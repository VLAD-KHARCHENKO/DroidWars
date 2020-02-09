package ua.training.droidwars.controller.actionController.impl;

import ua.training.droidwars.controller.actionController.AbstractAction;
import ua.training.droidwars.model.Droid;

public class DefenceAction extends AbstractAction {

    private static int startRange = 38;
    private static int endRange = 75;

    public DefenceAction() {
        super(startRange, endRange);
    }

    @Override
    public void doAction(Droid firstDroid, Droid secondDroid) {
        firstDroid.useDefence(secondDroid);
    }
}
