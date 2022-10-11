package ie.atu.week4;

import java.util.Scanner;

public class Calc2022 {




    public static void main (String[] args) {
    delete();
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
