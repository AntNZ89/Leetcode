package january.medium;

import org.w3c.dom.Node;

import java.util.HashMap;
import java.util.Map;

public class CopyRandomList {
//    public Node copyRandomList(Node head) {
//
//        if (head == null) return head;
//
//        Node curr = new Node(head.val);
//        Node ans = curr;
//        Node copyCurr = curr;
//        Node copyHead = head;
//        Map<Node, Node> trans = new HashMap<>();
//        trans.put(head, curr);
//
//        while (head != null && head.next != null){
//            Node next = new Node(head.next.val);
//            trans.put(head.next, next);
//            curr.next = next;
//            curr = next;
//            head = head.next;
//        }
//
//        while (copyHead != null){
//            copyCurr.random = trans.get(copyHead.random);
//            copyHead = copyHead.next;
//            copyCurr = copyCurr.next;
//        }
//
//
//        return ans;
//
//    }
}
