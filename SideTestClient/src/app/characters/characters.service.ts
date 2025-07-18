import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Character } from '../character';

@Injectable({
  providedIn: 'root'
})

export class CharactersService {
  private apiUrl = 'http://localhost:8080/characters';

  constructor(private http: HttpClient) {}

  async getCharacters(): Promise<Character[]>{
    const data = await fetch(this.apiUrl);
    return (await data.json()) ?? [];
  }
  
  async getCharacter(characterId: number): Promise<Character | undefined>{
    const data = await fetch(`${this.apiUrl}?id=${characterId}`)
    const characterJson = await data.json();
    return characterJson[characterId-1] ?? {}
  }
}
