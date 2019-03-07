package ir.hamidvand.Shooting;

public class Soldier {
    private int id;
    private int score1;
    private int score2;
    private int score3;
    private int score4;
    private int finalScore;
    private int initailRank;
    private int finalRank;

    public Soldier(int id, int score1, int score2, int score3, int score4, int finalScore, int initailRank,int finalRank) {
        this.id = id;
        this.score1 = score1;
        this.score2 = score2;
        this.score3 = score3;
        this.score4 = score4;
        this.finalScore = finalScore;
        this.initailRank = initailRank;
        this.finalRank = finalRank;
    }

    public int getId() { return this.id; }

    public int getScore1() {
        return this.score1;
    }

    public int getScore2() {
        return this.score2;
    }

    public int getScore3() {
        return this.score3;
    }

    public int getScore4() {
        return this.score4;
    }

    public int getFinalScore() { return this.finalScore = this.score1 + this.score2 + this.score3 + this.score4; }

    public int getInitailRank() { return this.initailRank; }

    public int getFinalRank() { return this.finalRank = changeRank(); }


    public int changeRank() {
        if (this.finalScore >= 28 && this.initailRank==3) {
            this.finalRank=3;
        }
        else if(this.finalScore >= 28 && this.initailRank==2){
            this.finalRank=3;
        }
        else if(this.finalScore >= 28 && this.initailRank==1){
            this.finalRank=2;
        }
        else if(this.finalScore < 28 && this.initailRank==1){
            this.finalRank=1;
        }
        else if(this.finalScore < 28 && this.initailRank==2){
            this.finalRank=1;
        }
        else if(this.finalScore < 28 && this.initailRank==3){
            this.finalRank=2;
        }
        return this.finalRank;
    }

}
