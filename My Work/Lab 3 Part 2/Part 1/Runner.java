
public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SharedScreen sharedObj = new SharedScreen();
		FirstMessage T1 = new FirstMessage(sharedObj, "Hello");
		SecondMessage T2 = new SecondMessage(sharedObj, "Goodbye");
		
		T1.start();
		T2.start();
	}

}
