package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WhiskeyTest {
    @Test
    public void setNameTest() {
        // given
        String expected = "SomeName";

        // when
        Whiskey testWhiskey = new Whiskey();
        testWhiskey.setName(expected);

        // then (3)
        Assertions.assertEquals(expected, testWhiskey.getName());
    }

    @Test
    void setIdTest() {
        // given
        int expected = 1;

        // when
        Whiskey testWhiskey = new Whiskey();
        testWhiskey.setId(expected);

        // then (3)
        Assertions.assertEquals(expected, testWhiskey.getId());
    }

    @Test
    void setBrandTest() {
        // given
        String expected = "SomeBrand";

        // when
        Whiskey testWhiskey = new Whiskey();
        testWhiskey.setBrand(expected);

        // then (3)
        Assertions.assertEquals(expected, testWhiskey.getBrand());
    }

    @Test
    void setAlcConcentrationTest() {
        // given
        double expected = .30;

        // when
        Whiskey testWhiskey = new Whiskey();
        testWhiskey.setAlcConcentration(expected);

        // then (3)
        Assertions.assertEquals(expected, testWhiskey.getAlcConcentration());
    }

    @Test
    void setSizeTest() {
        // given
        double expected = 1.5;

        // when
        Whiskey testWhiskey = new Whiskey();
        testWhiskey.setSize(expected);

        // then (3)
        Assertions.assertEquals(expected, testWhiskey.getSize());
    }

    @Test
    void setQtyTest() {
        // given
        int expected = 1;

        // when
        Whiskey testWhiskey = new Whiskey();
        testWhiskey.setQty(expected);

        // then (3)
        Assertions.assertEquals(expected, testWhiskey.getQty());
    }

    @Test
    void setPriceTest() {
        // given
        double expected = 16.53;

        // when
        Whiskey testWhiskey = new Whiskey();
        testWhiskey.setPrice(expected);

        // then (3)
        Assertions.assertEquals(expected, testWhiskey.getPrice());
    }
}