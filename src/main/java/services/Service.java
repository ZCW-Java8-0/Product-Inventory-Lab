package services;


public abstract class Service<T> {
    abstract T findProduct(int id);
    public abstract T[] findProductAll();
    public abstract boolean deleteProduct(int id);
}
