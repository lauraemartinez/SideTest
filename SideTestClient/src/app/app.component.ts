import { Component, EnvironmentInjector } from '@angular/core';
import {RouterModule} from '@angular/router';
import { NavbarComponent } from "./navbar/navbar.component";
import { HomeComponent } from './home/home.component';

@Component({
  selector: 'app-root',
  imports: [RouterModule, NavbarComponent, HomeComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = "App";
  
}
