import java.util.Scanner;

public class EdxModule1 {

// int % int = remainder of dividing the numbers, useful for 24 hour format
//This project lets the user input directly into the terminal using Scanner to caluclate various things the user will 
// need to know when they go on vacation

public static void introScanner(){
    Scanner input = new Scanner(System.in);

        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name?");
        String name = input.next();
        System.out.print("Nice to meet you " + name + ", where are you travelling to?");
        String location = input.next();
        System.out.println("Great! " + location + " sounds like a great trip");
}

public static void timeBudget(){
    Scanner input2 = new Scanner(System.in);

            System.out.print("How many days are you going to spend travelling?");

    int days = input2.nextInt();
    int daysToHours = days * 24;
    int hoursToMinutes = daysToHours * 60;

            System.out.print("How much money, in USD, are you planning to spend on the trip?");

    double budget = input2.nextInt();
    double budgetPerDay = budget/days;

            System.out.print("What is the three letter currency symbol for your travel destination?");
    String symbol = input2.next();

            System.out.println("How many " + symbol + " are there in 1 USD?");

    double conversionRate = input2.nextDouble();
    double usdConversion = conversionRate * budget;

            System.out.println("If you are travelling for " + days + " days that is the same as " + daysToHours + " hours or " + hoursToMinutes + " minutes.");
            System.out.println("If you are going to spend " + budget + " USD that means per day you can spend up to " + budgetPerDay + " USD");
            System.out.println("Your total budget in " + symbol + " is " + usdConversion + ", which per day is " + usdConversion/days + " " + symbol);
}

public static void timeComparison(){
    Scanner input3 = new Scanner(System.in);

        System.out.print("What is the time difference between your home and your destination?");

    int timeDifference = input3.nextInt();
    int timeAdd = timeDifference % 24;
    int timeSubtract = timeDifference % 24;

        System.out.print("That means when it is midnight at home it will be " + timeAdd + ":00 in your travel destination and when it is noon " +
                "at home it will be " + timeSubtract + ":00 ");



}



public static void main(String[] args){

    introScanner();
    System.out.println(" ");
    timeBudget();
    System.out.println(" ");
    timeComparison();
    System.out.println(" ");

}

}
