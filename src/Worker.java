
public class Worker implements Runnable
{
	
	public boolean finished = false;
	
	public void run()
	{

		while(!finished)
		{
			System.out.println("Hello from thread "+Thread.currentThread().getId());
			
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				finished = true;
			}
		}
		
		System.out.println("Worker "+Thread.currentThread().getId()+" finished.");
	
	}
}
