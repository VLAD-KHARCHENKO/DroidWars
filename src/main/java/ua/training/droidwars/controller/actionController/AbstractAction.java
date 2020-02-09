package ua.training.droidwars.controller.actionController;

import ua.training.droidwars.model.Droid;

public abstract class AbstractAction implements Action {
    private int startRange;
    private int endRange;

    public AbstractAction(int startRange, int endRange) {
        this.startRange = startRange;
        this.endRange = endRange;
    }

    @Override
    public void performAction(int selectorNumber, Droid firstDroid, Droid secondDroid) {
        if (selectorNumber >= startRange && selectorNumber <= endRange) {
            doAction(firstDroid, secondDroid);
        }
    }

    public abstract void doAction(Droid firstDroid, Droid secondDroid);

}
