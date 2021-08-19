package by.academy.jc.guliachernysh;

public class FrogJumperSolution {
    public static int solution(int x, int y, int d){
        int diffDistance = y - x;
        int distance = 10;
        if(diffDistance%distance == 0)
            return diffDistance/distance;
        else
            return diffDistance/distance + 1;
    }

    public static void main(String[] args){
        System.out.println("#Jump must made:"+solution(10,110,30));
    }
}