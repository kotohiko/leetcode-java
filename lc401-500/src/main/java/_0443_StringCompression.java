/**
 * <h1>443. String Compression</h1>
 * <a href="https://leetcode.cn/problems/string-compression/">LeetCode link</a>
 *
 * @author Jacob Suen
 * @since 16:15 Dec 08, 2023
 */
class StringCompression_Solution {
    public int compress(char[] cs) {
        var n = cs.length;
        var i = 0;
        var j = 0;
        while (i < n) {
            var idx = i;
            while (idx < n && cs[idx] == cs[i]) {
                ++idx;
            }
            var cnt = idx - i;
            cs[j++] = cs[i];
            if (cnt > 1) {
                var start = j;
                var end = start;
                while (cnt != 0) {
                    cs[end++] = (char) ((cnt % 10) + '0');
                    cnt /= 10;
                }
                reverse(cs, start, end - 1);
                j = end;
            }
            i = idx;
        }
        return j;
    }

    void reverse(char[] cs, int start, int end) {
        while (start < end) {
            var t = cs[start];
            cs[start] = cs[end];
            cs[end] = t;
            ++start;
            --end;
        }
    }
}