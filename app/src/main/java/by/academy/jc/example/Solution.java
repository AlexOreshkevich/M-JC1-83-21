package by.academy.jc.example;

import org.checkerframework.checker.units.qual.C;

public class Solution {

    public static void main(String[] args) {
        Circle circle = new Circle(2.0, 4.0);
        CardBoard cardBoard = new CardBoard(12.0);

        boolean result = CircleUtils.isApplicable(
                circle,
                cardBoard
        );

        System.out.println("" + circle + " " + cardBoard + " : result " + result);
    }
}
