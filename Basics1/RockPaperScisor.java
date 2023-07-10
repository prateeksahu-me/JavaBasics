import java.util.Scanner;
import java.util.Random;

public class RockPaperScisor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int player1;
        Random rn = new Random();
        player1 = rn.nextInt(3)+1;
        //add random  value b/w 1-3 in player1
        int player2;

        System.out.println("Welcome to Game !!! ROCK.PAPER.SCISSOR");
        System.out.println("Enter \n1 for Rock\n2 for Paper\n3 for Scissor\nPlayer2 : ");
        player2 = sc.nextInt();

        System.out.println("Player1 : "+player1);
        if((player1== 1 && player2 == 1) ||(player1== 2 && player2 == 2) ||(player1== 3 && player2 == 3))
        {
            System.out.println("Tie!");
        }
        else if (player1== 1 && player2 == 2)
        {
            System.out.println("Player2 is Winner!!!");
        }
        else if (player1== 1 && player2 == 3)
        {
            System.out.println("Player1 is Winner!!!");
        }
        else if (player1== 1 && player2 == 2)
        {
            System.out.println("Player2 is Winner!!!");
        }
        else if (player1== 2 && player2 == 1)
        {
            System.out.println("Player1 is Winner!!!");
        }
        else if (player1== 3 && player2 == 1)
        {
            System.out.println("Player2 is Winner!!!");
        }
        else if (player1== 3 && player2 == 2)
        {
            System.out.println("Player1 is Winner!!!");
        }
        else if (player1== 2 && player2 == 3)
        {
            System.out.println("Player2 is Winner!!!");
        }
    }
}
