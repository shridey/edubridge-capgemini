import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-data-binding',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './data-binding.component.html',
  styleUrl: './data-binding.component.css'
})
export class DataBindingComponent {
  // Data for Interpolation and Property Binding
  title: string = "Angular Data Binding"
  imageUrl = 'https://angular.io/assets/images/logos/angular/angular.svg';
  isButtonDisabled = false;

  // Data for Event Binding
  buttonText = 'Click me!';
  counter = 0;

  // Data for Two-Way Binding
  userName = '';

  // Event Binding Method
  incrementCounter() {
    this.counter++;
    this.buttonText = `Clicked ${this.counter} times`;
  }
}
