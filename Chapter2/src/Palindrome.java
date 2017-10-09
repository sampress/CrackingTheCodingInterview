
public class Palindrome {

	Node head, left;

	 public void insertAtBeggining(int x) 
	 {
	   // Creating a new node and shifting the head pointer to the new node 
	   Node newNode = new Node(x);
	   // Creates a link b/w the new node and previous 1st node
	   newNode.next = head;
	   // Now set the head pointer to the new node
	   head = newNode;
	  }
	 
	 // Initial parameters to this function are &head and head
	    boolean isPalindromeUtil(Node right) 
	    {
	        left = head;
	         
	        /* stop recursion when right becomes NULL */
	        if (right == null)
	            return true;
	 
	        /* If sub-list is not palindrome then no need to
	           check for current left and right, return false */
	        boolean isp = isPalindromeUtil(right.next);
	        if (isp == false)
	            return false;
	 
	        /* Check values at current left and right */
	        boolean isp1 = (right.data == (left).data);
	 
	        /* Move left to next node */
	        left = left.next;
	 
	        return isp1;
	    }
	 
	    // A wrapper over isPalindromeUtil()
	    boolean isPalindrome(Node head) 
	    {
	        boolean result = isPalindromeUtil(head);
	        return result;
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
