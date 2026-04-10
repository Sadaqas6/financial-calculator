import java.util.Scanner;

public class MortgageCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        System.out.println("------- Mortgage Calculator -------");
        System.out.println("Lets calculate your monthly payment and interest! ");
        System.out.println();
        System.out.print("Principal: ");
        double p = sc.nextDouble();

        System.out.print("Annual Interest Rate: ");
        double i = sc.nextDouble() /100;

        System.out.print("Loan Length(in years): ");
        int loanLength = sc.nextInt();

        double n = 12 * loanLength;

        i /= 12; // interest divided by month  r divided 12


        // M = P × (i × (1+i)^n) / ((1+i)^n - 1)

        double m = p * (i * Math.pow(1 + i, n )) / (Math.pow(1 + i, n ) - 1);

        System.out.printf("Monthy Payments: %.2f%n " , m);

        double totalInterest = (m * n)-p;

        System.out.printf("\n$%.2f/mo payment with a total interest of $%.2f", m , totalInterest);



    }
}
