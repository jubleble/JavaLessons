package services;

import exceptions.UserCannotReceiveMessageException;
import models.User;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import utils.*;

/**
 * Created by pawelk on 27/11/2018.
 */
public class UserService {
    private Logger logger;

    public UserService(Logger logger) {
        this.logger = logger;
    }

    public void sendMessage(User user) throws UserCannotReceiveMessageException {
        if (user.isByEmail()) {
            logger.info(user.toString() + " received message by Email!");
        } else if (user.isByText()) {
            logger.info(user.toString() + " received message by Text!");
        } else if (user.isByPhone()) {
            logger.info(user.toString() + " received message by Phone!");
        } else if (user.isByPost()) {
            logger.info(user.toString() + " received message by Post!");
        } else {
            UserCannotReceiveMessageException exception = new UserCannotReceiveMessageException();
            logger.error("User doesn't have any allowed marketing preference!");
            throw exception;
        }
    }

    public User[] getUsersWhoSubscribeEmailChannel(User[] allUsers) {
        ArrayHelperGeneric<User> arrayHelperGeneric = new ArrayHelperGeneric<>();
        User[] resultUsers = new User[0];
        for (User user:allUsers) {
            if (user.isByEmail()) {
                resultUsers = arrayHelperGeneric.addItem(resultUsers, user);
            }
        }
        return resultUsers;
    }

    public User[] getUsersWhoHaveMoreLoyaltyPointsThan
            (User[] allUsers, int minimumExpectedLoyaltyPoints) {
        NotImplementedException exception = new NotImplementedException();
        throw exception;
    }

  /*
    write unit tests
    method should try find user by firstName and lastName
    create class UserNotFoundException
    WHEN provided user doesn't exist in array 'users' THEN throw exception UserNotFoundException

    public User getUser(User[] users, String firstName, String lastName) throws UserNotFoundException{
        NotImplementedException exception = new NotImplementedException();
        throw exception;
    }

    write unit tests
    method should calculate number of loyalty points of users
    [u1,u2,u3]
        u1.loyaltyPoints = 30;
        u2.loyaltyPoints = 20;
        u3.loyaltyPoints = 50;
    => 30 + 20 + 50 = 100;

    public int calculateLoyaltyPointsOfUsers(User[] users) {
        throw new NotImplementedException();
    }

    write unit tests
    method should set up '0' as a new value for loyaltyPoints of provided users
    [u1,u2,u3]
        u1.loyaltyPoints = 30;
        u2.loyaltyPoints = 20;
        u3.loyaltyPoints = 50;
    =>
        u1.loyaltyPoints = 0;
        u2.loyaltyPoints = 0;
        u3.loyaltyPoints = 0;

    public void clearLoyaltyPoints(User[] users) {
        throw new NotImplementedException();
    }


    write unit tests
    method should update user phone number
    WrongPhoneNumberException - should be thrown in case WHEN:
        - newPhoneNumber is exactly the same like old one
        - newPhoneNumber has less characters than 8 or more than 12

    public void updateUserPhoneNumber(User user, String newPhoneNumber) throws WrongPhoneNumberException {

    }

    write unit tests
    method should update user address
        WrongAddressException - should be thrown in case WHEN:
        - newAddress is exactly the same like old one
        - newAddress is empty = ""

    public void updateUserAddress(User user, String newAddress) throws WrongAddressException {

    }
    */
}