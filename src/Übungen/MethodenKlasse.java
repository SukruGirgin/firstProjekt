package Übungen;

public class MethodenKlasse {

    //monatsGehaltRechner
    double stundenLohn;
    double wochenStunden;
    double monatsGehalt;
    final int nettoProzent = 60;

    //monatlicheFixkosten
    double miete;
    double handyverträge;
    double wochenEinkauf;
    double generelleVerträge;
    double schulden;
    double gesamtFixkosten;
    double differenzFixkostenGehalt;
    double verfügbaresGeld;
    double nettoSteuerabzug;


    public double nettoMonatsGehaltRechner() {
        double monatsGehalt = stundenLohn * ((wochenStunden / 5) * 30);
        return nettoSteuerabzug = (monatsGehalt * nettoProzent) / 100;
    }

    public double gesamtFixkostenZsm() {
        return gesamtFixkosten = miete + handyverträge +
                generelleVerträge + schulden + ((wochenEinkauf / 7) * 30);
    }

    public double monatlicheFixkosten() {
        return verfügbaresGeld = nettoMonatsGehaltRechner() - gesamtFixkostenZsm();
    }


}
