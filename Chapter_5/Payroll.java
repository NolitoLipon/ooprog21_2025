import java.util.Scanner;

class Payroll
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("How many hours did you work this week? ");
        int hours = input.nextInt();

        System.out.print("What is your regular pay rate? ");
        double rate = input.nextDouble();

        Employee emp = new Employee(1234, rate);

        double regularPay = emp.calcRegularPay(hours);
        double overtimePay = emp.calcOvertimePay(hours);

        System.out.println("Regular pay is " + regularPay);
        System.out.println("Overtime pay is " + overtimePay);
    }
}

   