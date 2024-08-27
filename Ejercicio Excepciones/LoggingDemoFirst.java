package rcvdemo;
import org.apache.logging.log4j.*;

public class LoggingDemoFirst {
	
	private static Logger demologger = LogManager.getLogger(LoggingDemoFirst.class.getName());

	public static void main(String[] args) {
		int value =-1;
		
		try {
			if (value < 0) {
	            throw new InvalidInputException("Invalid input provided: " + value);
	        }
           
        } catch (InvalidInputException e) {

            demologger.error("Caught exception: " + e.getMessage());
        }
		
		try {
			
			processUser(null);
			
		} catch(UserNotFoundException e) {
			
			demologger.error("Caught exception: " + e.getMessage());
		}

	}
	
	public static void processUser(String userId) throws UserNotFoundException {
	    if (userId == null) {
	        throw new UserNotFoundException("User ID cannot be null!");
	    }
	    
	}

}
