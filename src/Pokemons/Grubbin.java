package Pokemons;

import Moves.Rest;
import Moves.XScissor;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Grubbin extends Pokemon {
    public Grubbin(String name, int lvl) {
        super(name, lvl);
        this.setStats(47, 62, 45, 55, 45, 46);
        this.setType(Type.BUG);
        this.addMove(new Rest());
        this.addMove(new XScissor());
    }
}
