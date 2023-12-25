package lab_26_DesignPattern; // User defined Package declaration
// Class Declaration
public class Singleton_Logger {
	// Main method
	public static void main(String[] args)
	{
		// Get the Singleton instance
		//user1
		Logger log = Logger.createobject();
		// Call a method on the Singleton instance
		log.loggerInmsg();
		log.loggerOutmsg();
		
		//user2
		Logger log1 = Logger.createobject();
		// Call a method on the Singleton instance
		log1.loggerInmsg();
		log1.loggerOutmsg();
		
		
	}

}
