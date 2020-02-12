import java.util.*;

public class OddsOrEvens {
    static public void main(String args[]) {
        System.out.println("Let's play a game called Odds or Evens!");
//Part one, when the user puts in their name/ whether they want to be odds or evens
        Scanner input = new Scanner(System.in);
        System.out.print("What is your name?");
        String name = input.next();
        System.out.print("Hi " + name + ", what do you choose? (O)dds or (E)vens?");
        String oddsOrEvens = input.next();
// the computer will always be opposite to what the user chooses
        if (oddsOrEvens.equals("O")) {
            System.out.println(name + " has chosen odds! The computer will be evens.");

        } else {
            System.out.println(name + " has chosen evens! The computer will be odds.");
        }

        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        System.out.println(" ");
//The amount of fingers the user puts out and the amount of fingers the computer puts out is added up
        System.out.println("How many fingers do you put out?");
        int numberChosen = input.nextInt();

        Random rand = new Random();
        int computer = rand.nextInt(6);

        System.out.println("The computer plays number " + computer);
        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
        System.out.println(" ");

        int sum = computer + numberChosen;
        System.out.println(numberChosen + " + " + computer + " = " + sum);

        boolean oddOrEven = sum % 2 == 0;
//comparisons of both if the user chose even or odd

        if (oddOrEven) {
            System.out.println(sum + " is...even!");
            if (oddsOrEvens.equals("E")){
                System.out.println(name + " wins!");
            } else {
                System.out.println("The computer wins!");
            }
        }

        if (!oddOrEven) {
            System.out.println(sum + " is...odd!");
            if (oddsOrEvens.equals("O")){
                System.out.println(name + " wins!");
            } else {
                System.out.println("The computer wins!");
            }
        }

        /* if (oddOrEven && oddsOrEvens.equals("E")){
             System.out.println(name + " wins!");
         } else {
             System.out.println("The computer wins!");
         }
        System.exit(0);

        if (!oddOrEven && oddsOrEvens.equals("O")){
             System.out.println(name + " wins!");
         } else {
             System.out.println("The computer wins!");

         } */

        /* if(sum % 2 == 0 ) {
            System.out.println( sum + " is ...even!");

            if(numberChosen % 2 == 0)
                System.out.println("That means " + name + " wins!");
            else
                System.out.println("That means computer wins!");
        }
        else{
            System.out.println(sum + " is ...odd!");

            if(numberChosen % 2 != 0)
                System.out.println("That means " + name + " wins!");
            else
                System.out.println("That means computer wins!");
*/

        System.out.println("-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_-_");
    }
}












