import { Component } from '@angular/core';
import { HeaderComponent } from '../header/header.component';
import { FormsModule } from '@angular/forms';
import { ProfileService } from '../../services/profile.service';
import { CloudinaryService } from '../../services/cloudinary.service';

@Component({
  selector: 'app-profile-update',
  standalone: true,
  imports: [HeaderComponent, FormsModule],
  templateUrl: './profile-update.component.html',
  styleUrl: './profile-update.component.css'
})
export class ProfileUpdateComponent {

  constructor (private profileService: ProfileService, private cloudinaryService: CloudinaryService) {}

  username: string = localStorage.getItem('username') || ""

  profileId: number = -1
  realname: string = ""
  bio: string = ""
  dob: string = ""
  imageUrl: string = ""
  selectedFile: File | null = null;

  isProfileUpdated: boolean = false

  errorMessage = ""

  profile = {}

  ngOnInit() {
    this.profileService.getUserProfile(this.username).subscribe({
      next: response => {
        this.profileId = response.profileId
        this.realname = response.realname
        this.bio = response.bio
        this.dob = response.dob
        this.imageUrl = response.avatarUrl
      }
    })
  }

  onFileSelected(event: any) {
    this.selectedFile = event.target.files[0];
  }

  onSubmit() {
    if (this.selectedFile && this.username) {
      // Upload image to Cloudinary in the `username/posts` folder
      this.cloudinaryService.uploadProfileImage(this.username, this.selectedFile).subscribe({
        next: response => {
          this.imageUrl = response.secure_url; // Get the image URL from Cloudinary response
          console.log('Image uploaded successfully:', this.imageUrl);

          this.profile = {
            profileId: this.profileId,
            realname: this.realname,
            bio: this.bio,
            dob: this.dob,
            avatarUrl: this.imageUrl
          }
          
          console.log('Profile data:', this.profile)
          
          this.profileService.updateProfile(this.username, this.profile).subscribe({
            next: () => {
              console.log('Profile updated successfully');
              this.isProfileUpdated = true; // Set flag to true when post is created
              console.log("Profile Updated: ", this.isProfileUpdated)
              this.errorMessage = ""; // Clear error message
            },
            error: error => {
              console.error('Error updating profile:', error);
              this.errorMessage = "Error updating profile.";
            }
          })
        },
        error: error => {
          console.error('Error uploading image:', error);
          this.errorMessage = "Error uploading image.";
        }
      })
    } else {
      console.error('No file selected or username is missing');
      this.errorMessage = "Please select a file.";
    }
  }
}
