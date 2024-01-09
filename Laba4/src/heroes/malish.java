package heroes;

import SMTH.feeling;

public class malish extends Human {
    public malish(){super("Малыш");}
    public String talking(){return "";}
    public String looking(){
        return name +" "+ feeling.WOORING+" посмотрел на Дядю Юлиуса";
    }
    public String eating() {return "";}
    public String going() {return "";}
    public String thinking() {return "";}
    private String personality = new String("трогательный, добрый и застенчивый");
    public String explain(){
        return(this.name + " очень долго обьяснял, что это игрушка. ");
    }
    public String getPaper(){
        return name + " получил ";
    }
    public String spendTime(){
        return ("что "+name + " тоже "+feeling.HAPPY+" проводит время и что он "+feeling.GOOD+" ладит с дядей Юлиусом и Фрекен Бок" );
    }
}
