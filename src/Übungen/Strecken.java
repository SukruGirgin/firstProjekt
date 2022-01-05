package Übungen;

public class Strecken {

    double preis;
    double fehler;

    public double preisAusgabe(String startHaltestelle, String zielHaltestelle){
        if (startHaltestelle == "Hamburg" && zielHaltestelle == "Berlin") {
            return preis = 24.95;
        } else if (startHaltestelle == "Berlin" && zielHaltestelle == "Hamburg"){
            return preis = 14.95;
        } else {
            System.out.print("Fehler: ");
            return fehler = 404.404;
        }
    }

    public double rückGeld(double gegebenesGeld){
        if (fehler != 404.404) {
            double rückgeld;
            return rückgeld = gegebenesGeld - preis;
        } else {
            System.out.print("Fehler: ");
            return fehler = 404.404;
        }
    }




}
