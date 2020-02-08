package ua.training.droidwars.controller;

import ua.training.droidwars.model.Droid;

import java.util.List;

public class Arena implements Rules {

    List<Droid> droids;
    Droid winner;

    public void start() {
        droids = introduceDroids();
        winner = startTournament(droids);
        announceResult(winner, droids);
    }

    @Override
    public List<Droid> introduceDroids() {
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
