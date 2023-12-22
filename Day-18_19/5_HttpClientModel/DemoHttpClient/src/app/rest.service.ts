import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { ToDo } from "./model/ToDo";

@Injectable({
  providedIn: 'root'
})
export class RESTService {

  constructor(private http: HttpClient) {

  }

  findAllToDo() {
    this.http.get<ToDo[]>('https://jsonplaceholder.typicode.com/todos')
    .subscribe(
      response => console.log(response)
    );
  }

  deleteById(id: number) {
    this.http.delete<void>('https://jsonplaceholder.typicode.com/todos/' + id)
    .subscribe();
  }

  save(t: ToDo) {
    this.http.post<ToDo>('https://jsonplaceholder.typicode.com/todos', t)
    .subscribe();

  }
}
