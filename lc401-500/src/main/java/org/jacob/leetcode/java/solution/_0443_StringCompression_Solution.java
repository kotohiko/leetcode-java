package org.jacob.leetcode.java.solution;

/**
 * <a href="https://leetcode.cn/problems/string-compression/"><h1>443. String Compression</h1></a>
 *
 * @author Kotohiko
 * @since 16:15 Dec 08, 2023
 */
public class _0443_StringCompression_Solution {
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