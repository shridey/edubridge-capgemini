import { Component } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule, Validators } from '@angular/forms';

@Component({
  selector: 'app-reactive-form',
  standalone: true,
  imports: [ReactiveFormsModule],
  templateUrl: './reactive-form.component.html',
  styleUrl: './reactive-form.component.css'
})
export class ReactiveFormComponent {

  reactiveForm!: FormGroup;
  submittedReactive = false;
  reactiveData = {
    name: '',
    email: ''
  };

  ngOnInit(): void {
    // Initializing Reactive Form
    this.reactiveForm = new FormGroup({
      name: new FormControl(null, Validators.required),
      email: new FormControl(null, [Validators.required, Validators.email])
    });
  }

  onSubmitReactiveForm() {
    this.submittedReactive = true;
    this.reactiveData = this.reactiveForm.value;
    console.log('Reactive form submitted:', this.reactiveForm.value);
  }
}
