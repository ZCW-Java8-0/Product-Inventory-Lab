package services;

import models.HockeyStick;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class HockeyStickServiceTest {

    @Test
    public void createTest(){
        String expectedName = "Tacks";
        String expectedBrand = "CCM";
        Integer expectedSize = 13;
        Integer expectedQty = 5;
        Double expectedPrice = 499.00;


        HockeyStickService stickService = new HockeyStickService();
        HockeyStick testHockeyStick = HockeyStickService.create(expectedName,expectedBrand,expectedSize,expectedQty,expectedPrice);

        String actualName = testHockeyStick.getName();
        String actualBrand = testHockeyStick.getBrand();
        Integer actualSize = testHockeyStick.getSize();
        Integer actualQty = testHockeyStick.getQty();
        Double actualPrice = testHockeyStick.getPrice();


        Assertions.assertEquals(expectedName, actualName);
        Assertions.assertEquals(expectedBrand, actualBrand);
        Assertions.assertEquals(expectedSize, actualSize);
        Assertions.assertEquals(expectedQty, actualQty);
        Assertions.assertEquals(expectedPrice, actualPrice);












    }
}
