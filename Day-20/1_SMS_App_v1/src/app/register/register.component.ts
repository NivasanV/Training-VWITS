import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Student } from '../../module/Student';
import { FormsModule } from '@angular/forms';
import { UserService } from '../service/user.service';
import { Router } from '@angular/router';
import { StudentsService } from '../service/students.service';
import { MatButtonModule } from "@angular/material/button";
import { MatFormFieldModule } from "@angular/material/form-field";
import { MatInputModule } from "@angular/material/input";

@Component({
  selector: 'app-register',
  standalone: true,
  imports: [
    CommonModule, FormsModule,
    MatButtonModule , MatFormFieldModule,
    MatInputModule
  ],
  templateUrl: './register.component.html',
  styleUrl: './register.component.css'
})
export class RegisterComponent { 
  rollNo:number=0;
  name:string='';
  attempts:number=0;
  percentage:number=0;

  
  constructor(private user:UserService, private r:Router, private s:StudentsService){

  }

  performRegister(){
      this.user.performRegister(this.rollNo, this.name, this.attempts, this.percentage);
      this.r.navigate(['students']);
  }
    
}
