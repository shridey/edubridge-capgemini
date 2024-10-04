import { Component } from '@angular/core';
import { HeaderComponent } from "../header/header.component";
import { PostService } from '../../services/post.service';
import { FormsModule } from '@angular/forms';
import { CloudinaryService } from '../../services/cloudinary.service';

@Component({
  selector: 'app-post',
  standalone: true,
  imports: [FormsModule, HeaderComponent],
  templateUrl: './post.component.html',
  styleUrl: './post.component.css'
})
export class PostComponent {

  caption: string = ""
  imageUrl: string = ""
  username: string = ""
  selectedFile: File | null = null;
  isPostCreated: boolean = false;
  errorMessage: string = "";

  constructor(private postService: PostService, private cloudinaryService: CloudinaryService) {
    this.username = localStorage.getItem('username') || ""
  }

  onFileSelected(event: any) {
    this.selectedFile = event.target.files[0];
  }

  onSubmit() {
    if (this.selectedFile && this.username) {
      // Upload image to Cloudinary in the `username/posts` folder
      this.cloudinaryService.uploadPostImage(this.username, this.selectedFile).subscribe({
        next: response => {
          this.imageUrl = response.secure_url; // Get the image URL from Cloudinary response
          console.log('Image uploaded successfully:', this.imageUrl);

          this.postService.addPost(this.username,this.caption, this.imageUrl).subscribe({
            next: () => {
              console.log('Post created successfully');
              this.isPostCreated = true; // Set flag to true when post is created
              this.errorMessage = ""; // Clear error message
            },
            error: error => {
              console.error('Error creating post:', error);
              this.errorMessage = "Error creating post.";
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
      this.errorMessage = "Please select a file and enter a username.";
    }
  }
}
