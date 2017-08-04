import org.junit.Test;

import static org.junit.Assert.*;

public class EventPlannerTest {
    @Test
    public void newEventPlanner_getGuestCount_25(){
        EventPlanner testEventPlanner = new EventPlanner();
        assertEquals(25, testEventPlanner.countExpectedGuests(25));
    }
    @Test
    public void newEventPlanner_getGuestTimeDuration_4(){
        EventPlanner testEventPlanner = new EventPlanner();
        assertEquals(4, testEventPlanner.receiveGuestTimeDuration(4));
    }
    @Test
    public void newEventPlanner_instantiatesCorrectly(){
        EventPlanner testEventPlanner = new EventPlanner("john", "american", "soda", "dj", 4, 25);
        assertEquals(true, testEventPlanner instanceof EventPlanner);
    }
}