import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Profile } from '../models/profile';
import { environment } from '../../environments/environment.development';

@Injectable({
  providedIn: 'root'
})
export class ProfileService {

  constructor(private httpClient: HttpClient) { }

  getUserProfile(username: string) {
    console.log("Get Profile API called!")
    return this.httpClient.get<Profile>(`${environment.api_profiles}/${username}`)
  }

  updateProfile(username: string, profile: any) {
    console.log("Profile Service: Update Profile Method called!")
    return this.httpClient.put<Profile>(`${environment.api_profiles}/update/${username}`, profile)
  }

}
