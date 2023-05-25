/** Configura definisce alcuni metodi factory */
public class Configura {
    public static Prodotto getBigliettoScontato() {
        System.out.print("[Configura] ");
        return new Formatta(new Sconto(new Biglietto()));
    }

    public static Prodotto getBiglietto() {
        System.out.print("[Configura] ");
        return new Formatta(new Biglietto());
    }

    public static Prodotto getBigliettoSuperScontato() {
        System.out.print("[Configura] ");
        return new Formatta(new Sconto(new Sconto(new Biglietto())));
    }
}
