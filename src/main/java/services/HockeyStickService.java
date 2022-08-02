package services;

import models.HockeyStick;

import java.util.ArrayList;

public class HockeyStickService {

    private static int nextId = 1;

    private static ArrayList<HockeyStick> inventory = new ArrayList<HockeyStick>();

    public static HockeyStick create(String name, String brand, Integer size, Integer qty, Double price){

        HockeyStick createdStick = new HockeyStick(nextId++, name, brand, size, qty, price);

        inventory.add(createdStick);

        return createdStick;
    }

    public HockeyStick findHockeyStick(Integer id) {
        for (int i = 0; i < inventory.size(); i++) {
            if (inventory.get(i).equals(id)) {
                return inventory.get(i);
            } else {
                return null;
            }
        }
        return null;
    }


    public HockeyStick[] findAll(){
        return (HockeyStick[]) inventory.toArray();

    }

    public boolean delete(Integer id){
        return inventory.remove(findHockeyStick(id));

    }






}
