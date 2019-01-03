package models;

import java.util.Date;

/**
 * Created by pawelk on 06/11/2018.
 */
public class Promotion {
    private Date startDate; //date when promotion should be started
    private User[] affectedUsers;
    private String promotionName;
    private String promotionContent;

    public Promotion(Date startDate, User[] users, String promotionName, String promotionContent) {
        this.affectedUsers = users;
        this.promotionContent = promotionContent;
        this.promotionName = promotionName;
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "Promotion Name: " + this.promotionName
                + "\nPromotion Content: " + this.promotionContent
                + "\nStart date: " + this.startDate.toString()
                + "\nNumber of affected users: " + this.getAffectedUsers().length;
    }

    public User[] getAffectedUsers() {
        return affectedUsers;
    }
}
