package edu.kis.vh.nursery.list;

//TODO: klasa IntLinkedList oraz jej metody nie są nigdzie używane, powinno się je użyć lub usunąć
public class IntLinkedList {

    Node last;
    int i;

    public void push(int i) {
        if (last == null)
            last = new Node(i);
        else {
            last.next = new Node(i);
            last.next.prev = last;
            last = last.next;
        }
    }

    public boolean isEmpty() {
        return last == null;
    }

    //TODO: wartość zwracana przez metodę isFull() powinna być uzależniona od jakichś czynników
    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return -1;
        return last.value;
    }

    public int pop() {
        if (isEmpty())
            return -1;
        int ret = last.value;
        last = last.prev;
        return ret;
    }

}


//TODO: część geterów i seterów nie jest używana, więc powinno się je usunąć
class Node {
    public final int value;

    public Node prev, next;
    public Node(int i) {
        value = i;
    }

    public int getValue() {
        return value;
    }

    public Node getPrev() {
        return prev;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

}