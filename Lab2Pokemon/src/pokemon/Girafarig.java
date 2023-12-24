package pokemon;
import moveAttack.*;
import ru.ifmo.se.pokemon.*;

public class Girafarig extends Pokemon {
    public Girafarig(String name, int level){
        super(name, level);
        setType(Type.NORMAL, Type.PSYCHIC);
        setStats(70, 80, 65, 90, 65, 85);
        setMove(new Stomp(), new TakeDown(), new DoubleTeam(), new DreamEater());
    }
}
