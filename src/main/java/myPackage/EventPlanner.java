package myPackage;


import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.Map;
import java.util.HashMap;


public class EventPlanner {
    private int expectedNumberGuests;
    private int expectedDurationTime;
    private String chosenFood;
    private String chosenBeverage;
    private String chosenEntertainment;


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
    public static int calculateCostTotal(int duration, int guestCount, String food, String beverage, String entertainment){
        Map<String,Integer> serviceProvided = new HashMap<>();
        serviceProvided.put("american",10);
        serviceProvided.put("mexican",11);
        serviceProvided.put("asian",11);
        serviceProvided.put("french",12);
        serviceProvided.put("soda",2);
        serviceProvided.put("beer",9);
        serviceProvided.put("wine",10);
        serviceProvided.put("dj",200);
        serviceProvided.put("band",375);
        serviceProvided.put("none",0);

        int totalCost = (100*duration)+(guestCount*serviceProvided.get(food))+(guestCount*serviceProvided.get(beverage))+(duration*serviceProvided.get(entertainment));
        return totalCost;
    }
    public static int  discountQualifier(String discountCode){
        int discountedAmount;
        switch (discountCode){
            case "epicodus":
                discountedAmount = 50;
                System.out.println("Discount Accepted! You get $50 off.");
                break;
            case "excellence":
                discountedAmount = 100;
                System.out.println("Discount Accepted! You get $100 off.");
                break;
            default:
                discountedAmount = 0;
                System.out.println("No Discount Applied!");
        }

        return discountedAmount;
    }

}
