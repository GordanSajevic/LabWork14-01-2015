import java.util.Iterator;


public class LinkedList <T> implements Iterable<T>{
	
	private Node head;
	
	public LinkedList()
	{
		this.head = head;
	}
	
	public void add(T value)
	{
		Node newNode = new Node(value);
		if (head == null)
		{
			this.head = newNode;
			return;
		}
		Node previous=null;
		Node current = head;
		while (current != null)
		{ 
			previous = current;
			current = current.next;
		}
		if (previous == null)
		{
			newNode.next = head;
			head = newNode;
		}
		else
		{
			previous.next = newNode;
			newNode.next = current;
		}
	}
	
	public void removeAt(int index)
	{
		if (index < 0 )
		{
			throw new IndexOutOfBoundsException("Index is not valid!");
		}
		else if (index == 0)
		{
			head = head.next;
		}
		else
		{
			Node previous = head;
			Node current = head.next;
			int counter = 1;
			while(counter < index)
			{
				previous = previous.next;
				current = current.next;
				counter++;
			}
			previous.next = current.next;
			current.next = null;
			
		}
	}
	
	public int getSize()
	{
		Node current = head;
		int counter = 1; 
		while(current.next != null)
		{
			current = current.next;
			counter++;
		}
		return counter;
	}
	
	public T getAt(int index)
	{
		Node current = head;
		int counter = 0;
		while(current.next != null)
		{
			if (counter == index)
			{
				break;
			}
			current = current.next;
		}
		return (T) current.value;
	}
	
	public String toString()
	{
		String str = "";
		Node current = head;
		while(current != null)
		{
			str += current.value + " ";
			current = current.next;
		}
		return str;
	}
	
	public boolean equals(T value1, T value2)
	{
		if (value1.equals(value2))
		{
			return true;
		}
		return false;
	}
	
	private class Node<T>
	{
		private T value;
		private Node next;
		
		public Node(T value)
		{
			this.value = value;
			this.next = null;
		}
		
		public Node(T value, Node next)
		{
			this.value = value;
			this.next = next;
		}
	}

	@Override
	public Iterator<T> iterator() {
		
		return null;
	}

}
