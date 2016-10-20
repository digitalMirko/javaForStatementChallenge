package com.digitalmirko;
/**
 Challenge part 1:
 Using the for statement, call the calculateInterest method with the amount
 of $10,000.00 with an interest Rate of 2, 3, 4, 5, 6, 7 and 8 percent
 then print the results to the console window.

 Challenge part 2:
 Modify the for statement above to do the same thing as shown but to start from 8% and work back to 2%

 */
public class Main {

    public static void main(String[] args) {
        // Part 1 of 2
        for (int i = 2; i < 9; i++){

            System.out.println("$10,000.00 at " + i + "% interest = $" + String.format("%.2f",(calculateInterest(10000.00, i))));
        }

        System.out.println("**************************************");

        // Part 2 of 2
        for (int i = 8; i > 1; i--) {

            System.out.println("$10,000.00 at " + i + "% interest = $" + String.format("%.2f",(calculateInterest(10000.00, i))));
        }
    }

    public static double calculateInterest(double amount, double interestRate) {

        return (amount *(interestRate/100));
    }
}

/*
Output: Part 1:
$10,000.00 at 2% interest = $200.00
$10,000.00 at 3% interest = $300.00
$10,000.00 at 4% interest = $400.00
$10,000.00 at 5% interest = $500.00
$10,000.00 at 6% interest = $600.00
$10,000.00 at 7% interest = $700.00
$10,000.00 at 8% interest = $800.00
**************************************
Output: Part 2:
$10,000.00 at 8% interest = $800.00
$10,000.00 at 7% interest = $700.00
$10,000.00 at 6% interest = $600.00
$10,000.00 at 5% interest = $500.00
$10,000.00 at 4% interest = $400.00
$10,000.00 at 3% interest = $300.00
$10,000.00 at 2% interest = $200.00
 */
