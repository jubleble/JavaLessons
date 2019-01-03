package tests;

import examples.MathHelper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Created by pawelk on 15/11/2018.
 */
public class MathHelperTest {
    @Test
    public void IsPrimeNumber_WhenProvidedNumberIsPrime_ThenReturnTrue(){
        // Arrange
        int providedNumber = 5;
        MathHelper mathHelper = new MathHelper();

        // Act
        boolean result = mathHelper.isPrimeNumber(providedNumber);

        // Assert
        Assertions.assertEquals(true, result);
    }

    @Test
    public void IsPrimeNumber_WhenProvidedNumberIsNotPrime_ThenReturnFalse() {
        // Arrange
        int providedNumber = 4;
        MathHelper mathHelper = new MathHelper();

        // Act
        boolean result = mathHelper.isPrimeNumber(providedNumber);

        // Assert
        Assertions.assertEquals(false, result);
    }

    @Test
    public void IsPrimeNumber_WhenProvidedNumberIsLessThanZero_ThenReturnFalse() {
        // Arrange
        int providedNumber = -100;
        MathHelper mathHelper = new MathHelper();

        // Act
        boolean result = mathHelper.isPrimeNumber(providedNumber);

        // Assert
        Assertions.assertEquals(false, result);
    }

    @Test
    public void IsPrimeNumber_WhenProvidedNumberIsZero_ThenReturnFalse() {
        // Arrange
        int providedNumber = 0;
        MathHelper mathHelper = new MathHelper();

        // Act
        boolean result = mathHelper.isPrimeNumber(providedNumber);

        // Assert
        Assertions.assertEquals(false, result);
    }
}
