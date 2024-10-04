import { Component } from '@angular/core';
import { HeaderComponent } from "../header/header.component";
import { ProfileService } from '../../services/profile.service';
import { FormsModule } from '@angular/forms';
import { Profile } from '../../models/profile';
import { Post } from '../../models/post';
import { PostService } from '../../services/post.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-profile',
  standalone: true,
  imports: [HeaderComponent, FormsModule],
  templateUrl: './profile.component.html',
  styleUrl: './profile.component.css'
})
export class ProfileComponent {

  username = localStorage.getItem('username') || ""

  posts: Post[] = []

  currentTab = "posts"

  isCurrentUser = true
  isFollowing = false

  profile: Profile = {
    profileId: -1,
    realname: "",
    bio: "",
    dob: "",
    avatarUrl: "",
    postCount: 0,
    followersCount: 0,
    followingCount: 0
  }

  constructor(private profileService: ProfileService, private postService: PostService, private router: Router) {}

  ngOnInit() {
    this.getUserProfile(this.username)

    this.postService.getPost(this.username).subscribe({
      next: response => {
        this.posts = response
        console.log("Post Response: ", response)
      }
    })

  }

  getUserProfile(username: string) {
    this.profileService.getUserProfile(username).subscribe({
      next: response => {
        console.log("Profile Response: ", response)
        this.profile = response
        console.log("Profile Object Response: ", this.profile)
      }
    })
  }

  onEditProfile() {
    this.router.navigate(['/edit-profile'])
  }

  onUnfollowUser() {

  }

  onFollowUser() {

  }

}
