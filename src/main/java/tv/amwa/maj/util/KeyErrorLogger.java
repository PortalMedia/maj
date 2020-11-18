package tv.amwa.maj.util;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class KeyErrorLogger {
	
	static String logFileName = "missing_keys.csv";
	
	public static void LogMissingClassKey(String key) {
		WriteToLogFile(key, "class");
	}

	public static void LogMissingProperty(String key) {
		WriteToLogFile(key, "property");
	}
	private static void WriteToLogFile(String key, String type) {
		if(CreateLogFile()) {
			try {
				  SimpleDateFormat formatter = new SimpleDateFormat("MM-dd-yyyy HH:mm:ss");
			      FileWriter logWriter = new FileWriter(logFileName, true);
			      logWriter.append("\"" + key +  "\",\"" + type + "\",\"" + formatter.format(new Date()) + "\"\n");
			      logWriter.close();
			      System.out.println("Successfully wrote to the file.");
			    } catch (IOException e) {
			      System.out.println("An error occurred.");
			      e.printStackTrace();
			    }
			
		}
	}
	private static void WriteHeader() {
		try {
		      FileWriter logWriter = new FileWriter(logFileName, true);
		      logWriter.append("\"Key\",\"Type\",\"Date\"\n");
		      logWriter.close();
		    } catch (IOException e) {
		      System.out.println("An error occurred.");
		      e.printStackTrace();
		    }
	}
	private static boolean CreateLogFile() {
		try {
			File logFile = new File(logFileName);
			if(!logFile.exists()) {
				logFile.createNewFile();
				WriteHeader();
			}
   
			return logFile.exists();
		}
		catch(Exception ex) {
			System.out.println("Could not create log file");
			System.out.println(ex.toString());
		}
		return false;
	}
}
