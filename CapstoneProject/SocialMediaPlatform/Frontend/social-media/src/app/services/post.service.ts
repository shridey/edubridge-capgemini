import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Post } from '../modals/post';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PostService {

  constructor(private httpClient: HttpClient) {}

  addPost(username: string, caption: string, imageUrl: string) {
    const postDTO = {
      username: username,
      caption: caption,
      imageUrl: imageUrl
    }
    return this.httpClient.post<Post>(`http://localhost:8080/api/posts/${postDTO.username}/addPost`, postDTO)
  }

  getPost(username: string) {
    return this.httpClient.get<Post[]>(`http://localhost:8080/api/posts/${username}`)
  }

  getAllPosts(): Observable<any> {
    return this.httpClient.get('http://localhost:8080/api/posts');
  }

  deletePost(postId: number): any {
    return this.httpClient.delete<any>(`http://localhost:8080/api/posts/${postId}`);
  }
}
