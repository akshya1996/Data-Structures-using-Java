/**
 * 
 */

/**
 * @author akshya1996
 *
 */
public class LinkedList {

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
	static void printlist()
	{
		if(head==null)
		{
			System.out.println("Linkedlist is empty");
			return;
		}
		Node n=head;
		while(n!=null)
		{
			System.out.println(n.data);
			n=n.next;
		}
	}
	static void pushintohead(int d)
	{
		Node newnode= new Node(d);
		newnode.next=head;
		head=newnode;
	}
	static void pushafternode(Node n,int d)
	{
		//checking if node n is present
		if(n==null)
		{
			System.out.println("Previous node cannot be null");
			return;
		}
		Node newnode= new Node(d);
		newnode.next=n.next;
		n.next=newnode;
	}
	static void insertintoend(int d)
	{
		Node n=head;
		Node newnode= new Node(d);
		while(n.next!=null)
		{
			n=n.next;
			
		}

		n.next=newnode;
	}
	static void deletegivenkey(int key)
	{
		Node temp = head, prev = null; 
        if (temp != null && temp.data == key) 
        { 
            head = temp.next;
            return; 
        } 
        while (temp != null && temp.data != key) 
        { 
            prev = temp; 
            temp = temp.next; 
        }     
        if (temp == null) return; 
        prev.next = temp.next; 

	}
	static void deletegivenposition(int index)
	{
		Node temp=head;
		Node prev=null;
		int count=-1;
		if(index==0 && temp != null)
		{
		temp=temp.next;
		head=temp;
		return;
		}
		while(temp!=null)
		{
			count=count+1;
			if(count==index)
			{
				
				prev.next=temp.next;
				return;
			}
			prev=temp;
			temp=temp.next;
		}
		return;
		
	}
	static void findlength()
	{
		Node temp=head;
		int count=0;
		while(temp!=null)
		{
			count++;
			temp=temp.next;
		}
		System.out.println("Length: "+count);
		return;
	}
	public static void deletelist()
	{
		head=null;
		return;
	}
	public static void findoccurance(int d)
	{
		Node temp=head;
		int count=0;
		while(temp!=null)
		{
			if(temp.data==d)
			{
				count++;
			}
			temp=temp.next;
		}
		System.out.println("Number of occurance: "+count);
		return;
	}
	public static void reverselist()
	{
		Node prev = null; 
        Node current = head; 
        Node next = null; 
        while (current != null) { 
            next = current.next; 
            current.next = prev; 
            prev = current; 
            current = next; 
        } 
        head = prev; 
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList llist=new LinkedList();
		llist.head=new Node(2);
		Node second=new Node(2);
		Node third=new Node(2);
		llist.head.next=second;
		second.next=third;
		System.out.println("Elements of a linkedlist");
		llist.printlist();
		System.out.println("Inserting a node to the front of a linked list");
		llist.pushintohead(4);
		llist.printlist();
		System.out.println("Inserting a node after a given node");
		llist.pushafternode(third, 5);
		llist.printlist();
		System.out.println("Inserting an element to the end of the linkedlist");
		llist.insertintoend(2);
		llist.printlist();
		System.out.println("Deleting the node containing the first occurance of a key");
		llist.deletegivenkey(2);
		llist.printlist();
		System.out.println("Deleting a node given the index position");
		llist.deletegivenposition(2);
		llist.printlist();
		System.out.println("Length of the linked list");
		llist.findlength();
		//System.out.println("Deleting a linked list");
		//llist.deletelist();
		//llist.printlist();
		System.out.println("Finding the number of times a given number appears in the linkedlist");
		llist.printlist();
		llist.findoccurance(2);
		System.out.println("Reversing a linkedlist");
		llist.reverselist();
		llist.printlist();
		
		
	}

}
