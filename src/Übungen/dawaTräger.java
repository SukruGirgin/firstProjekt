package Übungen;

public class dawaTräger {

    String thema1;
    String thema2;
    String thema3;
    String thema4;
    String thema5;
    String thema6;

    public void themenWahl() {

        if (thema1 == "Problem" && thema2 == "Schöpfer" && thema3 == "kheir & Shar"
                && thema4 == "propheten" && thema5 == "WunderIslam" && thema6 == "SinnDesLebens")  {

            System.out.println("Gute Reihe!");

        } else if (thema1 == "Rizk" && thema2 == "Ecel"){

            System.out.println("Gute Reihe Nach Aqida");

        } else if (thema1 == "Mefhum von Deen" && thema2 == "Hubullah va Rasul" && thema3 == "Hub ud Dunya" && thema4 == "Lieben und Hassen") {

            System.out.println("Gute Mefehim Reihe");

        } else {

            System.out.println("Schlechte Reihe");

        }


    }




}
