package task6;

import java.util.Random;
import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int randomNumber = random.nextInt(0,100);
        int userNumber;
        System.out.println("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Let the game begin!");
        boolean endGame = false;
        while (!endGame){
            System.out.println("Enter the number from 0 to 100");
            userNumber=scanner.nextInt();
            if (userNumber<randomNumber){
                System.out.println("Your number is too small. Please, try again.");
            }
            else if (userNumber>randomNumber) {
                System.out.println("Your number is too big. Please, try again");
            }
            else {
                System.out.println("Congratulations, " + name + "!");
                endGame=true;
            }
        }
    }
}
