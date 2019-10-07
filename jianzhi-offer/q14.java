//输入一个链表，输出该链表中倒数第k个结点。

import java.util.Stack;

public class q14 {

    public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }

        public ListNode FindKthToTail(ListNode head, int k) {
            if (head == null || k == 0) return null;
            Stack<ListNode> stack = new Stack<>();
            while (head != null) {
                stack.push(head);
                head = head.next;
            }
            while (k > 1) {
                if (stack.isEmpty()) return null;
                stack.pop();
                k--;
            }
            if (stack.isEmpty()) return null;
            return stack.pop();
        }

        //o(n) q go first k steps and then p go
        public ListNode FindKthToTail2(ListNode head,int k) { //5,{1,2,3,4,5}
            ListNode p, q;
            p = q = head;
            int i = 0;
            for (; p != null; i++) {
                if (i >= k)
                    q = q.next;
                p = p.next;
            }
            return i < k ? null : q;
        }

    }
}
