package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RunningShoesTest {
    @Test
    public void setNameTest() {
        // Given
        String expected = "OZWEEGO";

        // When
        RunningShoes nameTest = new RunningShoes();
        nameTest.setName(expected);

        // Then
        Assertions.assertEquals(expected, nameTest.getName());
    }
}
