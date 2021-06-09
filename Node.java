// CREATING NODE CLASS 

public class Node
{
	// private member variable
	private int data;
	// public instance of Node;
	public Node next;
	// Node constructor
	public Node(int data)
	{
		this.data = data;
		this.next = null;
	}

	// public method getData which return private member variable data
	public int getData()
	{
		return data;
	}
}