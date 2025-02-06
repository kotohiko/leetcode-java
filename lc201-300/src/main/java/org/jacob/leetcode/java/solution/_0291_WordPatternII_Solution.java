package org.jacob.leetcode.java.solution;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.cn/problems/word-pattern-ii/description/">
 *     <h1>291. Word Pattern II</h1></a>
 * [Medium]
 * <p>
 * Given a {@code pattern} and a string {@code s}, return {@code true} <i>if {@code s} <b>matches</b> the pattern</i>.
 * <p>
 * A string {@code s} <b>matches</b> a {@code pattern} if there is some <b>bijective mapping</b> of single characters
 * to <b>non-empty</b> strings such that if each character in {@code pattern} is replaced by the string it maps to,
 * then the resulting string is {@code s}. A <b>bijective mapping</b> means that no two characters map to the same string, and no character maps to
 * two different strings.<p>
 * <b>Example 1:</b>
 * <blockquote>
 * <b>Input:</b> {@code pattern = "abab", s = "redblueredblue"}
 * <p>
 * <b>Output:</b> {@code true}
 * <p>
 * <b>Explanation: </b>One possible mapping is as follows:<p>
 *     {@code 'a' -> "red"}<p>
 *     {@code 'b' -> "blue"}
 * </blockquote>
 * <b>Example 2:</b>
 * <blockquote>
 * <b>Input:</b> {@code pattern = "aaaa", s = "asdasdasdasd"}
 * <p>
 * <b>Output:</b> {@code true}
 * <p>
 * <b>Explanation: </b>One possible mapping is as follows:<p>
 * {@code 'a' -> "asd"}
 * </blockquote>
 * <b>Example 3:</b>
 * <blockquote>
 * <b>Input:</b> {@code pattern = "aabb", s = "xyzabcxzyabc"}
 * <p>
 * <b>Output:</b> {@code false}
 * </blockquote>
 * <b>Constraints:</b>
 * <p>
 * <ul>
 *     <li>{@code 1 <= pattern.length, s.length <= 20}</li>
 *     <li>{@code pattern} and {@code s} consist of only lowercase English letters.</li>
 * </ul>
 * @author Kotohiko
 * @since 16:34:49 Jan 22, 2025
 */
public class _0291_WordPatternII_Solution {

    Map<Character, String> letterToStr = new HashMap<>();

    Map<String, Character> strToLetter = new HashMap<>();

    private String pattern;

    private String s;

    private int patternLength;

    private int sLength;

    public boolean wordPatternMatch(String pattern, String s) {
        if (pattern.length() > s.length()) {
            return false;
        }

        this.pattern = pattern;
        this.s = s;
        this.patternLength = pattern.length();
        this.sLength = s.length();
        return backtrack(0, 0);
    }

    private boolean backtrack(int patternIndex, int sIndex) {
        if (patternIndex == patternLength) {
            return sIndex == sLength;
        }

        var c = pattern.charAt(patternIndex);
        if (letterToStr.containsKey(c)) {
            var target = letterToStr.get(c);
            return isEqual(sIndex, target) && backtrack(patternIndex + 1, sIndex + target.length());
        } else {
            for (int i = sIndex + 1; i <= sLength; ++i) {
                var target = s.substring(sIndex, i);

                if (!strToLetter.containsKey(target)) {
                    letterToStr.put(c, target);
                    strToLetter.put(target, c);

                    if (backtrack(patternIndex + 1, i)) {
                        return true;
                    }

                    letterToStr.remove(c);
                    strToLetter.remove(target);
                }
            }
            return false;
        }
    }

    private boolean isEqual(int start, String target) {
        var targetLength = target.length();
        if (start + targetLength > sLength) {
            return false;
        }
        for (int i = 0; i < targetLength; ++i) {
            if (s.charAt(start + i) != target.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}