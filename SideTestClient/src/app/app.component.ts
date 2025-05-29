import { Component, EnvironmentInjector } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { CharactersComponent } from "./characters/characters.component";
import {RouterModule} from '@angular/router';
import { BurgersComponent } from './burgers/burgers.component';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, HomeComponent, CharactersComponent, BurgersComponent, RouterModule],
  template: `
  <main>
      
      <header class="brand-name">
      </header>
     
      <section class="content">
        <a [routerLink]="['/']" class="title"><h1>Bob's Burgers site</h1></a>
         <router-outlet></router-outlet>
      </section>
    </main>
  `,
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = "App";
  
}
