package services;

/**
 * Created by pawelk on 18/12/2018.
 */
public class PromotionService {
    private UserService userService;

    public PromotionService(UserService userService) {

    }

    //     write unit tests
    // method should send messages to all affected users
    // PromotionWithoutSubscribersException - should be thrown in case WHEN:
    //    - promotion doesn't have any affected users
    /*
    public void runPromotion(Promotion promotion) {
    }
    */

    /*
    write unit tests
    method should update promotion name
    WrongPromotionNameException - should be thrown in case WHEN:
        - newPromotionName is exactly the same like old one
        - newPromotionName has less characters than 2 or more than 30

    public void updatePromotionName(Promotion promotion, String newPromotionName) throws WrongPromotionNameException {

    }
     */

    /*
    write unit tests
    method should assign new empty array of affectedUsers

    public void clearAffectedUsers(Promotion promotion) {
        throw new NotImplementedException();
    }
     */

    /*
    write unit tests
    method should calculate number of loyalty points of affected users

    public int calculateLoyaltyPointsOfAffectedUsers(Promotion promotion) {
        throw new NotImplementedException();
    }
     */
}
