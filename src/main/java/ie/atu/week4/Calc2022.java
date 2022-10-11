package ie.atu.week4;

import java.util.Scanner;

public class Calc2022 {




    public static void main (String[] args) {
    add();
    delete();
    }
    
     public static void add() {
        System.out.println("Please enter first number: ");
        Scanner inputs = new Scanner(System.in);

        int firstNumber = inputs.nextInt();

        System.out.println("Please enter first number: ");
        int secondNumber = inputs.nextInt();

        int total = firstNumber + secondNumber;

        System.out.printf("The total is " + total);
    }

    public static void delete() {
    System.out.println("please enter your first number ");
    Scanner inputs = new Scanner(System.in);

    int firstnNumber = inputs.nextInt();



    System.out.println("please enter your second number ");
    int secondNumber = inputs.nextInt();


        int total = firstnNumber - secondNumber;
    System.out.println(" your total is :" + total );

}

}
