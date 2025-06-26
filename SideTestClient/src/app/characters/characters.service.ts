import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})

export class CharactersService {
  private apiUrl = 'http://localhost:8080/characters';

  constructor(private http: HttpClient) {}

  getCharacters(): Observable<any[]>{
    return this.http.get<any>(this.apiUrl);
  }
  
}
