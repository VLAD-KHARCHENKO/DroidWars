package ua.training.droidwars.model.kharchenko;

import ua.training.droidwars.model.Droid;

public class HutsulDroid extends Droid {

   public HutsulDroid(String name, int attack, int defence, int health){
       this.name = name;
       this.attack = attack;
       this.defence = defence;
       this.health = health;
   }

    @java.lang.Override
    public int useAttack(Droid droid) {
        return 0;
    }

    @java.lang.Override
    public int useDefence(Droid droid) {
        return 0;
    }

    @java.lang.Override
    public int useSpecialAbility(Droid droid) {
        return 0;
    }

    @java.lang.Override
    public int useUltimateAbility(Droid droid) {
        return 0;
    }

    @java.lang.Override
    public void prepareForNextBattle() {

    }

}
