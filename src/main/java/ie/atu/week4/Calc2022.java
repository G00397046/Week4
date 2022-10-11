package ie.atu.week4;

import java.util.Scanner;

public class Calc2022 {

        public static void main (String[] args) {
           add();
        }

        public static void add() {
            System.out.println("Please enter your first number to add: ");
            Scanner inputs = new Scanner(System.in);

            int firstNumber = inputs.nextInt();



            System.out.println("Please enter your second number to add:  ");
            int secondNumber = inputs.nextInt();


            int total = firstNumber + secondNumber;
            System.out.println(" your total is :" + total );

        }

    }