package com.wipro.training;

import com.wipro.Length;

public class QuantityMeasurementApp {
    public static class Feet{
        private final double value;
         public Feet(double value){
             this.value = value;
         }
         @Override
        public boolean equals(Object obj){
             //same reference check
             if (this==obj) return true;
             // check null and type check
             if (null == obj || getClass() != obj.getClass()) return false;
             //safe check
             Feet other = (Feet) obj;
            return Double.compare(this.value, other.value)==0;
         }
    }

    public static void main(String[] args) {
        Feet f1=new Feet(1.0);
        Feet f2=new Feet(1.0);

        System.out.println("Are equals? -> "+f1.equals(f2));
    }

}
