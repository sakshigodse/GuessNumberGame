
import java.util.Random;
import java.util.Scanner;
public class NumberGuess {
    public static void main(String[] args) {
        Random Random_number= new Random();
        int right_no=Random_number.nextInt(100);
        int turns=0;
        Scanner s=new Scanner(System.in);
        System.out.println("*******************  NUMBER GUESSING GAME   *******************"+
                "\nInstructions for game are:- \n\t1. You have to guess number between 1 to 100. \n\t2. You will have 10 turns." +
                "\n\t3. Based on the number of attempts points will be given.\n" );
        System.out.println("  Best of luck!\n");
        System.out.println("***************************************************************");

        int guess;
        int i=0;
        boolean win=false;
        while(win==false) {
            guess=s.nextInt();
            turns++;

            if(guess==right_no) {
                win=true;
            }
            else if(i>8){
                System.out.println("You loose! the Right Answer was: "+right_no);
                return;
            }
            else if(guess<right_no){
                i++;
                System.out.println("You Guess Lower Number than the Right Guess Number. \tTurns left: "+(10-i));
            }
            else if(guess>right_no) {
                i++;
                System.out.println("You Guess Higher Number than the Right Guess Number. \tTurns left: "+(10-i));

            }
        }
        System.out.println("You WIN!!!");
        System.out.println("The Number was "+right_no);
        System.out.println("You used "+turns+" turns to guess the right number");
        System.out.println("Your score is "+((10-turns)*10)+" out of 100");

    }
}