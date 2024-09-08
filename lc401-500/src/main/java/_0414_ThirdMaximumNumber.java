import java.util.*;
import java.util.stream.IntStream;

/**
 * <a href="https://leetcode.cn/problems/third-maximum-number"><h1>414. Third Maximum Number</h1></a>
 *
 * @author Kotohiko
 * @since 08:43 Jun 30, 2024
 */
class ThirdMaximumNumber_Solution {
    public int thirdMax(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (var num : nums) {
            set.add(num);
        }
        List<Integer> list = new ArrayList<>(set);
        Collections.sort(list);
        return list.size() < 3 ? list.getLast() : list.get(list.size() - 3);
    }
}

@SuppressWarnings("unused")
class ThirdMaximumNumber_Solution2 {
    public int thirdMax(int[] nums) {
        int[] arr = IntStream.of(nums).distinct().sorted().toArray();
        return arr[arr.length >= 3 ? arr.length - 3 : arr.length - 1];
    }
}