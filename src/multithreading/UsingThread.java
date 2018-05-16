package multithreading;

public class UsingThread extends Thread{
	@Override
	public void run() {
		System.out.println("Call from thread");
	}
	public static void main(String[] args) {
		UsingThread thread = new UsingThread();
		thread.start();
	}

}
