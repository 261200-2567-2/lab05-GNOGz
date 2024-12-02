package lab3;

public class Sword {
    private int swordDamage;
    private int swordLevel = 1;
    private int swordIncrement;
    private String swordName;
    Sword(int damage, int increment,String name) {
        this.swordDamage = damage;
        this.swordIncrement = increment;
        this.swordName = name;
    }
    public void swordLevelUp(){
        this.swordLevel++;
        this.swordDamage += this.swordIncrement;
    }
    public int getSwordDamage() {
        return swordDamage;
    }
    public int getSwordLevel() {
        return swordLevel;
    }
    public int getSwordIncrement() {
        return swordIncrement;
    }
    public String getSwordName() {
        return swordName;
    }
}
