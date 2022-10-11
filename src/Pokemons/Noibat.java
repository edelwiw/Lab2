package Pokemons;

import Moves.LeechLife;
import Moves.Screech;
import Moves.Swagger;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Noibat extends Pokemon {
    public Noibat(String name, int lvl) {
        super(name, lvl);
        this.setStats(40, 30, 35, 45, 40, 55);
        this.setType(Type.FLYING, Type.DRAGON);
        this.addMove(new LeechLife());
        this.addMove(new Screech());
        this.addMove(new Swagger());
    }
}
