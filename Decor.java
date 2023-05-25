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
    public void printNome() {
        System.out.print("[Decor] ");
        myComp.printNome();
    }

    @Override
    public double getCosto() {
        System.out.print("[Decor] ");
        return myComp.getCosto();
    }

    /* Toglie lo strato esterno */
    @Override
    public Prodotto getWrapped() {
        System.out.print("[Decor] ");
        return myComp;
    }
}
