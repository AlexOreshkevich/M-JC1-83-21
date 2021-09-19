package by.academy.jc.ht.shorokhov.ht8;

import java.util.Stack;

public class Solution {
    public int solution(int[] A, int[] B) {
        int numberOfFishes = A.length;
        if (numberOfFishes == 0){
            return 0;}
        Stack<Integer> fish = new Stack<>();
        for(int i = 0; i<A.length; i++){
            if(B[i] == 1) {
                fish.push(A[i]);
            }
            else{
                while(!fish.isEmpty()){
                    if(fish.peek() > A[i]){
                        numberOfFishes--;
                        break;
                    } else if(fish.peek() < A[i]){
                        numberOfFishes--;
                        fish.pop();
                    }
                }
            }
        }
        return numberOfFishes;
    }

}
