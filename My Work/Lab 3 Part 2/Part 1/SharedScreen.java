
public class SharedScreen {

	boolean turn = false; ///When it is flase it is time for hello
	
	public SharedScreen()
	{
		
	}
	
	public synchronized void HelloMessage(String message)
	{
		while(turn==true)
		{
			try 
			{
				wait();
			} 
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(message);
		turn = true;
		notifyAll();
	}
	
	public synchronized void GoodByeMessage(String message)
	{
		while(turn == false)
		{
			try 
			{
				wait();
			} 
			
			catch (InterruptedException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(message);
		turn = false;
		notifyAll();
	}
}
