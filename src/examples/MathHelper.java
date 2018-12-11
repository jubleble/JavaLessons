package examples;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by pawelk on 15/11/2018.
 */
public class MathHelper {
    public boolean isPrimeNumber(int number) {
        if (number <= 0) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number%i == 0) {
                return false;
            }
        }
        return true;
    }

    public double divide(double first, double second) throws DivideByZeroException {
        if (second == 0) {
            throw new DivideByZeroException();
        } else {
            return first / second;
        }
    }
}
