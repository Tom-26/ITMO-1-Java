package moveAttack;

import ru.ifmo.se.pokemon.*;

public class Headbutt extends PhysicalMove {
    public Headbutt(){super (Type.NORMAL,70 , 100);}
    @Override
    protected void applyOppDamage(Pokemon pokemon, double a){
        pokemon.setMod(Stat.HP, (int) Math.round(a));
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon){
        Effect.confuse(pokemon);
    }
    @Override
    protected String describe() { return "attacked with Headbutt";}
}
