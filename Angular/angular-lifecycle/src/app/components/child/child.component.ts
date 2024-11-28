import { Component, Input, SimpleChanges } from '@angular/core';

@Component({
  selector: 'app-child',
  standalone: true,
  imports: [],
  templateUrl: './child.component.html',
  styleUrl: './child.component.css'
})
export class ChildComponent {
  @Input() parentData: string = "";

  constructor() {
    console.log('ChildComponent Constructor');
  }

  ngOnChanges(changes: SimpleChanges): void {
    console.log('ChildComponent ngOnChanges', changes);
  }

  ngOnInit(): void {
    console.log('ChildComponent ngOnInit: Child component initialized');
  }

  ngDoCheck(): void {
    console.log('ChildComponent ngDoCheck: Custom change detection in child');
  }

  ngAfterContentInit(): void {
    console.log('ChildComponent ngAfterContentInit: Content initialized');
  }

  ngAfterContentChecked(): void {
    console.log('ChildComponent ngAfterContentChecked: Content checked');
  }

  ngAfterViewInit(): void {
    console.log('ChildComponent ngAfterViewInit: View initialized');
  }

  ngAfterViewChecked(): void {
    console.log('ChildComponent ngAfterViewChecked: View checked');
  }

  ngOnDestroy(): void {
    console.log('ChildComponent ngOnDestroy: Child component destroyed');
  }
}
