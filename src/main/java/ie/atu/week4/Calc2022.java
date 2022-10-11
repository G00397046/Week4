package ie.atu.week4;

import java.util.Scanner;

public class Calc2022 {
    public static void main(String[] args) {
        add();

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

