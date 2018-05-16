package multithreading;

public class Methods_Of_Thread extends Thread{

	public static void main(String[] args) {
		Methods_Of_Thread thread = new Methods_Of_Thread();
		System.out.println(thread.getId());
		System.out.println(thread.getName());//output: Thread-0
		
		// Check priority of thread
		System.out.println(thread.getPriority());// default output: 5
		//change priority 1-10
		//if you give >10 or <1, it will throw run time error "java.lang.IllegalArgumentException"
		thread.setPriority(1);
		System.out.println(thread.getPriority());// output: 1
		
		//check for daemon thread
		System.out.println(thread.isDaemon());//output: false
		
		//thread is interrupted by someone or not
		System.out.println(thread.isInterrupted());//output: false
		
		//Check thread is live or not
		System.out.println(thread.isAlive());// output: false
		thread.start();
		System.out.println(thread.isAlive());// output: true
	}

	@Override
	public void run() {
		super.run();
	}
}
