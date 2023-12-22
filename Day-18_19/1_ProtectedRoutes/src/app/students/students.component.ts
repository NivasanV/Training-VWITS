import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Student } from '../../module/Student';
import { StudentsService } from '../students.service';
import { UserService } from '../user.service';

@Component({
  selector: 'app-students',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './students.component.html',
  styleUrl: './students.component.css'
})
export class StudentsComponent {
  public students:Student[] =[];
  message:string = '';
  colorClass:string = '';

  constructor(private service:StudentsService){
    this.students = service.findAllStudents();
  }

  showStudents(){

  }

  sortByPercent(){
    this.students.sort((a,b) => b.percentage - a.percentage);
  }

  sortByAttempts(){
    this.students.sort((a,b) => a.attempts - b.attempts);
  }

  sortByNoOfSubjects(){
    this.students.sort((a,b) => a.subjectsLearning.length - b.subjectsLearning.length)
  }

  deleteStudent(rollNo:number){
    if(confirm("Delete the Student with Roll No:"+rollNo)){
      this.students = this.students.filter(s => s.rollNo != rollNo);
      this.message = 'Record Delete :)';
      this.colorClass = 'success';
    }
    else{
      this.message = 'Deletion Cancled !';
      this.colorClass = 'error';
    }
  }

  updateStudent(s:Student){
    console.log(s);
  }

}
