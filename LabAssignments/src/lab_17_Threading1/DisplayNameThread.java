/*
 * 1. create a multithreading program to display the given name with welcome message

display greeting for available users. store 5 names using array of string, pass the string to the methods to diplay greeting message.

create 2 threads to perform the above task.
 */


package lab_17_Threading1;// User defined Package

//Defining a DiplayNameThread class implementing Runnable Interface
public class DisplayNameThread implements Runnable 
{
	private String[] names;
	// create Object
	NameDiplay obj = new NameDiplay();
	public DisplayNameThread(String[] na)
	{
		names=na;
	}
	public void run()
	{
		// Code to be executed in the thread
		System.out.println("THread started");
		for(int i=0;i<names.length;i++)
		{
			obj.display(names[i]);
			
			try
			{
				Thread.sleep(100);
			}
			catch(Exception e)
			{
				System.out.println(e.toString());
			}
		}
	}

}