package services;

import com.sun.org.apache.xpath.internal.Arg;
import models.Sneaker;
import models.Whiskey;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SneakerService extends Service<Sneaker> {
    private int nextId = 1;

//    private List<Sneaker> inventory = new ArrayList<>();
    private Map<Integer, Sneaker> inventory = new HashMap<>();

    public Sneaker create(String name, String brand, String sport, double size, int quantity, double price) {
        Sneaker createdSneaker = new Sneaker(nextId++, name, brand, sport, size, quantity, price);
        inventory.put(createdSneaker.getId(),createdSneaker);
        return createdSneaker;
    }

    public Sneaker findSneaker(int id) {
        return inventory.get(id);
//        for (Sneaker s: inventory) {
//            if (s.getId() == id)
//                return s;
//        }
    }

    public Sneaker[] findAll() {
        return inventory.values().toArray(new Sneaker[inventory.size()]);
    }

    public boolean delete(int id) {
//        for (Sneaker s: inventory) {
//            if (s.getId() == id){
//                inventory.remove(s);
//                return true;
//            }
//        }
//        return false;
        Sneaker sneaker = inventory.remove(id);
        if (sneaker == null)
            return false;
        return true;
    }

    @Override
    public Sneaker[] findProductAll() {
        return findAll();
    }

    @Override
    public boolean deleteProduct(int id) {
        return delete(id);
    }
}
