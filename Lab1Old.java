class Lab1OldHelper extends Thread {
	@Override
	public void run() {
		System.out.println("in run method of Lab1OldHelper");
	}
}

class Lab1OldRunnableHelper implements Runnable {
	@Override
	public void run() {
		System.out.println("in run method of Lab1OldRunnableHelper");
	}
}

public class Lab1Old {

	public static void main(String[] args) {
		/*Lab1OldHelper thread = new Lab1OldHelper();
		thread.start();*/
		
		/*Lab1OldRunnableHelper runnableHelper = new Lab1OldRunnableHelper();
		Thread thread = new Thread(runnableHelper);
		thread.start();*/
		
		Thread thread = new Thread(()->System.out.println("in run method of Functional interface using Lambda"));
		thread.start();
	}

}
