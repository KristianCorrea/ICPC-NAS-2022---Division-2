//Time Limit Exceeded. Test Case 20/35
import java.util.*;
public class Solution {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int result = 0;
        int n = input.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = input.nextInt();
        }
        Set<Integer> available = new HashSet<>(List.of(0,1,2));
        for (int tool : new int[]{0, 1, 2}) {
            available.remove(tool);
            result = Math.max(result, recurse(tool, available, nums, 0, 0));
            available.add(tool);
        }
        System.out.println(result);
    }

    static int recurse(int tool, Set<Integer> available, int[] nums, int current, int i) {
        int result = current;
        int drop = current;
        if (i >= nums.length) return current;
        for (int j = i; j < nums.length; j++) {
            int task = nums[j];
            if (task == tool) {
                result++;
                continue;
            }
            if (available.size() == 0 || !available.contains(task)) continue;
            available.remove(task);
            drop = Math.max(drop, recurse(task, available, nums, result + 1, j + 1));
            available.add(task);
        }
        return Math.max(result, drop);
    }
}
