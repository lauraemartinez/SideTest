import { Component, inject, OnInit } from '@angular/core';
import {
  ActivatedRoute,
  ActivatedRouteSnapshot,
  ResolveFn,
  RouterStateSnapshot,
} from '@angular/router';
import { CharactersService } from '../characters/characters.service';
import { CharactersComponent } from '../characters/characters.component';
import { Character } from '../character';

@Component({
  selector: 'app-character-details',
  imports: [],
  templateUrl: './character-details.component.html',
  styleUrl: './character-details.component.css',
})
export class CharacterDetailsComponent {
  
  characterService = inject(CharactersService);
  character: Character | undefined;

  constructor(private route: ActivatedRoute) {
    const characterId = parseInt(this.route.snapshot.params['id']);
    this.characterService.getCharacter(characterId)
    .then((character) => {
      this.character = character;
    })
  }

}

// export const characterResolver : ResolveFn<CharacterData> =
// (route: ActivatedRouteSnapshot, state: RouterStateSnapshot) => {
//   const characterStore = inject(CharactersService);
//   const characterId = route.paramMap.get('id')!;
//   return characterStore.getCharacter(characterId)
// }
