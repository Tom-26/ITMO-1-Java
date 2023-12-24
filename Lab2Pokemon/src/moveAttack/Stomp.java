package moveAttack;
import ru.ifmo.se.pokemon.*;
public class Stomp  extends PhysicalMove{
    public Stomp() {super(Type.NORMAL, 65 ,100);}
    @Override
    protected void applyOppDamage(Pokemon pokemon, double a){
        pokemon.setMod(Stat.HP, (int) Math.round(a));
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon){
        Effect.confuse(pokemon);
    }
    @Override
    protected String describe() {
        return "attacks with Take Down";
    }
}
