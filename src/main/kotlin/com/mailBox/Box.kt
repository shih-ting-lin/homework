package com.mailBox

import java.util.*

fun main(args: Array<String>) {
    val box3 = Box(23f,14f,13)
    val box5 = Box(39.5f,27.5f,23)

    val scanner = Scanner(System.`in`)
    print("Please enter object's length:")
    var lenght = scanner.nextFloat()
    print("Please enter object's width:")
    var width = scanner.nextFloat()
    print("Please enter object's height:")
    var height = scanner.nextInt()
    if (box3.validate(lenght, width, height)== true){
        print("Box3")
    } else if (box5.validate(lenght, width, height)== true){
        print("Box5")
    } else{
        print("There is no suitable box.")
    }
}
class BoxSet(var lenght:Float, var width:Float, var height:Int){
    fun validate(lenght:Float, width:Float, height:Int){
        var box = false
        if(lenght >= lenght && width>= width && height >= height){
            box = true
        }

    }
}


