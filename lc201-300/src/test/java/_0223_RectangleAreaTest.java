import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author LeetCode Playground
 */
public class _0223_RectangleAreaTest {
    public static void main(String[] args) throws IOException {
        var in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            var ax1 = Integer.parseInt(line);
            line = in.readLine();
            var ay1 = Integer.parseInt(line);
            line = in.readLine();
            var ax2 = Integer.parseInt(line);
            line = in.readLine();
            var ay2 = Integer.parseInt(line);
            line = in.readLine();
            var bx1 = Integer.parseInt(line);
            line = in.readLine();
            var by1 = Integer.parseInt(line);
            line = in.readLine();
            var bx2 = Integer.parseInt(line);
            line = in.readLine();
            var by2 = Integer.parseInt(line);

            var ret = new RectangleArea_Solution().computeArea(ax1, ay1, ax2, ay2, bx1, by1, bx2, by2);

            var out = String.valueOf(ret);

            System.out.println(out);
        }
    }
}