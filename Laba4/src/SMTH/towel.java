package SMTH;

public class towel {
    public static final String name = "полотенца";

    public static int count= (int) (Math.random() * 10);
    public static String status = "грязные и мятые, ";
    public static String lenght = "охапкой";
    public String getStatusTowel(){
        return " Но все эти " + name + " были " +status;
    }
}
