package ua.training.droidwars.model.kharchenko;

import ua.training.droidwars.model.Droid;

public class Chugayster extends Droid {

    public Chugayster (){
        this.name = "Chugayster";
        this.attack = 30;
        this.defence = 15;
        this.health = 70;
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
