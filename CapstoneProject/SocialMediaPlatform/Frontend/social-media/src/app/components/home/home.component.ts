import { Component } from '@angular/core';
import { HeaderComponent } from '../header/header.component';
import { PostService } from '../../services/post.service';
import { DatePipe } from '@angular/common';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [HeaderComponent, DatePipe],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent {

  posts: any[] = [];

  username: string = ""

  constructor(private postService: PostService, private router: Router) {
    this.username = localStorage.getItem('username') || ""
  }

  // Fetch all posts on component initialization
  ngOnInit(): void {
    this.postService.getAllPosts().subscribe({
      next: response => {
        console.log(response)
        this.posts = response; // Store the fetched posts
      },
      error: error => {
        console.error('Error fetching posts:', error);
      }
    })
  }

  onEditPost(post: any) {
  }

  onDeletePost(post: any) {
    this.postService.deletePost(post.post.postId).subscribe(
      (response: any[]) => {
        this.posts = response
      }
    )
  }

  createPost() {
    this.router.navigate(['/post'])
  }
}
