package ua.t.d.view;

import ua.training.droidwars.model.Droid;

import java.util.concurrent.TimeUnit;

public class View {
    public static final String CHOOSE_DROID_SELECTION_MODE = "Please, choose droid selection mode." +
            " Press 1 for manual choice or 2 for automatic";
    public static final String WRONG_INPUT = "Wrong input data. Please, try again.";
    public static final String CHOOSE_NUMBER_OF_DROID = "Please, type number of droid.";
    public static final String FULL_LIST_OF_DROIDS = "Here is full list of droids:";
    public static String message=" This is 500 years after AD\nHumans destroyed by the uprising of robots\nDroids started a fight for resources\n" +
            "Some droids are programmed to restore human appearance in the lab,\nbut they need to win this war...";
    public static void printMessage(String message) {
        System.out.println(message);
    }


    public void preview() throws InterruptedException {
        char[] result = message.toCharArray();
        for (char c : result) {
            System.out.print(c);
            TimeUnit.MILLISECONDS.sleep(75);
        }
    }

    public void droidInfo(Droid droid) {
        System.out.println("Information about " + droid.getName());
        System.out.println("attack: " + droid.getAttack());
        System.out.println("defence: " + droid.getDefence());
        System.out.println("health: " + droid.getHealth());

    }
}