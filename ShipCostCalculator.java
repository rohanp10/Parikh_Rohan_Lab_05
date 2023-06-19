import java.util.Scanner;

public class ShipCostCalculator {

    public static void main(String[] args){

        // Pseudocode Program

        // class ShippingCosts
        //    main()
        //      num itemPrice
        //      num shippingCost
        //      num totalPrice
        //      output “Enter the price of the item”
        //      input itemPrice
        //      if itemPrice >= 100 then
        //         shippingCost = 0
        //      else
        //         shippingCost = itemPrice * 0.02
        //      end if
        //      totalPrice = itemPrice + shippingCost
        //      output “The shipping cost of the item is $” + shippingCost
        //      output “The total price of the item is $” + totalPrice
        //    return
        // end class

        // Java Program

        Scanner in = new Scanner(System.in);

        double itemPrice;
        double shippingCost;
        double totalPrice;

        String trash = "";

        System.out.print("Enter the price of the item: ");

        if (in.hasNextDouble()){

            itemPrice = in.nextDouble();
            in.nextLine(); // clears the buffer

            if (itemPrice >= 100){
                shippingCost = 0;
            }
            else {
                shippingCost = itemPrice * 0.02;
            }

            totalPrice = itemPrice + shippingCost;
            System.out.println("The shipping cost of the item is $" + shippingCost);
            System.out.println("The total price of the item is $" + totalPrice);

        }
        else {

            trash = in.nextLine();
            System.out.println("\nYou said the price of the item was: " + trash);
            System.out.println("Run the program again and enter a valid amount");

        }

    }

}
