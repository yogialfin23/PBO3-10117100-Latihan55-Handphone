package com.company;

public class BlackBerry extends Handphone {
    private String pinBB;

    public BlackBerry(String manufacture, String operatingSystem, String model, int harga, String pinBB) {
        super(manufacture, operatingSystem, model, harga);
        this.pinBB = pinBB;
    }

    public String getPinBB() {
        return pinBB;
    }

    public void setPinBB(String pinBB) {
        this.pinBB = pinBB;
    }
}
