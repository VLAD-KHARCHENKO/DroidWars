package ua.training.droidwars;

import ua.training.droidwars.controller.Arena;
import ua.training.droidwars.model.HutsulDroid;

public class Main {

    public static void main(String[] args) {
        Arena arena = new Arena();
        arena.start();
                   //гуцул боти
        HutsulDroid hutzulkaKsena = new HutsulDroid("hutsulkaKsena", 5, 15, 30);
        HutsulDroid droidShtefko = new HutsulDroid("Shtefko", 20, 30, 70);
        HutsulDroid chugayster = new HutsulDroid("Chugayster", 30, 50, 95);

    }
}