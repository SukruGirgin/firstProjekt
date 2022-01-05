package Übungen;

public class Auto {

    //Eigenschaften
    String marke;
    String model;
    String farbe;

    int ps;
    int sitze;

    double maxGeschwindigkeit; // 280km/h zu 360km
    double preis;
    double dauerGerundet;
    double maxGeschInMdSek = maxGeschwindigkeit;

    //methoden
    public void minZeitZurAnkunft(String start, String ziel, int km){
        double dauerDerFahrtInStd = km / maxGeschwindigkeit;
        double dauerGerundet = Math.round(dauerDerFahrtInStd * 100) / 100;
        System.out.println(dauerDerFahrtInStd);
        System.out.println(dauerGerundet);
    }

    public void minRechner(){
        int dauerMal100 = (int)dauerGerundet * 100;
        double kommaHinterStd = (dauerGerundet * 100) - dauerMal100;
        double kommaInMin = (60 * kommaHinterStd) / 100;
        int dieStundeEinzeln = (int)dauerGerundet;
        System.out.println();
        System.out.println("Fahrt dauert: " + dieStundeEinzeln + "Std und " + kommaInMin + "min.");
        System.out.println("Kontrolle: ");
        System.out.println("Dauer Gerundet: " + dauerGerundet);
        System.out.println("Komme in Min: " + kommaInMin);
    }


    public String objektToString() {
        return "Auto {" +
                "Marke='" + marke + '\'' +
                ", Model='" + model + '\'' +
                ", Farbe='" + farbe + '\'' +
                ", PS=" + ps +
                ", max Geschwindigkeit=" + maxGeschwindigkeit +
                "km/h , Sitze=" + sitze +
                ", Preis=" + preis +
                '}';
    }
}
