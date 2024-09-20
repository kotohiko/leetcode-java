import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Kotohiko
 * @since 17:23 Sep 19, 2024
 */
public class HW3_ReplaceSpaces {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            int len = Integer.parseInt(in.readLine());
            String result = replaceSpaces(line, len);
            System.out.println(result);
        }
    }

    public static String replaceSpaces(String iniString, int len) {
        char[] ans = new char[len * 3]; // 最坏情况下每个空格都被替换为 '%20'，长度最多是原长度的3倍

        // 索引用于跟踪结果字符数组的位置
        int idx = ans.length - 1;

        // 从后向前遍历原字符串
        for (int i = len - 1; i >= 0; i--) {
            if (iniString.charAt(i) == ' ') {
                // 如果遇到空格，则替换为 '%20'
                ans[idx--] = '0';
                ans[idx--] = '2';
                ans[idx--] = '%';
            } else {
                // 如果不是空格，则直接复制字符
                ans[idx--] = iniString.charAt(i);
            }
        }
        // 将结果字符数组转换为字符串，并截取有效部分
        return new String(ans, idx + 1, ans.length - idx - 1);
    }
}