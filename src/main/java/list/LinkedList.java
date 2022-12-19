package list;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LinkedList<V> {
    public final static Logger LOG = LogManager.getLogger(LinkedList.class);

    private Node head = null;
    private Node tail = null;

    class Node{
        V data;
        Node next;

        public Node(V data){
            this.data = data;
            this.next = null;
        }
    }

    public void add(V data){
        // Makes new node
        Node newNode = new Node(data);
        // checks for empty list
        if(head == null){
            // if empty both head and tail are data
            head = newNode;
            tail = newNode;
        }else{
          tail.next = newNode;
          tail = newNode;
        }
    }
    public void print(){
        Node current = head;

        if(current == null){
            LOG.info("list is empty");
            return;
        }
        while (current != null){
            LOG.info(current.data);
            current = current.next;
        }
        LOG.info("");
    }

    public static void main(String[] args){
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(4);
        ll.add(5);
        ll.add(7);

        ll.print();
        LinkedList<String> l1 = new LinkedList<>();
        l1.add("hello");
        l1.add("world");
        l1.add("foo");
        l1.add("bar");

        l1.print();
    }

}
