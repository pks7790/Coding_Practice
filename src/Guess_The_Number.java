import java.util.*;

public class Guess_The_Number {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Hello! Would you like to play vOne or vTwo of guess the number?");
        String gameChoice = input.next();

        if (gameChoice.equals("vOne")){
            guessTheNumberOne();
        } else if (gameChoice.equals("vTwo")){
            guessTheNumberTwo();
        }
    }

    public static void guessTheNumberOne() {
        Scanner inputTwo = new Scanner(System.in);
        Random randNumber = new Random();
        System.out.println("Alright! The computer is choosing a random number...");
        int randVOne = randNumber.nextInt(100);
        System.out.println("Computer has chosen number! Now for your hints...:");

        ArrayList<String> hints = new ArrayList<>();
        ArrayList<String> falseHints = new ArrayList<>();

        if (randVOne % 50 == 0){
            hints.add("50");
        } else {
            falseHints.add("50.");
        }
        if (randVOne % 25 == 0){
            hints.add("25");
        } else {
            falseHints.add("25");
        }

        if (randVOne % 10 == 0){
            hints.add("10");
        } else {
            falseHints.add("10");
        }

        if (randVOne % 5 == 0){
            hints.add("5");
        } else {
            falseHints.add("5");
        }

        if (randVOne % 3 == 0){
            hints.add("3");
        } else {
            falseHints.add("3");
        }

        if (randVOne % 2 == 0){
            hints.add("2");
        } else {
            falseHints.add("2");
        }

        if (randVOne % 4 == 0){
            hints.add("4");
        } else {
            falseHints.add("4");
        }

        System.out.println("Factors that are not with the random numbers:");
        System.out.println(falseHints);
        System.out.println("Actual factors of this number:");
        System.out.println(hints);
        System.out.println("Now you have five chances to guess, good luck!");

        int[] chances = new int [6];

        for (int i = 1; i <= chances.length; i++){
            chances[i] = inputTwo.nextInt();
            int numberR = chances[i];
            if (numberR == randVOne){
                System.out.println("Congratulations! You have guessed the number!");
                break;
            } else {
                System.out.println("Sorry, wrong number.");
            }
            if (i == 5 && chances[5] != randVOne) {
                System.out.println("Oof, you have lost...Play again?");
                break;
            }
        }
    }

    public static void guessTheNumberTwo(){

    }
}

