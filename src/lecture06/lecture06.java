package lecture06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class lecture06 {
    public static void main(String[] args) {
        ex05();
    }

    public static void ex01() {
        //   0, 1, 2, 3, 4
        int[] numbers = {5, 30, 47, 8, 9};
        int sum = 0;

        for (int num : numbers) {
            sum += num;
        }

        System.out.println(sum);

    }

    public static void ex02() {

        int[][] matrix = {
                {4, 7, 19}, //0
                {5, 8, 13}, //1
                {6, 2, 1}, //2
                {6, 1, 0} //3
        };

        for (int rows[] : matrix) {

            for (int number : rows) {
                System.out.println(number);
            }
            System.out.println();

        }

    }

    public static void ex03() {

        Scanner myScanner = new Scanner(System.in);


        System.out.println("Enter your desired number of rows");
        int rows = myScanner.nextInt();
        System.out.println("Enter your desired number of columns");
        int columns = myScanner.nextInt();

        int[][] matrix = new int[rows][columns];

        for (int rowsIndex = 0; rowsIndex < rows; rowsIndex++) {
            for (int columnsIndex = 0; columnsIndex < columns; columnsIndex++) {
                System.out.println("Enter a number " + columnsIndex + " for " + rowsIndex + " row ");
                matrix[rowsIndex][columnsIndex] = myScanner.nextInt();
            }
        }

        for (int matrixIndex[] : matrix) {
            for (int index : matrixIndex){
                System.out.println(index);
            }
            System.out.println();
        }
    }

    public static void ex04() {

        int[] array = {5, 8, 12 ,50, 67, 32};
        int max = 0;

        for (int number : array) {
            if (max < number) {
                max = number;
            }
        }

        System.out.println(max);
    }

    public static void ex05() {

     //TO DO


    }

}
