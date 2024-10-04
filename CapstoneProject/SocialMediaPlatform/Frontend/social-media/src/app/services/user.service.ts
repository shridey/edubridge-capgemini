import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { User } from '../models/user';
import { environment } from '../../environments/environment.development';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private httpClient: HttpClient) { }

  register(username: string, password: string) {
    const userRegisterDTO = {
      username: username,
      password: password
    }
    return this.httpClient.post<User>(`${environment.api_auth}/register`, userRegisterDTO)
  }

  login(username: string, password: string) {
    const userLoginDTO = {
      username: username,
      password: password
    }
    return this.httpClient.post<User>(`${environment.api_auth}/login`, userLoginDTO)
  }

}
