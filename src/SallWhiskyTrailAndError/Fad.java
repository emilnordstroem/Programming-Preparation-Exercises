package SallWhiskyTrailAndError;

import java.util.HashMap;

public class Fad extends Beholder {
    private Historik historik;
    private final double literKapacitet;
    private double literPaafyldt;

    public Fad(double literKapacitet) {
        this.historik = new Historik(this);
        this.literKapacitet = literKapacitet;
    }

    @Override
    public void paafyldBeholder (Overfoerlig kilde, double literVolume) {
        if ((literKapacitet - literPaafyldt) >= literVolume
                && literVolume > 0) {
            if (kilde.tapningAfOverfoerlig(literVolume)) {
                literPaafyldt += literVolume;
                paafyldning.put(kilde, literVolume);
                historik.tilfoejHistorik(kilde.hentHistorik());
            }
        }
    }

    @Override
    public boolean tapningAfOverfoerlig(double literVolume) {
        if ((literKapacitet - literPaafyldt) >= 0
                && literVolume > 0) {
            literPaafyldt -= literVolume;
            return true;
        }
        return false;
    }

    @Override
    public Historik hentHistorik() {
        return historik;
    }

    @Override
    public void rydHistorik() {
        historik = new Historik(this);
    }

    public HashMap<Overfoerlig, Double> getPaafyldning() {
        return paafyldning;
    }

    public double getLiterKapacitet() {
        return literKapacitet;
    }

    public double getLiterPaafyldt() {
        return literPaafyldt;
    }

    @Override
    public String toString() {
        return "Fad{" +
                "literKapacitet=" + literKapacitet +
                ", literPaafyldt=" + literPaafyldt +
                '}';
    }
}