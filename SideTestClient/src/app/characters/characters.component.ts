import { HttpClient } from '@angular/common/http';
import { Component, inject, Injectable, OnInit } from '@angular/core';
import { ActivatedRoute, RouterLink } from '@angular/router';
import { CharactersService } from './characters.service';
import { NgForOf } from '@angular/common';


@Component({
  selector: 'app-characters',
  imports: [RouterLink, NgForOf],
  templateUrl: './characters.component.html',
  styleUrl: './characters.component.css'
})
export class CharactersComponent implements OnInit {
        characters: any[] = [];
        
        constructor(private charactersService: CharactersService){}
        
        ngOnInit() {
          this.charactersService.getCharacters().subscribe(
            character => this.characters = character
          );
        }
}
