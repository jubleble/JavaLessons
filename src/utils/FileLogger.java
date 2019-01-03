package utils;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by pawelk on 18/12/2018.
 * https://howtodoinjava.com/java/io/java-write-to-file/
 */
public class FileLogger implements Logger {
    @Override
    public void info(String message) {
        throw new NotImplementedException();
    }

    @Override
    public void warn(String warnMessage) {
        throw new NotImplementedException();
    }

    @Override
    public void error(String error) {
        throw new NotImplementedException();
    }

    @Override
    public void fatal(String fatalError) {
        throw new NotImplementedException();
    }
}
