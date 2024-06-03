/** Formatta e' un ConcreteDecorator, ridefinisce il metodo printNome */

public class Formatta extends Decor {
    public Formatta(Prodotto myC) {
        super(myC);
    }

    @Override
    public String id() {
        System.out.print("[Formatta] ");
        String id = super.id();
        System.out.println(id+" comprensivo di tasse");
        return id;
    }

}
