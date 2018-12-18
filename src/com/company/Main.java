package com.company;

import examples.DivideByZeroException;
import models.User;
import examples.MathHelper;
import services.UserService;

public class Main {

    public static void main(String[] args) {
        // Live demo
        /*
        User user = new User("pawel.kubiak@gmail.com", "Paweł", "Kubiak", true, true, true, true, "48505869606", "testaddress");
        User user1 = new User("emil.d@gmail.com", "Emil", "D", true, false, false, false, "48500500500", "testaddress");

        System.out.println(user.toString());
        System.out.println(user1.toString());

        System.out.println();
        System.out.println("Print Promotion");
        Date startDate = new Date(118, 10, 30);
        User[] database = new User[2];
        database[0] = user;
        database[1] = user1;
        Promotion promotion = new Promotion(startDate, database, "Test promotion", "Lorem ipsum...");
        System.out.println(promotion.toString());
*/
        // Basics
        /*
        Scanner scanner = new Scanner(System.in);
        LoopTest loopTest = new LoopTest(scanner);
        loopTest.test();


        MathHelper mathHelper = new MathHelper();
        boolean result = mathHelper.isPrimeNumber(5);

        User user = new User("pawel.kubiak@gmail.com", "Paweł", "Kubiak", false, true, true, true, "48505869606", "testaddress");
        User user1 = new User("emil.d@gmail.com", "Emil", "D", true, false, false, false, "48500500500", "testaddress");
        User[] allUsers = new User[2];
        allUsers[0] = user;
        allUsers[1] = user1;
        UserService userService = new UserService();


        for (User u:allUsers) {
            userService.sendMessage(u);
        }

        User[] onlyEmailUsers = userService.getUsersWhoSubscribeEmailChannel(allUsers);
        System.out.println(onlyEmailUsers.length);

        User[] usersWhoHaveMoreThan250LoyaltyPoints = userService.getUsersWhoHaveMoreLoyaltyPointsThan(allUsers, 250);
        */

        /* Lesson - exceptions
        MathHelper mathHelper = new MathHelper();
        int first = 100;
        for (int i = -2; i < 3; i++) {
            try {
                System.out.println(mathHelper.divide(first, i));
            }
            catch (DivideByZeroException exception) {
                System.out.println("Do not divide by zero!");
            }
            catch (IllegalArgumentException exception) {
                System.out.println("IllegalArgumentException occured: " + exception.toString());
            }
            catch (Exception exception) {
                System.out.println("Exception occured: " + exception.toString());
            }
            finally {
                System.out.println("Iteration: " + (i+3));
            }
        }
        */

        // Problem solving - cannot read property from object
        /*
        User user1 = new User("pawel.kubiak@gmail.com", "Paweł", "Kubiak", false, true, true, true, "48505869606", "testaddress");
        User user2 = new User("emil.d@gmail.com", "Emil", "D", true, false, false, false, "48500500500", "testaddress");
        User[] allUsers = new User[2];
        allUsers[0] = user1;
        allUsers[1] = user2;

        String expectedName = "Emil";
        for (User user:allUsers) {
            if (user.getFirstName()==expectedName) {
                System.out.println("Found: " + user.getFirstName());
            } else {
                System.out.println("Found " + user.getFirstName() + " instead of " + expectedName);
            }
        }
        */
    }
}
