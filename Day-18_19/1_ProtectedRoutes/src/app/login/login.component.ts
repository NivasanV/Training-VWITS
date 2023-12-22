import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { UserService } from '../user.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [CommonModule, FormsModule],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {
  username:string = '';
  password:string = '';
  message:string = '';
  constructor(private user:UserService, private r:Router){
      
  }

  performLogin(){
    if(this.user.performLogin(this.username,this.password)){
      this.message = 'Login Successful';
      // show students view to user
      this.r.navigate(['students']); // this is programatic navigation
    }
    else{
      this.message = 'Login Failed';
    }
    
  }
}
