import org.junit.Test;

import static org.junit.Assert.*;

public class EventPlannerTest {
    @Test
    public void newEventPlanner_instantiatesCorrectly(){
        EventPlanner testEventPlanner = new EventPlanner( 4, 25);
        assertEquals(true, testEventPlanner instanceof EventPlanner);
    }
    @Test
    public void newEventPlanner_getGuestCount_25(){
        EventPlanner testEventPlanner = new EventPlanner(4,25);
        assertEquals(25, testEventPlanner.countExpectedGuests());
    }
    @Test
    public void newEventPlanner_getGuestTimeDuration_4(){
        EventPlanner testEventPlanner = new EventPlanner(4,25);
        assertEquals(4, testEventPlanner.receiveGuestTimeDuration());
    }

}