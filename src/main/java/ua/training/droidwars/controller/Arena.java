package ua.training.droidwars.controller;

import ua.t.d.view.View;
import ua.training.droidwars.controller.actionController.Action;
import ua.training.droidwars.controller.actionController.impl.AttackAction;
import ua.training.droidwars.controller.actionController.impl.DefenceAction;
import ua.training.droidwars.controller.actionController.impl.SpecialAbilityAction;
import ua.training.droidwars.controller.actionController.impl.UltimateAbilityAction;
import ua.training.droidwars.model.Droid;
import ua.training.droidwars.model.kharchenko.Chugayster;
import ua.training.droidwars.model.kharchenko.HutsulDroid;
import ua.training.droidwars.model.kharchenko.Molfar;
import ua.training.droidwars.model.olesiiuk.ImpartialDroid;
import ua.training.droidwars.model.olesiiuk.MercifulDroid;
import ua.training.droidwars.model.olesiiuk.RestlessDroid;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Arena implements Rules {
  
    private final int numberOfDroidForBattle = 8;

    private static  List<Droid> allDroids;
    private List<Droid> chosenDroids;
    private Droid winner;
    private static View view;
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

    public void   droidInfo(Droid droid) {
        System.out.println("Information about "+  droid.getName());
        System.out.println("attack: "+droid.getAttack());
        System.out.println("defence: "+droid.getDefence());
        System.out.println("health: "+droid.getHealth());

    }
  
    @Override
    public List<Droid> introduceDroids() {
        List<Droid> droidList = new ArrayList<>();
        //гуцул боти
        HutsulDroid hutsulDroid = new HutsulDroid();
        Chugayster chugayster = new Chugayster();
        Molfar molfar =new Molfar();
        //olesiiuk боти
        ImpartialDroid impartialDroid=new ImpartialDroid();
        MercifulDroid mercifulDroid =new MercifulDroid();
        RestlessDroid restlessDroid =new RestlessDroid();
        droidList.add(hutsulDroid);
        droidList.add(chugayster);
        droidList.add(molfar);
        droidList.add(impartialDroid);
        droidList.add(mercifulDroid);
        droidList.add(restlessDroid);

        return droidList;
    }

    @Override
    public List<Droid> chooseDroids(List<Droid> droids) {
        ArrayList <Droid> tmpDroids = new ArrayList<>();
        view.printMessage(view.FULL_LIST_OF_DROIDS);
        displayDroidList();
        view.printMessage(view.CHOOSE_DROID_SELECTION_MODE);
        int buffer = measuresCheck(1,2);
        if (buffer == 1) {
            for (int i = 0; i < numberOfDroidForBattle; ++i) {
                view.printMessage(view.CHOOSE_NUMBER_OF_DROID);
                int number =measuresCheck(0,droids.size() - 1);
                tmpDroids.add(droids.get(number));
            }
        }
        else {
            for (int i = 0; i < numberOfDroidForBattle; ++i) {
                tmpDroids.add(droids.get(0 + (int) Math.random() * (droids.size() - 1)));
            }
        }
        return tmpDroids;
    }

    public void displayDroidList () {
        for (int i = 0; i < allDroids.size(); ++i) {
            System.out.println(allDroids.get(i));
        }
    }

    public int inputCheck(Scanner scanner)  {
        while (!scanner.hasNextInt()) {
            view.printMessage(view.WRONG_INPUT);
            scanner.next();
        }
        return scanner.nextInt();
    }

    public int measuresCheck(int min, int max) {
        Scanner sc = new Scanner(System.in);
        int number = inputCheck(sc);
        while (number > max || number < min) {
            view.printMessage(view.WRONG_INPUT);
            number = inputCheck(sc);
        }
        return number;
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
