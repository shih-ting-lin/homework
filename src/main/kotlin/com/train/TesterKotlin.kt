package com.train

import java.util.Scanner

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)
    println("Please enter number of ticket:")
    var totalTicket = scanner.nextInt()
    println("How many round-trip ticket:")
    var totalRoundTrip = scanner.nextInt()

    val tic = Ticket("taiToKao", 1000)
    var totalPrice = (totalTicket-totalRoundTrip)*tic.price+ totalRoundTrip*(tic.price*2*0.9)
    println("Total:${totalPrice}")


}

class Ticket(val name: String, val price: Int ) {

}

