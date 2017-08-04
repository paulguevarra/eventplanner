import java.awt.*;

public class EventPlanner {
    private int expectedNumberGuests;
    private int expectedDurationTime;



    public int countExpectedGuests(int userGuestNum){
        expectedNumberGuests = userGuestNum;
        return expectedNumberGuests;
    }
    public int receiveGuestTimeDuration(int userEventDuration){
        expectedDurationTime = userEventDuration;
        return expectedDurationTime;
    }
}
