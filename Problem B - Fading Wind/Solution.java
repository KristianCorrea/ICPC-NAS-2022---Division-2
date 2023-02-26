//Solution accepted. Test cases: 54/54 Runtime: 0.10 s
	
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total = 0;
        int h = input.nextInt();
        int k = input.nextInt();
        int v = input.nextInt();
        int s = input.nextInt();
        while (h > 0) {
            v += s;
            v -= Math.max(1, (int) v / 10);
            if (v >= k) h++;
            if (v > 0 && v < k) {
                h--;
                if (h == 0) v = 0;
            }
            if (v <= 0) {
                h = 0;
                v = 0;
            }
            total += v;
            if (s > 0) s--;
        }
        System.out.println(total);
    }
}
