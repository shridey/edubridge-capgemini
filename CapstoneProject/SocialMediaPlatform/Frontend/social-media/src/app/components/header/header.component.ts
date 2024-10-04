import { Component } from '@angular/core';
import { Router, RouterLink } from '@angular/router';

@Component({
  selector: 'app-header',
  standalone: true,
  imports: [RouterLink],
  templateUrl: './header.component.html',
  styleUrl: './header.component.css'
})
export class HeaderComponent {
  isLoggedIn: boolean = false;

  constructor(private router: Router) {
    this.isLoggedIn = localStorage.getItem('username') ? true : false;
  }

  logout() {
    localStorage.removeItem('username');
    this.router.navigate(['']);
  }

}
