
public class removeDuplicates {

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
	
  void removeDuplicates()
  {
    Node newPtr1 = head;
	Node  newPtr2 = null, temp = null;
      
    while(newPtr1 != null && newPtr1.next != null) 
    {
      newPtr2 = newPtr1;
         
      // Move newPtr2 ahead of newPtr1 to check if they are duplicates
      while (newPtr2.next != null)
      { 
    	// Check for duplicates
        if(newPtr1.data == newPtr2.next.data)
        {
          // Delete the duplicate node
          temp = newPtr2.next;
          newPtr2.next = newPtr2.next.next;
         }
        else 
         // Increment newPtr2 	
          newPtr2 = newPtr2.next;
                
       }
      // Increment newPtr2 	
       newPtr1 = newPtr1.next;
      }
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
