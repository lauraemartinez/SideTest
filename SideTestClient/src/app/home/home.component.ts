import { Component, inject } from '@angular/core';
import { CharactersComponent } from "../characters/characters.component";
import { RouterLink, RouterModule, RouterOutlet } from '@angular/router';
import { NavbarComponent } from "../navbar/navbar.component";
import { CharactersService } from '../characters/characters.service';
import { Character } from '../character';

@Component({
  selector: 'app-home',
  imports: [CharactersComponent, RouterOutlet, RouterLink, NavbarComponent],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent {

}
