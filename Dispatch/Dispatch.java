class Dispatch
{
	public static void main(String args[])
	{
		A a = new A();
		B b = new B();
		C c = new C();

		A r;	// obtain a reference of type A

		r = a;
		a.callme();

		r = b;
		b.callme();

		r = c;
		c.callme();
	}
}
