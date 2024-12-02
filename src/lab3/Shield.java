package lab3;

public class Shield {
    private int shieldEff;
    private int shieldLevel = 1;
    private int shieldIncrement;
    private String shieldName;
    public Shield(int shieldEff, int shieldIncrement, String shieldName) {
        this.shieldEff = shieldEff;
        this.shieldIncrement = shieldIncrement;
        this.shieldName = shieldName;
    }

    public void shieldLevelUp() {
        shieldLevel++;
        shieldEff += shieldIncrement ;
    }

    public int getShieldEff() {
        return shieldEff;
    }
    public int getShieldLevel() {
        return shieldLevel;
    }
    public int getShieldIncrement() {
        return shieldIncrement;
    }
    public String getShieldName() {
        return shieldName;
    }
}
