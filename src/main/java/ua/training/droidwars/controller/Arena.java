package ua.training.droidwars.controller;

import ua.training.droidwars.model.Droid;
import ua.training.droidwars.model.kharchenko.Chugayster;
import ua.training.droidwars.model.kharchenko.HutsulDroid;
import ua.training.droidwars.model.kharchenko.Molfar;
import ua.training.droidwars.model.olesiiuk.ImpartialDroid;
import ua.training.droidwars.model.olesiiuk.MercifulDroid;
import ua.training.droidwars.model.olesiiuk.RestlessDroid;

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
