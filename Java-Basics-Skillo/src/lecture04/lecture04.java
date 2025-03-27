package lecture04;

import java.util.Scanner;

public class lecture04 {

    public static void main(String[] args) {

        exercise07();

    }

    public static void exercise01() {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter angle 1: ");
        int angle1 = myScanner.nextInt();
        System.out.print("Enter angle 2: ");
        int angle2 = myScanner.nextInt();
        System.out.print("Enter angle 3: ");
        int angle3 = myScanner.nextInt();

        int anglesSum = angle1 + angle2 + angle3;

        if (anglesSum == 180) {
            System.out.println("Triangle can be build");

            // Типа според ъглите
            if (angle1 == 90 || angle2  == 90 || angle3 ==90) {
                System.out.println("Правоъгълен");
            } else if (angle1 < 90 || angle2 < 90 || angle3 < 90) {
                System.out.println("Остроъгълен");
            } else if (angle1 > 90 || angle2 > 90 || angle3 > 90) {
                System.out.println("Тъпоъгълен");
            }
            // Типа според страните
            if (angle1 == angle2 && angle2 == angle3) {
                System.out.println("Равностранен");
            } else if (angle1 == angle2 || angle2 == angle3 || angle3 == angle1){
                System.out.println("Равнобедрен");
            } else {
                System.out.println("Разностранен");
            }

        } else {
            System.out.println("Triangle cannot be build");
        }


    }

    public static void exercise02() {

        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter a day of the week: ");
        byte day = myScanner.nextByte();
        String dayOfWeek;


        switch (day) {
            case 1:
                dayOfWeek = "Monday";
                System.out.printf("The %d-st day of the week is %s.", day, dayOfWeek);
                break;
            case 2:
                dayOfWeek = "Tuesday";
                System.out.printf("The %d-nd day of the week is %s.", day, dayOfWeek);
                break;
            case 3:
                dayOfWeek = "Wednesday";
                System.out.printf("The %d-rd day of the week is %s.", day, dayOfWeek);
                break;
            case 4:
                dayOfWeek = "Thursday";
                System.out.printf("The %d-th day of the week is %s.", day, dayOfWeek);
                break;
            case 5:
                dayOfWeek = "Friday";
                System.out.printf("The %d-th day of the week is %s.", day, dayOfWeek);
                break;
            case 6:
                dayOfWeek = "Saturday";
                System.out.printf("The %d-th day of the week is %s.", day, dayOfWeek);
                break;
            case 7:
                dayOfWeek = "Sunday";
                System.out.printf("The %d-th day of the week is %s.", day, dayOfWeek);
                break;
            default:
                System.out.println("Not a valid weekday");

        }

    }

    public static void exercise03() {

        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = myScanner.nextInt();

        if (age >= 16) {
            System.out.println("You are eligible to work.");
        } else {
            System.out.println("You're NOT eligible to work.");
        }

    }

    public static void exercise04() {

        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter unit price: ");
        int unitPrice = myScanner.nextInt();
        System.out.print("Enter quantity: " );
        int quantity = myScanner.nextInt();

        double discountRate;

        if (quantity < 100) {
            discountRate = 0;
        } else if ( quantity >= 100 && quantity <= 120) {
            discountRate = 0.15;
        } else {
            discountRate = 0.20;
        }

        double discount = (unitPrice * quantity) * discountRate;
        double revenue = (unitPrice * quantity) - discount;
        System.out.println("The revenue from sale: " + revenue + "$");
        System.out.println("Discount: " + discount + "$" + "(" + discountRate * 100 + "%)");
    }


    public static void exercise05() {

        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter preferred type of vacation (beach or mountain): ");
        String vacationType = myScanner.nextLine();

        System.out.print("Enter your budget: ");
        double budget = myScanner.nextDouble();

        System.out.print("Enter desired days: ");
        int days = myScanner.nextInt();

        System.out.print("Enter number of people: ");
        int people = myScanner.nextInt();

        double dailyBudget = budget / days;
        double dailyBudgetPerPerson = dailyBudget / people;

        String destinationBulgaria = "Suitable destination: Bulgaria";
        String destinationOutsideBulgaria = "Suitable destination: Outside Bulgaria";

        if (vacationType.equals("beach")) {

            if (dailyBudgetPerPerson < 50) {
                System.out.println(destinationBulgaria);
            } else {
                System.out.println(destinationOutsideBulgaria);
            }

        } else if (vacationType.equals("mountain")) {

            if (dailyBudgetPerPerson < 30) {
                System.out.println(destinationBulgaria);
            } else {
                System.out.println(destinationOutsideBulgaria);
            }

        } else {
            System.out.println("There is no information about this type of vacation");
        }

        myScanner.close();
    }


    public static void exercise06() {


        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = myScanner.nextInt();


        if ((year % 4 == 0) && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }

        myScanner.close();
    }

    public static void exercise07() {

        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter temperature: ");
        double temp = myScanner.nextDouble();

        System.out.println("Enter direction: \n 1 Celsius to Fahrenheit \n 2 Fahrenheit to Celsius");
        byte direction = myScanner.nextByte();

        double cTOf = temp * 9/5 + 32;
        double fTOc = (temp - 32) * 5/9;

        switch (direction){
            case 1:
                System.out.println(cTOf);
                break;
            case 2:
                System.out.println("Temperature in Celsius: " + fTOc);
                break;
            default:
                System.out.println("Not a valid direction");
                break;
        }

    }
}

