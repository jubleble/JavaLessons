package tests;

import exceptions.UserNotFoundException;
import models.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import services.UserService;

/**
 * Created by pawelk on 27/11/2018.
 */
public class UserServiceTest {
    /*
        // todo
        1. WHEN allUsersIsEmpty THEN empty array will be returned
        2. WHEN allUsersIsNotEmpty AND allUserSaidYesToEmail THEN allUsersArrayShouldBeReturned
        3. WHEN allUsersIsNotEmpty AND allUserSaidNoToEmail THEN empty array will be returned
        4. WHEN allUsersIsNotEmpty AND someOfUsersSaidYesToEmail THEN array with only users who said 'yes' to Email chanel will be returned
     */

    //1. users array is empty then empty array
    @Test
    public void findUserByFirstNameAndLastName_WhenArrayIsEmpty_ThenShouldReturnEmptyArray() {
        // Arrange
        UserService userService = new UserService();
        User[] EmptyArray = new User[0];
        String firstName = "Test3";
        String surname  = "Test4";

        // Act
        User [] result = new User[0];
        try {
            result = userService.findUser(EmptyArray,firstName, surname);
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }

        // Assert
        Assertions.assertEquals(EmptyArray, result);
    }
}
