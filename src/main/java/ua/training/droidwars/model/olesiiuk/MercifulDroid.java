package ua.training.droidwars.model.olesiiuk;

import ua.training.droidwars.model.Droid;

public class MercifulDroid extends Droid {

    public MercifulDroid() {
        this.attack = 0;
        this.defence = 0;
        this.health = 9;
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
