package ua.training.droidwars.controller.actionController.impl;

import ua.training.droidwars.controller.actionController.AbstractAction;
import ua.training.droidwars.model.Droid;

public class SpecialAbilityAction extends AbstractAction {

    private static int startRange = 76;
    private static int endRange = 95;

    public SpecialAbilityAction() {
        super(startRange, endRange);
    }

    @Override
    public void doAction(Droid firstDroid, Droid secondDroid) {
        firstDroid.useSpecialAbility(secondDroid);
    }
}
