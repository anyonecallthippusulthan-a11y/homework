package javaapplication31;

public class cd {
 

    Node1 head;

    
    public void insertHead(int data) {
        Node1 n1 = new Node1(data);

        if (head == null) {
            head = n1;
            head.prev = head;
            head.next = head;
        } 
        else {
            Node1 last = head.prev;
            n1.next = head;
            n1.prev = last;
            last.next = n1;
            head.prev = n1;
            head = n1;
        }
    }

    
    public void insertTail(int data) {
        Node1 n1 = new Node1(data);

        if (head == null) {
            head = n1;
            head.prev = head;
            head.next = head;
        } else {
            Node1 last = head.prev;

            last.next = n1;
            n1.prev = last;

            n1.next = head;
            head.prev = n1;
        }
    }

    
    public void insertAtPosition(int data, int pos) {
        if (pos == 1) {
            insertHead(data);
            return;
        }

        Node1 temp = head;
        int count = 1;

        while (count < pos - 1 && temp.next != head) {
            temp = temp.next;
            count++;
        }

        Node1 n1 = new Node1(data);
        Node1 nextNode = temp.next;

        temp.next = n1;
        n1.prev = temp;

        n1.next = nextNode;
        nextNode.prev = n1;
    }

    
    public void display() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }

        Node1 temp = head;

        do {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(HEAD)");
    }
}
    

