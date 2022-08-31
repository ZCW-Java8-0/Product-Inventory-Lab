package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class HockeySkatesTests {

    private HockeySkates skate;

    @BeforeEach
    public void setup() {skate = new HockeySkates();}

    @Test
    public void HockeySkateName(){
        //given
        String expectedSkateName = "vapor";

        //when
        skate.setName(expectedSkateName);
        String actualSkateName = skate.getName();
        //then
        Assertions.assertEquals(expectedSkateName,actualSkateName);
    }

    @Test
    public void HockeySkateSize(){
        Integer expectedSkateSize = 13;

        skate.setSize(expectedSkateSize);
        Integer actualSkateSize = skate.getSize();

        Assertions.assertEquals(expectedSkateSize,actualSkateSize);
    }

    @Test
    public void HockeySkateBrand(){
        String expectedSkateBrand = "Bauer";

        skate.setBrand(expectedSkateBrand);
        String actualSkateBrand = skate.getBrand();

        Assertions.assertEquals(expectedSkateBrand,actualSkateBrand);
    }

    @Test
    public void HockeySkateQuantity(){
        Integer expectedQty = 2;

        skate.setQty(expectedQty);
        Integer actualSkateQty = skate.getQty();

        Assertions.assertEquals(expectedQty,actualSkateQty);
    }

    @Test
    public void HockeySkatePrice(){
        Double expectedPrice = 350.00;

        skate.setPrice(expectedPrice);
        Double actualPrice = skate.getPrice();

        Assertions.assertEquals(expectedPrice,actualPrice);
    }
    @Test
    public void HockeyStickId(){
        Integer expectedId = 8899;

        skate.setId(expectedId);
        Integer actualId = skate.getId();

        Assertions.assertEquals(expectedId,actualId);
    }

    @Test
    public void  HockeySkateConstructor(){

        Integer expectedId = 8899;
        String expectedName = "vapor";
        String expectedBrand = "Bauer";
        Integer expectedSize = 13;
        Integer expectedQty = 2;
        Double expectedPrice = 350.00;

        HockeyStick testHockeyStick = new HockeyStick(expectedId,expectedName,expectedBrand,expectedSize,expectedQty,expectedPrice);

        Assertions.assertEquals(expectedId, testHockeyStick.getId());
        Assertions.assertEquals(expectedName, testHockeyStick.getName());
        Assertions.assertEquals(expectedBrand, testHockeyStick.getBrand());
        Assertions.assertEquals(expectedSize,testHockeyStick.getSize());
        Assertions.assertEquals(expectedQty,testHockeyStick.getQty());
        Assertions.assertEquals(expectedPrice,testHockeyStick.getPrice());

    }





}
