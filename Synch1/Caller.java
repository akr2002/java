class Caller implements Runnable
{
	String msg;
	CallMe target;
	Thread t;

	public Caller(CallMe targ, String s)
	{
		target = targ;
		msg = s;
		t = new Thread(this);
	}

	// synchronized calls to call()
	public void run()
	{
		synchronized(target)	// synchronized block
		{
			target.call(msg);
		}
	}
}
