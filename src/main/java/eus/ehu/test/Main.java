package eus.ehu.test;

import eus.ehu.business_logic.BlFacade;
import eus.ehu.business_logic.BlFacadeImpl;

public class Main {
    public static void main(String[] args) {

        BlFacade bl = new BlFacadeImpl();

        //Pilotoak pilots taulan gorde
        bl.storePilot("Lewis Hamilton", "British", 380);
        bl.storePilot("Yuki Tsunoda", "Japanese", 80);
        bl.storePilot("Lando Norris", "British", 200);
        bl.storePilot("Carlos Sainz", "Spanish", 300);
        bl.storePilot("Charles Leclerc", "Monegasque", 360);
        bl.storePilot("Sergio Perez", "Mexican", 350);
        bl.storePilot("Fernando Alonso", "Spanish", 160);


        bl.getPilotsByNationality("British").forEach(System.out::println);
    }
}
