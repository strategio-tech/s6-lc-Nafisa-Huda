package tech.strategio;

import java.util.Scanner;

public class LoanCalculator {
    /**
     * TODO: finish out this JavaDoc comment block.
     * @author Nafisa Huda
     * @param amount of the loan
     * @return remaining loan amount owed after 3 months
     */
    static int getRemainingAmountIn3Months(int amount) {
        //get the loan amount
        //Take out 10% off the loan, 3 times
        //return remaining amount after 3 months
        for(int i = 1; i < 4; i++){
           int payed = (amount * 10)/100;
           amount -= payed;
        }
        return amount;
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int amount = scanner.nextInt();
            System.out.println(getRemainingAmountIn3Months(amount));
        }
    }
}
