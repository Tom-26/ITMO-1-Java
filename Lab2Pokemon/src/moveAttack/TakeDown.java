package moveAttack;
import ru.ifmo.se.pokemon.*;

public class TakeDown extends PhysicalMove{
    public TakeDown(){
        super(Type.NORMAL, 90, 85);
    }
    @Override
    protected void applySelfDamage(Pokemon att, double damage){
        att.setMod(Stat.HP, (int)(0.25*Math.round(damage)));
    }
    @Override
    protected String describe() {
        return "attacks with Take Down";
    }
}