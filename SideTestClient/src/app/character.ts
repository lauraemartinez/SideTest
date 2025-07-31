import { Relative } from "./relative";

export interface Character {
    id: number;
    name: string;
    gender: string;
    image: string;
    hair: string;
    age: string;
    allOcupations: string[];
    occupation: string;
    nicknames: string[];
    relatives: Relative[];
    firstEpisode: string;
    voicedBy: string;
    wikiUrl: string;
}
