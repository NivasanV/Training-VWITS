import { Injectable } from '@angular/core';
import { Student } from '../../module/Student';
import { StudentsService } from './students.service';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  isUserLoggedIn:boolean = false;
  public students:Student[] =[];

  constructor(private s:StudentsService) { }

  performLogin(username:string, password:string){
    if(username == 'admin' && password== 'admin'){
      this.isUserLoggedIn = true;
    }
    else{
      this.isUserLoggedIn = false;
    }
    return this.isUserLoggedIn;
  }

  performRegister(rollNo:number, name:string, attempts:number, percentage:number){
    this.s.addStudent(rollNo, name, attempts, percentage);
  }
}
