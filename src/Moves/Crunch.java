package Moves;

import ru.ifmo.se.pokemon.*;

//Crunch deals damage and has a 20% chance of lowering the target's Defense by one stage.
public class Crunch extends PhysicalMove {
    public Crunch() {
        super(Type.DARK, 80, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect();
        e.chance(0.2);
        e.stat(Stat.DEFENSE, -1);
        p.addEffect(e);
    }

    @Override
    protected String describe() { return "moves Crunch desk."; } //TODO
}
