package ua.training.droidwars.controller.actionController.impl;

import ua.training.droidwars.controller.actionController.AbstractAction;
import ua.training.droidwars.model.Droid;

public class UltimateAbilityAction extends AbstractAction {

    private static int startRange = 96;
    private static int endRange = 100;

    public UltimateAbilityAction() {
        super(startRange, endRange);
    }

    @Override
    public void doAction(Droid firstDroid, Droid secondDroid) {
        firstDroid.useSpecialAbility(secondDroid);
    }
}
