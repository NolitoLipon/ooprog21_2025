class Employee
{
    private int employeeNumber;
    private double payRate;
    public static final double OVERTIME_MULTIPLIER = 1.5;

    public Employee(int empNum, double rate)
    {
        this.employeeNumber = empNum;
        this.payRate = rate;
    }

    public double getPayRate()
    {
        return payRate;
    }

    public double calcRegularPay(int hoursWorked)
    {
        if (hoursWorked <= 40)
            return hoursWorked * payRate;
        else
            return 40 * payRate;
    }

    public double calcOvertimePay(int hoursWorked)
    {
        if (hoursWorked > 40)
        {
            int overtimeHours = hoursWorked - 40;
            return overtimeHours * payRate * OVERTIME_MULTIPLIER;
        }
        else
            return 0.0;
    }
}
