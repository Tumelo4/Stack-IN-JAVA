public class Main 
{
	public static void main(String[] args) 
	{
		Stack stack = new Stack();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		System.out.println(stack);

		for(Node curr = stack.getTop(); curr.next != null; curr = curr.next)
		{
			System.out.print(stack.pop()+",");
		}
		System.out.println(stack.pop());
		System.out.println("Stack is empty: "+stack.pop());
	}
} 
