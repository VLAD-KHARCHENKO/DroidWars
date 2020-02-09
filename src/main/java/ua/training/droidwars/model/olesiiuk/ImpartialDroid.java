package ua.training.droidwars.model.olesiiuk;

import ua.training.droidwars.model.Droid;

public class ImpartialDroid extends Droid {

    public ImpartialDroid() {
        this.attack = 4;
        this.defence = 3;
        this.health = 30;
        this.name = "";
    }

    @Override
    public int useAttack(Droid droid) {
        return 0;
    }

    @Override
    public int useDefence(Droid droid) {
        return 0;
    }

    @Override
    public int useSpecialAbility(Droid droid) {
        return 0;
    }

    @Override
    public int useUltimateAbility(Droid droid) {
        return 0;
    }

    @Override
    public void prepareForNextBattle() {

    }
}
