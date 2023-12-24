package moveAttack;

import ru.ifmo.se.pokemon.*;

public class Psybeam extends SpecialMove {
    public Psybeam(){super(Type.PSYCHIC, 65, 100);}
    @Override
    protected void applyOppDamage(Pokemon pokemon, double a){
        pokemon.setMod(Stat.HP,(int) Math.round(a));
    }
    @Override
    protected void applyOppEffects(Pokemon pokemon){
        if (Math.random() <=0.33) Effect.confuse(pokemon);}
    @Override
    protected String describe(){
        return "used Double team";
    }

}
