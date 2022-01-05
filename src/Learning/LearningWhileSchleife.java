package Learning;

public class LearningWhileSchleife {



    public void doWhile(){

    }


    int num1 = 1;

    public void doWhileSchleife() {

        do {
            System.out.println(num1);
            num1++;
        } while (num1 <= 5);

    }


    String stern = "*";
    int zähler = 0;
    String s;

    public void whileTannenbaum() {
        String stern = "*";
        while (stern.length() < 15) {
            System.out.println(stern);
            stern += "*";
        }
        System.out.println("**");
        System.out.println("**");

    }




    boolean nagelDrin = false;
    int zählerHammerSchlag = 0;


    public void whileSchleifeHammerNagel() {

        while (zählerHammerSchlag < 10) {
            System.out.println("Schlag mit Hammer an Wand!");
            zählerHammerSchlag++;
            if (zählerHammerSchlag == 10) {
                nagelDrin = true;
                System.out.println("Nagel ist drin!");
                System.out.println("nagelDrin = " + nagelDrin);
            }
        }

    }





    int zahl = 0;
    int zahl2 = 10;

    public void whileSchleifePlus() {

        while (zahl < 10) {
            System.out.println(zahl);
            zahl++;
        }
        System.out.println("Ende der Plus Schleife!");

    }

    public void whileSchleifeMinus() {


        while (zahl >= 0) {
            System.out.println(zahl2);
            zahl2--;
        }
        System.out.println(" ");
        System.out.println("Ende der Minus Schleife!");

    }



}
