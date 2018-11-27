package services;

import models.User;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;
import utils.ArrayHelperGeneric;

/**
 * Created by pawelk on 27/11/2018.
 */
public class UserService {
    public void sendMessage(User user) {
        if (user.isByEmail()) {
            System.out.println(user.toString() + " received message by Email!");
        } else if (user.isByText()) {
            System.out.println(user.toString() + " received message by Text!");
        } else if (user.isByPhone()) {
            System.out.println(user.toString() + " received message by Phone!");
        } else if (user.isByPost()) {
            System.out.println(user.toString() + " received message by Post!");
        } else {
            /*
                todo
                1. implement custom exception class - UserCannotReceiveMessageException
                2. throw that exception
             */
            System.out.println(user.toString() + " didn't received message!");
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

    public User[] getUsersWhoHaveMoreLoyaltyPointsThan(User[] allUsers, int minimumExpectedLoyaltyPoints) {
        throw new NotImplementedException();
    }
}
