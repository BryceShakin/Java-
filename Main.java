//Bryce Shakin
//csc 160
//nov 13
//final project 30 or bust
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("welcome!");                             //////intro
        System.out.println("The goal of this game is to accumulate a player score of exactly 30. The first player to score exactly 30 is the Winner!");
        System.out.println("You will roll a pair of dice, then you must choose the score of one of the dice or the total of the two dice. This value is " +
                "added to your player score. If your score goes over 30, your score is reset to zero. Player turn changes after each roll of the dice. " +
                "You win when you accumulate a score of exactly 30.");
        System.out.println();

        int answer = Second.intro();
        Scanner input = new Scanner(System.in);
        if (answer == 1)                            //user chooses if they want to play by thereselves or with friend
            gameOne();
        else
            gameTwo();


    }

    public static void gameOne() {                   //// gameOne only a one player
        Scanner input = new Scanner(System.in);
        System.out.println("what is your name?");
        String player1 = input.nextLine();
        Second Player1 = new Second();
        Player1.playerName = player1;
        System.out.println();
        System.out.println();


        boolean start = true;                       //while loop for one player game
        while (start) {
            start = play1(Player1);


        }
    }
    public static void gameTwo(){            ////gameTwo only has two players
        Scanner input = new Scanner(System.in);     // getting input for player ones name than making an object for the second class to assign the name
        System.out.println("whats player ones name? ");
        String player1Name = input.nextLine();
        Second player1 = new Second();
        player1.playerName = player1Name;
        System.out.println("----------------");




        System.out.println("whats player twos name? ");         //// getting input for player one making an object and assigning the name in Second class
        String player2name = input.nextLine();
        Second player2 = new Second();
        player2.playerName = player2name;
        System.out.println("----------------");


        System.out.println("Welcome "+ player1.playerName + " and " + player2.playerName + " to 30 or Bust!" );


        System.out.println("are you ready to play? type yes(y) or no(n):");             //this determines if the user wants to start if they type n nothing will happen
        String play = input.nextLine();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();

        boolean start;
        if(play.equals("y")) {
            start = true;
        }else{
            start = false;
        }

        while(start){                               //two player game
            start = play1(player1);
            if(start)
            start = play2(player2);
        }

    }




    public static boolean play1(Second player1){//this method will tell player 1 the dice that he rolled and will give him three options on keeping the die that will assign it to the second class under player score
        Scanner input = new Scanner(System.in);
        System.out.println(player1.playerName +" your score is "+player1.playerScore +" you rolled: ");
        int dice1= dice1();
        int dice2= dice2();
        System.out.println("DICE 1:  "+dice1);
        System.out.println("DICE 2:  "+dice2);
        System.out.println("would you like to keep the first die(1), keep the second(2), or both of them(3)?");
        System.out.println();
        int answer = input.nextInt();




        if(player1.playerScore<30) {
            if (answer == 1) {
                System.out.println();
                player1.playerScore += dice1;
                return test(player1);
            } else if (answer == 2) {
                System.out.println();
                player1.playerScore += dice2;
                return test(player1);
            } else {
                System.out.println();
                player1.playerScore += dice1 + dice2;
                return test(player1);
            }
        }
        return false;
    }

    public static boolean play2(Second player2){                    ////this method will tell the player 2 what the dice will have and give him three options to keep the dice and will add it to the second class
        Scanner input = new Scanner(System.in);
        System.out.println(player2.playerName +" your score is "+player2.playerScore +" you rolled: ");
        int dice1= dice1();
        int dice2= dice2();
        System.out.println("DICE 1:   "+dice1);
        System.out.println("DICE 2:   "+dice2);
        System.out.println("would you like to keep the first die(1), keep the second(2), or both of them(3)?");
        System.out.println();
        int answer = input.nextInt();




        if(player2.playerScore<30) {
            if (answer == 1) {
                System.out.println();
                player2.playerScore += dice1;
                return test2(player2);
            } else if (answer == 2) {
                System.out.println();
                player2.playerScore += dice2;
                return test2(player2);
            } else {
                System.out.println();
                player2.playerScore += dice1 + dice2;
                return test2(player2);
            }
        }
        return false;
    }





public static boolean test(Second player1){                     ///////this method will be checking if player 1 will continue playing or not by returning true or false
    if (player1.playerScore>30){
        System.out.println("BUST your score is reset to 0");
        System.out.println("----------------------------------------------");
        System.out.println();
        System.out.println();
        System.out.println();
        player1.playerScore=0;
        boolean start;
        return start = true;
    }else if (player1.playerScore<30){
        System.out.println(player1.playerName +" score is " + player1.playerScore);
        System.out.println("----------------------------------------------");
        System.out.println();
        System.out.println();
        System.out.println();
        boolean start;
        return start = true;
    }else{
        System.out.println("Congrats you hit 30, you won!!!");
        boolean start;
        return start = false;
    }

}
    public static boolean test2(Second player2){                    ///////// this method will be checking if player 2 will keep playing or not by returning true or false
        if (player2.playerScore>30){
            System.out.println("BUST your score is reset to 0");
            System.out.println("----------------------------------------------");
            System.out.println();
            System.out.println();
            System.out.println();
            player2.playerScore = 0;
            boolean start;
            return start = true;
        }else if (player2.playerScore<30){
            System.out.println(player2.playerName +" score is " + player2.playerScore);
            System.out.println("----------------------------------------------");
            System.out.println();
            System.out.println();
            System.out.println();
            boolean start;
            return start = true;
        }else{
            System.out.println("Congrats you hit 30, you won!!!");
            boolean start;
            return start = false;
        }

    }

    public static int dice1(){              //dice one from 1 to 6
    int dice1 = ((int)(Math.random()*6)+1);
    return dice1;
    }
    public static int dice2(){               // dice two from 1 to 6
        int dice2 = ((int)(Math.random()*6)+1);
        return dice2;
    }


}
