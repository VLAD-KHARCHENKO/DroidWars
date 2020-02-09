package ua.training.droidwars.controller;

import ua.training.droidwars.controller.actionController.Action;
import ua.training.droidwars.controller.actionController.impl.AttackAction;
import ua.training.droidwars.controller.actionController.impl.DefenceAction;
import ua.training.droidwars.controller.actionController.impl.SpecialAbilityAction;
import ua.training.droidwars.controller.actionController.impl.UltimateAbilityAction;
import ua.training.droidwars.model.Droid;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Arena implements Rules {

    private List<Droid> allDroids;
    private List<Droid> chosenDroids;
    private Droid winner;
    private List<Action> actions;

    public void start() {
        allDroids = introduceDroids();
        chosenDroids = chooseDroids(allDroids);
        winner = startTournament(chosenDroids);
        announceResult(winner, chosenDroids);

        //должно приходить списком из main
        actions.add(new AttackAction());
        actions.add(new DefenceAction());
        actions.add(new SpecialAbilityAction());
        actions.add(new UltimateAbilityAction());

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
        do {
            doMove(firstDroid, secondDroid);
            doMove(secondDroid, firstDroid);
        } while (bothDroidsAlive(firstDroid, secondDroid));

        return getWinner(firstDroid, secondDroid);
    }

    private void doMove(Droid firstDroid, Droid secondDroid) {
        int selectorNumber = getRandomNumber();

        for (Action action : actions) {
            action.performAction(selectorNumber, firstDroid, secondDroid);
        }
    }

    private static int getRandomNumber() {
        int percentageBound = 101;
        Random r = new Random();
        return r.nextInt(percentageBound);
    }

    private boolean bothDroidsAlive(Droid firstDroid, Droid secondDroid) {
        return firstDroid.getHealth() > 0 || secondDroid.getHealth() > 0;
    }

    private Droid getWinner(Droid firstDroid, Droid secondDroid) {
        return firstDroid.getHealth() > 0 ? firstDroid : secondDroid;
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
