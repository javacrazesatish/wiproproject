package com.wipro;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class QuantityMeasurementAppTest {

    @Test
    void sameObjectShouldBeEquals(){
        QuantityMeasurementApp.Feet feet=new QuantityMeasurementApp.Feet(
                8.0);
        assertTrue(feet.equals(feet));
    }
    @Test
    void twoSameObjectShouldBeEquals(){
        QuantityMeasurementApp.Feet feet1=new QuantityMeasurementApp.Feet(
                8.0);
        QuantityMeasurementApp.Feet feet2=new QuantityMeasurementApp.Feet(
                8.0);
        assertTrue(feet1.equals(feet2));
        assertTrue(feet2.equals(feet1));
    }
    @Test
    void objectWithDiffValueNotEqual(){
        QuantityMeasurementApp.Feet feet1=new QuantityMeasurementApp.Feet(
                8.0);
        QuantityMeasurementApp.Feet feet2=new QuantityMeasurementApp.Feet(
                1.0);
        assertFalse(feet1.equals(feet2));
    }
    @Test
    void equalsShouldReturnFalseForNull(){
        QuantityMeasurementApp.Feet feet1=new QuantityMeasurementApp.Feet(
                8.0);

        assertFalse(feet1.equals(null));
    }
    @Test
    void equalsShouldReturnFalseForDiffClass(){
        QuantityMeasurementApp.Feet feet1=new QuantityMeasurementApp.Feet(
                8.0);
         assertFalse(feet1.equals("0.8"));
    }
    @Test
    void hashCodeShouldBeSameForEqualsObject(){
        QuantityMeasurementApp.Feet feet1=new QuantityMeasurementApp.Feet(
                8.0);
        QuantityMeasurementApp.Feet feet2=new QuantityMeasurementApp.Feet(
                8.0);
        assertEquals(feet1.hashCode() ,feet2.hashCode());

    }
    @Test
    void equalsShouldBeConsistent(){
        QuantityMeasurementApp.Feet feet1=new QuantityMeasurementApp.Feet(
                8.0);
        QuantityMeasurementApp.Feet feet2=new QuantityMeasurementApp.Feet(
                8.0);
        assertTrue(feet1.equals(feet2));
        assertTrue(feet1.equals(feet2));
        assertTrue(feet1.equals(feet2));
    }


}

