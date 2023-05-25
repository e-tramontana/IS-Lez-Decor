
/** MainBiglietto e' un client del design pattern Decorator */
public class MainBiglietto {
    private static Prodotto prod = Configura.getBigliettoScontato();
    public static void main(String[] args) {
        System.out.println("[MainBiglietto] Creata istanza di " + prod.getClass().getName());
        prod.printNome();
        System.out.println("[MainBiglietto] Costo: " + prod.getCosto());
        

        Prodotto prod2 = prod.getWrapped().getWrapped();
        System.out.println("[MainBiglietto] Istanza di " + prod2.getClass().getName());
        System.out.println("[MainBiglietto] Costo: " + prod2.getCosto());
    }
}
