package moveAttack;

import ru.ifmo.se.pokemon.*;

public class FocusBlast extends SpecialMove {
    public FocusBlast() {super (Type.FIGHTING, 120, 70);}
    @Override
    protected void applyOppEffects(Pokemon pokemon){
        pokemon.setMod(Stat.SPECIAL_DEFENSE, -1);
    }
}
