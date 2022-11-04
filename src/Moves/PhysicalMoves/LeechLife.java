package Moves.PhysicalMoves;

import ru.ifmo.se.pokemon.*;

/*

Leech Life deals damage and the user will recover 50% of the HP drained.

If the user is holding a Big Root, the move instead recovers 65% of the damage dealt (30% more than normal).
If used on a Pokémon with the ability Liquid Ooze, the user instead loses the HP it would have otherwise gained.

*/

public class LeechLife extends PhysicalMove {
    public LeechLife() {
        super(Type.BUG, 80, 100);
    }

    @Override
    protected void applySelfDamage(Pokemon p, double damage) {
        p.setMod(Stat.HP, (int)(-damage * 0.5)); //TODO WTF???
    }

    @Override
    protected String describe(){
        return "move Leech Life desc.";
    } //TODO

}
