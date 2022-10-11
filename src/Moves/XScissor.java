package Moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

//X-Scissor deals damage with no additional effect.
public class XScissor extends PhysicalMove {
    public XScissor() {
        super(Type.BUG, 80, 100);
    }

    @Override
    protected String describe(){
        return "moves X-Scissor desk."; //TODO
    }
}
