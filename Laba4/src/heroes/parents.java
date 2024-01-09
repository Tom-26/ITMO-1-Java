package heroes;
import SMTH.feeling;
import SMTH.gifts;
public class parents extends Human {

    public parents() {
        super("Мамы и Папы");
    }
    public String talking() {
        return "";
    }
    public String looking() {
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
    public void sendLetter(String gift) {
        gift = "открытке";
        System.out.println("в " + gift + " которую отправили родители");
    }
    public String travel() {
        return "Путешествиe было "+ feeling.BRILLIANT+", ";
    }
    public String write() {
        return "писали они, и надеются ";
    }
    // Локальный анонимный класс
    public String message() {
        gifts plot = new gifts();
        return plot.plotMethod();
    }
}
