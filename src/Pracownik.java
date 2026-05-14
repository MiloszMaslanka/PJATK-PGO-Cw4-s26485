import java.util.Objects;

public class Pracownik {
    private String idPracownika;
    private String imie;
    private String nazwisko;
    private double stawkaBazowa;

    public Pracownik(String idPracownika, String imie, String nazwisko, double stawkaBazowa) {
        this.idPracownika = idPracownika;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.stawkaBazowa = stawkaBazowa;
    }

    public String getIdPracownika() {
        return idPracownika;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public double getStawkaBazowa() {
        return stawkaBazowa;
    }

    public final String pobierzIdPracownika() {
        return idPracownika;
    }

    public double obliczKosztMiesieczny() {
        return stawkaBazowa;
    }

    public String przedstawSie() {
        return "Jestem pracownikiem: " + imie + " " + nazwisko + ".";
    }

    @Override
    public String toString() {
        return "Pracownik{" +
                "idPracownika='" + idPracownika + '\'' +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", stawkaBazowa=" + stawkaBazowa +
                '}';
    }

    @Override
    public boolean equals(Object obiekt) {
        if (this == obiekt) {
            return true;
        }

        if (!(obiekt instanceof Pracownik)) {
            return false;
        }

        Pracownik pracownik = (Pracownik) obiekt;
        return Objects.equals(idPracownika, pracownik.idPracownika);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPracownika);
    }
}