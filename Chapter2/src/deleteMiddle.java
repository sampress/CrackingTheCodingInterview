
public class deleteMiddle {

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
	 
	 void deleteNode(int pos)
	 {    
	    Node node = head;
		       
		 // To find the node at pos-1 
		 for(int i=0; node!=null && i<pos-1; i++)
		   node = node.next;

		 if(node == null || node.next == null)
		  return;
		 
		 // To link the previous node to to node after the deleted node
		 Node next = node.next.next;
		 // Delete the node at given position
		 node.next = next;  
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
