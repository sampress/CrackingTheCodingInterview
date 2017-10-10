
public class loopDetection {

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
	 
 public Node detectLoop()
 {
   Node ptr1 = head, ptr2 = head;
   while(ptr1 != null && ptr2 != null && ptr2.next != null)
   {
	 ptr1 = ptr1.next;
	 ptr2 = ptr2.next.next;
	 if(ptr1 == ptr2) 
	   return ptr2;
   }
   return null;
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
