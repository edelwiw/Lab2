package Pokemons;

import Moves.Crunch;
import ru.ifmo.se.pokemon.Type;

public class Charjabug extends  Grubbin{
    public Charjabug(String name, int lvl) {
        super(name, lvl);
        this.setStats(57, 82, 95, 55, 75, 36);
        this.setType(Type.BUG, Type.ELECTRIC);
        this.addMove(new Crunch());
    }
}
