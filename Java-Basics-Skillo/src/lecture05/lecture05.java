package lecture05;


import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class lecture05 {

    public static void main(String[] args) {
        ex06();
    }

    public static void ex01() {

        Scanner myScanner = new Scanner(System.in);

        int[] numbers = new int[5];

        for(int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number for " + i + " position");
            numbers[i] = myScanner.nextInt();
        }

        System.out.println(Arrays.toString(numbers));

        int maxNumber = 0;
        for(int i = 0; i < numbers.length; i++) {

            if(maxNumber < numbers[i]) {
                maxNumber = numbers[i];
            }
        }

        System.out.println(maxNumber);

        myScanner.close();
    }

    public static void ex02() {

        int[] numbers = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200, 40};

        for(int number : numbers) {

            if(number > 150) {
                break;
            } else {
                if(number % 5 == 0) {
                    System.out.println(number);
                }
            }
        }
    }

    public static void ex03() {

        int[] myArray = {10, 20, 30, 40, 50};

        for(int i = myArray.length - 1; i >= 0; i--) {
            System.out.println(myArray[i]);
        }

    }

    public static void ex04() {

        int[] myArray = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};

        for(int number : myArray) {
            if(number % 5 == 0) {
                System.out.println(number);
                break;
            }
        }
    }

    public static void ex05() {

        int[] myArray = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};

        for (int number : myArray) {
            if(number % 3 == 0){
                continue;
            } else {
                System.out.println(number);
            }

//            if(number % 3 != 0){
//                System.out.println(number);
//            }

        }

    }

    public static void ex06() {
        int[] myArray = {1, 2, 3, 4, 5, 1};

        double sum = 0;
        for (int number : myArray) {
            sum += number;
        }

        double average = sum / myArray.length;
        System.out.println(average);
    }

    public static void ex07() {

        Random randomGen = new Random();
        Scanner myScanner = new Scanner(System.in);

        int randomNumber = randomGen.nextInt(1,100);

        int guessedNumber;
        do {
            System.out.println("Guess a number between 1 and 100");
            guessedNumber = myScanner.nextInt();

            if (guessedNumber == randomNumber) {
                System.out.println("Congrats!");
            } else if (guessedNumber < randomNumber) {
                System.out.println("Too low!");
            } else {
                System.out.println("Too high!");
            }
        } while (guessedNumber != randomNumber);

        myScanner.close();
    }
}
