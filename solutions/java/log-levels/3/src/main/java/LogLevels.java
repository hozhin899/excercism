public class LogLevels {

	public static String message(String logLine) {
		return logLine.substring(logLine.indexOf(":") + 1).strip();
	}

	public static String logLevel(String logLine) {
		String result = logLine.substring(logLine.indexOf("[") + 1, logLine.indexOf("]")).strip();
		return result.toLowerCase();
	}

	public static String reformat(String logLine) {
		return message(logLine) + " (" +  logLevel(logLine) + ")";
	}
}