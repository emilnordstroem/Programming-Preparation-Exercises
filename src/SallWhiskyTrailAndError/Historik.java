package SallWhiskyTrailAndError;

import java.util.ArrayList;

public class Historik {
    private ArrayList<Overfoerlig> historikListe = new ArrayList<>();

    public Historik(Overfoerlig overfoerlig) {
        historikListe.add(overfoerlig);
    }

    public void tilfoejHistorik(Historik historik){
        historikListe.addAll(historik.getHistorikListe());
    }

    public ArrayList<Overfoerlig> getHistorikListe() {
        return historikListe;
    }

}
