package heroes;

import SMTH.towel;
import exception.TowelException;

import static SMTH.towel.count;

public class freken_bok extends Human{
    public freken_bok(){super("Фрекен Бок");}
    public String talking(){
        return " и не вымолвила не слова.";
    }
    public String looking(){
        return "";
    }
    public String eating() {
        return "";
    }
    public String going() {
        return "";
    }
    public String thinking() {
        return "";
    }
    public String Towel = new towel().toString();
    public String personality = new String("грузная и решительная");
    public String hight = new String("высокая");
    public String leaps () {
        return " еще плотнее сжала губы";
    }
    public String  clean_up(){
        return name + " стала убирать со стола ";
    }
    public String wash(){
        return "и мыть посуду, ";
    }
    public String sing(){
        return "и даже Карлсона не смог ей испортить настроение, потому что она начала напевать 'Ах, Фрида, для тебя это лучше!..' ";
    }
    public String engr(){
        return "Но тут "+ name + " вдруг обнаружила, что нет ни одного " + towel.name + ", и снова рассердилась. ";
    }
    public String engr2(){return ("и "+name+" разозлилась еще больше, когда увидела, что их меньше 5. ");}

    public String checkTowel() {
        try {
            if (count < 5) {
                throw new TowelException();
            } else {
                return "их было больше 5, поэтому Фрекен Бок успкоилась. ";
            }
        } catch (TowelException e) {
            engr2();
        }
        return engr2();
    }

}



