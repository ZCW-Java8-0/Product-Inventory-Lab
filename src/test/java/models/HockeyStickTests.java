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
        String expectedName = "bauer";

        //when
        stick.setName(expectedName);
        String actualName = stick.getName();


        //then

        Assertions.assertEquals(expectedName, actualName);


    }

}
