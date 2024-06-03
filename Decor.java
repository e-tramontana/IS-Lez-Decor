/**
 * Decor e' un Decorator, contiene istanze dell'oggetto wrapped ed invoca
 * operazioni sull'oggetto wrapped
 */

public class Decor implements Prodotto {
    private final Prodotto myComp;

    public Decor(Prodotto myC) {
        myComp = myC;
    }

    @Override
    public String id() {
        System.out.print("[Decor] ");
        return myComp.id();
    }

    @Override
    public double costo() {
        System.out.print("[Decor] ");
        return myComp.costo();
    }

    /* Toglie lo strato esterno */
    @Override
    public Prodotto wrapped() {
        System.out.print("[Decor] ");
        return myComp;
    }
}
