package Moves;

import ru.ifmo.se.pokemon.*;

//User sleeps for 2 turns, but user is fully healed.
public class Rest extends StatusMove {
    public Rest() {
        super(Type.PSYCHIC, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect e = new Effect();
        e.chance(1);
        e.turns(2);
        e.stat(Stat.HP);
        Effect.sleep(p);
        p.addEffect(e);
    }

    @Override
    protected String describe() { return "moves Rest desk."; } //TODO
}
