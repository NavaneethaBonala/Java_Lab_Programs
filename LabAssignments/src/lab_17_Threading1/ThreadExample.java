/*
 * 2. Create two thread.one thread is finding the average of the first 10 numbers and

another thread is printing the square of the number stored in array arr={1,20,50,15,30}

and make sure both threads can execute one by one.
 */


package lab_17_Threading1;// User defined Package

public class ThreadExample {// Class declaration
    private static final int[] arr = {1, 20, 50, 15, 30};
    private static int sum = 0;
    // Main Method
    public static void main(String[] args) {
        // Create two Runnable instances
        Runnable averageRunnable = () -> {
            synchronized (ThreadExample.class) {
                calculateAverage();
            }
        };

        Runnable squareRunnable = () -> {
            synchronized (ThreadExample.class) {
                printSquares();
            }
        };

        // Create two threads
        Thread thread1 = new Thread(averageRunnable);
        Thread thread2 = new Thread(squareRunnable);

        // Start the threads
        thread1.start();
        thread2.start();

        try {
            // Wait for both threads to finish
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    // Method to Calculate Average
    private static void calculateAverage() {
        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;
        }

        double average = (double) sum / 10;
        System.out.println("Average: " + average);
    }
    // Method to Calculte the Square of a Given number
    private static void printSquares() {
        System.out.print("Squares: ");

        for (int num : arr) {
            System.out.print(num * num + " ");
        }

        System.out.println();
    }
}

