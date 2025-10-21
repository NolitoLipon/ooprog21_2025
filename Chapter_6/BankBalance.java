import java.util.Scanner;

class BankBalance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double balance, interestRate = 0.03;
        int choice = 1;
        int year = 0;

        System.out.print("Enter initial bank balance > ");
        balance = input.nextDouble();

       
        while (choice == 1) {
            System.out.println("Do you want to see next year's balance?");
            System.out.print("Enter 1 for yes or any other number for no >> ");
            choice = input.nextInt();

            if (choice == 1) {
                year++;
                balance = balance + (balance * interestRate);
                System.out.println("After year " + year + " at " + interestRate +
                        " interest rate, balance is $" + balance);
            }
        }
    }
}
