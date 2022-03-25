package services;

import models.Whiskey;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WhiskeyService extends Service<Whiskey> {
    private int nextId = 1;
//    private List<Whiskey> inventory = new ArrayList<>();
    private Map<Integer,Whiskey> inventory = new HashMap<>();

    public Whiskey create(String name, String brand, double alcConcentration, double size, double price, int qty) {
        Whiskey createdWhiskey = new Whiskey(nextId++, name, brand, alcConcentration, size, price, qty);
        inventory.put(createdWhiskey.getId(),createdWhiskey);
        return createdWhiskey;
    }

    public Whiskey findWhiskey(int id) {
        return inventory.get(id);
//        for (Whiskey s : inventory.values()) {
//            if (s.getId() == id)
//                return s;
//        }
//        return null;
    }

    public Whiskey[] findAll() {
        return inventory.values().toArray(new Whiskey[inventory.size()]);
    }

    public boolean delete(int id) {
//        for (Whiskey s : inventory) {
//            if (s.getId() == id) {
//                inventory.remove(s);
//                return true;
//            }
//        }
//        return false;
        Whiskey whiskey = inventory.remove(id);
        if (whiskey == null)
            return false;
        return true;
    }

    @Override
    public Whiskey[] findProductAll() {
        return findAll();
    }

    @Override
    public boolean deleteProduct(int id) {
        return delete(id);
    }
}

