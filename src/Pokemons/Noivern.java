package Pokemons;

import Moves.DragonClaw;
import ru.ifmo.se.pokemon.Type;

public class Noivern extends Noibat{
    public Noivern(String name, int lvl) {
        super(name, lvl);
        this.setStats(85, 70, 80, 97, 80, 123);
        this.setType(Type.FLYING, Type.DRAGON);
        this.addMove(new DragonClaw());
    }
}
