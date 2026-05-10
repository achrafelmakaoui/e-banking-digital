import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { email } from '@angular/forms/signals';

@Component({
  selector: 'app-new-customer',
  imports: [],
  templateUrl: './new-customer.html',
  styleUrl: './new-customer.css',
})
export class NewCustomer implements OnInit{
  newCustomerFormGroup! : FormGroup;

  constructor(private fb: FormBuilder) { }

  ngOnInit(): void {
      this.newCustomerFormGroup = this.fb.group({
        name : this.fb.control(null),
        email : this.fb.control(null)
      })
  }
}
