package ir.hamidvand.Shooting;

public class BattlefieldOfficer {
    private String name;
    private int testResult;

    public BattlefieldOfficer(String name) {
        this.name = name;
    }


    public void printSoldiersList(Soldier[] soldiers) {
        int count = 0;
        for (Soldier soldier : soldiers) {
            System.out.println("Soldier ID: [" + soldier.getId() + "]");
            System.out.println(" \t Bullet 1: [" + soldier.getScore1() + "]");
            System.out.println(" \t Bullet 2: [" + soldier.getScore2() + "]");
            System.out.println(" \t Bullet 3: [" + soldier.getScore3() + "]");
            System.out.println(" \t Bullet 4: [" + soldier.getScore4() + "]");
            System.out.println("\n  \t Final Score: [" + soldier.getFinalScore() + "]");
            System.out.println("  \t Initial Rank: [" + soldier.getInitailRank() + "]");
            System.out.println("  \t Final Rank: [" + soldier.getFinalRank() + "]");
            System.out.println("\n*********************************");
            System.out.println("\ntaghir dadaaaam :))))");

            if (soldier.getFinalRank() == 1) {
                count++;
            }
        }
        this.testResult = (count * 100) / 15;
        System.out.println("********** Test Result **********");
        System.out.println(this.testResult + "% \n");
        System.out.println("yani bzanam tu saret");
    }
   public int getTestResult() {
        return this.testResult;
    }


}

