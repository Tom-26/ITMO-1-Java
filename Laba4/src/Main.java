import exception.*;
import heroes.*;
import SMTH.*;
public class Main {
    public static void main(String[] args) {
        freken_bok freken_bok = new freken_bok();
        karlson karlson = new karlson();
        malish malish = new malish();
        parents parents= new parents();
        gifts gifts= new gifts();
        thifer thifers = new thifer();
        uncle_ulius uncle_ulius = new uncle_ulius();
        police police=new police();
        towel towel = new towel();
        StringBuilder sb = new StringBuilder();
        sb.append(freken_bok.name+freken_bok.leaps()+freken_bok.talking()+ " ");
        sb.append(malish.looking()+", ");
        sb.append(uncle_ulius.hearing()+". "+uncle_ulius.calling());
    System.out.print(sb);
            String m=null;
        StringBuilder sb2 = new StringBuilder();
    sb2.append("У них за ночь случилось 313 краж, сказали они, которыми надо заняться. "+ police.interest()+". ");
    sb2.append(uncle_ulius.looking()+" который приосанился, как петух, и "+ karlson.looking());
    sb2.append(uncle_ulius.afraid()+". "+uncle_ulius.thinking());
    sb2.append(thifers.run_away()+". "+ malish.explain());
    sb2.append(uncle_ulius.belive()+uncle_ulius.going()+uncle_ulius.getSmoke());
    sb2.append(freken_bok.clean_up()+ freken_bok.wash()+freken_bok.sing());
    sb2.append(freken_bok.engr()+ karlson.runinoterworld()+karlson.takeTowels());
    sb2.append(towel.getStatusTowel()+ freken_bok.checkTowel());
    sb2.append("Шли дни. "+malish.getPaper() + gifts.name + "от " + parents.name +". ");
    sb2.append(parents.travel()+parents.write()+malish.spendTime()+"."+parents.message()+karlson.upset());
            boolean goodPolice=true;
            try {
                if (goodPolice && Math.random() < 0.5) {
                    throw new PoliceException();
                } else {
                    m=uncle_ulius.talking() + " какая в городе "+feeling.BAD+" полиция!";
                    System.out.println(m+" "+sb2);
                }
            } catch (PoliceException e) {
                 m= e.getMessage();
            System.out.println(m);
            }
    }
}