import pokemon.*;
import ru.ifmo.se.pokemon.*;
public class Main {
 public static void main(String[] args) {
     Battle b = new Battle();
     Drowzee p1 = new Drowzee("Mike", 40);
     Girafarig p2 = new Girafarig("Tom", 20);
     Hipno p3 = new Hipno("Robert", 15);
     Porygon p4 = new Porygon("David", 30);
     Porygon2 p5 = new Porygon2("Walter", 35);
     Porygon_Z p6 = new Porygon_Z("Jessie", 40);
    b.addAlly(p1);
    b.addAlly(p3);
    b.addAlly(p5);

    b.addFoe(p2);
    b.addFoe(p4);
    b.addFoe(p6);

    b.go();
 }

}