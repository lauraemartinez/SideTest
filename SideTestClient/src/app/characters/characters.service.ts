import { HttpClient } from '@angular/common/http';
import { inject, Injectable } from '@angular/core';
import { response } from 'express';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CharactersService {
private http = inject(HttpClient); 
  constructor() { }
  getCharacters(): Observable<any[]>{
    return this.http.get<any[]>("characters")
  }
}
