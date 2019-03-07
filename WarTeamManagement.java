package ir.hamidvand.Shooting;

import java.util.Random;

public class WarTeamManagement {
    private static int testResult;

    public static int getTestResult() {
        return testResult;
    }

    public static void startOperation() {
        //-------------
        WarTeam myWarTeam = new WarTeam("Operation Mersad");
        //-------------
        BattlefieldOfficer battlefieldOfficer = new BattlefieldOfficer("Reza Hamidvand");
        //-------------
        Soldier[] soldiers = new Soldier[15];
        //-------------
        myWarTeam.setBattlefieldofficer(battlefieldOfficer);
        //-------------
        for (int i = 0; i < 15; i++) {
            soldiers[i] = new Soldier(i, scorepoints(i), scorepoints(i), scorepoints(i), scorepoints(i), i, initailRank(i), i);
        }
        myWarTeam.setSoldier(soldiers);
        //-------------
        battlefieldOfficer.printSoldiersList(myWarTeam.getSoldier());
        testResult = battlefieldOfficer.getTestResult();
    }

    public static int initailRank(int i) {
        Random rand = new Random();
        // Obtain a number between [1,2,3].
        int i1 = rand.nextInt(3);
        // Add 1 to the result to get a number from the required range
        // (i.e., [1,2,3]).
        return i1 + 1;
    }

    public static int scorepoints(int i) {
        Random rand = new Random();
        // Obtain a number between [0 - 10].
        int i1 = rand.nextInt(11);
        // Add 1 to the result to get a number from the required range
        // (i.e., [0 - 10]).
        return i1;
    }
}




