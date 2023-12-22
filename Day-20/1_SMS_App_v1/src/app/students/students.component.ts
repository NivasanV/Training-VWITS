import { Component } from '@angular/core';
import { CommonModule } from '@angular/common';
import { Student } from '../../module/Student';
import { StudentsService } from '../service/students.service';
import { StudentUpdateComponent } from '../student-update/student-update.component';
import { MatButtonModule } from "@angular/material/button";
import { MatRadioModule } from "@angular/material/radio";
import { MatDialog } from "@angular/material/dialog";
import { StudentRestService } from '../service/student-rest.service';

@Component({
  selector: 'app-students',
  standalone: true,
  imports: [
    CommonModule, StudentUpdateComponent,
    MatButtonModule, MatRadioModule
  ],
  templateUrl: './students.component.html',
  styleUrl: './students.component.css'
})
export class StudentsComponent {
  public students: Student[] = [];
  message: string = '';
  colorClass: string = '';

  selectedStudent!: Student;
  // isUpdate: boolean = false;

  constructor(private service: StudentRestService, private dialog: MatDialog) {
    
  }

  showStudents() {
    this.service.findAllStudents().subscribe(
      res => this.students = res
    );
  }

  sortByPercent() {
    this.students.sort((a, b) => b.percentage - a.percentage);
  }

  sortByAttempts() {
    this.students.sort((a, b) => a.attempts - b.attempts);
  }

  sortByNoOfSubjects() {
    this.students.sort((a, b) => a.subjectsLearning.length - b.subjectsLearning.length)
  }

  deleteStudent(rollNo: number) {
    if (confirm("Delete the Student with Roll No:" + rollNo)) {
      this.students = this.students.filter(s => s.rollNo != rollNo);
      this.message = 'Record Delete :)';
      this.colorClass = 'success';
    }
    else {
      this.message = 'Deletion Cancled !';
      this.colorClass = 'error';
    }
  }

  updateStudent(s: Student) {
    console.log(s);
    this.dialog.open(StudentUpdateComponent, { data: s })
    this.selectedStudent = s;
    // this.isUpdate = true;
  }

  doUpdate(updatedStudent: Student) {
    // map is built-in function of javascript that transform every element of array
    // which is exactly similar to lambda function and return new array
    let modifiedStudents = this.students.map(s => {
      if (s.rollNo == updatedStudent.rollNo) {
        // following line is make use of spread operator
        // spread operator is added in ES6
        // using follwoing line we are changing the value of attemps field
        return { ...s, attempts: updatedStudent.attempts }
      }
      else {
        return s;
      }
    });

    this.students = modifiedStudents;
    // this.isUpdate = false;
  }

}
