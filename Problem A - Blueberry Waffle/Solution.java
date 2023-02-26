import java.util.*;

class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int r = input.nextInt();
        int f = input.nextInt();
        double rotsDone = (double) f / r;
        int numRotations = (int) Math.floor(rotsDone);
        double leftOver = rotsDone - numRotations;
        if (leftOver > 0.5) numRotations++;
        System.out.println(numRotations % 2 == 0 ? "up": "down");
    }
}