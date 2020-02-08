package ua.training.droidwars.controller;

import ua.training.droidwars.model.Droid;

import java.util.List;

public class Arena implements Rules {

    private List<Droid> allDroids;
    private List<Droid> chosenDroids;
    private Droid winner;

    public void start() {
        allDroids = introduceDroids();
        chosenDroids = chooseDroids(allDroids);
        winner = startTournament(chosenDroids);
        announceResult(winner, chosenDroids);
    }

    @Override
    public List<Droid> introduceDroids() {
        return null;
    }

    @Override
    public List<Droid> chooseDroids(List<Droid> droids) {
        return null;
    }

    @Override
    public Droid startTournament(List<Droid> droids) {
        return null;
    }

    @Override
    public Droid droidsFight(Droid firstDroid, Droid secondDroid) {
        return null;
    }

    @Override
    public void announceResult(Droid winner, List<Droid> droids) {

    }

}
