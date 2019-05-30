public class Logger {
    private Logger() {
        // private constructor
    }
    // static inner class - inner classes are not loaded until they are
    // referenced.
    private static class LoggerHolder {
        private static Logger logger = new Logger();
    }
    // global access point
    public static Logger getInstance() {
        return LoggerHolder.logger;
    }
    //Other methods
}
