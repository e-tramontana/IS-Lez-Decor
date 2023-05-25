/** Formatta e' un ConcreteDecorator, ridefinisce il metodo printNome */

public class Formatta extends Decor {
    public Formatta(Prodotto myC) {
        super(myC);
    }

    @Override
    public void printNome() {
        System.out.print("[Formatta] ");
        super.printNome();
        System.out.println(" comprensivo di tasse");
    }

}
