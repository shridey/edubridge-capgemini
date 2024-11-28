import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-template-driven-form',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './template-driven-form.component.html',
  styleUrl: './template-driven-form.component.css'
})
export class TemplateDrivenFormComponent {

  submittedTemplate = false;
  templateData = {
    name: '',
    email: ''
  };

  onSubmitTemplateForm(form: any) {
    this.submittedTemplate = true;
    this.templateData = form.value;
    console.log('Template-driven form submitted:', form.value);
  }
}
