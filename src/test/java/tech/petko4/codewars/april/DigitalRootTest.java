package tech.petko4.codewars.april;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DigitalRootTest {

    @Test
    public void Test1() {
      assertEquals(7, DigitalRoot.digitalRoot(16));
    }      
    @Test
    public void Test2() {
      assertEquals(6, DigitalRoot.digitalRoot(456));
    }
}
