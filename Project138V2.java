import java.util.Scanner;

public class Project138V2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // initialize choice variable
        String choice = "";

        // welcome user to program
        System.out.println("Welcome to the Choose Your Pet Decision-Maker!");
        System.out.println();

        // decision 1 = indoor vs outdoor
        System.out.println("Where would you like your pet to live?");
        System.out.println("Type 1 for INDOORS or 2 for OUTDOORS");
        choice = sc.nextLine();

        //////////////////////////////////////////////////////////////////////////////////////

        // if choice = indoor pet
        if (choice.equals("1")) {
            // display choice
            System.out.println("You chose an indoor pet.");
            System.out.println();

            // decision
            System.out.println("Would you like a small or large pet?");
            System.out.println("Type 1 for SMALL or 2 for LARGE");
            choice = sc.nextLine();

            // if choice = small pet
            if (choice.equals("1")) {
                // display choice
                System.out.println("You chose a small pet.");
                System.out.println();

                // decision
                System.out.println("Would you like a soft or scaly pet?");
                System.out.println("Type 1 for SOFT or 2 for SCALY");
                choice = sc.nextLine();

                // if choice = soft
                if (choice.equals("1")) {
                    System.out.println("You chose a soft pet.");
                    System.out.println("You should get a chinchilla!");
                }

                // if choice = scaly
                else if (choice.equals("2")) {
                    System.out.println("You chose a scaly pet.");
                    System.out.println("You should get an iguana!");
                }

                // display error message if input is invalid
                else {
                    System.out.println("Your input is invalid. Please restart.");
                }
            }
            // if choice = large pet
            else if (choice.equals("2")) {
                // display choice
                System.out.println("You chose a large pet.");
                System.out.println();

                // decision
                System.out.println("Would you like a pet that protects your house or encourages visitors?");
                System.out.println("Type 1 for PROTECTOR or 2 for ENCOURAGER");
                choice = sc.nextLine();

                // if choice = protector
                if (choice.equals("1")) {
                    System.out.println("You chose a protective pet.");
                    System.out.println("You should get a bear!");
                }

                // if choice = encourager
                else if (choice.equals("2")) {
                    System.out.println("You chose a friendly pet.");
                    System.out.println("You should get an red panda!");
                }

                // display error message if input is invalid
                else {
                    System.out.println("Your input is invalid. Please restart.");
                }
            }

            // display error message if input is invalid
            else {
                System.out.println("Your input is invalid. Please restart.");
            }
        }

        //////////////////////////////////////////////////////////////////////////////////////

        // if choice = outdoor pet
        else if (choice.equals("2")) {
            // display choice
            System.out.println("You chose an outdoor pet.");
            System.out.println();

            // decision
            System.out.println("Would you like a pet with big teeth or no teeth?");
            System.out.println("Type 1 for BIG TEETH or 2 for NO TEETH");
            choice = sc.nextLine();

            // if choice = big teeth
            if (choice.equals("1")) {
                // display choice
                System.out.println("You chose a pet with big teeth.");
                System.out.println();

                // decision
                System.out.println("Would you like a green or orange pet?");
                System.out.println("Type 1 for GREEN or 2 for ORANGE");
                choice = sc.nextLine();

                // if choice = green
                if (choice.equals("1")) {
                    System.out.println("You chose a green pet.");
                    System.out.println("You should get an alligator!");
                }

                // if choice = orange
                else if (choice.equals("2")) {
                    System.out.println("You chose an orange pet.");
                    System.out.println("You should get a tiger!");
                }

                // display error message if input is invalid
                else {
                    System.out.println("Your input is invalid. Please restart.");
                }
            }
            // if choice = no teeth
            else if (choice.equals("2")) {
                // display choice
                System.out.println("You chose a pet with no teeth.");
                System.out.println();

                // decision
                System.out.println("Would you like a pet that flies or walks?");
                System.out.println("Type 1 for FLIES or 2 for WALKS");
                choice = sc.nextLine();

                // if choice = flies
                if (choice.equals("1")) {
                    System.out.println("You chose a pet that flies.");
                    System.out.println("You should get a parrot!");
                }

                // if choice = walks
                else if (choice.equals("2")) {
                    System.out.println("You chose a pet that walks.");
                    System.out.println("You should get a tarantula!");
                }

                // display error message if input is invalid
                else {
                    System.out.println("Your input is invalid. Please restart.");
                }
            }

            // display error message if input is invalid
            else {
                System.out.println("Your input is invalid. Please restart.");
            }
        }
        // display error message if input is invalid
        else {
            System.out.println("Your input is invalid. Please restart.");
        }
    }
}
