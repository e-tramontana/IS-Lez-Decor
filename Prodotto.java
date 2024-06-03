/** Prodotto e' un Component per il design pattern Decorator */
public interface Prodotto {
    public String id();

    public double costo();

    public Prodotto wrapped();
}
