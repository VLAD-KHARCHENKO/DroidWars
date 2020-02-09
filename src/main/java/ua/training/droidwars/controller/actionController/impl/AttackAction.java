package ua.training.droidwars.controller.actionController.impl;

import ua.training.droidwars.controller.actionController.AbstractAction;
import ua.training.droidwars.model.Droid;

public class AttackAction extends AbstractAction {

    private static int startRange = 0;
    private static int endRange = 37;

    public AttackAction() {
        super(startRange, endRange);
    }

    @Override
    public void doAction(Droid firstDroid, Droid secondDroid) {
        firstDroid.useAttack(secondDroid);
    }
}
