package services;


import com.sun.org.apache.xpath.internal.Arg;
import models.Whiskey;

public abstract class Service<T> {
    public abstract T[] findProductAll();
    public abstract boolean deleteProduct(int id);
}
