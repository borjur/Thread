import java.util.ArrayList;


public class MainClass
{

	
	public static void main(String[] args) throws InterruptedException
	{
		ArrayList<Worker> workerList = new ArrayList<Worker>();
		for(int i=0;i<10;i++)
		{
			Worker w = new Worker();
			workerList.add(w);
			Thread t = new Thread(w);
			t.start();
			Thread.sleep(2000);
		}

		
		Thread.sleep(10000);
		
		for(Worker w : workerList)
		{
			w.finished = true;
		}


	}

}
