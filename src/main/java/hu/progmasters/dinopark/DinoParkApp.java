package hu.progmasters.dinopark;

public class DinoParkApp {

    static String whatever = "Whatever";

    public static void main(String[] args) {
        DinoParkApp.whatever="";

        DinoParkApp dinoParkApp = new DinoParkApp();
        dinoParkApp.whatever="";    // Bad practice!
    }
}
