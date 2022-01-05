package Übungen;

public class Mitarbeiter {

    String[] name;
    String[] nachname;
    String adresse;
    String abteilung;
    String standort;

    boolean homeoffice;
    boolean probezeit;

    int[] alter;
    int rentenAlter = 67;
    int neueArbeitsstunden;
    int arbeitsStundeBleibt;

    double stundengehalt;
    double wochenArbeitsstunden;
    double neuerLohn;
    double ueberLohn;

    int neueRente;
    int frühRente;

    double monatsGehalt;
    int differenzRenteUndAlter;

    public void monatsGehalt() {
        monatsGehalt =  (stundengehalt * (wochenArbeitsstunden / 5)) * 30;
    }

    public void bisRente() {
        //differenzRenteUndAlter = rentenAlter - alter;
    }
/*
    public static void doSomething() {
        int x = 10;
        int y = 20;
        int result = x + y;
        System.out.println(result);
    }
*/
    public static int diesIsteineMethode(int nummer1, int nummer2) {
        return nummer1 + nummer2;
    }

    public int methode1() {
        int x = 1;
        int y = 2;
        int ergebnis = x + y;

        return ergebnis;
    }

    /*
    public int ergebnisRechner(){
     int neueMitarbeiter = 150;
     int neueMitarbeiterAnzahl = mitarbeiterAnzahl + neueMitarbeiter;
    }
     */


/*
    public void berechneStudenlohn(){
        if (stundengehalt < 15) {
            neuerLohn = stundengehalt + (15 - stundengehalt);
            /*System.out.println("Stundegehalt wurde auf 15€/h aufgestockt, also ist der neue Lohn: " + neuerLohn +
            "€ " +  "und der alte lag bei: " + stundengehalt + "€."); */
/*        } else {
            ueberLohn = stundengehalt - 15;
            /* System.out.println("Stundengehalt liegt " + ueberLohn + "€ über deinem Lohn."); */
 /*       }
    }

    public void berechneRentenalter() {
        if (rentenAlter > 67) {
            neueRente = 67;
        } else {
            frühRente = rentenAlter;
        }
    }

    public void berechneArbeitsstunden() {
        if (wochenArbeitsstunden > 40) {
            neueArbeitsstunden = 40;
        } else {
            arbeitsStundeBleibt = wochenArbeitsstunden;
        }
    }
*/

}
