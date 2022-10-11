package Moves;

import ru.ifmo.se.pokemon.*;

//Play Rough deals damage and has a 10% chance of lowering the target's Attack by one stage.
public class PlayRough extends PhysicalMove {
    public PlayRough(){
        super(Type.FAIRY, 90, 90);
    }

    @Override
    protected String describe(){
        return "moves PlayRough desk."; //TODO
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e = new Effect();
        e.chance(0.1).stat(Stat.ATTACK, -1);
        p.addEffect(e);
    }
}
