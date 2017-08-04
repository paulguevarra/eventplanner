import java.awt.*;
import java.util.Map;
import java.util.HashMap;


public class EventPlanner {
    private int expectedNumberGuests;
    private int expectedDurationTime;
    private String chosenFood;
    private String chosenBeverage;
    private String chosenEntertainment;
    private int totalCost;

    public EventPlanner (int duration, int guestCount, String food, String beverage, String entertainment){
        expectedDurationTime = duration;
        expectedNumberGuests = guestCount;
        chosenFood = food;
        chosenBeverage = beverage;
        chosenEntertainment = entertainment;

    }
    public int countExpectedGuests(){
        return expectedNumberGuests;
    }
    public int receiveGuestTimeDuration(){
        return expectedDurationTime;
    }

    public String getChosenFood() {
        return chosenFood;
    }

    public String getChosenBeverage() {
        return chosenBeverage;
    }

    public String getChosenEntertainment() {
        return chosenEntertainment;
    }
    public int calculateCostTotal(int duration, int guestCount, String food, String beverage, String entertainment){
        Map<String,Integer> serviceProvided = new HashMap<String, Integer>();
        serviceProvided.put("american",10);

        totalCost = (100*duration)+(guestCount*serviceProvided.get(food));
        return totalCost;
    }
}
