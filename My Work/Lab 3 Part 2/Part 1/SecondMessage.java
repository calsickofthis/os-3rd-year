
public class SecondMessage extends Thread{

	SharedScreen myScreen;
	String message;
	
	public SecondMessage(SharedScreen s, String m)
	{
		myScreen = s;
		message = m;
	}

	public void run()
	{
		for(int i=0;i<20;i++)
		{
			myScreen.GoodByeMessage(message);
		}
	}
}
