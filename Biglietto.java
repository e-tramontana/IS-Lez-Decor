/** Biglietto e' un ConcreteComponent */
public record Biglietto(String id, double costo, Prodotto wrapped) implements Prodotto {
}
