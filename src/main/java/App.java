import myPackage.EventPlanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to Simply Catered");
        System.out.println("=========================");
        System.out.println(" ");
        System.out.println("We will work your event so that you don't have to.");
        System.out.println(" ");
        System.out.println("-------------------------");
        System.out.println(" ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("May I have your name?");
        try {
            String name = bufferedReader.readLine();
            System.out.println("Hello "+name+"!");
            System.out.println("How long is the duration of your event?");
            String userDuration = bufferedReader.readLine();
            int duration = Integer.parseInt(userDuration);

            System.out.println("Great! How many people are you expecting?");
            String userGuestNum = bufferedReader.readLine();
            int guestCount = Integer.parseInt(userGuestNum);

            System.out.println("Splendid! What cuisine would you like us to prepare for you?");
            System.out.println("Choose One: american, asian, french, or mexican");
            String food = bufferedReader.readLine();

            System.out.println("Awesome Choice! What type of beverage would you like to serve?");
            System.out.println("Choose One: soda, beer, wine, or none");
            String beverage = bufferedReader.readLine();

            System.out.println("Not a problem! Would you like to include entertainment?");
            System.out.println("Choose One: dj, band, none");
            String entertainment = bufferedReader.readLine();

            EventPlanner userEvent = new EventPlanner(duration, guestCount, food, beverage, entertainment);

            int totalCost = EventPlanner.calculateCostTotal(userEvent.receiveGuestTimeDuration(), userEvent.countExpectedGuests(),userEvent.getChosenFood(),userEvent.getChosenBeverage(),userEvent.getChosenEntertainment());

            System.out.println("Fantastic! Our calculations show that your total cost is $"+totalCost+".00");



        } catch (IOException e){
            e.printStackTrace();
        }


    }
}
