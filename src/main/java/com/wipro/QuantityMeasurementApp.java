package com.wipro;
public class QuantityMeasurementApp {
        public static class Feet{
        private final double value;
        public Feet(double value){
            this.value=value;
        }
        @Override
        public boolean equals(Object obj) {  if(this==obj){ return true;
            }
            if(null==obj || getClass() != obj.getClass()){  return false;
            }
            Feet other = (Feet) obj; return Double.compare(this.value,other.value)==0;
        }
        @Override
        public int hashCode() {
            return Double.hashCode(value);
        }
    }
    public static void main(String[] args) {
        Feet feet=new Feet(0.8);
        Feet feet2=new Feet(0.8);
        System.out.println(feet.equals(feet2));
        demonstrtaeInchesEquality();

    }
    public static class Inches {

        private final double value;

        public Inches(double value) {
            this.value = value;
        }

        public double getValue() {
            return value;
        }

        @Override
        public boolean equals(Object obj) {

            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }

            Inches other = (Inches) obj;
            return Double.compare(this.value, other.value) == 0;
        }

        @Override
        public int hashCode() {
            return Double.hashCode(value);
        }
    }
    public static void demonstrtaeInchesEquality() {
            System.out.println("demonstrtaeInchesEquality class called...");
        Inches inchesValue1 = new Inches(1.0);
        Inches inchesValue2 = new Inches(1.0);
        boolean inchesResult = inchesValue1.equals(inchesValue2);
        System.out.println("Equal" + "(" + inchesResult + ")");
    }
}



