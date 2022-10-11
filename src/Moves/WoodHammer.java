package Moves;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

//Wood Hammer deals damage, but the user receives 1⁄3 of the damage it inflicted in recoil. In other words, if the attack does 90 HP damage to the opponent, the user will lose 30 HP.
public class WoodHammer extends PhysicalMove {
    public WoodHammer() {
        super(Type.GRASS, 120, 100);
    }

    @Override
    protected void applySelfDamage(Pokemon att, double damage) {
        att.setMod(Stat.HP, (int)(damage * (1 / 3)));
    }

    @Override
    protected String describe(){
        return "move Wood Hammer desc.";
    } //TODO

}
