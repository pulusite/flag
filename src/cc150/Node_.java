package cc150;

import java.util.List;

/**
 * Created by zhangdong8 on 2017/7/6.
 */
public class Node_ {
    Node_ next = null;
    int data;
    Enum state;
    List<Node_> adjacent;

    public Node_(int d) {
        data = d;
    }

    void appendToTail(int d) {
        Node_ end = new Node_(d);
        Node_ n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = end;
    }

    Node_ deleteNode(Node_ head, int d) {
        Node_ n = head;
        if (n.data == d) {
            return head.next;
        }
        while (n.next != null) {
            if (n.next.data == d) {
                n.next = n.next.next;
                return head;
            }
            n = n.next;
        }
        return head;
    }

    public List<Node_> getAdjacent() {
        return adjacent;
    }

    public void setAdjacent(List<Node_> adjacent) {
        this.adjacent = adjacent;
    }
}
