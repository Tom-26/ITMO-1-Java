package pokemon;
import moveAttack.*;
import ru.ifmo.se.pokemon.*;

public class Hipno extends Drowzee{
    public Hipno(String name, int level){
        super(name, level);
        setType(Type.PSYCHIC);
        setStats(85, 73, 70, 73, 115, 67);
        setMove(new Facade(), new Headbutt(), new Psychic(), new FocusBlast());
    }
}
