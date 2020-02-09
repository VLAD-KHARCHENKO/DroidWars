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

    protected Integer attack; // Шанс 37.7%
    protected Integer defence; // Шанс 37.5%
    protected Integer health;
    protected String name;

    public abstract int useAttack(Droid droid);

    public abstract int useDefence(Droid droid);

    public abstract int useSpecialAbility(Droid droid); // Шанс 20%

    public abstract int useUltimateAbility(Droid droid); // Шанс 5%

    public abstract void prepareForNextBattle();

    public Integer getAttack() {
        return attack;
    }

    public void setAttack(Integer attack) {
        this.attack = attack;
    }

    public Integer getDefence() {
        return defence;
    }

    public void setDefence(Integer defence) {
        this.defence = defence;
    }

    public Integer getHealth() {
        return health;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
