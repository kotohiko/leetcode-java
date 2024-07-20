import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author LeetCode Playground
 */
public class _0206_ReverseLinkedListTest {
    public static int[] stringToIntegerArray(String input) {
        input = input.trim();
        input = input.substring(1, input.length() - 1);
        if (input.isEmpty()) {
            return new int[0];
        }

        var parts = input.split(",");
        var output = new int[parts.length];
        for(var index = 0; index < parts.length; index++) {
            var part = parts[index].trim();
            output[index] = Integer.parseInt(part);
        }
        return output;
    }

    public static ListNode stringToListNode(String input) {
        // Generate array from the input
        var nodeValues = stringToIntegerArray(input);

        // Now convert that list into linked list
        var dummyRoot = new ListNode(0);
        var ptr = dummyRoot;
        for(var item : nodeValues) {
            ptr.next = new ListNode(item);
            ptr = ptr.next;
        }
        return dummyRoot.next;
    }

    public static String listNodeToString(ListNode node) {
        if (node == null) {
            return "[]";
        }

        var result = new StringBuilder();
        while (node != null) {
            result.append(node.val).append(", ");
            node = node.next;
        }
        return "[" + result.substring(0, result.length() - 2) + "]";
    }

    public static void main(String[] args) throws IOException {
        var in = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = in.readLine()) != null) {
            var head = stringToListNode(line);

            var ret = new ReverseLinkedList_Solution().reverseList(head);

            var out = listNodeToString(ret);

            System.out.println(out);
        }
    }
}