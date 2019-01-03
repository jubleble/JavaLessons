package tests;

import models.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.ArrayHelper;
import utils.ArrayHelperGeneric;

/**
 * Created by pawelk on 20/11/2018.
 */
public class ArrayHelperGenericTest {
    /*
        1. array is empty => new array should contains one element, equal to provide item
        2. array is not empty => new array should contains one additional element, last element in array should be equal to provided item
    */
    @Test
    public void addItem_WhenArrayIsEmpty_ThenShouldReturnArrayWithSingleElement() {
        // Arrange
        ArrayHelperGeneric<String> stringArrayHelperGeneric = new ArrayHelperGeneric<String>();
        String[] strings = new String[0];
        String newString = "Test";

        ArrayHelperGeneric<User> userArrayHelperGeneric = new ArrayHelperGeneric<User>();
        User[] users = new User[0];
        User newUser = new User("test@test.com", "Test", "Test", true, true, true, true, "TestPhone", "TestAddress");

        // Act
        String[] stringsResult = stringArrayHelperGeneric.addItem(strings, newString);
        User[] usersResult = userArrayHelperGeneric.addItem(users, newUser);

        // Assert
        Assertions.assertEquals(stringsResult.length, 1);
        Assertions.assertEquals(stringsResult[0], newString);
        Assertions.assertEquals(usersResult.length, 1);
        Assertions.assertEquals(usersResult[0], newUser);
    }

    @Test
    public void addItem_WhenArrayIsNotEmpty_ThenShouldContainAdditionalProvidedElement() {
        // Arrange
        ArrayHelperGeneric<User> userArrayHelperGeneric = new ArrayHelperGeneric<User>();
        User[] oldArray = new User[1];
        oldArray[0] = new User("test1@test1.com", "Test1", "Test1", false, false, false, false);
        User newUser = new User("test2@test2.com", "Test2", "Test2", false, false, false, false);

        // Act
        User[] resultUsers = userArrayHelperGeneric.addItem(oldArray, newUser);

        // Assert
        Assertions.assertEquals(resultUsers.length, oldArray.length + 1);
        Assertions.assertEquals(resultUsers[0], oldArray[0]);
        Assertions.assertEquals(resultUsers[1], newUser);
    }
}
