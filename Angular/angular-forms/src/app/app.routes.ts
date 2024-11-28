import { Routes } from '@angular/router';
import { TemplateDrivenFormComponent } from './components/template-driven-form/template-driven-form.component';
import { ReactiveFormComponent } from './components/reactive-form/reactive-form.component';

export const routes: Routes = [
    {path: "", component: TemplateDrivenFormComponent},
    {path: "reactive", component: ReactiveFormComponent}
];
