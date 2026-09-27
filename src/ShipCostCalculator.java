import java.util.Scanner;

public class ShipCostCalculator {
    public static void main(String[] args) {
        // Create a Scanner to get input from the user.
        // Ask the user to enter the price of an item.
        // Safely check that the input is a valid double.
        // If the item price is $100 or more, set shipping cost to 0.
        // Otherwise, calculate shipping as 2% of the item price.
        // Calculate the total price by adding the item price and shipping cost.
        // Display the shipping cost and total price.
        // If the input is invalid, display an error message.

        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        double shippingCost = 0;
        double totalPrice = 0;
        String trash = "";

        System.out.print("Enter the price of the item: ");

        if (in.hasNextDouble()) {
            itemPrice = in.nextDouble();
            in.nextLine();

            if (itemPrice >= 100) {
                shippingCost = 0;
            } else {
                shippingCost = itemPrice * 0.02;
            }

            totalPrice = itemPrice + shippingCost;

            System.out.printf("Shipping cost: $%.2f%n", shippingCost);
            System.out.printf("Total price: $%.2f%n", totalPrice);
        } else {
            trash = in.nextLine();
            System.out.println("Invalid input: " + trash);
        }

        in.close();
    }
}
