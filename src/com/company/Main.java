package com.company;

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
//create string and while loop to allow player and continue playing game
        String playAgain = "yes";
        while(playAgain.equals("yes") ){

// user display and input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome! What is your name?");
        String name = scanner.nextLine();
        System.out.println("Welcome, " + name + ". Today we will be playing rock, paper scissors. Let's begin the game!");
        System.out.println("Will it be rock, paper, or scissors?");

        String choice = scanner.nextLine();

        if(!choice.equals("rock") && !choice.equals("paper") && !choice.equals("scissors")){
            System.out.println("This entry is not accepted!");
            System.out.println("Please enter either rock, paper, or scissors");
        }
        else {
            System.out.println(name + " , you selected " + choice + "! Good Luck! ");
        }
// CPU random int generator
        String[] arr = {"0","1","2"};
        Random r = new Random();
        int randomNumber = r.nextInt(arr.length);
// assigning random generated int to appropriate string
        String CPUchoice = "";

        if(randomNumber == 0) {
            CPUchoice = "rock";
        }
        else if (randomNumber == 1) {
            CPUchoice = "paper";
        }
        else {
            CPUchoice = "scissors";
        }
        System.out.println("The CPU chose: " +CPUchoice);
// if else-if statements that determine who won and display that to user
        if((choice.equals("rock") && CPUchoice.equals("scissors")) || (choice.equals("paper") && CPUchoice.equals("rock")) || (choice.equals("scissors") && CPUchoice.equals("paper"))) {
            System.out.println("You win!!!");
        }
        else if(choice.equals(CPUchoice)){
            System.out.println("The game is a tie!");
        }
        else {
            System.out.println("You lose!");
        }
//prompt the player to play again
        System.out.println("Would you like to play again?  yes or no ");
        playAgain = scanner.nextLine();
        if(playAgain.equals("no")){
            System.out.println( name + " has chosen to end the game.");
        }
    }


            }}




