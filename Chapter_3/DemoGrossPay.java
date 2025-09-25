class DemoGrossPay {
   
   public static void main(String[] args) {
   
      double hours = 25;
      double YourHoursWorked = 37.5;
      calculateGross(10);
      calculateGross(hours);
      calculateGross(YourHoursWorked);
      
   }
   
   public static void calculateGross(double hours) {
      final double Rate = 22.75;
      double gross;
      gross = hours * Rate;
      System.out.println( hours +  "hours at $" + 
         Rate + "per hour is $" + gross);
   }
   
}
