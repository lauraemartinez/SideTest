import { HttpClient } from '@angular/common/http';
import { Component, inject, OnInit } from '@angular/core';
import { RouterLink } from '@angular/router';
import { BurgersService } from './burgers.service';
import { NgForOf } from '@angular/common';
import { AppComponent } from '../app.component';
import { Burger } from '../burger';

@Component({
  selector: 'app-burgers',
  imports: [RouterLink, NgForOf],
  templateUrl: './burgers.component.html',
  styleUrl: './burgers.component.css',
})
export class BurgersComponent {
  burgerList: Burger[] | undefined;

  burgerService = inject(BurgersService);

  constructor() {
    this.burgerService
    .getBurgers()
    .then((burgerList: Burger[]) => {
      this.burgerList = burgerList;
    });
  }
}
