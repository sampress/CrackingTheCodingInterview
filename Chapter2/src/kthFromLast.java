
public class kthFromLast {

 Node head;
		
 public void insertAtBeggining(int x) 
 {
   // Creating a new node and shifting the head pointer to the new node 
   Node newNode = new Node(x);
   // Creates a link b/w the new node and previous 1st node
   newNode.next = head;
   // Now set the head pointer to the new node
   head = newNode;
  }
	
 void printNthFromLast(int n)
 {
     int len = 0;
     Node temp = head;

     // 1) count the number of nodes in Linked List
     while (temp != null)
     {
         temp = temp.next;
         len++;
     }

     // check if value of n is not more than length of
     // the linked list
     if (len < n)
         return;

     temp = head;

     // 2) get the (n-len+1)th node from the begining
     for (int i = 1; i < len-n+1; i++)
         temp = temp.next;

     System.out.println(temp.data);
 }
 
 public void print()
 {
   Node temp = head;
   while(temp != null)
   {
     // Keep printing till we reach null
	 System.out.print(temp.data+" ");
     temp = temp.next;
	}
   }
}
