import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class UuidTest {

    /**
     * 生成的 UUID 无 “-” 字符
     *
     * @param n 你需要的位数
     */
    public static String uuidGenerator(int n) {
        return UUID.randomUUID().toString().replace("-", "").substring(0, n);
    }

    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        int number = 0;
        for (var i = 0; i < 1000000; ++i) {
            String test = uuidGenerator(8).toUpperCase();
            boolean boo = set.add(test);
            if (!boo) {
                ++number;
                System.out.println("有重复");
            }
        }
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(number);
    }
}
