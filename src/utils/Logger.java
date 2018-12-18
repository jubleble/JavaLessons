package utils;

/**
 * Created by pawelk on 18/12/2018.
 */
public interface Logger {
    void info(String message);
    void warn(String warnMessage);
    void error(String error);
    void fatal(String fatalError);
}
