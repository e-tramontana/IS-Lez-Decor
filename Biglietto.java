/** Biglietto e' un ConcreteComponent */
public class Biglietto implements Prodotto {
    @Override
    public void printNome() {
        System.out.print("[Biglietto] Biglietto n. 1231231 ");
    }

    @Override
    public double getCosto() {
        System.out.print("[Biglietto] ");
        return 100.0;
    }

    @Override
    public Prodotto getWrapped() {
        System.out.print("[Biglietto] ");
        return this;
    }
}
