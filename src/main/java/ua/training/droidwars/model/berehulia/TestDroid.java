package ua.training.droidwars.model.berehulia;

import ua.training.droidwars.model.Droid;

public class TestDroid extends Droid {

    public TestDroid() {
        this.attack = 5;
        this.defence = 5;
        this.health = 50;
        this.name = "TestDroid";
    }

    @Override
    public int useAttack(Droid droid) {
        droid.setHealth(droid.getHealth() - this.attack);
        return 0;
    }

    @Override
    public int useDefence(Droid droid) {
        this.health += 5;
        return 0;
    }

    @Override
    public int useSpecialAbility(Droid droid) {
        this.setHealth(this.getHealth() + 20);
        return 0;
    }

    @Override
    public int useUltimateAbility(Droid droid) {
        droid.setName("LoserDroid!");
        return 0;
    }

    @Override
    public void prepareForNextBattle() {
        this.attack = 5;
        this.defence = 5;
        this.health = 50;
    }

}
