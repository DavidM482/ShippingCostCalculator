import java.util.Scanner;

public class ShippingCostCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //variables
        int maxShippingPrice = 100;
        double totalPrice;
        double itemPrice;
        double shippingPercent = 0.02;

        //output
        System.out.println("What is the price of your item?");
        if (scan.hasNextDouble()) {
            itemPrice = scan.nextDouble();

            //decision
            if (itemPrice <= maxShippingPrice) {
                totalPrice = itemPrice + (itemPrice * shippingPercent);
                System.out.println("Your total cost is " + totalPrice + ".");
            } else {
                totalPrice = itemPrice;
                System.out.println("Your total cost is " + totalPrice + ". You had free shipping.");
            }
        } else {
            System.out.println("You have entered an invalid value.");
        }
    }
}