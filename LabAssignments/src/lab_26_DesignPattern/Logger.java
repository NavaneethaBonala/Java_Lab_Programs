/*
 * 2. Create a simple Singleton Pattern for a logging class. 
 * Implement a Logger class that logs messages. 
 * Ensure that only one instance of the Logger class can be created, 
 * and all log messages are written to a single log file. 
 * Write a program to demonstrate the usage of the Logger class to log messages 
 * from multiple parts of the application.
 */

package lab_26_DesignPattern; // User defined Package declaration
// class declaration
public class Logger {
	// Private static instance variable to hold the single instance of the class
	public  static Logger log = new Logger();
	//Private constructor to prevent instantiation from other classes
	private Logger()
	{
		System.out.println("Logger instance is created.");
	}
	// Public static method to provide access to the single instance of the class
	public static Logger createobject()
	{
		return log;
	}
	// Concrete method
	public void loggerInmsg()
	{
		System.out.println("call login registered");
	}
	// Concrete method
	public void loggerOutmsg()
	{
		System.out.println("call logout registered");
	}

}
