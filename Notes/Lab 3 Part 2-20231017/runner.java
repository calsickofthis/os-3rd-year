import java.util.Scanner;

public class runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Screen sharedObj = new Screen();
		WriterThread T1 = new WriterThread(1, sharedObj,"My");
		WriterThread T2 = new WriterThread(2, sharedObj,"Name");
		WriterThread T3 = new WriterThread(3, sharedObj,"Is");
		WriterThread T4 = new WriterThread(4, sharedObj,"Martin");
		
		
		T1.start();
		T2.start();
		T3.start();
		T4.start();
		
		int flag=0;
		
		
		while(flag!=-1)
		{
			int input = sharedObj.userMessage("Enter 1 to terminate");
			if(input==1)
			{
				T1.finishThread();
				T2.finishThread();
				T3.finishThread();
				T4.finishThread();
				flag = -1;
			}
		}
		
	}

}
