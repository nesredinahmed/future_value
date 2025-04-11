import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        A calculator that determines the future value of a
//        one-time deposit assuming compound interest - it is used to help
//        you decide how much a CD will be worth when it matures
//        a) It would accept the deposit, interest rate, and number of
//        years from the user
        System.out.printf("Inter Your Deposit Amount:");
        Scanner input = new Scanner(System.in);
        double depositAmount = input.nextDouble();

        System.out.printf("Inter Your Annule Interst: %%");
        double rowRate = input.nextDouble();

        System.out.printf("Inter Your Number Of Year:");
        double numberOfYear = input.nextDouble();

        double totalInterstRate = 0;
        double annuleInterset = rowRate / 100;

        // mathimatical input
        double futurAmount = 0;
//        b) It would display the future value and the total interest
//        earned
//        Example: If you deposit $1,000 in a CD that earns 1.75%
//                interest and matures in 5 years, your CD's ending balance will
//        be $1,092.62 and you would have earned $92.62 in interest
//        Note: The numbers above assume daily compounding
        futurAmount = depositAmount * Math.pow( (1 + (annuleInterset / 365)), (365 * numberOfYear));
        totalInterstRate = futurAmount - depositAmount;


//        FV = P × (1 + (r / 365))^(365 × t)
//• Future Value (FV)
//• Principal (P): This is the initial deposit amount.
//• Annual Interest Rate (r): The nominal annual interest rate in decimal form
//        (e.g., 1.75% = 0.0175).
//• Number of Years (t): The total number of years the deposit will earn interest.
//• Days Per Year: Daily compounding assumes 365 days per year.
//• Total Number of Days: This is 365 × t (because there are 365 days per year).
//• Total Interest Earned = FV - P
        //OUTPUT
        System.out.printf("Futur Amount $%.2f\n", futurAmount );
        System.out.printf("Total Interest Earned = $%.2f.", totalInterstRate );

        }
}
