class OverloadCons
{
	public static void main(String args[])
	{
		Box mybox1 = new Box(10, 20, 15);
		Box mybox2 = new Box();
		Box mybox3 = new Box(7);

		System.out.println("Volume is " + mybox1.volume());
		System.out.println("Volume is " + mybox2.volume());
		System.out.println("Volume is " + mybox3.volume());
	}
}
