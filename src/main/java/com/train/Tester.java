package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        int  price = 1000;
        int roundTripPrice = (int) (2000*0.9);

        System.out.println("Please enter number of ticket:");
        Scanner scanner = new Scanner(System.in);
        int totalTicket = scanner.nextInt();
        System.out.println("How many round-trip ticket:");
        Scanner scanner1 = new Scanner(System.in);
        int totalRoundTrip = scanner.nextInt();
        int totalPrice = ((totalTicket - totalRoundTrip)*price + totalRoundTrip*roundTripPrice)  ;

        System.out.println("Total tickets:"+ totalTicket);
        System.out.println("Round-trip:"+ totalRoundTrip);
        System.out.println("Total:" + totalPrice);

    }
}
