package com.example.rockpaperscissors

fun main()
{
    var PlayerChoice=""
    var ComputerChoice=""
    println("Player's Turn")
    println("Enter your choice: ")
    PlayerChoice=readln()
    while(!(PlayerChoice=="Rock"||PlayerChoice=="Paper"||PlayerChoice=="Scissors"))
    {
        println("Invalid! Enter valid choice: ")
        PlayerChoice=readln()
    }
    var num=(1..3).random()
    if(num==1)
    {
        ComputerChoice="Rock"
    }
    else if(num==2)
    {
        ComputerChoice="Paper"
    }
    else
    {
        ComputerChoice="Scissors"
    }
    println(ComputerChoice)
    var winner=when
    {
        PlayerChoice==ComputerChoice->"Tie"
        PlayerChoice=="Rock" && ComputerChoice=="Scissors"->"Player"
        PlayerChoice=="Scissors" && ComputerChoice=="Paper"->"Player"
        PlayerChoice=="Paper" && ComputerChoice=="Rock"->"Player"
        else
            ->"Computer"
    }
    if(winner=="Tie")
    {
        println("It is a Tie!")
    }
    else {
        println("$winner Won!")
    }
}