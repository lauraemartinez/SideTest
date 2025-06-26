import { HttpClient } from '@angular/common/http';
import { Component, inject, OnInit } from '@angular/core';
import { RouterLink } from '@angular/router';
import { BurgersService } from './burgers.service';
import { NgForOf } from '@angular/common';

@Component({
  selector: 'app-burgers',
  imports: [RouterLink, NgForOf],
  templateUrl: './burgers.component.html',
  styleUrl: './burgers.component.css'
})
export class BurgersComponent implements OnInit {
  burgers: any[] = [];
  
  constructor(private burgersService: BurgersService){}
          
  ngOnInit() {
     this.burgersService.getBurgers().subscribe(
       burger => this.burgers = burger
      );
    }
  }
