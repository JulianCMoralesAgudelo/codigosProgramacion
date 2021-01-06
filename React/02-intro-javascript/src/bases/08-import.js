//import { heroes } from './data/heroes';
import heroes, { owners } from '../data/heroes.js'

/*const getHeroeByID = (id) => {
    return heroes.find(heroes => {
        if(heroe.id == id){
            return true
        }
        return 'El id mo coincide'
    });
}*/

//console.log(getHeroeByID(2));
export const getHeroesByname = (id) => {
    const heroeByID = heroes.find(heroe => heroe.id === id);
    if (heroeByID) {
        return console.log('El heroe se llama $(heroeByI.name)');
    }
    return console.log('El nombre a buscar no se encuentra');

}

export const getHeroes = () => heroes.map((n) => console.log(n.name));
export const getHeroeByID = (id) => heroes.find(heroe => heroe.id === id);

export const getHeroeByOwner = (owner) => {
    const heros = heroes.filter(heore => heore.owner === owner);
    heros.map((n) => console.log(n.name));
}


