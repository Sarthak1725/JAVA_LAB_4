//Sarthak PAtil
//23070126088
//AIML B1

import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Deck deck = new Deck();
        int choice;
        do { 

             System.out.println("\nMENU");
            System.out.println("1. Print Deck");
            System.out.println("2. Print a Specific Card");
            System.out.println("3. Find Cards of Same Suit");
            System.out.println("4. Find Cards of Same Rank");
            System.out.println("5. Find a Specific Card");
            System.out.println("6. Deal 5 Random Cards");
            System.out.println("7. Shuffle Deck");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();
            
        } while (true);

    }

}