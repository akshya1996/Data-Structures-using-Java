
public class DoublyLinkedList {
		static Node head;
		static class Node{
			int data;
			Node next;
			Node prev;
			Node(int d)
			{
				data=d;
				next=null;
				prev=null;
			}
		}
public static void printlist()
{
 Node temp=head;
 while(temp.next!=null)
 {
	 System.out.println(temp.data);
	 temp=temp.next;
	 
 }
 System.out.println(temp.data);
	
}

//*************************Insertion operations here****************************
//Method 1: Adding a node to the start of the doubly linked list
public static void addinfront(int d)
{
	Node temp=head;
	Node curr=new Node(d);
	curr.prev=null;
	curr.next=temp;
	head.prev=curr;
	head=curr;
}
//Method 2: Adding a node to the end of the doubly linked list
public static void addinend(int d)
{
	Node temp=head;
	Node curr=new Node(d);
	while(temp.next!=null)
	{
		temp=temp.next;
	}
	temp.next=curr;
	curr.next=null;
	curr.prev=temp;
}
//Method 3: Adding a node before any given node index
public static void addbeforenode(int index, int d)
{
	Node temp=head;
	Node curr=new Node(d);
	Node previous=null;
	int count=-1;
	while(temp.next!=null)
	{
		count++;

		if(count==index)
		{
			temp.prev=curr;
			curr.next=temp;
			curr.prev=previous;
			previous.next=curr;
			return;
		}
		previous=temp;
		temp=temp.next;
	}
}
//******************Finding the length of the doubly linked list*************************
public static void findlength()
{
	Node temp=head;
	if(temp==null)
	{
		System.out.println("Doubly linked list empty");
		return;
	}
	int count=1;
	while(temp.next!=null)
	{
		count++;
		temp=temp.next;
	}
	System.out.println("Length:"+count);
	return;
}
//*******************Deleting a doubly linked list ***************************************
public static void deletedlist()
{
	Node temp=head;
	head=null;
	return;
}
//*******************Reversing a doubly linked list *************************************
public static void reversedlist()
{
    Node temp=null;
    Node curr=head;
    while(curr!=null)
    {
    	temp=curr.prev;
    	curr.prev=curr.next;
    	curr.next=temp;
    	curr=curr.prev;
    }
    if(temp!=null)
    {
    	head=temp.prev;
    }
}
//*******************Deleting a node from a given index***********************************
public static void deletefromindex(int index)
{
	Node temp=head;
	Node previous=null;
	int count=-1;
	while(temp.next!=null)
	{
		count++;

		if(count==index)
		{
			Node nextnode=temp.next;
			previous=temp.prev;
			previous.next=nextnode;
			nextnode.prev=previous;
			temp=null;
			return;
		}
		temp=temp.next;
		}
	
}





	public static void main(String[] args) {
		DoublyLinkedList dlist=new DoublyLinkedList();
		dlist.head=new Node(1);
		Node second=new Node(2);
		Node third= new Node(3);
		dlist.head.next=second;
		second.next=third;
		second.prev=dlist.head;
		third.prev=second;
		dlist.printlist();
		System.out.println("Adding node to the front of the linked list ");
		dlist.addinfront(4);
		dlist.printlist();
		System.out.println("Adding a node to the end of a linked list");
		dlist.addinend(5);
		dlist.printlist();
		System.out.println("Adding a node before a given index");
		dlist.addbeforenode(2, 2);
		dlist.printlist();
		System.out.println("Finding the length of the doubly linked list");
		dlist.findlength();
		//The following code is commented to perform reversing the list operation;
		//System.out.println("Deleting a doubly linked list");
		//dlist.deletedlist();
		dlist.printlist();
		//dlist.findlength();
		System.out.println("Reversing a doubly linked list");
		dlist.reversedlist();
		dlist.printlist();
		//dlist.findlength();
		System.out.println("Deleting a node from the given index");
		dlist.deletefromindex(2);
		dlist.printlist();
		
		
		
	}

}
