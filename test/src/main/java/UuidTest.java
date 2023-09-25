import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

public class UuidTest {

    /**
     * 生成的 UUID 无 “-” 字符
     */
    public static String uuidGenerator() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    /**
     * 生成的 UUID 无 “-” 字符
     *
     * @param n 你需要的位数
     */
    public static String uuidGenerator(int n) throws NoSuchAlgorithmException {
        Random rand = SecureRandom.getInstanceStrong();
        int start = rand.nextInt(24);
        int end = start + n;
        return UUID.randomUUID().toString().replace("-", "").substring(start, end);
    }

    public static void main(String[] args) throws NoSuchAlgorithmException {
        Set<String> set = new HashSet<>();
        int number = 0;
        for (var i = 0; i < 80000; ++i) {
            String test = uuidGenerator(8);
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
