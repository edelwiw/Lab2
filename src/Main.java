import Pokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Main {
    public static void main(String[] args) {
        Battle battle = new Battle();

        battle.addAlly(new Turtonator("Turtonator", 100));
        battle.addAlly(new Noibat("Noibat", 100));
        battle.addAlly(new Noivern("Noivern", 100));

        battle.addFoe(new Grubbin("Grubbin", 100));
        battle.addFoe(new Charjabug("Charjabug", 100));
        battle.addFoe(new Vikavolt("Vikavolt", 100));

        battle.go();
    }
}