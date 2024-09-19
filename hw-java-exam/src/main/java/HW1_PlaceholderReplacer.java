import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Kotohiko
 * @since 16:40 Sep 19, 2024
 */
public class HW1_PlaceholderReplacer {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int n = Integer.parseInt(in.readLine());
            char[] chArgs = in.readLine().toCharArray();
            String ans = replacePlaceholders(line, n, chArgs);
            System.out.println(ans);
        }
    }

    private static String replacePlaceholders(String str, int n, char[] args) {
        String[] argStrings = new String[args.length];
        for (int i = 0; i < args.length; ++i) {
            argStrings[i] = String.valueOf(args[i]);
        }

        StringBuilder sb = new StringBuilder();
        int argIndex = 0;

        for (int i = 0; i < n; i++) {
            if (i < n - 1 && str.charAt(i) == '%' && str.charAt(i + 1) == 's') {
                if (argIndex < argStrings.length) {
                    sb.append(argStrings[argIndex++]);
                    ++i;
                }
            } else {
                sb.append(str.charAt(i));
            }
        }

        for (; argIndex < argStrings.length; ++argIndex) {
            sb.append(argStrings[argIndex]);
        }

        return sb.toString();
    }
}