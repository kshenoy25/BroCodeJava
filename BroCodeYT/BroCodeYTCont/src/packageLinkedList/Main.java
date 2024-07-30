package packageLinkedList;

import java.util.LinkedList;

public class Main {
    // LinkedList = store Nodes in 2 parts (data + address)
    //             Nodes are in non-consecutive memory locations
    //             Elements are linked using pointers

    //                              Singly Linked List
    //            Node                       Node                    Node
    //        [data | address] --->      [data | address] --->   [data | address]

    //                              Doubly Linked List
    //             Node                                 Node
    //     [address | data | address ] <----->  [address | data | address]

    // advantages?
    // 1) Dynamic Data Structure (allocates needed memory while running)
    // 2) Insertion and Deletion of Nodes is easy - Notation O(1)
    // 3) No/Low memory waster

    // disadvantages?
    // 1) Greater memory usage (additional pointer)
    // 2) No random access of elements (no index [i])
    // 3) Accessing/searching elements is more time consuming - Notation O(n)

    // uses?
    // implement Stacks/Queues
    // GPS nav
    // music playlist
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
        System.out.println(list.peekLast());
        list.addFirst("E");
        list.addLast("F");

        String first = list.removeFirst();
        String last = list.removeLast();

        //System.out.println(list.indexOf("B"));
        //list.poll();
        //list.pop();
        System.out.println(list);
    }

}
