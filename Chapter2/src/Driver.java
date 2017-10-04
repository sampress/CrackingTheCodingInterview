
public class Driver {

	public static void main(String[] args)
	{
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
        
	}
}
