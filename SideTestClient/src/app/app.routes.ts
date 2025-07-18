import { Routes } from '@angular/router';
import { CharactersComponent } from './characters/characters.component';
import { HomeComponent } from './home/home.component';
import { BurgersComponent } from './burgers/burgers.component';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { CharacterDetailsComponent } from './character-details/character-details.component';
import { BurgerDetailsComponent } from './burger-details/burger-details.component';

export const routes: Routes = [{
    path: '',
    component: HomeComponent
  },
  {
    path: 'characters',
    component: CharactersComponent
  },
  {
    path: 'burgers',
    component: BurgersComponent
  },
  {
    path: 'characters/:id',
    component: CharacterDetailsComponent
    //,
    // resolve: {
    //   characters: characterResolver
    // }
  },
  {
    path: 'burgers/:id',
    component: BurgerDetailsComponent
  }
];
