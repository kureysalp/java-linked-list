package LinkedList;

public class LinkedList<T> {
	
	private Node<T> head = null;	
	public int length;
	
	public void Insert(T data)
	{
		Node<T> node = new Node<T>(data);
		
		if(head == null)
			head = node; //if there is no head node, set this node as head.
		else
		{
			Node<T> n = head; //Create a node and assign it head.
			
			//Get next until there is no node in order to get last node.
			while(n.GetNext() != null)
			{
				n = n.GetNext(); //n is the last node now.
			}
			n.SetNext(node); //Add "node" to the end of the linked list. 
		}
		length++;
	}
	
	public Node<T> Remove()
	{		
		Node<T> n = head; //Create a node and assign it head.
		
		//Get next until there is no node in order to get last node.
		while(n.GetNext() != null)
		{
			n = n.GetNext(); //n is the last node now.
		}		
		
		Node<T> temp = n; //Get the last node to a temporary variable in order to return it.
		n = null; //Remove the last node.
		return temp; //Return the removed node.	
	}
	
	public void Push(T value)
	{
		if(head == null)
		{
			head = new Node<T>(value); 
		}
		else
		{
			Node<T> oldHead = head;
			head = new Node<T>(value);
			head.SetNext(oldHead);		
		}
		System.out.println("Pushed "+value);
		length++;
	}
	
	public T Pop()
	{
		if(head == null)
		{
			System.out.print("Underflow");
			return null;
		}
		else
		{
			T tempValue = head.GetValue();
			head = head.GetNext();
			length--;
			return tempValue;
		}		
	}
	
	public T Peek()
	{
		Node<T> n = head; //Create a node and assign it head.
		
		//Get next until there is no node in order to get last node.
		while(n.GetNext() != null)
		{
			n = n.GetNext(); //n is the last node now.
		}
		return n.GetValue();
	}
	
	public int size()
	{
		return length;
	}
	
	public boolean isEmpty()
	{
		if(head == null)
			return true;
		return false;
	}
		
}
