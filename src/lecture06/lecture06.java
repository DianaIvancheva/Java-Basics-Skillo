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

        ArrayList<String> toDoList = new ArrayList<>();
        toDoList.add("Do Java Homework");
        toDoList.add("Do Uni Homework");

        ArrayList<String> completedTasks = new ArrayList<>();
        completedTasks.add("Clean room");

        showMainMenu(toDoList, completedTasks);

    }
    public static void showMainMenu(ArrayList<String> toDoList, ArrayList<String> completedTasks) {

        Scanner myScanner = new Scanner(System.in);

        boolean exitRequested = false;
        while (false == exitRequested) {

            System.out.println("\nPlease enter a number between 1 and 5.\n" +
                    "1) Show tasks lists \n" +
                    "2) Add task \n" +
                    "3) Mark task as completed \n" +
                    "4) Delete completed tasks \n" +
                    "5) End program");

            int chosenOption = myScanner.nextInt();
            myScanner.nextLine();

            switch (chosenOption) {
                case 1:
                    System.out.println("To-do:");
                    showTasks(toDoList);
                    System.out.println("Completed tasks:");
                    showTasks(completedTasks);
                    break;
                case 2:
                    addTaskMenu(toDoList);
                    break;
                case 3:
                    markTasksAsCompleted(toDoList, completedTasks);
                    break;
                case 4:
                    completedTasks.clear();
                    break;
                case 5:
                    exitRequested = true;
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
        myScanner.close();

    }

    public static void showTasks(ArrayList<String> tasks) {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(i + 1 +") " + tasks.get(i));
        }
    }

    public static void addTaskMenu(ArrayList<String> toDoList) {
        boolean exitRequested = false;
        Scanner myScanner = new Scanner(System.in);
        while (false == exitRequested) {
            System.out.println("Add a task menu \n" +
                    "1) Add a task \n" +
                    "2) Exit");
            int chosenOption = myScanner.nextInt();
            myScanner.nextLine();

            switch (chosenOption) {
                case 1:
                    System.out.println("Enter your task");
                    String newTask = myScanner.nextLine();
                    toDoList.add(newTask);
                    break;
                case 2:
                    exitRequested = true;
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }

    public static void markTasksAsCompleted(ArrayList<String> toDoList, ArrayList<String> completedTasks) {
        boolean exitRequest = false;
        Scanner myScanner = new Scanner(System.in);

        while (false == exitRequest) {
            System.out.println("Mark tasks as completed menu \n" +
                    "1) Mark task as completed \n" +
                    "2) Exit");
            int chosenOption = myScanner.nextInt();
            switch (chosenOption) {
                case 1:
                    System.out.println("Enter a number of completed task");
                    System.out.println("To-do list");
                    showTasks(toDoList);
                    int numberOfCompletedTask = myScanner.nextInt();
                    myScanner.nextLine();

                    if (numberOfCompletedTask > 0 && numberOfCompletedTask <= toDoList.size()) {
                        completedTasks.add(toDoList.get(numberOfCompletedTask - 1));
                        toDoList.remove(numberOfCompletedTask - 1);
                    } else {
                        System.out.println("Invalid");
                    }

                    break;
                case 2:
                    exitRequest = true;
                    break;
                default:
                    System.out.println("Invalid option");
                    break;
            }
        }
    }

}
