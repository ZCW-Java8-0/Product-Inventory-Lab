package services;

import models.Sneaker;

import java.util.ArrayList;
import java.util.List;

public class SneakerService extends Service<Sneaker> {
    private int nextId = 1;

    private List<Sneaker> inventory = new ArrayList<>();

    public Sneaker create(String name, String brand, String sport, double size, int quantity, double price) {
        Sneaker createdSneaker = new Sneaker(nextId++, name, brand, sport, size, quantity, price);
        inventory.add(createdSneaker);
        return createdSneaker;
    }

    public Sneaker findSneaker(int id) {
        for (Sneaker s: inventory) {
            if (s.getId() == id)
                return s;
        }
        return null;
    }

    public Sneaker[] findAll() {
        return inventory.toArray(new Sneaker[inventory.size()]);
    }

    public boolean delete(int id) {
        for (Sneaker s: inventory) {
            if (s.getId() == id){
                inventory.remove(s);
                return true;
            }
        }
        return false;
    }

    @Override
    Sneaker findProduct(int id) {
        return findSneaker(id);
    }

    @Override
    public Sneaker[] findProductAll() {
        return findProductAll();
    }

    @Override
    public boolean deleteProduct(int id) {
        return delete(id);
    }
}
