class TestStack2
{
	public static void main(String args[])
	{
		Stack mystack1 = new Stack(5);
		Stack mystack2 = new Stack(8);

		// push some numbers onto the stack
		for (int i = 0; i < 5; mystack1.push(i++));
		for (int i = 0; i < 8; mystack2.push(i++));

		// pop those numbers off the stack
		System.out.println("Stack in mystack1:");
		for (int i = 0; i < 5; ++i)
			System.out.println(mystack1.pop());

		System.out.println("Stack in mysrack2:");
		for (int i = 0; i < 8; ++i)
			System.out.println(mystack2.pop());
	}
}
