import java.util.Scanner;

public class NumCompare {

    public static void main(String[] args){

        // Pseudocode Program

        // class CompareInputs
        //   main()
        //      num firstInput
        //      num secondInput
        //      output “Enter the first input”
        //      input firstInput
        //      output “Enter the second input”
        //      input secondInput
        //      if firstInput == secondInput then
        //         output “The two inputs are equal”
        //      else if firstInput < secondInput then
        //         output “The input “ + firstInput + “ is less than the other input of ” + secondInput
        //      else
        //         output “The input “ + secondInput + “ is less than the other input of “ + firstInput
        //      end if
        //   return
        // end class

        // Java Program

        Scanner in = new Scanner(System.in);

        double firstInput;
        double secondInput;

        String trash = "";

        System.out.print("Enter the first number: ");

        if (in.hasNextDouble()){
            firstInput = in.nextDouble();
            in.nextLine(); // clears the buffer
        }
        else {
            trash = in.nextLine();
            System.out.println("\nYou said the first number was: " + trash);
            System.out.println("Run the program again and enter a valid amount");
            System.exit(0);
            return;
        }

        System.out.print("Enter the second number: ");

        if (in.hasNextDouble()){

            secondInput = in.nextDouble();
            in.nextLine(); // clears the buffer

            if (firstInput == secondInput){
                System.out.println("The two inputs are equal");
            }
            else if (firstInput < secondInput){
                System.out.println("The input " + Math.round(firstInput) + " is less than the other input of " + Math.round(secondInput));
            }
            else {
                System.out.println("The input " + Math.round(secondInput) + " is less than the other input of " + Math.round(firstInput));
            }
        }
        else {
            trash = in.nextLine();
            System.out.println("\nYou said the second number was: " + trash);
            System.out.println("Run the program again and enter a valid amount");
            System.exit(0);
        }

    }
}
