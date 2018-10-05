
public class CircularLinkedList {

	
		static Node head;
		static class Node{
			int data;
			Node next;
			Node(int d)
			{
				data=d;
				next=null;
			}
		}
	
public static void printlist()
{
	Node temp=head;
	while(temp.next!=head)
	{
		System.out.println(temp.data);
		temp=temp.next;
	}
	System.out.println(temp.data);
}

public static void findlength()
{
	Node temp=head;
	int count=1;
	if(head==null)
	{
		System.out.println("Length: 0");
		return;
	}
	while(temp.next!=head)
	{
		count++;
		temp=temp.next;
	}
	System.out.println("Length: "+count);
}
//Inserting the node before the head node in a circular linked list or at the end of a circular linked list
public static void insertinfront(int d)
{
	Node temp=head;
	if(head==null)
	{
		Node newnode = new Node(d);
		newnode.next=newnode;
		head=newnode;
		return;
	}
	Node newnode=new Node(d);
	newnode.next=head;
	while(temp.next!=head)
	{
		temp=temp.next;
	}
	temp.next=newnode;
	return;
}
//Inserting a node before any given data in a circular linked list
public static void insertbeforedata(int d, int data)
{
	Node temp=head;
	int count=-1;
	Node prev=null;
	while(temp.next!=head)
	{
		count++;
		if(temp.data==data)
		{
			Node newnode = new Node(d);
			newnode.next=temp;
			prev.next=newnode;
			return;
		}
		prev=temp;
		temp=temp.next;
	}
	return;
}
//Deleting a circular linked list
public static void deletelist()
{
	head=null;
	return;
}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircularLinkedList clist=new CircularLinkedList();
		clist.head=new Node(1);
		Node second=new Node(2);
		Node third=new Node(3);
		clist.head.next=second;
		second.next=third;
		third.next=clist.head;
		clist.printlist();
		clist.findlength();
		clist.insertinfront(4);
		clist.printlist();
		clist.findlength();
		clist.insertbeforedata(5, 3);
		clist.printlist();
		clist.findlength();
		clist.deletelist();
		clist.findlength();
	}

}
