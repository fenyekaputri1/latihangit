package org.example;

import org.junit.Assert;
import org.junit.Test;

public class SquareTest {

    @Test
    public void testLuasPersegi(){
        Square square = new Square(7);
        Assert.assertEquals(49, square.getSisi());
    }
}
