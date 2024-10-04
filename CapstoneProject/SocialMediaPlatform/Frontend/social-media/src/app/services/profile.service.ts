import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Profile } from '../modals/profile';

@Injectable({
  providedIn: 'root'
})
export class ProfileService {

  constructor(private httpClient: HttpClient) { }

  getUserProfile(username: string) {
    console.log("Get Profile API called!")
    return this.httpClient.get<Profile>(`http://localhost:8080/api/profiles/${username}`)
  }

  updateProfile(username: string, profile: any) {
    console.log("Profile Service: Update Profile Method called!")
    return this.httpClient.put<Profile>(`http://localhost:8080/api/profiles/update/${username}`, profile)
  }

}
