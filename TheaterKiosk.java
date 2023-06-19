import java.util.Scanner;

public class TheaterKiosk {

    public static void main(String[] args){

        // Pseudocode Program

        // class WristBandAge
        //   main()
        //     num userAge
        //     output “Enter your age”
        //     input userAge
        //     if userAge >= 21 then
        //       output “You get a wrist band”
        //     end if
        //   return
        // end class

        // Java Program

        Scanner in = new Scanner(System.in);

        int userAge;

        String trash = "";

        System.out.print("Enter your age: ");

        if (in.hasNextInt()){
            userAge = in.nextInt();
            in.nextLine(); // clears the buffer

            if (userAge >= 21){
                System.out.println("You get a wrist band");
            }
        }
        else {
            trash = in.nextLine();
            System.out.println("\nYou said your age was: " + trash);
            System.out.println("Run the program again and enter a valid amount");
        }


    }

}
