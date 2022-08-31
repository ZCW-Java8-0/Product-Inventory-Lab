package models;

import com.sun.xml.internal.ws.policy.AssertionSet;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HockeyStickTests {

    private HockeyStick stick;

    @BeforeEach
    public void setup(){
        stick = new HockeyStick();
    }

    @Test
    public void HockeyStickNameTest(){
        //given
        String expectedName = "rbz";
        //when
        stick.setName(expectedName);
        String actualName = stick.getName();
        //then
        Assertions.assertEquals(expectedName, actualName);
    }

    @Test
    public void HockeyStickBrand(){
        String expectedBrand = "CCM";

        stick.setBrand(expectedBrand);
        String actualBrand = stick.getBrand();

        Assertions.assertEquals(expectedBrand, actualBrand);
    }

    @Test
    public void HockeyStickSize(){
        Integer expectedSize = 64;

        stick.setSize(expectedSize);
        Integer actualSize = stick.getSize();

        Assertions.assertEquals(expectedSize,actualSize);
    }

    @Test
    public void HockeyStickQuantity(){
        Integer expectedQty = 3;

        stick.setQty(expectedQty);
        Integer actualQty = stick.getQty();

        Assertions.assertEquals(expectedQty,actualQty);
    }

    @Test
    public void HockeyStickPrice(){
        Double expectedPrice = 170.00;

        stick.setPrice(expectedPrice);
        Double actualPrice = stick.getPrice();

        Assertions.assertEquals(expectedPrice,actualPrice);
    }

    @Test
    public void HockeyStickId(){
        Integer expectedId = 2424;

        stick.setId(expectedId);
        Integer actualId = stick.getId();

        Assertions.assertEquals(expectedId,actualId);
    }

    @Test
    public void  HockeyStickConstructor(){

        Integer expectedId = 9876;
        String expectedName = "covert";
        String expectedBrand = "Warrior";
        Integer expectedSize = 59;
        Integer expectedQty = 3;
        Double expectedPrice = 120.00;

        HockeyStick testHockeyStick = new HockeyStick(expectedId,expectedName,expectedBrand,expectedSize,expectedQty,expectedPrice);

        Assertions.assertEquals(expectedId, testHockeyStick.getId());
        Assertions.assertEquals(expectedName, testHockeyStick.getName());
        Assertions.assertEquals(expectedBrand, testHockeyStick.getBrand());
        Assertions.assertEquals(expectedSize,testHockeyStick.getSize());
        Assertions.assertEquals(expectedQty,testHockeyStick.getQty());
        Assertions.assertEquals(expectedPrice,testHockeyStick.getPrice());

        }






    }

