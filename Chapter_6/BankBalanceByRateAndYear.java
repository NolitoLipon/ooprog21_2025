import java.util.Scanner;

class BankBalanceByRateAndYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter initial bank balance > ");
        double balance = input.nextDouble(); 
         
        for (double interestRate = 0.02; interestRate <= 0.05; interestRate += 0.01) {
            double newBalance = balance; 
             System.out.println("\nWith an initial balance of " + balance +
                               " at an interest rate of " + interestRate);
            
            for (int year = 1; year <= 4; year++) {
                newBalance += newBalance * interestRate;
                System.out.println("After year " + year + " balance is " + newBalance);
            }
        }

    }
}
