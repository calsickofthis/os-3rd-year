
public class FirstMessage extends Thread{
	
	SharedScreen myScreen;
	String message;
	
	public FirstMessage(SharedScreen s, String m)
	{
		myScreen = s;
		message = m;
	}

	public void run()
	{
		for(int i=0;i<20;i++)
		{
			myScreen.HelloMessage(message);
		}
	}
}
