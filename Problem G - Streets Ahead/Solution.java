//Accepted Answer 	Runtime: 1.66s	Java 16/16
import java.util.*;

public class Solution {
    public static void main(String[] args) {
       var scn = new Scanner(System.in);
       var n = scn.nextInt();
       var q = scn.nextInt();
       scn.nextLine();

       var map = new HashMap<String, Integer>();
       for (int i = 0; i < n; i++) {
           String st = scn.nextLine();
           map.put(st, i);
       }
        int[] qs = new int[q];
       for (int i = 0; i < q; i++) {
            String[] path = scn.nextLine().split(" ");
            int passed = Math.abs(map.get(path[0]) - map.get(path[1])) - 1;
           qs[i] = passed;
       }
       for(int passed : qs) {
           System.out.println(passed);
       }
    }
}
