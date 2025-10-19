package com.mycompany.telecombilling;

public class TelecomBilling {
    public static void main(String[] args) {
        double airtime = 10000;
        double tax = airtime * 0.10; // 10% charge
        airtime -= tax; // remaining after deduction

        int callSeconds = 5 * 60; // 5 minutes -> 300 seconds
        double callRate = 200; // per second
        double totalCallCost = callSeconds * callRate;

        if (totalCallCost > airtime) {
            int allowedSeconds = (int) (airtime / callRate);
            double usedAmount = allowedSeconds * callRate;
            airtime -= usedAmount;

            System.out.println("Balance after call cut-off: UGX " + airtime);
            System.out.println("Call ended early after: " + allowedSeconds + " seconds");
        } else {
            airtime -= totalCallCost;
            System.out.println("Balance after full call: UGX " + airtime);
        }
    }
}
