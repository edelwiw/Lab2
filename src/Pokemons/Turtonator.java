package Pokemons;

import Moves.StatusMoves.Confide;
import Moves.StatusMoves.DoubleTeam;
import Moves.PhysicalMoves.PlayRough;
import Moves.PhysicalMoves.WoodHammer;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Turtonator extends Pokemon {
    public Turtonator(String name, int lvl){
        super(name, lvl);
        this.setStats(60, 78, 135, 91, 85, 36);
        this.setType(Type.FIRE, Type.DRAGON);
        this.addMove(new PlayRough());
        this.addMove(new WoodHammer());
        this.addMove(new DoubleTeam());
        this.addMove(new Confide());
    }
}
