class Overload
{
	public static void main(String args[])
	{
		OverloadDemo ob = new OverloadDemo();

		ob.test();
		ob.test(10);
		ob.test(10, 20);
		System.out.println("Result of ob.test(123.45): " + ob.test(123.45));
	}
}
