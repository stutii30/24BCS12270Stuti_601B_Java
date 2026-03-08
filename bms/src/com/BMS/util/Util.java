package com.BMS.util;

import java.util.Random;

public class Util {

    public static int generateAccountNumber() {
        Random rand = new Random();
        return 100000 + rand.nextInt(900000);
    }

    public static void validateMinimumBalance(double balance) throws Exception {
        if (balance < 1000) {
            throw new Exception("Minimum balance should be ₹1000");
        }
    }

}