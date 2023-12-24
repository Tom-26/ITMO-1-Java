package pokemon;
import moveAttack.*;
import ru.ifmo.se.pokemon.*;
public class Porygon_Z extends Porygon2{
    public Porygon_Z(String name, int level) {
        super(name, level);
        setType(Type.NORMAL);
        setStats(85, 80, 70, 135, 75,90);
        setMove(new Facade(), new Psybeam(), new Swagger(), new DefenseCurl());
    }
}
