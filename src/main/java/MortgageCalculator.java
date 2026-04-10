import java.util.Scanner;

public class FinancialCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        System.out.println("------- Mortgage Calculator -------");

        System.out.print("\tPrincipal: ");
        double principal = sc.nextDouble();

        System.out.print("\tAnnual Interest: ");
        double interestRate = sc.nextDouble();

        System.out.print("\tLoan Length(in years): ");
        int loanLength = sc.nextInt();






        // M = P × (i × (1+i)^n) / ((1+i)^n - 1)








    }
}
