package moveAttack;

import ru.ifmo.se.pokemon.*;

public class DefenseCurl extends StatusMove {
    public DefenseCurl() {super(Type.NORMAL, 0, 0);}
    @Override
    protected void applySelfEffects(Pokemon pokemon) {pokemon.setMod(Stat.DEFENSE, +1);}
    @Override
    protected String describe() {return "Used Defence Curl";}
}
