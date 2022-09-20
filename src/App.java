import java.util.Scanner;

/*
 * Mortgage Calculator - Calculate the monthly payments of a fixed term mortgage over given Nth terms at a given interest rate. Also figure out 
 * how long it will take the user to pay back the loan. For added complexity, 
 * add an option for users to select the compounding interval 
 * (Monthly, Weekly, Daily, Continually).
 * 
 * Mortage calculator formula 
 * M = P * r (1 + r)^n/ (((1 + r)^n) - 1)
 * P: principal amount
 * r: anual rate
 * n: time (monthly or yearly)
 * 
 * Interest rate = 3.03 % (fixed term mortage) annual rate
 * Principal amount = 400,000USD
 *
 */
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Mortage Calculator for Fixed Term mortage");
        System.out.println("-------------");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal amount you borrowed?(USD) ");
        int principal = scanner.nextInt();
        System.out.print("Enter the interest rate?(%) ");
        double rate = scanner.nextDouble();
        System.out.print("Enter the time period of payment?(years)");
        int time = scanner.nextInt();

        rate = rate / 100; // change rate in decimal
        double monthlyRate = rate / 12; // annual rate to monthly
        double monthly = time * 12;
        double monthlyPayment = (principal * monthlyRate * (Math.pow((1 + monthlyRate), monthly)))
                / (Math.pow((1 + monthlyRate), monthly) - 1);

        double totalPaymentAmount = monthlyPayment * 360;
        System.out.println("Your monthy payments are " + Math.round(monthlyPayment) + "USD");
        System.out.println("Your will have to pay " + Math.round(totalPaymentAmount) + "USD in total");
    }
}
