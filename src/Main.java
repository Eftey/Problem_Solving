import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        String s = in.next();
        int c = 0;
        for (char i : s.toCharArray()) if (i >= 'a' && i <= 'z') c++;
        pw.println(c >= (s.length() - c) ? s.toLowerCase() : s.toUpperCase());
        pw.close();
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        else if (list2 == null) return list1;

        ListNode listNode = new ListNode(), x = list1, y = list2, head = listNode;
        //ListNode ptr1 = list1, ptr2 = list2, ptr3 = new ListNode(), head = ptr3;
        while(x != null && y != null) {
            if(x.val <= y.val) {
                listNode.next = x;
                x = x.next;
            }
            else {
                listNode.next = y;
                y = y.next;
            }
            listNode = listNode.next;
        }
        if(x == null)
            listNode.next = y;
        if(y == null)
            listNode.next = x;
        return head.next;
    }

    static void debug(Object... obj) {
        System.err.println(Arrays.deepToString(obj));
    }
}