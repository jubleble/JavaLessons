package services;

import models.User;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

/**
 * Created by pawelk on 27/11/2018.
 */
public class UserService {
    /*
    W sytuacji, gdy nie ma sprecyzowanego wyboru kanału komunikacji dla promocji, należy uwzględnić następujące priorytety dla preferencji:

1 - mail
2 - sms
3 - telefon
4 - poczta
     */
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
        throw new NotImplementedException();
    }

    public User[] getUsersWhoHaveMoreLoyaltyPointsThan(User[] allUsers, int minimumExpectedLoyaltyPoints) {
        throw new NotImplementedException();
    }
}
