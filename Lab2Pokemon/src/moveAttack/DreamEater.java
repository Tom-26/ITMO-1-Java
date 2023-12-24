package moveAttack;

import ru.ifmo.se.pokemon.*;

public class DreamEater extends SpecialMove {
    private boolean isOpponentSleeping = false;
    public DreamEater() {super(Type.PSYCHIC, 100,100 ); }
    @Override
    protected void applyOppDamage(Pokemon pokemon, double a) {
        isOpponentSleeping = pokemon.getCondition().equals(Status.SLEEP);
        if (isOpponentSleeping){
            super.applyOppDamage(pokemon, a);
        }
        super.applyOppDamage(pokemon, 0);
    }
    @Override
    protected void applySelfDamage(Pokemon pokemon, double a){
        if (isOpponentSleeping){
            applyOppDamage(pokemon, -(0.5*a));
        }
    }
    @Override
    protected String describe() {
        return "attacks with Dream Eater";
    }
}
