import java.util.*;

// Basic game of rock, paper, scissors!

public class rockPaperScissors {

    public static void main(String[] args){
        System.out.println("Let's play a game!");
        Scanner input = new Scanner(System.in);
        System.out.print("What's your name?");


        String name = input.next();

        System.out.println("Hiya " + name + ", what do you choose: rock, paper or scissors?");

        //User puts in their name
        String playerSelect = input.next();

        // If method for when the player selects either rock, paper or scissors
        if(playerSelect.equals("rock")){
            System.out.println("The player has chosen rock!");
        } else if (playerSelect.equals("paper")){
            System.out.println("The player has chosen paper!");
        } else {
            System.out.println("The player has chosen scissors!");
        }

        // The computer is assigned a random number which could be 0, 1 or 2
        Random rand = new Random();
        int computer = rand.nextInt(2);

          /*  if(computer == 0){
            } else if (computer == 1){
                System.out.println("The computer has chosen paper!");
            } else{
                System.out.println("The computer has chosen scissors!");
            }
        */
        //Switch statement embedded into an if statement which goes through each of the three possibilities that could happen for each selection
        if(computer == 0){
            System.out.println("the computer has chosen rock!");
            switch (playerSelect) {
                case "rock":
                    System.out.println("Darn, they both cancel out...play again!");
                    break;
                case "paper":
                    System.out.println("Yikes, paper is super effective against rock! You win!");
                    break;
                case "scissors":
                    System.out.println("Darn! Rock wins against scissors! You lose!");
                    break;
            }
        }
        // Switch statement #2
        if(computer == 1){
            System.out.println("The computer has chosen paper!");
            switch (playerSelect) {
                case "rock":
                    System.out.println("Crap, paper beats rock. You lose :(");
                    break;
                case "paper":
                    System.out.println("Oof, paper and paper cancel out :/");
                    break;
                case "scissors":
                    System.out.println("Scissors is super effective against paper! You win...");
                    break;
            }
        }
        // Switch statement #3
        if(computer == 2){
            System.out.println("The computer has chosen scissors!");
            switch (playerSelect) {
                case "rock":
                    System.out.println("Oh my, rock is super effective against scissors! You win!");
                    break;
                case "paper":
                    System.out.println("Nice! Scissors easily beats paper! You lose!");
                    break;
                case "scissors":
                    System.out.println("Oh, scissors and scissors cancel out...");
                    break;
            }
        }

        System.out.println("Thanks for playing!!! Play again?");

    }

}
