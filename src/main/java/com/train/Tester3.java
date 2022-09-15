package com.train;

import java.util.Scanner;

public class Tester3 {
    public static void main(String[] args) {
        Ticket1 ticket = new Ticket1("taiToKao", 1000);
        ticket.name = "taiToKao";
        ticket.price = 1000;
        int roundTripPrice = (int) (2000*0.9);

        //System.out.println("Please enter number of ticket:");

        Scanner scanner = new Scanner(System.in);

        //int totalTicket = scanner.nextInt();
       // System.out.println("How many round-trip ticket:");
        Scanner scanner1 = new Scanner(System.in);
        //int totalRoundTrip = scanner.nextInt();
        //int totalPrice = ((totalTicket - totalRoundTrip) * ticket.price + totalRoundTrip * roundTripPrice);
        int totalTicket = 0;
        //System.out.println("Total tickets:" + totalTicket);
        //System.out.println("Round-trip:" + totalRoundTrip);
        //System.out.println("Total:" + totalPrice);
        while(true) {
            System.out.println("Please enter number of ticket:");
            totalTicket = scanner.nextInt();
            if (totalTicket == -1){
                break;
            }else {
                System.out.println("How many round-trip ticket:");
                int totalRoundTrip = scanner.nextInt();
                int totalPrice = ((totalTicket - totalRoundTrip) * ticket.price + totalRoundTrip * roundTripPrice);

                System.out.println("Total tickets:" + totalTicket);
                System.out.println("Round-trip:" + totalRoundTrip);
                System.out.println("Total:" + totalPrice);
            }

        }


    }
}
