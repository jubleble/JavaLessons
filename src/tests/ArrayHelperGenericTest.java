package tests;

import models.User;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import utils.ArrayHelperGeneric;

public class ArrayHelperGenericTest {
    @Test
    public void findItem_WhenArrayIsEmpty_ThenReturnFalse() {
        // Arrange
        ArrayHelperGeneric<User> userArrayHelperGeneric = new ArrayHelperGeneric<User>();
        User[] array = new User[0];
        User itemToFind = new User("test2@test2.com", "Test2", "Test2", false, false, false, false);
        boolean expectedValue = false;

        // Act
        boolean result = userArrayHelperGeneric.findItem(array, itemToFind);

        // Assert
        Assertions.assertEquals(expectedValue, result);
    }

    @Test
    public void findItem_WhenArrayIsNotEmptyAndElementDoesntExistInArray_ThenReturnFalse() {
        // Arrange
        ArrayHelperGeneric<String> stringArrayHelperGeneric = new ArrayHelperGeneric<String>();
        String[] array = new String[3];
        String itemToFind = "a";
        array[0] = "aa";
        array[1] = "aaa";
        array[2] = "aab";
        boolean expectedValue = false;

        // Act
        boolean result = stringArrayHelperGeneric.findItem(array, itemToFind);

        // Assert
        Assertions.assertEquals(expectedValue, result);
    }

    @Test
    public void findItem_WhenArrayIsNotEmptyAndElementExistsInArray_ThenReturnTrue() {
        // Arrange
        ArrayHelperGeneric<String> stringArrayHelperGeneric = new ArrayHelperGeneric<String>();
        String[] array = new String[3];
        String itemToFind = "a";
        array[0] = "aa";
        array[1] = "a";
        array[2] = "aab";
        boolean expectedValue = true;

        // Act
        boolean result = stringArrayHelperGeneric.findItem(array, itemToFind);

        // Assert
        Assertions.assertEquals(expectedValue, result);
    }

    @Test
    public void removeItem_WhenArrayIsEmpty_ThenShouldReturnNull() {
        // Arrange
        ArrayHelperGeneric<User> userArrayHelperGeneric = new ArrayHelperGeneric<User>();
        User[] emptyArray = new User[0];
        User removeElement = new User("test2@test2.com", "Test2", "Test2", false, false, false, false);
        User [] expectedValue = null;

        // Act
        User[] result = userArrayHelperGeneric.removeItem(emptyArray, removeElement);

        // Assert
        Assertions.assertEquals(expectedValue, result);
    }

    @Test
    public void removeItem_WhenArrayIsNotEmptyAndRemoveElementNotExist_ThenShouldReturnOldArray() {
        // Arrange
        ArrayHelperGeneric<User> userArrayHelperGeneric = new ArrayHelperGeneric<User>();
        User[] nonEmptyArray = new User[3];
        nonEmptyArray[0] = new User("test@test.com", "Test", "Test", false, false, false, false);
        nonEmptyArray[1] = new User("test1@test1.com", "Test1", "Test1", false, false, false, false);
        nonEmptyArray[2] = new User("test2@test2.com", "Test2", "Test2", false, false, false, false);
        User removeElement = new User("test3@test3.com", "Test3", "Test3", false, false, false, false);

        // Act
        User[] result = userArrayHelperGeneric.removeItem(nonEmptyArray, removeElement);

        // Assert
        Assertions.assertEquals(nonEmptyArray, result);
    }

    @Test
    public void removeItem_WhenArrayIsNotEmptyAndRemoveElementExist_ThenShouldRemoveItemAndReturnNewArray() {
        // Arrange
        ArrayHelperGeneric<User> userArrayHelperGeneric = new ArrayHelperGeneric<User>();
        User[] nonEmptyArray = new User[3];
        nonEmptyArray[0] = new User("test@test.com", "Test", "Test", false, false, false, false);
        nonEmptyArray[1] = new User("test1@test1.com", "Test1", "Test1", false, false, false, false);
        nonEmptyArray[2] = new User("test2@test2.com", "Test2", "Test2", false, false, false, false);
        User removeElement = nonEmptyArray[1];

        // Act
        User[] result = userArrayHelperGeneric.removeItem(nonEmptyArray, removeElement);

        // Assert
        Assertions.assertEquals(nonEmptyArray.length - 1, result.length);
        Assertions.assertEquals(nonEmptyArray[0], result[0]);
        Assertions.assertEquals(nonEmptyArray[2], result[1]);
        Assertions.assertEquals(removeElement, nonEmptyArray[1]);
    }

    @Test
    public void swapItem_WhenArrayIsEmpty_ThenShouldReturnNull() {
        // Arrange
        ArrayHelperGeneric<User> userArrayHelperGeneric = new ArrayHelperGeneric<User>();
        User[] emptyArray = new User[0];
        User[] expectedValue = null;
        User swapElement = new User("test1@test1.com", "Test1", "Test1", false, false, false, false);
        User newElement = new User("test3@test3.com", "Test3", "Test3", false, false, false, false);

        // Act
        User[] result = userArrayHelperGeneric.swapItem(emptyArray, swapElement, newElement);

        // Assert
        Assertions.assertEquals(expectedValue, result);
    }

    @Test
    public void swapItem_WhenArrayIsNotEmptyAndSwapElementNotExist_ThenShouldReturnOldArray() {
        // Arrange
        ArrayHelperGeneric<User> userArrayHelperGeneric = new ArrayHelperGeneric<User>();
        User[] nonEmptyArray = new User[3];
        nonEmptyArray[0] = new User("test@test.com", "Test", "Test", false, false, false, false);
        nonEmptyArray[1] = new User("test1@test1.com", "Test1", "Test1", false, false, false, false);
        nonEmptyArray[2] = new User("test2@test2.com", "Test2", "Test2", false, false, false, false);
        User swapElement = new User("test4@test4.com", "Test4", "Test4", false, false, false, false);
        User newElement = new User("test3@test3.com", "Test3", "Test3", false, false, false, false);

        // Act
        User[] result = userArrayHelperGeneric.swapItem(nonEmptyArray, swapElement, newElement);

        // Assert
        Assertions.assertEquals(nonEmptyArray, result);
    }

    @Test
    public void swapItem_WhenArrayIsNotEmptyAndSwapElementExist_ThenShouldSwapElementAndReturnNewArray() {
        // Arrange
        ArrayHelperGeneric<User> userArrayHelperGeneric = new ArrayHelperGeneric<User>();
        User[] nonEmptyArray = new User[3];
        nonEmptyArray[0] = new User("test@test.com", "Test", "Test", false, false, false, false);
        nonEmptyArray[1] = new User("test1@test1.com", "Test1", "Test1", false, false, false, false);
        nonEmptyArray[2] = new User("test2@test2.com", "Test2", "Test2", false, false, false, false);
        User swapElement = nonEmptyArray[1];
        User newElement = new User("test3@test3.com", "Test3", "Test3", false, false, false, false);

        // Act
        User[] result = userArrayHelperGeneric.swapItem(nonEmptyArray, swapElement, newElement);
        // Assert
        Assertions.assertEquals(nonEmptyArray.length, result.length);
        Assertions.assertEquals(nonEmptyArray[0], result[0]);
        Assertions.assertEquals(result[1], newElement);
        Assertions.assertEquals(swapElement, nonEmptyArray[1]);
        Assertions.assertEquals(nonEmptyArray[2], result[2]);
    }
}
