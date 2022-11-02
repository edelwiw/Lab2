import Pokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Main {
    public static void main(String[] args) {
        Battle battle = new Battle();

        battle.addAlly(new Turtonator("Черепашаня", 50));
        battle.addAlly(new Noibat("БИТ1.4", 50));
        battle.addAlly(new Noivern("Наверна", 50));

        battle.addFoe(new Grubbin("Грубиян", 50));
        battle.addFoe(new Charjabug("Сжук-зарядка", 50));
        battle.addFoe(new Vikavolt("ЛенаАмпер", 50));

        battle.go();
    }
}