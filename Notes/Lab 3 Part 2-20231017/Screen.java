import java.util.Scanner;

public class Screen {

	private int flag=1;
	private int count=0;
	//1 -> First Message
	//2 -> Second Message
	//3 -> Third Message
	//4 -> Fourth Message
	public Screen()
	{
		
	}
	
	public synchronized void firstMessage(String msg)
	{
		while(flag!=1)
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
		
		System.out.println(msg);
		count++;
		flag = 2;
		notifyAll();
	}
	
	public synchronized void secondMessage(String msg)
	{
		while(flag!=2)
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
		
		System.out.println(msg);
		flag = 3;
		count++;
		notifyAll();
	}
	
	public synchronized void thirdMessage(String msg)
	{
		while(flag!=3)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		System.out.println(msg);
		flag = 4;
		count++;
		notifyAll();
	}
	
	public synchronized void fourthMessage(String msg)
	{
		while(flag!=4)
		{
			try {
				wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(msg);
		count++;
		
		if(count<1000)
		flag=1;
		else
		flag=5;
		
		notifyAll();
	}
	
	
	public synchronized int userMessage(String msg)
	{
		Scanner in = new Scanner(System.in);
		
		while(flag!=5)
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
		
		System.out.println(msg);
		int input = in.nextInt();
		count=0;
		flag = 1;
		notifyAll();
		return input;
	}
}
