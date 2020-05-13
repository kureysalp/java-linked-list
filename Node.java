package LinkedList;

public class Node<T> {
	T data;
	Node<T> next;
	
	Node(T value)
	{
		this.data = value;
	}
	
	public void SetNext(Node<T> node)
	{
		this.next = node;
	}
	
	public Node<T> GetNext()
	{
		return next;
	}
	
	public T GetValue()
	{
		return data;
	}
	
	public void SetValue(T value)
	{
		this.data = value; 
	}

}
