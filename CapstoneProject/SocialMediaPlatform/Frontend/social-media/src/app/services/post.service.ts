import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Post } from '../models/post';
import { Observable } from 'rxjs';
import { environment } from '../../environments/environment.development';

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
    return this.httpClient.post<Post>(`${environment.api_posts}/${postDTO.username}/addPost`, postDTO)
  }

  getPost(username: string) {
    return this.httpClient.get<Post[]>(`${environment.api_posts}/${username}`)
  }

  getPostById(postId: number) {
    return this.httpClient.get<Post>(`${environment.api_posts}/byId/${postId}`)
  }

  getAllPosts(): Observable<any> {
    return this.httpClient.get(`${environment.api_posts}`);
  }

  updatePost(postId: number, post: any) {
    return this.httpClient.put(`${environment.api_posts}/${postId}`, post)
  }

  deletePost(postId: number): any {
    return this.httpClient.delete<any>(`${environment.api_posts}/${postId}`);
  }
}
