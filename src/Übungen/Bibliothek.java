package Übungen;

public class Bibliothek {

    String standort;
    String buchName;
    int buchAnzahl;

    @Override
    public String toString() {
        return "Bibliothek{" +
                "standort='" + standort + '\'' +
                ", buchName='" + buchName + '\'' +
                ", buchAnzahl=" + buchAnzahl +
                '}';
    }
}
