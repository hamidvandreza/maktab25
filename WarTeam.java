package ir.hamidvand.Shooting;

public class WarTeam {
    private String title;
    private BattlefieldOfficer battlefieldofficer;
    Soldier[] soldier;

    public WarTeam(String title) {
        this.title = title;
    }

    public void setBattlefieldofficer(BattlefieldOfficer battlefieldofficer) {
        this.battlefieldofficer = battlefieldofficer;
    }

    public void setSoldier(Soldier[] soldier) {
        this.soldier = soldier;
    }

    public Soldier[] getSoldier() {
        return soldier;
    }

}
