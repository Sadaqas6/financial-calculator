import java.util.Scanner;

public class FutureValueCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("----The Future Value Calculator----");
        System.out.println("Let's determine the future value!");



        System.out.print("What is your deposit: ");
        double p = sc.nextDouble();

        System.out.print("What is the interest rate: ");
        double i = sc.nextDouble() / 100;

        System.out.print("The total years the deposit will earn interest: ");
        int t = sc.nextInt();



        // FV = P × (1 + (r / 365))^(365 × t)


        double futureValue = p * Math.pow(1 + (i / 365), (365 * t));
        double totalInterest = futureValue - p;


        System.out.printf("\nThis would be the future value: $%.2f" , futureValue);
        System.out.printf("\nThe total interest earned: $%.2f", totalInterest);
    }
}
