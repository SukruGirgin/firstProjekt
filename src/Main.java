/*
1. Klasse erstellen
2. Eigenschaften erstellen
3. Methoden erstellen
4. in die Main
5. Objekt erstellen
6. Methode über Objekt ausführen
*/


public class Main {

    public static void main(String[] args) {





/*
        librarie apache common wurde immer vorgeschlagen bei den lösungen um strings in der console zu zentrieren,
        ich wusste nicht wie ich das installieren soll.
/*
        Auto[] autos = {new Auto(), new Auto(), new Auto()};

        autos[0].marke = "Audi";
        autos[0].model = "A8";
        autos[0].farbe = "Schwarz";
        autos[0].maxGeschwindigkeit = 280;
        autos[0].preis = 280000;
        autos[0].ps = 80;
        autos[0].sitze = 5;

        autos[0].minZeitZurAnkunft("Berlin", "Hamburg", 360);
        autos[0].minRechner();
*/



/*
        Strecken[] strecke = {new Strecken(), new Strecken(), new Strecken()};

        System.out.println(strecke[0].preisAusgabe("Hamburg", "Berlin"));
        System.out.println(strecke[0].rückGeld(50));
        System.out.println();
        System.out.println(strecke[1].preisAusgabe("Kiel", "Berlin"));
        System.out.println(strecke[1].rückGeld(50));
        System.out.println();
        System.out.println(strecke[2].preisAusgabe("Berlin", "Hamburg"));
        System.out.println(strecke[2].rückGeld(70));
*/


/*
        LearningArray arrSout = new LearningArray();
        arrSout.array2();
        System.out.println(arrSout.array3());

        LearningForSchleife forSout = new LearningForSchleife();
        forSout.forEachSchleife2();
*/

/*
        Bibliothek[] bibliothekArray = {new Bibliothek(), new Bibliothek(), new Bibliothek()};

        bibliothekArray[0].standort = "Hamburg";
        bibliothekArray[1].standort = "Berlin";
        bibliothekArray[2].standort = "Kiel";

        bibliothekArray[0].buchName = "Der Pate";
        bibliothekArray[1].buchName = "Der Sizilianer";
        bibliothekArray[2].buchName = "Das Buch";

        bibliothekArray[0].buchAnzahl = 2;
        bibliothekArray[1].buchAnzahl = 3;
        bibliothekArray[2].buchAnzahl = 5;

        System.out.println(bibliothekArray[1].toString());

        int[] a = {12, 17, 23, 25};
        System.out.println(a[0]); //12
*/






/*
        //3 array: einer speichert 4 int, einer speichert 5 string, und 3 Bibliotheken(klassen objekte)

        Bibliothek bibliotheken1 = new Bibliothek();
        Bibliothek bibliotheken2 = new Bibliothek();
        Bibliothek bibliotheken3 = new Bibliothek();

        Bibliothek[] bibliothekenArray = new Bibliothek[99];
        bibliothekenArray[0] = bibliotheken1;
        bibliothekenArray[1] = bibliotheken2;
        bibliothekenArray[2] = bibliotheken3;

        bibliotheken1.standort = "Hamburg";
        bibliotheken1.buchName = "Nizam ul-Islam";
        bibliotheken1.buchAnzahl = 5;

        bibliotheken2.standort = "Berlin";
        bibliotheken2.buchName = "Mafahim at-HuT";
        bibliotheken2.buchAnzahl = 5;

        bibliotheken3.standort = "Lübeck";
        bibliotheken3.buchName = "Takattul";
        bibliotheken3.buchAnzahl = 4;

        System.out.println(bibliothekenArray[0].standort);
*/



/*
        Mitarbeiter mitarbeiter = new Mitarbeiter();
        mitarbeiter.name = new String[]{"Günther", "Harald", "Benny"};
        mitarbeiter.nachname = new String[]{"Müller", "Bäcker", "Bauer"};
        mitarbeiter.alter = new int[]{20, 25, 37};
        System.out.println("- " + mitarbeiter.name[1] + ", " + mitarbeiter.nachname[1] + ", " + mitarbeiter.alter[1] + " -");
*/






/*
        ForSchleife bsp = new ForSchleife();
        bsp.forSchleife2();
*/




/*
        WhileSchleife bsp = new WhileSchleife();

        bsp.whileTannenbaum();
*/



/*
        SwitchCaseBeispiel bsp = new SwitchCaseBeispiel();

        bsp.switchWithInt(7);
        bsp.switchWithInt(3);
*/





/*
        if (!true && !false) {
            System.out.println("ist Wahr!");
        } else {
            System.out.println("ist Falsch!");
        }
*/


/*
        IfElseOperatorenÜbung beispielObject = new IfElseOperatorenÜbung();

        beispielObject.ifElseBeispiel(5, 13);
        beispielObject.ifElseBeispiel(13, 5);
*/

/*
        Taschenrechner TRObject = new Taschenrechner();

        TRObject.zahl4 = 4;

        TRObject.zahl4ÄndernMethode(12);

        System.out.println(TRObject.zahl4);

*/



/*
        Kurs neuerKursPreis = new Kurs();

        neuerKursPreis.preis = 8000;
        int neuerPreisFinal = neuerKursPreis.preisVeränderung(-300); // neuerPreisFinal = 8000 + -300

        System.out.println(neuerPreisFinal);
*/




/*
        WieHochIstBruttoAbgabe bruttoAbgabeSedat = new WieHochIstBruttoAbgabe();
        WieHochIstMwrtStAbgabe mwrtStAbgabeSedat = new WieHochIstMwrtStAbgabe();


        double ergebnisSedat =
                bruttoAbgabeSedat.bruttoAbgabeRechner(2500) + mwrtStAbgabeSedat.mehrwertSteuerRechner(500);

        System.out.println("Steuerabgabe im Monat beträgt: " + ergebnisSedat);
        System.out.println(" ");
        System.out.println("Gehalt:  " + bruttoAbgabeSedat.bruttoAbgabeRechner(2500));
        System.out.println("einkauf: " + mwrtStAbgabeSedat
        .mehrwertSteuerRechner(500));
*/



/*
        AutoHaus autoHinzu = new AutoHaus();
        autoHinzu.standort = "Bergedorf";

        NeueAutos audiA8 = new NeueAutos();
        audiA8.hersteller = "VW";
        audiA8.gebraucht = "gebraucht";
        audiA8.km = 18000;
        audiA8.marke = "Audi A8";
        audiA8.schäden = "Keine Schäden";
        audiA8.bestand = 1;
        audiA8.preis = 14500;

        autoHinzu.autoHinzufügen(audiA8);

 */




/*
        Taschenrechner myTR = new Taschenrechner();

        //myTR.rechnerPlus(20, 30);
        //myTR.fixKosten(620, 80, 800);



        System.out.print("übrig bleibt: ");
        myTR.monatsEinkommen(1700, 190, 3, 100, 800, 200, 300);


 */

/*
        dawaTräger brother1 = new dawaTräger();
        brother1.thema1 = "Problem";
        brother1.thema2 = "Schöpfer";
        brother1.thema3 = "kheir & Shar";
        brother1.thema4 = "propheten";
        brother1.thema5 = "WunderIslam";
        brother1.thema6 = "SinnDesLebens";

        dawaTräger brother2 = new dawaTräger();
        brother2.thema1 = "SinnDesLebens";
        brother2.thema2 = "Schöpfer";
        brother2.thema4 = "propheten";
        brother2.thema5 = "WunderIslam";
        brother2.thema6 = "SinnDesLebens";

        dawaTräger brother3 = new dawaTräger();
        brother3.thema1 = "Rizk";
        brother3.thema2 = "Ecel";

        dawaTräger brother4 = new dawaTräger();
        brother4.thema1 = "Mefhum von Deen";
        brother4.thema2 = "Hubullah va Rasul";
        brother4.thema3 = "Hub ud Dunya";
        brother4.thema4 = "Taqwa";


        System.out.println(" ");
        System.out.print("Brother1: ");
        brother1.themenWahl();
        System.out.println(" ");
        System.out.print("Brother2: ");
        brother2.themenWahl();
        System.out.println(" ");
        System.out.print("Brother3: ");
        brother3.themenWahl();
        System.out.println(" ");
        System.out.print("Brother4: ");
        brother4.themenWahl();
*/


/*
        MethodenKlasse bruttoNetto = new MethodenKlasse();

        bruttoNetto.stundenLohn = 18.5; //2664
        bruttoNetto.wochenStunden = 40;
        bruttoNetto.miete = 720;
        bruttoNetto.wochenEinkauf = 70;
        bruttoNetto.generelleVerträge = 80;
        bruttoNetto.handyverträge = 70;
        bruttoNetto.schulden = 240;

        //40% abzüge


        System.out.println("Gesamtfixkosten Beträgt: " + bruttoNetto.gesamtFixkostenZsm());

        System.out.println("Netto       " + bruttoNetto.nettoMonatsGehaltRechner());
        System.out.println("Fixkosten   " + bruttoNetto.gesamtFixkostenZsm() + "    //Fixkosten Falsch");

        System.out.println("Differenz = " + bruttoNetto.monatlicheFixkosten());
        System.out.println("Kontrolle:  " + (2664 - 1410));
*/

/*
        Mitarbeiter mitarbeiter1 = new Mitarbeiter();

        mitarbeiter1.vorname = "VORNAME";
        mitarbeiter1.nachname = "NACHNAME";
        mitarbeiter1.adresse = "ADRESSE";
        mitarbeiter1.abteilung = "ABTEILUNG";
        mitarbeiter1.standort = "STANDORT";

        mitarbeiter1.homeoffice = true;
        mitarbeiter1.probezeit = false;

        mitarbeiter1.alter = 22;
        mitarbeiter1.rentenAlter = 65;
        mitarbeiter1.berechneRentenalter();
        mitarbeiter1.wochenArbeitsstunden = 45;
        mitarbeiter1.berechneArbeitsstunden();

        mitarbeiter1.stundengehalt = 17.50;
        mitarbeiter1.berechneStudenlohn();

        System.out.println("Vorname:       " + mitarbeiter1.vorname);
        System.out.println("Nachname:      " + mitarbeiter1.nachname);
        System.out.println("Adresse:       " + mitarbeiter1.adresse);
        System.out.println("Abteilung:     " + mitarbeiter1.abteilung);
        System.out.println("Standort:      " + mitarbeiter1.standort);

        if (mitarbeiter1.homeoffice == true) {
            System.out.println("Homeoffice:    Ja");
        } else {
            System.out.println("Homeoffice:    Nein");
        }
        if (mitarbeiter1.probezeit == true) {
            System.out.println("Probezeit:     Ja");
        } else {
            System.out.println("Probezeit:     Nein");
        }

        /*
        System.out.println("Homeoffice:    " + mitarbeiter1.homeoffice);
        System.out.println("Probezeit:     " + mitarbeiter1.probezeit);
        */

        /*
        System.out.println("Alter:         " + mitarbeiter1.alter);

        if (mitarbeiter1.rentenAlter > 67) {
            System.out.println("Rentenalter:   " + mitarbeiter1.neueRente);
        } else {
            System.out.println("Rentenalter:   " + mitarbeiter1.frühRente);
        }

        if (mitarbeiter1.wochenArbeitsstunden > 40) {
            System.out.println("Stunden/Woche: " + mitarbeiter1.neueArbeitsstunden);
        } else {
            System.out.println("Stunden/Woche: " + mitarbeiter1.arbeitsStundeBleibt);
        }


        if (mitarbeiter1.stundengehalt < 15) {
            System.out.println("Stundenlohn:   " + mitarbeiter1.neuerLohn + "€");
        } else {
            System.out.println("Stundenlohn:   " + mitarbeiter1.stundengehalt + "€");
        }*/
/*

        Scanner scanner = new Scanner(System.in);

        Mitarbeiter mitarbeiter1 = new Mitarbeiter();


        //Scanner bereich...
        System.out.print("Vorname: ");
        String vornameScanner = scanner.next();
        mitarbeiter1.vorname = vornameScanner;

        System.out.print("Nachname: ");
        String nachnameScanner = scanner.next();
        mitarbeiter1.nachname = nachnameScanner;

        System.out.print("Adresse: ");
        String adresseScanner = scanner.next();
        mitarbeiter1.adresse = adresseScanner;

        System.out.print("Abteilung: ");
        String abteilungScanner = scanner.next();
        mitarbeiter1.abteilung = abteilungScanner;

        System.out.print("Standort: ");
        String standortScanner = scanner.next();
        mitarbeiter1.standort = standortScanner;

        /*
        System.out.print("Homeoffice: ");
        String homeofficeScanner = scanner.next();
        mitarbeiter1.homeoffice = homeofficeScanner;

        System.out.print("Probezeit: ");
        String probezeitScanner = scanner.next();
        mitarbeiter1.probezeit = probezeitScanner;
        */

/*

        System.out.print("Alter: ");
        int alterScanner = Integer.parseInt(scanner.next());
        mitarbeiter1.alter = alterScanner;

        System.out.print("Rentenalter: ");
        int rentenAlterScanner = Integer.parseInt(scanner.next());
        mitarbeiter1.rentenAlter = rentenAlterScanner;

        System.out.print("Wöchentliche Arbeitsstunden: ");
        int wochenArbeitsstundenScanner = Integer.parseInt(scanner.next());
        mitarbeiter1.wochenArbeitsstunden = wochenArbeitsstundenScanner;

        System.out.print("Stundenlohn: ");
        double stundengehaltScanner = Double.parseDouble(scanner.next());
        mitarbeiter1.stundengehalt = stundengehaltScanner;
        mitarbeiter1.berechneStudenlohn(); //zugriff auf Mitarbeiter Method if/else

        //Ausgabebereich...
        System.out.println("");
        System.out.println("Vorname des Mitarbeiters ist:    " + mitarbeiter1.vorname);
        System.out.println("Nachname des Mitarbeiters ist:   " + mitarbeiter1.nachname);
        System.out.println("Adresse des Mitarbeiters ist:    " + mitarbeiter1.adresse);
        System.out.println("Abteilung des Mitarbeiters ist:  " + mitarbeiter1.abteilung);
        System.out.println("Standort des Mitarbeiters ist:   " + mitarbeiter1.standort);
        System.out.println("");
        System.out.println("Alter des Mitarbeites ist:       " + mitarbeiter1.alter);
        System.out.println("Rentenalter des Mitarbeites ist: " + mitarbeiter1.rentenAlter);
        System.out.println("Stunden die Woche:               " + mitarbeiter1.wochenArbeitsstunden);


        if (mitarbeiter1.stundengehalt < 15) {
            System.out.println(" ");
            System.out.println("Neuer Lohn:                      " + mitarbeiter1.neuerLohn + "€");
        } else {
            System.out.println(" ");
            System.out.println("Stundenlohn:                     " + mitarbeiter1.stundengehalt + "€");
        }

*/
        //Mitarbeiter.doSomething();
/*
        System.out.println(Mitarbeiter.diesIsteineMethode(35, 10));


        Mitarbeiter sam = new Mitarbeiter();

        sam.vorname = "Sam";
        sam.nachname = "Uslu";
        sam.alter = 30;
        sam.wochenArbeitsstunden = 40;
        sam.stundengehalt = 17.5;

        sam.monatsGehalt();
        sam.bisRente();
        System.out.println("Methode1 Ausgabe: " + sam.methode1());


        System.out.println(sam.vorname + " " + sam.nachname + " / " + sam.alter);
        System.out.println("");
        System.out.println("Monatliches Gehalt:  " + sam.monatsGehalt);
        System.out.println("Jahre bis zur Rente: " + sam.differenzRenteUndAlter);

 */
    }
}
