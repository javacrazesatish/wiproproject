package com.wipro;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class UC3_LengthTest{

    @Test
    void givenSameFeetValues_shouldReturnTrue(){
        Length length1=new Length(1.0, Length.UC3_LengthUnit.Feet);
        Length length2=new Length(1.0, Length.UC3_LengthUnit.Feet);
        assertEquals(length1, length2);
    }

    @Test
    void givenDiffFeetValues_shouldReturnFalse(){
        Length length1=new Length(1.0, Length.UC3_LengthUnit.Feet);
        Length length2=new Length(2.0, Length.UC3_LengthUnit.Feet);
        assertNotEquals(length1, length2);

    }
    @Test
    void givenOneFeetAndTwelveInches_shouldReturnTrue(){
        Length feet=new Length(1.0, Length.UC3_LengthUnit.Feet);
        Length inches=new Length(12.0, Length.UC3_LengthUnit.Inches);
        assertEquals(feet, inches);

    }
    @Test
    void equalityShouldBeSymmetric(){
        Length feet=new Length(1.0, Length.UC3_LengthUnit.Feet);
        Length inches=new Length(12.0, Length.UC3_LengthUnit.Inches);
        assertEquals(inches, feet);
    }
    @Test
    void givenSameInchesValues_shouldReturnTrue(){
        Length inches1=new Length(12.0, Length.UC3_LengthUnit.Inches);
        Length inches=new Length(12.0, Length.UC3_LengthUnit.Inches);
        assertEquals(inches1, inches);
    }
    @Test
    void givenNull_shouldReturnFalse(){
        Length feet=new Length(1.0, Length.UC3_LengthUnit.Feet);
        assertNotNull(feet);
    }
    @Test
    void sameObjectShouldBeEquals(){
        Length feet=new Length(1.0, Length.UC3_LengthUnit.Feet);
        assertTrue(feet.equals(feet));
    }
    @Test
    void hashCodeShouldBeSameForEqualsObject(){
        Length feet=new Length(1.0, Length.UC3_LengthUnit.Feet);
        Length inches=new Length(12.0, Length.UC3_LengthUnit.Inches);
        assertEquals(feet.hashCode(), inches.hashCode());
    }
}
