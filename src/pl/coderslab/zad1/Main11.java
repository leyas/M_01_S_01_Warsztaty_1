package pl.coderslab.zad1;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main11 {
    public static final int LOW = 1;
    public static final int HIGH = 100;

    public static void main(String[] args) {
        int randomNumber = generateRandom();

        Scanner scanner = new Scanner(System.in);
        int numberToCheck = 0;
        do {
            System.out.print("Zgadnij liczbę: ");
            try {
                numberToCheck = scanner.nextInt();
                if(numberToCheck < randomNumber) {
                    System.out.println("Za mało!");
                } else if (numberToCheck > randomNumber){
                    System.out.println("Za dużo.");
                }
            } catch (InputMismatchException e) {
                scanner.next();
                System.out.println("To nie jest liczba!");
            }
        } while (numberToCheck != randomNumber);

        System.out.println("Zgadłeś!");
        scanner.close();
    }

    private static int generateRandom(){
        Random random = new Random();
        return random.nextInt(HIGH-LOW) + LOW;
    }
}
