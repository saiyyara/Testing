class SampleThread extends Thread
{
	public void run()
	{
		while(true)
		{
			System.out.println(getName());
			try
			{
				yield();
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}

class Thread5
{
	public static void main(String[] args)
	{
		SampleThread t1=new SampleThread();
		SampleThread t2=new SampleThread();
		
		t1.setName("My Thread");
		t2.setName("\t\tYour Thread");
		
		t1.start();
		t2.start();
	}
}