import java.util.HashMap;

public class lc_1171 {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }


    }

    public ListNode removeZeroSumSublists(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode cur = dummy;
        int sum = 0;
        HashMap<Integer, ListNode> map = new HashMap<>();
        while (cur != null) {
            sum += cur.val;
            map.put(sum, cur);
            cur = cur.next;
        }
        sum = 0;
        cur = dummy;
        while (cur != null) {
            sum += cur.val;
            if (map.containsKey(sum)) {
                cur.next = map.get(sum).next;
            }
            cur = cur.next;
        }

        return dummy.next;
    }


    public static void main(String[] args) {
        ListNode list = new ListNode();
        int[] head = new int[]{1, 3, 2, -3, -2, 5, 5, -5, 1};
        list.val = head[0];
        ListNode temp = list;
        for (int i = 1; i < head.length; i++) {
            temp.next = new ListNode();
            temp = temp.next;
            temp.val = head[i];
        }
        ListNode ans = new lc_1171().removeZeroSumSublists(list);
        //display the ans
        while (ans != null) {
            System.out.print(ans.val + "=>");
            ans = ans.next;
        }
    }
}

