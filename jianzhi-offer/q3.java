//输入一个链表，按链表从尾到头的顺序返回一个ArrayList。

import java.util.ArrayList;
import java.util.Stack;

public class q3 {

     public class ListNode {
         int val;
         ListNode next = null;

         ListNode(int val) {
             this.val = val;
         }
     }

    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        while(listNode != null){
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        while(!stack.isEmpty())list.add(stack.pop());
        return list;
    }
}
