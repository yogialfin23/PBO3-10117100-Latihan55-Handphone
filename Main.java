package com.company;

/**
 * Yogie Alfin Salim
 * 10117100
 * IF-3
 */
public class Main {


    public static void main(String[] args) {
        Handphone a = new Android("Samsung", "Android", "Grand", 3000000, "234ibfd3840fo");
        Handphone b = new BlackBerry("BlackB", "RIM", "Curve", 2000000, "BHS249");
        Handphone w = new WindowsPhone("Nokia", "Win8", "Lumia", 1000000, "UUUQIJWORJ");

        a.displayProduct();
        System.out.println("Android Key Store : " + ((Android) a).getKeyStore() + "\n");
        b.displayProduct();
        System.out.println("PIN : " + ((BlackBerry) b).getPinBB() + "\n");
        w.displayProduct();
        System.out.println("Wp Key Store : " + ((WindowsPhone) w).getWpKeyStore());

    }
}
