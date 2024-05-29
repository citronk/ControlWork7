package org.task3;

public class Phone {
    private String number;
    private boolean mobileOrStationary; //true - mobile, false - stationary

    public Phone(String number, boolean mobileOrStationary){
        this.number = number;
        this.mobileOrStationary = mobileOrStationary;
    }

    public boolean mobileOrStationary() {
        return mobileOrStationary;
    }

    @Override
    public String toString() {
        if (mobileOrStationary == true) {
            return "Mobile: " + number;
        }
        else {
            return "Stationary: " + number;
        }
    }
}