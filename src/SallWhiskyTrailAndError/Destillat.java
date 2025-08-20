package SallWhiskyTrailAndError;

public class Destillat implements Overfoerlig {
    private Historik historik;
    private double samletLiter;

    public Destillat(double samletLiter) {
        this.historik = new Historik(this);
        this.samletLiter = samletLiter;
    }

    @Override
    public boolean tapningAfOverfoerlig(double literVolume){
        if ((samletLiter - literVolume) >= 0
                && literVolume > 0) {
            samletLiter -= literVolume;
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

    public double getSamletLiter() {
        return samletLiter;
    }

    @Override
    public String toString() {
        return "Destillat{" +
                "samletLiter=" + samletLiter +
                '}';
    }
}
