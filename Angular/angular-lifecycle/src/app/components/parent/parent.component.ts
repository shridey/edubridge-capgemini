import { CommonModule } from '@angular/common';
import { Component, SimpleChanges } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { ChildComponent } from '../child/child.component';

@Component({
  selector: 'app-parent',
  standalone: true,
  imports: [ChildComponent, FormsModule, CommonModule],
  templateUrl: './parent.component.html',
  styleUrl: './parent.component.css'
})
export class ParentComponent {
  title: string = "Angular Lifecycle Hooks"
  inputText: string = ""
  showChild: boolean = true

  constructor() {
    console.log('ParentComponent Constructor');
  }

  ngOnChanges(changes: SimpleChanges): void {
    console.log('ParentComponent ngOnChanges', changes);
  }

  ngOnInit(): void {
    console.log('ParentComponent ngOnInit: Fetching data or setting up services');
  }

  ngDoCheck(): void {
    console.log('ParentComponent ngDoCheck: Checking for changes manually');
  }

  ngAfterContentInit(): void {
    console.log('ParentComponent ngAfterContentInit: Content initialized');
  }

  ngAfterContentChecked(): void {
    console.log('ParentComponent ngAfterContentChecked: Content checked');
  }

  ngAfterViewInit(): void {
    console.log('ParentComponent ngAfterViewInit: View initialized');
  }

  ngAfterViewChecked(): void {
    console.log('ParentComponent ngAfterViewChecked: View checked');
  }

  ngOnDestroy(): void {
    console.log('ParentComponent ngOnDestroy: Cleanup before component is destroyed');
  }

  toggleChildComponent(): void {
    this.showChild = !this.showChild;
  }

}
