package ua.training.droidwars.model;

public abstract class Droid {

    private Integer attack;
    private Integer defence;
    private Integer health;

    public abstract int attack(Droid droid);
    public abstract int defend(Droid droid);
    public abstract int useSpecialAbility(Droid droid);
    public abstract void prepareBeforeNextBattle();

}
