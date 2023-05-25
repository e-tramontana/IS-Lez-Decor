/** Sconto e' un ConcreteDecorator, ridefinisce il metodo getCosto */
public class Sconto extends Decor {
    public Sconto(Prodotto myC) {
        super(myC);
    }

    @Override
    public double getCosto() {
        System.out.print("[Sconto] ");
        return super.getCosto() * 0.95;
    }
}
