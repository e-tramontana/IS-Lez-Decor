/** Prodotto e' un Component per il design pattern Decorator */
public interface Prodotto {
    public void printNome();

    public double getCosto();

    public Prodotto getWrapped();
}
