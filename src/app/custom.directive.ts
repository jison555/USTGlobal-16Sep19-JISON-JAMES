import { Directive, ElementRef, HostListener } from '@angular/core';

@Directive({
  selector: '[appCustom]'
})
export class CustomDirective {



  constructor(private el:ElementRef) {
    this.el.nativeElement.style.color = 'red';
    this.el.nativeElement.style.backgroundColor = 'blue';


  
   }
   
   @HostListener('mouseleave') m() {
    this.el.nativeElement.style.color = 'green';
   }


   

}
