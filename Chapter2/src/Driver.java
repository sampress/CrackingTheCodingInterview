
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
	}
}
