import { Routes } from '@angular/router';
import { CharactersComponent } from './characters/characters.component';
import { HomeComponent } from './home/home.component';
import { BurgersComponent } from './burgers/burgers.component';

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
];
