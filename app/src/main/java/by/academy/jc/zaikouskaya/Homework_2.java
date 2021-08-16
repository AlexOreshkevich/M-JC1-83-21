package by.academy.jc.zaikouskaya;

import java.util.Scanner;

import static java.lang.Integer.sum;

public class Homework2 {

    public static void main(String[] args) {

        //input numbers
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first integer: ");
        int a = in.nextInt();

        System.out.print("Input the second integer: ");
        int b = in.nextInt();

        //sum of numbers
        int sum = a + b;

        //output the sum
        System.out.println("Sum of numbers " + a + " and " + b + " is " + sum);

    }

}
