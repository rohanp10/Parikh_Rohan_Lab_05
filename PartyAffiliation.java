import java.util.Scanner;

public class PartyAffiliation {

    public static void main(String[] args){

        // Pseudocode Program

        //  class PartyAffiliation
        //    main()
        //      String userParty
        //      output “Enter your party affiliation [D for Democrat, R for Republican, or I for Independent]”
        //      input userParty
        //      if userParty == D then
        //        output “You get a Democratic Donkey”
        //      else if userParty == R then
        //        output “You get a Republican Elephant”
        //      else
        //        output “You get an Independent Man”
        //      end if
        //    return
        //  end class

        // Java Program

        Scanner in = new Scanner(System.in);
        String menuChoice = "";
        String menu = "D - Democrat\tR - Republican\tI - Independent\nChoose your party affiliation: ";

        System.out.print(menu);
        menuChoice = in.nextLine();

        if (menuChoice.equalsIgnoreCase("D"))
        {
            System.out.println("You get a Democratic Donkey");
        }
        else if (menuChoice.equalsIgnoreCase("R"))
        {
            System.out.println("You get a Republican Elephant");
        }
        else if (menuChoice.equalsIgnoreCase("I"))
        {
            System.out.println("You get an Independent Man");
        }
        else
        {
            System.out.println("You get an Other party affiliation, since you did not choose D, R, or I");
        }

    }
}
