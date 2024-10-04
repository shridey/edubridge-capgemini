import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';
import { Form, FormsModule } from '@angular/forms';
import { UserService } from '../../services/user.service';
import { Router, RouterLink } from '@angular/router';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [FormsModule, CommonModule, RouterLink],
  templateUrl: './login.component.html',
  styleUrl: './login.component.scss'
})
export class LoginComponent {
  username: string = ""
  password: string = ""

  constructor(private userService: UserService, private router: Router) {}

  ngOnInit() {
    if (localStorage.getItem('username')) {
      this.router.navigate(['/home']);
    }
  }

  onSubmit(loginForm: any) {
    this.userService.login(this.username, this.password).subscribe(
      response => {
        localStorage.setItem('username', response.username)
        this.router.navigate(['/home'])
      }
    )
  }
}
