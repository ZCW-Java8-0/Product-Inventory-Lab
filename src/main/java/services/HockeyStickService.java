package services;

import models.HockeyStick;

import java.util.ArrayList;

public class HockeyStickService {

    private static int nextId = 1;

    private ArrayList<HockeyStick> inventory = new ArrayList<HockeyStick>();

    public HockeyStick create(String name, String brand, Integer size, Integer qty, Integer price){

        HockeyStick createdStick = new HockeyStick(nextId++, name, size, qty, price);

        inventory.add(createdStick);

        return createdStick;
    }




}
