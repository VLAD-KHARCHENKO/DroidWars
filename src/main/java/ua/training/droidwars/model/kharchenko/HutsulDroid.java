package ua.training.droidwars.model.kharchenko;

import ua.training.droidwars.model.Droid;

public class HutsulDroid extends Droid {

   public HutsulDroid(){
       this.name = "Hutsul";
       this.attack = 20;
       this.defence = 10;
       this.health = 80;
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
