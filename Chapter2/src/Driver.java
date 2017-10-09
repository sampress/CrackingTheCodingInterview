
public class Driver {

	public static void main(String[] args)
	{
		Node head;
		
		removeDuplicates llist = new removeDuplicates();
        llist.insertAtBeggining(20);
        llist.insertAtBeggining(13);
        llist.insertAtBeggining(13);
        llist.insertAtBeggining(11);
        llist.insertAtBeggining(11);
        llist.insertAtBeggining(11);
         
        System.out.println("List before removal of duplicates");
        llist.print();
         
        llist.removeDuplicates();
         
        System.out.println("List after removal of elements");
        llist.print();
        
        kthFromLast llist2 = new kthFromLast();
        llist2.insertAtBeggining(20);
        llist2.insertAtBeggining(13);
        llist2.insertAtBeggining(13);
        llist2.insertAtBeggining(11);
        llist2.insertAtBeggining(11);
        llist2.insertAtBeggining(11);
        System.out.println();
        llist2.printNthFromLast(2);
        
        deleteMiddle llist3 = new deleteMiddle();
        llist3.insertAtBeggining(20);
        llist3.insertAtBeggining(13);
        llist3.insertAtBeggining(13);
        llist3.insertAtBeggining(11);
        llist3.insertAtBeggining(11);
        llist3.insertAtBeggining(11);
        System.out.println();
        llist3.deleteNode(2);
        System.out.println();
        llist3.print();
        
        Partition llist4 = new Partition();
        llist4.insertAtBeggining(1);
        llist4.insertAtBeggining(2);
        llist4.insertAtBeggining(10);
        llist4.insertAtBeggining(5);
        llist4.insertAtBeggining(8);
        llist4.insertAtBeggining(5);
        llist4.insertAtBeggining(3);

        System.out.println();
        llist4.partition(5);
        llist4.print();

        Palindrome llist6 = new Palindrome();
        char str[] = {'a', 'b', 'a', 'c', 'a', 'b', 'a'};
        String string = new String(str);
        for (int i = 0; i < 7; i++) 
        {
            llist6.insertAtBeggining(str[i]);
            llist6.print();
            if (llist6.isPalindrome(llist6.head) != false) 
            {
                System.out.println("Is Palindrome");
                System.out.println("");
            } 
            else
            {
                System.out.println("Not Palindrome");
                System.out.println("");
            }
        }
        
        
        
        
	}
}
