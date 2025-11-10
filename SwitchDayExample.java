package batch59;

public class SwitchDayExample {
 public static void main(String[] args) {
     String day = "Monday"; 

     switch (day) {
         case "Monday":
             System.out.println("Start of the work week!");
             break;

         case "Tuesday":
             System.out.println("Second day of the week.");
             break;

         case "Wednesday":
             System.out.println("Midweek day.");
             break;

         case "Thursday":
             System.out.println("Almost the weekend!");
             break;

         case "Friday":
             System.out.println("Weekend is near!");
             break;

         case "Saturday":
             System.out.println("It's the weekend! Time to relax.");
             break;

         case "Sunday":
             System.out.println("Holiday! Enjoy your day.");
             break;

         default:
             System.out.println("Invalid day entered.");
     }
 }
}
