package Pokemons;

import Moves.PhysicalMoves.LeechLife;
import Moves.StatusMoves.Screech;
import Moves.StatusMoves.Swagger;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Pokemon;

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
