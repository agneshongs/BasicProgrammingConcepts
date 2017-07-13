/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agneshongs.rockpaperscissors;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author agnes
 */
public class RockPaperScissors {

    public static void main(String[] args) {

        int rounds; //stores the number of rounds entered by player
        String userPlay; // stores the player's choice
        String compPlay = ""; //stores the computer's choice
        int compInt; //variable for the number that represents the computer's choice

        int userWin; //stores the user's wins
        int compWin; //stores the computer's wins
        int tie; //stores the number of ties

        //all the subtotals start off at 0
        userWin = 0;
        compWin = 0;
        tie = 0;

        String playAgain = "";
        boolean willContinue = true;

        while (willContinue) {
            
            Scanner sc = new Scanner(System.in);
            System.out.println("How many rounds would you like to play? Enter a number between 1-10.");

            rounds = sc.nextInt();
            sc.nextLine();

            if (rounds >= 1 && rounds <= 10) {
                System.out.println("You said: " + rounds + " rounds");
            } else {
                System.out.println("Number of rounds was not between 1-10!");
                return;
            }

            while (rounds >= 1) {

                System.out.println("Choose your weapon: R, P, or S.");
                userPlay = sc.nextLine();
                userPlay = userPlay.toUpperCase();
                
                Random generator = new Random();

                compInt = generator.nextInt(3) + 1;

                if (compInt == 1) {
                    compPlay = "R";
                } else if (compInt == 2) {
                    compPlay = "P";
                } else if (compInt == 3) {
                    compPlay = "S";
                }

                if (userPlay.equals(compPlay)) {
                    System.out.println("It's a tie!");
                    tie = tie + 1;
                } else if (userPlay.equals("R") && compPlay.equals("S")) {
                    System.out.println("You Win");
                    userWin = userWin + 1;
                } else if (userPlay.equals("P") && compPlay.equals("R")) {
                    System.out.println("You Win");
                    userWin = userWin + 1;
                } else if (userPlay.equals("S") && compPlay.equals("P")) {
                    System.out.println("You Win");
                    userWin = userWin + 1;
                } else if (userPlay.equals("S") && compPlay.equals("R")) {
                    System.out.println("Computer Win");
                    compWin = compWin + 1;
                } else if (userPlay.equals("R") && compPlay.equals("P")) {
                    System.out.println("Computer Win");
                    compWin = compWin + 1;
                } else if (userPlay.equals("P") && compPlay.equals("S")) {
                    System.out.println("Computer Win");
                    compWin = compWin + 1;
                }
                rounds--;
            }
            System.out.println(tie);
            System.out.println(userWin);
            System.out.println(compWin);

            if (userWin > compWin) {
                System.out.println("You Win Rock, Paper, Scissors!");
            } else if (userWin < compWin) {
                System.out.println("Computer Wins Rock, Paper, Scissors!");
            } else if (userWin == compWin) {
                System.out.println("You have tied.");
            }

            System.out.println("Would you like to play again?");
            playAgain = sc.nextLine();

            if (playAgain.equals("no") || playAgain.equals("No")) {
                System.out.println("Thanks for playing");
                willContinue = false;

            }
        }

    }
}
