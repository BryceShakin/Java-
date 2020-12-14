import java.util.Scanner;
//Bryce Shakin
//csc 160
//nov 13
//final project 30 or bust
public class Second {               ///class with 2 public parameters for the game
    public String playerName;
    public int playerScore = 0;



    public static int  intro(){             ///method asking if the user will want to play 1 or 2 players
        Scanner input = new Scanner(System.in);
        System.out.println("would you like to play by yourself(1), or with a friend(2)?");
        int answer = input.nextInt();
        System.out.println(answer);
        return answer;
    }






}
