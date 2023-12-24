package pokemon;
import ru.ifmo.se.pokemon.*;
import moveAttack.*;
public class Drowzee extends Pokemon{
    public Drowzee(String name, int level){
        super(name, level);
        setType(Type.PSYCHIC);
        setStats(60, 48, 45, 43, 90, 42);
        setMove(new Facade(), new Headbutt(), new Psychic());
    }
}
