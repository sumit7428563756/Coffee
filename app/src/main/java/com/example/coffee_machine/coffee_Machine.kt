package com.example.coffee_machine

  fun main(){

   println("Enter the name for your Coffee!")
      val name = readln()
      println("how much spoon of sugar do you want?")
      val sugarCount = readln()
      val sugarCountInt = sugarCount.toInt()

      makecoffee(sugarCountInt,name)

  }

   fun makecoffee(sugarCount: Int, name : String){

       if (sugarCount == 1){

           println("Coffee with $sugarCount spoon of sugar for $name")
       }
       else if(sugarCount <= 0){
           println("Coffee with no sugar for $name")
       }
       else{
           println("Coffee with $sugarCount spoons of sugar for $name ")
       }

   }