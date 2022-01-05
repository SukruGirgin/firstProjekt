package Übungen;

public class TaschenrechnerAlt {

    public void rechnerPlus(int a, int b) {
        System.out.println(a+b);
    }

    public void fixKosten(int miete, int rechnungen, int einkommen){
        System.out.println(einkommen - miete - rechnungen);
    }

    public void monatsEinkommen(int jcEinnahme, int kindergeldHöhe, int kindergeldPp, int zuschüsse,
                                int miete, int rechnungen, int fixkosten){
        System.out.println((jcEinnahme + (kindergeldHöhe * kindergeldPp) + zuschüsse) - (miete + rechnungen + fixkosten));
    }

}
