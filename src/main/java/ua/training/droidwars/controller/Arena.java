package ua.training.droidwars.controller;

import ua.training.droidwars.model.Droid;

import java.util.ArrayList;
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
        ArrayList<Droid> tournamentResult = startRound(1, droids);
        return tournamentResult.get(0);
    }

    @Override
    public Droid droidsFight(Droid firstDroid, Droid secondDroid) {
        return null;
    }

    @Override
    public void announceResult(Droid winner, List<Droid> droids) {

    }

    public ArrayList<Droid> startRound(int round, List<Droid> droids) {
        ArrayList<Droid> roundWinners = new ArrayList<>();
        if (round == 3) {
            System.out.println("Final round:");
            System.out.println("Droid " + droids.get(0).getName() + " fighting against " + droids.get(1));
            roundWinners.add(droidsFight(droids.get(0), droids.get(1)));
            System.out.println("Droid " + roundWinners.get(0).getName() + "had win battle!");
            return roundWinners;
        } else {
            System.out.println("Round " + round + ":");
            for (int i = 0; i < droids.size(); i++) {
                System.out.println("Battle " + i + " starts!");
                System.out.println("Droid " + droids.get(i).getName() + " fighting against " + droids.get(i + 1));
                Droid battleWinner = droidsFight(droids.get(i), droids.get(i + 1));
                roundWinners.add(battleWinner);
                System.out.println("Droid " + battleWinner.getName() + " had win battle!");
            }
            startRound(round + 1, roundWinners);
        }
        return roundWinners;
    }

}
