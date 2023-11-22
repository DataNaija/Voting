package voting;

import java.util.Scanner;
public class Voting_Age {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Initialize voting age
        int voting_age = 18;

        int Age = 0;
        System.out.println("Enter your age?: ");
        Age = scanner.nextInt();

        scanner.close();

        // Quotation

        if(Age >= voting_age){
            System.out.println("You're qualified to vote");
        } else{
            System.out.println("You're not qualified to vote");
        }


    }
}
