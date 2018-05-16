package multithreading;

public class UsingRunnable implements Runnable{

	public static void main(String[] args) {
		UsingRunnable runnable = new UsingRunnable();
		Thread thread = new Thread(runnable);
		thread.start();
	}

	@Override
	public void run() {
		System.out.println("Call from thread");
	}

}
