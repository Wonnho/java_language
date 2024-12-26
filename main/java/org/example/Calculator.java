package org.example;


public class Calculator {
    double k,s;
    boolean buttonOn;

    public Calculator(double k, double s, boolean buttonOn) {
        this.k = k;
        this.s = s;
        this.buttonOn = buttonOn;
    }

    double plus(double k, double s) {
        return this.k+this.s;
    }
    double subtract(double k,double s) {
        return k-s;
    }
    double divide(double k,double s) {
//        if (s != 0) {
//            double  = k / s;
//        }
//        return double o;
        return k/s;
    }

    double product() {
        return k*s;
    }


}
