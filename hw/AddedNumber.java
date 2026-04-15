package hw;

public class AddedNumber {
              Node head;
              void insert(int data)
              {
                  Node n1=new Node(data);
                  if(head==null)
                  {
                      head=n1;
                  }
                  else 
                  {
                     Node temp=head;
                     while(temp.next != null)
                     {
                        temp=temp.next;
                     }
                     temp.next=n1;
                     n1.perv=temp;
                  
                  }
                  
              }
              void display()
              {
                Node temp=head;
                while(temp!=null)
                {
                  System.out.print(temp.data+ "-->");
                  temp=temp.next;
                }
              }
              void display1()
              {  
                  Node temp=head;
                  while(temp.next!=null)
                  {
                    temp=temp.next;
                    
                  }
                  while(temp!=null)
                  {
                      System.out.println(temp.data);
                      temp=temp.perv;
                  }
              
              }
}
