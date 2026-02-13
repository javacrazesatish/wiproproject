package com.wipro.training;

import com.wipro.training.QuantityMeasurementApp.Feet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class QuantityMeasurementAppTest {
    @Test
    void testFeetEquality_sameObjectShouldBeEquals(){
        Feet feet1=new Feet(1.0);
        Feet feet2=new Feet(1.0);
        assertTrue(feet1.equals(feet2));
    }
    @Test
    void testFeetEquality_diffValue(){
        Feet feet1=new Feet(1.0);
        Feet feet2=new Feet(2.0);
        assertFalse(feet1.equals(feet2));
    }
    @Test
    void testFeetEquality_nullComparison(){
        Feet feet1=new Feet(1.0);

        assertFalse(feet1.equals(null));
    }
    @Test
    void testFeetEquality_diffClass(){
        Feet feet1=new Feet(1.0);
        String str="1.0";
        assertFalse(feet1.equals(str));
    }
    @Test
    void testFeetEquality_sameReference(){
        Feet feet1=new Feet(1.0);
        assertTrue(feet1.equals(feet1));
    }

}
