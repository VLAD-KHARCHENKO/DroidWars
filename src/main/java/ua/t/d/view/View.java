package ua.t.d.view;

public class View {
    public static final String CHOOSE_DROID_SELECTION_MODE = "Please, choose droid selection mode." +
                                                            " Press 1 for manual choice or 2 for automatic";
    public static final String WRONG_INPUT = "Wrong input data. Please, try again.";
    public static final String CHOOSE_NUMBER_OF_DROID = "Please, type number of droid.";
    public static final String FULL_LIST_OF_DROIDS = "Here is full list of droids:";

    public static void printMessage (String message) {
        System.out.println (message);
    }
}
