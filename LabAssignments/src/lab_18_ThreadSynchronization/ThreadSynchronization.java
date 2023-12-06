
package lab_18_ThreadSynchronization;

public class ThreadSynchronization {
	public static void main(String[] args) { 
		
	SharedResource sharedResource = new SharedResource();

	// Create two threads that share the same resource 
	Thread thread1 = new MyThread(sharedResource); 
	Thread thread2 = new MyThread(sharedResource);

	// Start both threads 
	thread1.start(); 
	thread2.start();

	try {
		// Wait for both threads to finish 
		thread1.join();
		thread2.join();
	} catch (InterruptedException e) { e.printStackTrace();
	}

	// Print the final count after both threads complete 
	System.out.println("Final Count: " + sharedResource.getCount());
	}

}
