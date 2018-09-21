package pl.coderslab.zad2;

import pl.coderslab.zad1.Main1;

import java.util.*;

public class Main2 {
    public static void main(String[] args) {
        // wczytanie typowanych liczb
        System.out.println("Jakie liczby typujesz?");
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        int i = 0;
        do {
            System.out.print("Podaj "+(i+1)+" liczbę: ");
            try {
                int number = scanner.nextInt();
                if((number >= 1 && number <= 49) && !numbers.contains(number)) {
                    numbers.add(number);
                    i++;
                }
            } catch (InputMismatchException e){
                scanner.next();
                continue;
            }
        } while (i < 6);
        scanner.close();


        Collections.sort(numbers);
        for(int number : numbers) {
            System.out.print(number+", ");
        }

        Integer[] arr = new Integer[49];
        for (int k = 0; k < arr.length; k++) {
            arr[k] = k + 1;
        }
        Collections.shuffle(Arrays.asList(arr));
        System.out.println(Arrays.toString(arr));

        List<Integer> lotto = Arrays.asList(arr);



        int ileSieZgadza = 0;
        for(int j = 0; j < 6; j++){
            if(numbers.contains(lotto.get(j))){
                ileSieZgadza++;
            }
        }

        if (ileSieZgadza >= 3) {
            System.out.println("Ile się zgadza: " + ileSieZgadza);
        } else {
            System.out.println("Lipa. Zagraj jeszcze raz.");
        }
    }
}
