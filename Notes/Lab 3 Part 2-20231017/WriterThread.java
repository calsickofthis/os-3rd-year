
public class WriterThread extends Thread {

	private int type;
	private Screen myScreen;
	private String message;
	private boolean terminate=false;
	
	public WriterThread(int t, Screen s, String m)
	{
		type = t;
		myScreen = s;
		message = m;
	}
	
	public void finishThread()
	{
		terminate = true;
	}
	
	public void run()
	{
		while(terminate==false)
		{
			if(type==1)
				myScreen.firstMessage(message);
			else if(type==2)
				myScreen.secondMessage(message);
			else if(type==3)
				myScreen.thirdMessage(message);
			else if(type==4)
				myScreen.fourthMessage(message);
	
		}
	}
}
