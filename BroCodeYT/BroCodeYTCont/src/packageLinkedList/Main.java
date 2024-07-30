package packageLinkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        /*
        list.push("A");
        list.push("B");
        list.push("C");
        list.push("D");
        list.pop();
        System.out.println(list);

         */
        // can use a LinkedList to make a stack or a queue
        list.offer("A");
        list.offer("B");
        list.offer("C");
        list.offer("D");
        list.add(2,"P");
        list.remove("P");
        System.out.println(list.peekFirst());
        System.out.println(list);
        //System.out.println(list.indexOf("B"));
        //list.poll();
        //list.pop();
        System.out.println(list);
    }

}
