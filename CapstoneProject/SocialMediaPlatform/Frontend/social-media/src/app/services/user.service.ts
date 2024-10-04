import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { User } from '../modals/user';

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
    return this.httpClient.post<User>(`http://localhost:8080/api/users/auth/register`, userRegisterDTO)
  }

  login(username: string, password: string) {
    const userLoginDTO = {
      username: username,
      password: password
    }
    return this.httpClient.post<User>(`http://localhost:8080/api/users/auth/login`, userLoginDTO)
  }

}
