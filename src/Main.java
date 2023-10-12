import java.util.Scanner;
import java.util.Random;
public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        Random rnd = new Random();
        int die1 = 0;
        int die2 = 0;
        int crapsRoll = -1;
        int point = 0;
        String playAgain = "";
        boolean done = false;
        do
        {
            System.out.println("Rolling the dice...");
            die1 = rnd.nextInt(6) + 1;
            die2 = rnd.nextInt(6) + 1;
            crapsRoll = die1 + die2;
            System.out.println("Die 1: " + die1);
            System.out.println("Die 2: " + die2);
            System.out.println("Craps Roll: " + crapsRoll);
            if (crapsRoll == 2 || crapsRoll == 3 || crapsRoll == 12)
            {
                System.out.println("Craps, you lose!");
            }
            else if (crapsRoll == 7 || crapsRoll == 11)
            {
                System.out.println("Natural, you win!");
            }
            else
            {
                System.out.println("The point is " + crapsRoll);
                point = crapsRoll;
                crapsRoll = 0;
                while (crapsRoll != point && crapsRoll != 7)
                {
                    System.out.println("Trying for point...");
                    die1 = rnd.nextInt(6) + 1;
                    die2 = rnd.nextInt(6) + 1;
                    crapsRoll = die1 + die2;
                    System.out.println("Die 1: " + die1);
                    System.out.println("Die 2: " + die2);
                    System.out.println("Craps Roll: " + crapsRoll);
                }
                if (crapsRoll == point)
                {
                    System.out.println("Made point, you win!");
                }
                else
                {
                    System.out.println("Rolled 7, you lose!");
                }
            }
            do
            {
                System.out.print("Do you want to play again? [Y/N]: ");
                playAgain = in.nextLine();
                if (!playAgain.equalsIgnoreCase("Y") && !playAgain.equalsIgnoreCase("N"))
                {
                    System.out.println(playAgain + " is not a valid option [Y/N]");
                }
                else
                {
                    done = true;
                }
            } while (!done);
            done = false;
        } while(playAgain.equalsIgnoreCase("Y"));
    }
}