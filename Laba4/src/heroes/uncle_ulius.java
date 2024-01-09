package heroes;

import SMTH.sigara;
import exception.PoliceException;
import interfaces.afraid;

public class uncle_ulius extends Human implements afraid {
    public uncle_ulius() {super("Дядя Юлиус");}
    String x = new String( "все ворчал:");

    public String talking(){
        return  "Он "+ x;
    }
    public String looking(){
        return "И " + name + " c восторгом посмотрел на Карлсона";
    }
    public String eating() {return "";}
    public String going() {
        return " После обеда "+ name + " отправился в гостинную, " ;
    }
    public String thinking() {
        return "Он явно был очень рад и благодарен, что получил назад свои вещи, но все же считал, что мальчики не должны ходить с онестрельным оружием, и когда ";
    }
    public String hearing() {
        return "но казалось " + name + " ничего не слышал";
    }
    public String calling(){
        return name + " звонил в полицию. ";
    }
   public String afraid(){
        return(this.name + ", по правде сказать, тоже испугался этого пистолета");

   }
   public String belive(){
    return this.name + " никак не мог в это поверить.";
    }
   sigara sigara= new sigara();
   public String smoke = new sigara().toString();
   public String getSmoke(){
       return("чтобы взять сигару "+ sigara.burn()+" и закурить. ");
   }


}
