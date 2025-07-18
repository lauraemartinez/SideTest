import { Component, inject, Injectable, OnInit } from '@angular/core';
import { ActivatedRoute, RouterLink } from '@angular/router';
import { CharactersService } from './characters.service';
import { NgForOf } from '@angular/common';
import { Character } from '../character';


@Component({
  selector: 'app-characters',
  imports: [RouterLink, NgForOf],
  templateUrl: './characters.component.html',
  styleUrl: './characters.component.css'
})
export class CharactersComponent{
  characterList: Character[]| undefined;

  characterService = inject(CharactersService)

  constructor(){
    this.characterService
    .getCharacters()
    .then((characterList: Character[]) =>
    {
      this.characterList = characterList;
    })
  }

}
