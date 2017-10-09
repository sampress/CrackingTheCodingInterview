
public class sumLists {

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
