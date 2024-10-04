import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { UserService } from '../../services/user.service';
import { Router, RouterLink } from '@angular/router';

@Component({
  selector: 'app-register',
  standalone: true,
  imports: [FormsModule, RouterLink],
  templateUrl: './register.component.html',
  styleUrl: './register.component.scss'
})
export class RegisterComponent {

  username: string = ""
  password: string = ""
  confirmPassword: string = ""
  
  constructor(private userService: UserService, private router: Router) {}

  onSubmit() {
    if (this.password == this.confirmPassword) {
      this.userService.register(this.username, this.password).subscribe(
        response => {
          localStorage.setItem('username', response.username)
          this.router.navigate(['/home'])
        }
      )
    }
  }

}
