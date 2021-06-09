// Creating Stack class
public class Stack
{
	// private instance of Node class
	private Node top;
	// Stack constructor
	public Stack()
	{
		top = null;
	}

	// insert node into Stack
	public void push(int data)
	{
		if (top == null)
		{
			top = new Node(data);
		}
		else
		{
			Node newNode = new Node(data);
			newNode.next = top;
			top = newNode;
		}
	}
	// 	remove top node from Stack, if stack it's empty return -1
	public int pop()
	{
		if (top == null)
		{
			return -1;
		}
		else
		{
			int data = top.getData();
			top = top.next;
			return data;
		}
	}

	//Override toString()
	@Override
	public String toString()
	{
		String str = "";
		for(Node curr = top; curr != null; str+=curr.getData()+",",curr=curr.next);
		str = str.substring(0, str.length() - 1);
		return str;
	}
	// return the top of stack
	public Node getTop()
	{
		return top;
	}
 }