import { Injectable } from "@angular/core";

@Injectable({
    providedIn:'root'
})
export class DataService{
    students:string[]=[]
    addStudent(newstudent:string){
        this.students.push(newstudent)
    }
    removeStudent(){
        this.students.pop()

    }
}