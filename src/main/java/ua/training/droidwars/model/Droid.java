package ua.training.droidwars.model;

public abstract class Droid {

    /*
    * Каждый дроид формирует имеет 100 очков характеристик.
    * 1 единица атаки, или защиты стоит 5 очков.
    * 1 единица жизней стоит 1 очко.
    * Характеристики зависят от индивидуальной модели дроида.
    * Специальная способность дает дроиду способность на 20 очков:
    * Либо восстановить 20 жизней, либо усилить след. атаку/защиту на 4 и т.д.
    * Ультимитивная способность позволяет сделать с вражеским, или своим дроидом, что угодно :)
    */

    private Integer attack; // Шанс 37.7%
    private Integer defence; // Шанс 37.5%
    private Integer health;
    private Boolean isAlive;

    public abstract int useAttack(Droid droid);
    public abstract int useDefence(Droid droid);
    public abstract int useSpecialAbility(Droid droid); // Шанс 20%
    public abstract int useUltimateAbility(Droid droid); // Шанс 5%
    public abstract void prepareForNextBattle();

    public Integer getAttack() {
        return attack;
    }

    public Integer getDefence() {
        return defence;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public Boolean getAlive() {
        return isAlive;
    }

    public void setAlive(Boolean alive) {
        isAlive = alive;
    }

}
