package utils;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import utils.Logger;

/**
 * Created by pawelk on 18/12/2018.
 */
public class ConsoleLogger implements Logger {

    public void info(String message) {
        System.out.println("INFO " + message);
    }

    public void fatal(String message) {
        System.out.println("FATAL " + message);
    }

    public void warn(String message) {
        System.out.println("WARNING " + message);
    }

    public void error(String message) {
        System.out.println("ERROR " + message);
    }
}
