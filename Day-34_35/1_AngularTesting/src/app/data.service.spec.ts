import { TestBed } from "@angular/core/testing"
import { DataService } from "./data.service"

it('Adding student should increase the size',()=>{
    console.log("In data service test- Adding")
    //Arrange
    let s='Kevin'
    let serviceobj= TestBed.inject(DataService) 
    //Act
    serviceobj.addStudent(s)
    //Assert
    expect(serviceobj.students.length).toEqual(1)
})
// write a test case which follows TDD approach which helps us to create 
// new method in data.service.ts file which removes a student from array
// and asserts the size of array
it('Removing student should decrease the size',()=>{
    console.log("In data service test- Removing")
    //Arrange

    let serviceobj= TestBed.inject(DataService) 
    //Act
    serviceobj.removeStudent()
    //Assert
    expect(serviceobj.students.length).toEqual(0)
})