/**
 * @author Kotohiko
 * @since 18:23 9月 19, 2024
 */
public class BooleanTest {
    public static void main(String[] args) {
        boolean a = true ? false : true;
        boolean b = true ? false : true;
        boolean c = a == b;
        boolean d = true ? false : true == true ? false : true;
        System.out.println(d);
    }
}