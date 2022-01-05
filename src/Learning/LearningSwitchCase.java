package Learning;

public class LearningSwitchCase {


    public void zügeVonHamburgNach(String startBahnhof, String zielBahnhof) {

        startBahnhof = "Hamburg";

        switch (zielBahnhof) {
            case "Berlin" :
                System.out.println("Die Strecke Kostet 56€");
                break;

            case "München" :
                System.out.println("Die Strecke Kostet 70€");
                break;

            case "Kiel" :
                System.out.println("Die Strecke Kostet 24€");
                break;

            case "Düsseldorf" :
                System.out.println("Die Strecke Kostet 49€");
                break;

            default :
                System.out.println("Die Strecke existiert nicht!");
                break;
        }


    }









    public void switchWithInt(int zahl) {

        switch (zahl) {
            case 1 :
                System.out.println("Zahl ist eine 1");
                break;
            case 2 :
                System.out.println("Zahl ist eine 2");
                break;
            case 3 :
                System.out.println("Zahl ist eine 3");
                break;
            case 4 :
                System.out.println("Zahl ist eine 4");
                break;
            case 5 :
                System.out.println("Zahl ist eine 5");
                break;
            default :
                System.out.println("Zahl ist größer als 5");
                break;

        }

    }


    public void switchCase(String name) {

        switch (name) {
            case "Sobeir" :
                System.out.println("Der Name ist Sobeir!");
                break;

            case "Sedat" :
                System.out.println("Der Name ist Sedat!");
                break;

            case "Abdussamed" :
                System.out.println("Der Name ist Abdussamed!");
                break;

            case "Sükrü" :
                System.out.println("Der Name ist Sükrü!");
                break;

            default :
                System.out.println("Der Name existiert nicht!");
                break;
        }
    }
}
