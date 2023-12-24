package moveAttack;
import ru.ifmo.se.pokemon.*;
public class Psychic extends SpecialMove {
    public Psychic(){super (Type.PSYCHIC, 90,  100);}
    @Override
    protected void applyOppDamage(Pokemon pokemon, double a){
        pokemon.setMod(Stat.HP, (int) Math.round(a));
        pokemon.setMod(Stat.SPECIAL_DEFENSE, (int) -1);
    }
@Override
    protected String describe() { return  "attacked Psychic ";}
}
