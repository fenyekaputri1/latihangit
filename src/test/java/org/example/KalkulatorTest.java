package org.example;

import org.junit.Assert;
import org.junit.Test;

public class KalkulatorTest {

    @Test
//    public void testPerkalian(){
//        Kalkulator kalkulator = new Kalkulator(8,9);
//        Mengecek/verify ---> Assert
//        Assert.assertEquals(72, kalkulator.getHasilPerkalian());
//    }

    public void testPembagian(){
        Kalkulator kalkulator = new Kalkulator(10,2);
        Assert.assertEquals(5, kalkulator.getHasilPembagian(),0);
    }
}
