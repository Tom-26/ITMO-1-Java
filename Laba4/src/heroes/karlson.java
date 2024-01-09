package heroes;

import SMTH.towel;
import interfaces.fly;

public class karlson extends Human implements fly {
    public karlson () {super("Карлсон");}
    public String Towel = new towel().toString();
    public String talking(){return "";}
    public String looking(){
        return "бросил на Фрекен Бок свой торжествующий взгляд ";
    }
    public String eating() {return "";}
    public String going() {
        return "";
    }
    public String thinking() {return "";}
    public String personality = new String(name + "веселый, наглый и самоуверенный");
    public String hight = new String(name + "низкорослый");
    public void getUpset(){
        System.out.println(name + "на это сильно обиделся");
    }
    public String takeTowels(){
        return" вернулся с огромной " +towel.lenght +" полотенец, что его самого не было видно.";
    }
    public void backTowels(String towel){}
    public String fly() {
        return "";
    }
    public String runinoterworld(){
        return (name+" сбегал в комнату Малыша ");
    }
    public String upset(){
        return (", и " + name + " на это сильно обиделся. ");
    }
}
