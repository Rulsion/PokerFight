package pokerFight.log4j;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Loggers{
	private static Logger logger = LogManager.getLogger("Loggers");
	
	public static void loggerOut(String level,String msg) {
		if (level.equals("I")) {
			logger.info(msg);
		} else if (level.equals("W")) {

		} else if (level.equals("E")) {

		} else if (level.equals("M")) {

		}
		
	}

}
