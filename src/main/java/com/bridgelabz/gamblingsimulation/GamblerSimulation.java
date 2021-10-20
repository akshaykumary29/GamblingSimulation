package com.bridgelabz.gamblingsimulation;

/**
 * Gambling Simulation Problem
 */
public class GamblerSimulation {
    public static void main(String[] args) {
        System.out.println("Welcome To the Gambler Simulation Program");
        GamblerSimulation g = new GamblerSimulation();
        g.startGame();
    }

    void startGame() {
        // variable
        int everyDayStake = 100;
        int everyDayBet = 1;
        System.out.println("The start with a stake:" + everyDayStake);
        System.out.println("The start with a bet:" + everyDayBet);
    }
}
