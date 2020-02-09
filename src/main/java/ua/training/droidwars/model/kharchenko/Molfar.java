package ua.training.droidwars.model.kharchenko;

import ua.training.droidwars.model.Droid;

public class Molfar extends Droid {

    public Molfar (){
        this.name = "Molfar";
        this.attack = 35;
        this.defence = 30;
        this.health = 95;
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
