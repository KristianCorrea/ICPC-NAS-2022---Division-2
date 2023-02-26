// SUBMISSION FAILED: Time Limit Exceeded. Test Cases: 13/20
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int l = input.nextInt();
        int h = input.nextInt();

        int[] profitDays = new int[n];
        for (int i = 0; i < n; i++) {
            profitDays[i] = input.nextInt();
        }

        int min = Integer.MAX_VALUE;
        int max = 0;
        for (int window = l; window <= h; window++) {
            for (int start = 0; start < window; start++) {
                int currentWindow = 0;
                int profitSegments = 0;
                int currentProfit = 0;
                for (int i = start; i < n; i++) {
                    currentProfit += profitDays[i];
                    currentWindow++;
                    if (currentWindow == window || i == n - 1) {
                        if (currentProfit > 0) {
                            profitSegments++;
                        }
                        currentProfit = 0;
                        currentWindow = 0;
                    }
                }
                currentProfit = 0;
                for (int i = 0; i < start; i++) {
                    currentProfit += profitDays[i];
                }
                if (currentProfit > 0) {
                    profitSegments++;
                }
                min = Math.min(min, profitSegments);
                max = Math.max(max, profitSegments);
            }
        }
        System.out.println(min + " " + max);
    }
}
