import java.awt.*;

public class EventPlanner {
    private int expectedNumberGuests;
    private int expectedDurationTime;
    

    public EventPlanner (int duration, int guestCount){
        expectedDurationTime = duration;
        expectedNumberGuests = guestCount;
    }
    public int countExpectedGuests(){
        return expectedNumberGuests;
    }
    public int receiveGuestTimeDuration(){
        return expectedDurationTime;
    }


}
