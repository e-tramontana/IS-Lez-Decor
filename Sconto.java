/** Sconto e' un ConcreteDecorator, ridefinisce il metodo getCosto */
public class Sconto extends Decor {
    public Sconto(Prodotto myC) {
        super(myC);
    }

    @Override
    public double costo() {
        System.out.print("[Sconto] ");
        return super.costo() * 0.95;
    }
}
