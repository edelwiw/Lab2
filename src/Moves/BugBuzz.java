package Moves;

import ru.ifmo.se.pokemon.*;

//Bug Buzz deals damage and has a 10% chance of lowering the target's Special Defense by one stage.
public class BugBuzz extends SpecialMove {
    public BugBuzz() {
        super(Type.BUG, 90, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect();
        e.chance(0.1);
        e.stat(Stat.SPECIAL_DEFENSE, -1);
        p.addEffect(e);
    }

    @Override
    protected String describe() { return "uses Bug Buzz"; }
}
