package com.wipro;

import java.util.Objects;

public class Length {
    private final double value;
    private final UC3_LengthUnit unit;
    public enum UC3_LengthUnit {
        Feet(12.0),
        Inches(1.0);

        private final double conversionFactory;

        UC3_LengthUnit(double conversionFactory){
            this.conversionFactory = conversionFactory;
        }

        public double getConversionFactory() {
            return conversionFactory;
        }
    }
    public Length(double value, UC3_LengthUnit unit) {
        this.value = value;
        this.unit = unit;
    }
    // convert base unit to inches
    private double toBaseUnit(){
        return value * unit.getConversionFactory();
    }
    //bussiness comaprision
    public boolean compare(Length that){
        return Double.compare(this.toBaseUnit(),that.toBaseUnit())==0;
    }
    @Override
    public boolean equals(Object obj){
        if (this==obj) return true;
        if (null == obj || getClass() != obj.getClass()) return false;
        Length other = (Length) obj;
        return compare(other);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(toBaseUnit());
    }

}
