package tests;

import exceptions.UserNotFoundException;
import models.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import services.UserService;

/**
 * Created by pawelk on 27/11/2018.
 */
class UserServiceTest {
    /*
        // todo
        1. WHEN allUsersIsEmpty THEN empty array will be returned
        2. WHEN allUsersIsNotEmpty AND allUserSaidYesToEmail THEN allUsersArrayShouldBeReturned
        3. WHEN allUsersIsNotEmpty AND allUserSaidNoToEmail THEN empty array will be returned
        4. WHEN allUsersIsNotEmpty AND someOfUsersSaidYesToEmail THEN array with only users who said 'yes' to Email chanel will be returned
     */

    //1. users array is empty then empty array
    @Test
    void findUserByFirstNameAndLastName_WhenArrayIsEmpty_ThenShouldReturnEmptyArray() {
        // Arrange
        UserService userService = new UserService();
        User[] EmptyArray = new User[0];
        String firstName = "Test3";
        String surname  = "Test4";

        // Act
        User [] result = new User[0];
        try {
            result = userService.getUser(EmptyArray,firstName, surname);
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }

        // Assert
        Assertions.assertEquals(EmptyArray, result);
    }

    //2. users array is not empty and element not exist then null
    @Test
    void findUserByFirstNameAndLastName_WhenArrayIsNotEmptyAndElementNotExist_ThenShouldReturnUserNotFoundException() {
        // Arrange
        UserService userService = new UserService();
        User[] nonEmptyArray = new User[3];
        nonEmptyArray[0] = new User("test@test.com","test","test1",true,true,true,true,"test1","test1");
        nonEmptyArray[1] = new User("test1@test1.com","test1","test2",true,true,true,true,"test2","test2");
        nonEmptyArray[2] = new User("test2@test2.com","test2","test3",true,true,true,true,"test3","test3");
        String firstName = "Test3";
        String surname  = "Test4";
        boolean exceptionBoolean = false;

        // Act
        User [] result = new User[0];
        try {
            result = userService.getUser(nonEmptyArray,firstName, surname);
        } catch (UserNotFoundException e) {
            exceptionBoolean = true;
            System.out.println(e.toString());
        }

        // Assert
        Assertions.assertTrue(exceptionBoolean);
        Assertions.assertEquals(result, result);
    }

    //3. users array is not empty and element exist then find users
    @Test
    void findUserByFirstNameAndLastName_WhenArrayIsNotEmptyAndElementExist_ThenShouldReturnFindUser() {
        // Arrange
        UserService userService = new UserService();
        User[] nonEmptyArray = new User[3];
        nonEmptyArray[0] = new User("test@test.com","test","test1",true,true,true,true,"test1","test1");
        nonEmptyArray[1] = new User("test1@test1.com","test1","test2",true,true,true,true,"test2","test2");
        nonEmptyArray[2] = new User("test2@test2.com","test2","test3",true,true,true,true,"test3","test3");
        String firstName = "test1";
        String surname  = "test2";
        boolean exceptionBoolean = false;

        // Act
        User [] result = new User[0];
        try {
            result = userService.getUser(nonEmptyArray,firstName, surname);
        } catch (UserNotFoundException e) {
            exceptionBoolean = true;
            System.out.println(e.toString());
        }

        // Assert
        Assertions.assertFalse(exceptionBoolean);
        Assertions.assertEquals(nonEmptyArray[1], result[0]);
    }

    //4. users array is not empty and 2 element exist then find 2 users
    @Test
    void findUserByFirstNameAndLastName_WhenArrayIsNotEmptyAndTwoElementExist_ThenShouldReturnTwoFindUser() {
        // Arrange
        UserService userService = new UserService();
        User[] nonEmptyArray = new User[4];
        nonEmptyArray[0] = new User("test@test.com","test","test1",false,true,true,true,"test1","test1");
        nonEmptyArray[1] = new User("test1@test1.com","test1","test2",true,false,true,true,"test2","test2");
        nonEmptyArray[2] = new User("test2@test2.com","test2","test3",true,true,false,true,"test3","test3");
        nonEmptyArray[3] = new User("test3@test3.com","test1","test2",true,true,true,false,"test4","test4");
        String firstName = "test1";
        String surname  = "test2";
        boolean exceptionBoolean = false;

        // Act
        User [] result = new User[0];
        try {
            result = userService.getUser(nonEmptyArray,firstName, surname);
        } catch (UserNotFoundException e) {
            exceptionBoolean = true;
            System.out.println(e.toString());
        }

        // Assert
        Assertions.assertFalse(exceptionBoolean);
        Assertions.assertEquals(nonEmptyArray[1], result[0]);
        Assertions.assertEquals(nonEmptyArray[3], result[1]);
    }

    @Test
    void calculateLoyaltyPointsOfUsers_WhenArrayIsEmpty_ThenShouldReturnNull() {
        // Arrange
        UserService userService = new UserService();
        User[] EmptyArray = new User[0];
        // expectedValue = null;

        // Act
        Integer result = userService.calculateLoyaltyPointsOfUsers(EmptyArray);

        // Assert
        Assertions.assertNull(result);
    }

    @Test
    void calculateLoyaltyPointsOfUsers_WhenArrayIsNotEmpty_ThenShouldReturnNumberOfLoyaltyPoints() {
        // Arrange
        UserService userService = new UserService();
        User[] nonEmptyArray = new User[4];
        nonEmptyArray[0] = new User("test@test.com","test","test1",false,true,true,true,"test1","test1");
        nonEmptyArray[1] = new User("test1@test1.com","test1","test2",true,false,true,true,"test2","test2");
        nonEmptyArray[2] = new User("test2@test2.com","test2","test3",true,true,false,true,"test3","test3");
        nonEmptyArray[3] = new User("test3@test3.com","test1","test2",true,true,true,false,"test4","test4");
        Integer expectedValue = 480;
        // Act
        Integer result = userService.calculateLoyaltyPointsOfUsers(nonEmptyArray);

        // Assert
        Assertions.assertEquals(expectedValue, result);
    }
}
