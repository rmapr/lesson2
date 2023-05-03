package averageMean;

import java.util.Scanner;

public class App {
    static Scanner sc;
    static int numTask;
    public static void main(String[] args) {
        numTask = getNumTask();
        switch (numTask) {
            case 1 -> calcAvgTwoNumbers();
            case 2 -> calcAvgAnyNumbers();
            default ->{
                System.out.println("Shutdown...");
                sc.close();
            }
        }
    }
    private static void calcAvgTwoNumbers(){
        System.out.print("Enter two numbers:\n");
        double num1 = sc.nextDouble();
        double num2 = sc.nextDouble();
        System.out.printf("Arithmetic mean of two numbers: %.2f", getAvgNumbers(num1 + num2, 2));
    }

    private static void calcAvgAnyNumbers(){
        System.out.print("Enter arbitrary integer numbers:\n");
        int kolNumber = sc.nextInt();
        double sum = 0;
        int count = 0;
        for (int i = 0; i < kolNumber; i++) {
            count++;
            System.out.printf("Enter %d number:\n", count);
            sum += sc.nextDouble();
        }
        System.out.printf("Arithmetic mean %d numbers: %.2f",kolNumber, getAvgNumbers(sum, kolNumber));
    }

    private static double getAvgNumbers(double sum, double number){
        return sum / number;
    }

    private static int getNumTask(){
        printMenu();
        sc = new Scanner(System.in);
        return sc.nextInt();
    }

    private static void printMenu(){
        System.out.print("Enter task number (1,2 or 0):\n" +
                "1: Arithmetic mean of two numbers;\n" +
                "2: Arithmetic mean of an arbitrary number of numbers;\n" +
                "0: Exit.\n");
    }
}
