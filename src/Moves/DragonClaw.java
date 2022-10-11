package Moves;

import ru.ifmo.se.pokemon.*;

//Dragon Claw deals damage with no additional effect.
public class DragonClaw extends PhysicalMove {
    public DragonClaw() {
        super(Type.DRAGON, 80, 100);
    }

    @Override
    protected String describe(){
        return "moves DragonClaw desk."; //TODO
    }
}
