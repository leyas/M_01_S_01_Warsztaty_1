package pl.coderslab.zad1;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Main1 {
    private static final int LOW = 1;
    private static final int HIGH = 100;

    public static void main(String[] args) {
        int randomNumber = generateNumber(LOW, HIGH);
        int number = 0;
        do {
            System.out.print("Zgadnij liczbę: ");
            Scanner scanner = new Scanner(System.in);
            try {
                number = scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("To nie jest liczba");
                continue;
            }

            if (number > randomNumber) {
                System.out.println("Za dużo!");
            } else if (number < randomNumber) {
                System.out.println("Za mało!");
            }
        } while (number != randomNumber);

        System.out.println("Zgadłeś!");
    }

    public static int generateNumber(int low, int high) {
        Random random = new Random();
        return random.nextInt(high - low) + low;
    }
}



