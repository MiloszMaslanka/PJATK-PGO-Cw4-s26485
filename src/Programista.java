public class Programista extends Pracownik {
    private String glownyJezyk;
    private int liczbaRepozytoriow;

    public Programista(String idPracownika, String imie, String nazwisko, double stawkaBazowa,
                       String glownyJezyk, int liczbaRepozytoriow) {
        super(idPracownika, imie, nazwisko, stawkaBazowa);
        this.glownyJezyk = glownyJezyk;
        this.liczbaRepozytoriow = liczbaRepozytoriow;
    }

    public String getGlownyJezyk() {
        return glownyJezyk;
    }

    public int getLiczbaRepozytoriow() {
        return liczbaRepozytoriow;
    }

    @Override
    public double obliczKosztMiesieczny() {
        return getStawkaBazowa() + liczbaRepozytoriow * 250.0;
    }

    @Override
    public String przedstawSie() {
        return "Jestem programistą: " + getImie() + " " + getNazwisko()
                + ". Główny język: " + glownyJezyk + ".";
    }

    public void wypiszTechnologie() {
        System.out.println("Programista " + getImie() + " " + getNazwisko()
                + " pracuje głównie w technologii: " + glownyJezyk + ".");
    }

    @Override
    public String toString() {
        return "Programista{" +
                "idPracownika='" + getIdPracownika() + '\'' +
                ", imie='" + getImie() + '\'' +
                ", nazwisko='" + getNazwisko() + '\'' +
                ", stawkaBazowa=" + getStawkaBazowa() +
                ", glownyJezyk='" + glownyJezyk + '\'' +
                ", liczbaRepozytoriow=" + liczbaRepozytoriow +
                '}';
    }
}