/*
 * Write a java program to implement synchronized block in a threadprocess. create 2 threads to achieve thread synchronization.
use join(), notify()
 */

package lab_18_ThreadSynchronization;

public class SharedResource {
	private int count = 0;

	// Synchronized method to increment count 
	public synchronized void increment() { count++;
	}

	// Synchronized method to get the current count
	public synchronized int getCount() {
		return count;
	}
}

class MyThread extends Thread {
	private SharedResource sharedResource;

	public MyThread(SharedResource sharedResource) {
		this.sharedResource = sharedResource;
	}

	@Override
	public void run() {
		// Synchronized block to ensure thread safety
		synchronized (sharedResource) { for (int i = 0; i < 5; i++) { sharedResource.increment();

		System.out.println(Thread.currentThread().getName() + " - Count: " + sharedResource.getCount());
		}
		// Notify other waiting thread that it can proceed 
		sharedResource.notify();
		}
	}
}
