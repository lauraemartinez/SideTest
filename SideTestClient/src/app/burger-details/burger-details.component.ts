import { Component, inject, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { BurgersService } from '../burgers/burgers.service';
import { Burger } from '../burger';

@Component({
  selector: 'app-burger-details',
  imports: [],
  templateUrl: './burger-details.component.html',
  styleUrl: './burger-details.component.css'
})
export class BurgerDetailsComponent {
  burgerService = inject(BurgersService);
  burger: Burger | undefined;

  constructor(private route: ActivatedRoute) {
    const burgerId = parseInt(this.route.snapshot.params['id']);
    this.burgerService.getBurger(burgerId)
    .then((burger) => {
      this.burger = burger;
    })
  }


}
