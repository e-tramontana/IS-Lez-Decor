/** Produttore implementa alcuni metodi factory */
public class Produttore {
    private static String id = "ABC123";
    private static double costo = 100.0;

    public static Prodotto getBigliettoScontato() {
        System.out.print("[Configura] ");
        return new Formatta(new Sconto(new Biglietto(id, costo, null)));
    }

    public static Prodotto getBiglietto() {
        System.out.print("[Configura] ");
        return new Formatta(new Biglietto(id, costo, null));
    }

    public static Prodotto getBigliettoSuperScontato() {
        System.out.print("[Configura] ");
        return new Formatta(new Sconto(new Sconto(new Biglietto(id, costo, null))));
    }
}
