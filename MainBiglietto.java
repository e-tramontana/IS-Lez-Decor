
/** MainBiglietto e' un client del design pattern Decorator */
public class MainBiglietto {
    private static Prodotto prod = Produttore.getBigliettoSuperScontato();
    public static void main(String[] args) {
        System.out.println("[MainBiglietto] Creata istanza di " + prod.getClass().getName());
        System.out.println("[MainBiglietto] "+ prod.id());
        System.out.println("[MainBiglietto] Costo: " + prod.costo());
        

        Prodotto prod2 = prod.wrapped().wrapped();
        System.out.println("[MainBiglietto] Istanza di " + prod2.getClass().getName());
        System.out.println("[MainBiglietto] Costo: " + prod2.costo());
    }
}
