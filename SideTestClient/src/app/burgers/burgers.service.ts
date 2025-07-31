import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Burger } from '../burger';

@Injectable({
  providedIn: 'root'
})

export class BurgersService {
  private apiUrl = 'http://localhost:8080/burgers';

  constructor(private http: HttpClient) {}

  async getBurgers(): Promise<Burger[]>{
    const data = await fetch(this.apiUrl);
    return (await data.json()) ?? [];
  }
  
  async getBurger(burgerId: number): Promise<Burger | undefined>{
    const data = await fetch(`${this.apiUrl}?id=${burgerId}`)
    const burgerJson = await data.json();
    return burgerJson[burgerId-1] ?? {}
  }
}
