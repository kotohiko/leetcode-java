package example;

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
        StringBuilder result = new StringBuilder();

        int idx = 0;

        // 遍历原字符串
        for (int i = 0; i < n; ++i) {
            if (i + 1 < n && str.charAt(i) == '%' && str.charAt(i + 1) == 's') {
                // 找到占位符 %s
                if (idx < args.length) {
                    // 替换占位符
                    result.append(args[idx++]);
                }
                ++i; // 跳过 's'
            } else {
                result.append(str.charAt(i));
            }
        }

        // 如果还有剩余的参数字符，添加到字符串的结尾
        while (idx < args.length) {
            result.append(args[idx++]);
        }

        return result.toString();
    }
}