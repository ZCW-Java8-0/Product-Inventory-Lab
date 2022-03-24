package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SneakerTest {
    @Test
    public void setNameTest() {
        // given
        String expected = "SomeName";

        // when
        Sneaker testSneaker = new Sneaker();
        testSneaker.setName(expected);

        // then (3)
        Assertions.assertEquals(expected, testSneaker.getName());
    }

    @Test
    public void setIDTest() {
        // given
        Integer expected = 1;

        // when
        Sneaker testSneaker = new Sneaker();
        testSneaker.setId(expected);

        // then (3)
        Assertions.assertEquals(expected, testSneaker.getId());
    }

    @Test
    public void setBrandTest() {
        // given
        String expected = "SomeBrand";

        // when
        Sneaker testSneaker = new Sneaker();
        testSneaker.setBrand(expected);

        // then (3)
        Assertions.assertEquals(expected, testSneaker.getBrand());
    }
    @Test
    public void setSportTest() {
        // given
        String expected = "SomeSport";

        // when
        Sneaker testSneaker = new Sneaker();
        testSneaker.setSport(expected);

        // then (3)
        Assertions.assertEquals(expected, testSneaker.getSport());
    }
    @Test
    public void setSizeTest() {
        // given
        int expected = 1;

        // when
        Sneaker testSneaker = new Sneaker();
        testSneaker.setSize(expected);

        // then (3)
        Assertions.assertEquals(expected, testSneaker.getSize());
    }
    @Test
    public void setQtyTest() {
        // given
        int expected = 1;

        // when
        Sneaker testSneaker = new Sneaker();
        testSneaker.setQty(expected);

        // then (3)
        Assertions.assertEquals(expected, testSneaker.getQty());
    }

    @Test
    public void setPriceTest() {
        // given
        double expected = 9.94;

        // when
        Sneaker testSneaker = new Sneaker();
        testSneaker.setPrice(expected);

        // then (3)
        Assertions.assertEquals(expected, testSneaker.getPrice());
    }
}