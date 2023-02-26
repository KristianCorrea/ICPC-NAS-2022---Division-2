// Accepted Answer    Runtime: 0.10s Test Case: 41/41
import java.util.Scanner;

public class SolutionH {
    public static void main(String[] args) {
        var scn = new Scanner(System.in);

        var ds = scn.nextInt();
        var ys = scn.nextInt();
        var dm = scn.nextInt();
        var ym = scn.nextInt();

        var count = 0;
        do {
            ds++;
            dm++;
            count++;
        } while (ds % ys != 0 || dm % ym != 0);

        System.out.println(count);
    }
}
