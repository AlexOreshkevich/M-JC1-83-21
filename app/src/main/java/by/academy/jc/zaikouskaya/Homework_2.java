package by.academy.jc.zaikouskaya;

import java.util.Scanner;

import static java.lang.Integer.sum;

public class Homework_2 {

    public static void main(String[] args) {

        //input numbers
        Scanner in = new Scanner(System.in);
        System.out.print("Input the first integer: ");
        int a = in.nextInt();

        System.out.print("Input the second integer: ");
        int b = in.nextInt();

        //actions with numbers
        public int result = result(a, b) {
            result = a + b + a * b;
        }

        //output the result
        System.out.println("Your numbers are " + a + " and " + b + ". \nThe result is " + result + ".");

    }

}
