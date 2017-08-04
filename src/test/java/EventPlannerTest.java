import org.junit.Test;

import static org.junit.Assert.*;

public class EventPlannerTest {
    @Test
    public void newEventPlanner_instantiatesCorrectly(){
        EventPlanner testEventPlanner = new EventPlanner( 4, 25,"american","soda","dj");
        assertEquals(true, testEventPlanner instanceof EventPlanner);
    }
    @Test
    public void newEventPlanner_getGuestCount_25(){
        EventPlanner testEventPlanner = new EventPlanner(4,25,"american","soda","dj");
        assertEquals(25, testEventPlanner.countExpectedGuests());
    }
    @Test
    public void newEventPlanner_getGuestTimeDuration_4(){
        EventPlanner testEventPlanner = new EventPlanner(4,25,"american","soda","dj");
        assertEquals(4, testEventPlanner.receiveGuestTimeDuration());
    }
    @Test
    public void newEventPlanner_getChosenFood_American(){
        EventPlanner testEventPlanner = new EventPlanner(4,25,"american","soda","dj");
        assertEquals("american", testEventPlanner.getChosenFood());
    }
    @Test
    public void newEventPlanner_getChosenBeverage_Soda(){
        EventPlanner testEventPlanner = new EventPlanner(4,25,"american","soda","dj");
        assertEquals("soda", testEventPlanner.getChosenBeverage());

    }

}