package heroes;
import interfaces.run_away;

public class thifer extends Human implements run_away {
    public thifer(){super("Филле и Рулле");}
    public String talking(){return "";}
    public String looking(){return "";}
    public String eating() {return "";}
    public String going() {return "";}
    public String thinking() {return "";}
    public String run_away(){
        return(name + " удирали");
    }

}
