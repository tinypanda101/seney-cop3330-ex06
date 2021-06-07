/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ryan Seney
 */


import java.time.Year;
import java.util.Scanner;


public class RetirementCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your current age?");
        String currentAge = scanner.nextLine();

        System.out.println("At what age would you like to retire?");
        String retireAge = scanner.nextLine();

        int currentAgeInt = Integer.parseInt(currentAge);

        int retireAgeInt = Integer.parseInt(retireAge);

        int year = Year.now().getValue();

        int yearsLeft = retireAgeInt - currentAgeInt;

        int retireYear = year + yearsLeft;

        System.out.println("You have " + yearsLeft + " years left until you can retire.");

        System.out.println("It's " + year + ", so you can retire in " + retireYear + ".");
    }
}