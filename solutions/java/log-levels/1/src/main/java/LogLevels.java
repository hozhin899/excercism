public class LogLevels {

	public static String message(String logLine) {
		return logLine.substring(logLine.indexOf(":") + 1).strip();
	}

	public static String logLevel(String logLine) {
		if (logLine.contains("INFO"))
			return "info";
		else if (logLine.contains("WARNING"))
			return "warning";
		else if (logLine.contains("ERROR"))
			return "error";
		else
			throw new UnsupportedOperationException("Please implement the (static) LogLevels.logLevel() method");
	}

	public static String reformat(String logLine) {
		return message(logLine) + " (" +  logLevel(logLine) + ")";
	}
}