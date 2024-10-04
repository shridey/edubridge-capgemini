import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CloudinaryService {

  cloudName = 'dghs1fy8y';
  uploadPreset = 'mp2nmhzy';

  constructor(private httpClient: HttpClient) { }

  uploadPostImage(username: string, file: File): Observable<any> {
    const formData = new FormData();
    formData.append('file', file);
    formData.append('upload_preset', this.uploadPreset);
    formData.append('folder', `${username}/posts`); // Dynamic folder path based on username
    
    return this.httpClient.post(`https://api.cloudinary.com/v1_1/${this.cloudName}/image/upload`, formData);
  }

  uploadProfileImage(username: string, file: File): Observable<any> {
    const formData = new FormData();
    formData.append('file', file);
    formData.append('upload_preset', this.uploadPreset);
    formData.append('folder', `${username}/profile`); // Dynamic folder path based on username
    
    return this.httpClient.post(`https://api.cloudinary.com/v1_1/${this.cloudName}/image/upload`, formData);
  }
}
