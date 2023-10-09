import java.util.HashSet;
import java.util.UUID;

public class UuidTest {

    private static final int cnt = 300000;
    private static final int len = 8;

    /**
     * 生成的 UUID 无 “-” 字符
     *
     * @param n 你需要的位数
     */
    public static String uuidGenerator(int n) {
        return UUID.randomUUID().toString().replace("-", "").substring(0, n);
    }

    public static void main(String[] args) {
        var set = new HashSet<String>();
        var numberOfRepeated = 0;
        for (var i = 0; i < cnt; ++i) {
            var test = uuidGenerator(len).toUpperCase();
            var boo = set.add(test);
            if (!boo) {
                ++numberOfRepeated;
                System.out.println("有重复");
            }
        }
        System.out.println(set);
        System.out.println(set.size());
        System.out.println(numberOfRepeated);
    }
}
