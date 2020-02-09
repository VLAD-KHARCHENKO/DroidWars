package ua.training.droidwars.controller.actionController;

import ua.training.droidwars.model.Droid;

public interface Action {
    void performAction(int selectorNumber, Droid firstDroid, Droid secondDroid);
}
