package cc150;

/**
 * Created by zhangdong8 on 2017/7/6.
 */
public class Stack {
    Node top;

    Object pop() {
        if (top != null) {
            Object item = top.data;
            top = top.next;
            return item;
        }
        return null;
    }

    void push(Object item) {
        Node t = new Node((int) item);

    }
}
