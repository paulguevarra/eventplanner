import org.junit.Test;

import static org.junit.Assert.*;

public class EventPlannerTest {
    @Test
    public void newEventPlanner_getGuestCount_25(){
        EventPlanner testEventPlanner = new EventPlanner();
        assertEquals(25, testEventPlanner.countExpectedGuests(25));
    }

}