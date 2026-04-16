import java.util.Scanner;

class node {
    String data;
    node next;

    node(String data) {
        this.data = data;
        this.next = null;
    }
}

class qui {
    node front = null;
    node rear = null;

    void add(String data) {
        node n = new node(data);

        if (rear == null) {
            front = rear = n;
        } else {
            rear.next = n;
            rear = n;
        }
        System.out.println("Added: " + data);
    }

    void remove() {
        if (front == null) {
            System.out.println("Queue is empty");
        } else {
            System.out.println(front.data + " removed");
            front = front.next;

            if (front == null) {
                rear = null;
            }
        }
    }
	 void disp() {
        if (front == null) {
            System.out.println("Queue is empty");
        } else {
            
                       System.out.println(front.data + " next order");
			

            if (front == null) {
                rear = null;
            }
        }
    }

    void display() {
        node temp = front;

        while (temp != null) {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

class hi {
    public static void main(String[] args) {
        hi n1 = new hi();
        n1.menu();
    }

    void menu() {
        Scanner we = new Scanner(System.in);
        Scanner ab = new Scanner(System.in);

        qui ji = new qui();
        boolean result = true;

        do {
            System.out.println("\n1.add order");
            System.out.println("2. serve order");
            System.out.println("3.display all order");
            System.out.println("4.balance all order");
			
			
            System.out.println("5.exit");
            System.out.print("choose one: ");

            int a = we.nextInt();

            if (a == 1) {
                System.out.print("add the order: ");
                String abc = ab.nextLine();
                ji.add(abc);
            } else if (a == 2) {
                ji.remove();
            } else if (a == 3) {
                ji.display();
				
            } 
			else if(a==4)
			{
				ji.disp();
			}
			else {
                result = false;
            }

        } while (result);
    }
}