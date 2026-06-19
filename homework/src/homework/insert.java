package homework;

public class insert {
     node head;
     void inserts(int data)
     {
        node news=new node(data); 
         if(head==null)
         {
             head=news;
         }
         
         else{
             node temp=head;
          while(temp.next!=null)
          {
              temp=temp.next;
          }
         temp.next=news;
         
         
         }
         
         
     }
     void display()
     {
         node temp=head;
         while(temp!=null)
         {
             System.out.println(temp.data);
             temp=temp.next;
         }
         System.out.println("null");
     }
     void remove(int data)
     {
         if(head==null)
         {
             System.out.println("no node");
             return;
         }
         if(head.data==data)
         {
             head=head.next;
             return;
         }
         node temp=head;
         while(temp.next!=null&&temp.next.data!=data)
         {
             temp=temp.next;
         }
         if(temp.next==null)
         {
             System.out.println("value no found");
             return;
         }
          temp.next=temp.next.next;
         
     }
}

