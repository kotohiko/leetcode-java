import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author LeetCode Playground
 */
public class _0223_RectangleAreaTest {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int ax1 = Integer.parseInt(line);
            line = in.readLine();
            int ay1 = Integer.parseInt(line);
            line = in.readLine();
            int ax2 = Integer.parseInt(line);
            line = in.readLine();
            int ay2 = Integer.parseInt(line);
            line = in.readLine();
            int bx1 = Integer.parseInt(line);
            line = in.readLine();
            int by1 = Integer.parseInt(line);
            line = in.readLine();
            int bx2 = Integer.parseInt(line);
            line = in.readLine();
            int by2 = Integer.parseInt(line);

            int ret = new RectangleArea_Solution().computeArea(ax1, ay1, ax2, ay2, bx1, by1, bx2, by2);

            String out = String.valueOf(ret);

            System.out.println(out);
        }
    }
}