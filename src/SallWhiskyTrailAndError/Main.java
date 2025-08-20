package SallWhiskyTrailAndError;

public class Main {

    public static void main(String[] args) {
        Destillat destillat = new Destillat(100);
        Fad fad1 = new Fad(30);
        fad1.paafyldBeholder(destillat, 20);
        System.out.println(fad1.getLiterKapacitet() + " " + fad1.getLiterPaafyldt());
        System.out.println(destillat.getSamletLiter());
        System.out.println("=================");
        Fad fad2 = new Fad(30);
        fad2.paafyldBeholder(fad1, 20);
        System.out.println(fad2.getLiterPaafyldt() + " " + fad1.getLiterPaafyldt());
        System.out.println("=================");
        System.out.println(fad2.hentHistorik().getHistorikListe());

    }

}