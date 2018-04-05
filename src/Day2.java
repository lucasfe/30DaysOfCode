import java.text.DecimalFormat;
import java.util.Scanner;

public class Day2 {
	
	
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double meal_cost = in.nextDouble();
        int tip_percent = in.nextInt();
        int tax_percent = in.nextInt();
        
        double tip = (meal_cost * tip_percent)/100;
        double tax = (meal_cost * tax_percent)/100;

        
        int total = (int) (meal_cost + tip + tax);
        
        System.out.println("The total meal cost is " +total + " dollars");
        in.close();
    }


}
