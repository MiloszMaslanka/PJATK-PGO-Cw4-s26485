public class Tester extends Pracownik {
    private boolean czyAutomatyzujacy;
    private int liczbaScenariuszy;

    public Tester(String idPracownika, String imie, String nazwisko, double stawkaBazowa,
                  boolean czyAutomatyzujacy, int liczbaScenariuszy) {
        super(idPracownika, imie, nazwisko, stawkaBazowa);
        this.czyAutomatyzujacy = czyAutomatyzujacy;
        this.liczbaScenariuszy = liczbaScenariuszy;
    }

    public boolean isCzyAutomatyzujacy() {
        return czyAutomatyzujacy;
    }

    public int getLiczbaScenariuszy() {
        return liczbaScenariuszy;
    }

    @Override
    public double obliczKosztMiesieczny() {
        double premiaZaAutomatyzacje = czyAutomatyzujacy ? 800.0 : 0.0;
        return getStawkaBazowa() + liczbaScenariuszy * 30.0 + premiaZaAutomatyzacje;
    }

    @Override
    public String przedstawSie() {
        String typTestera = czyAutomatyzujacy ? "testerem automatyzującym" : "testerem manualnym";
        return "Jestem " + typTestera + ": " + getImie() + " " + getNazwisko()
                + ". Liczba scenariuszy: " + liczbaScenariuszy + ".";
    }

    public void uruchomRaportTestow() {
        System.out.println("Uruchomiono raport testów dla " + getImie() + " " + getNazwisko()
                + ". Liczba scenariuszy: " + liczbaScenariuszy + ".");
    }

    @Override
    public String toString() {
        return "Tester{" +
                "idPracownika='" + getIdPracownika() + '\'' +
                ", imie='" + getImie() + '\'' +
                ", nazwisko='" + getNazwisko() + '\'' +
                ", stawkaBazowa=" + getStawkaBazowa() +
                ", czyAutomatyzujacy=" + czyAutomatyzujacy +
                ", liczbaScenariuszy=" + liczbaScenariuszy +
                '}';
    }
}