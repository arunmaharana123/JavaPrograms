package multithreading;

public class Both_Thread_and_Runnable extends Thread implements Runnable {

	public static void main(String[] args) {
		Both_Thread_and_Runnable runnable = new Both_Thread_and_Runnable();
		Thread thread = new Thread(runnable);
		thread.start();
		runnable.start();
	}

	@Override
	public void run() {
		System.out.println("Call from thread");
	}

}
