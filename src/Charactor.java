import lab3.Shield;
import lab3.Sword;

public class Charactor {
    Stat status;
    protected int HP;
    protected int MP;
    protected int attackDmg;
    protected int defense;
    protected double speed;
    protected boolean isVisible = true;

    protected String name;
    protected int experience;
    protected int level;
    protected int expCap;

    protected Sword swordEquip;
    protected Shield shieldEquip;
    Charactor(String name) {
        status = new Stat(10, 10, 10, 10);
        this.experience = 0;
        this.expCap = 10;
        calculateStat();
        this.name = name;
    }

    protected void calculateStat() {
        this.HP = (status.getVit() * 10);
        this.MP = 50 + (status.getInt() * 3);
        this.attackDmg = 30 + status.getAtk();
        this.defense = 5 + (status.getVit() / 5);
        this.speed = 4 + (0.5 * status.getAgi());
    }

    public void equip(Sword sword) {
        this.swordEquip = sword;
    }

    public void equip(Shield shield) {
        this.shieldEquip = shield;
     }


    public void printStats() {
        System.out.println("Name: " + this.name);
        System.out.println("HP: " + this.HP);
        System.out.println("MP: " + this.MP);
        System.out.println("attackDmg: " + this.attackDmg);
        System.out.println("defense: " + this.defense);
        System.out.println("speed: " + this.speed);
        System.out.println("experience: " + this.experience);

        if (this.swordEquip != null || this.shieldEquip != null) {
            System.out.println("Equipments : ");
            if (this.swordEquip != null) {
                System.out.println("lab3.Sword : " + this.swordEquip.getSwordName());
                System.out.println("Attack + " + this.swordEquip.getSwordDamage());
            }
            if (this.shieldEquip != null) {
                System.out.println("lab3.Shield : " + this.shieldEquip.getShieldName());
                System.out.println("Defense + " + this.shieldEquip.getShieldEff());
            }
        }
        else{
            System.out.println("No equipment.");
        }
    }

    public void getExperience(int amount) {
        this.experience += amount;
        checkLevelUp();
    }

    private void checkLevelUp() {
        while (this.experience >= this.expCap) {
            this.experience -= this.expCap;
            this.expCap += level * 15;
            this.levelUp();
        }
    }

    private void levelUp() {
        System.out.println(this.name + " level up.");
        this.level++;
        this.status = new Stat(10 + level, 10 + level, 10 + level, 10 + level);
        calculateStat();
    }

    protected void takeDamage(int damageTaken) {
        int totalDefense = this.defense;
        if (this.shieldEquip != null) {
            totalDefense += this.shieldEquip.getShieldEff();
        }
        System.out.println(this.name + " took " + (Math.abs(damageTaken - totalDefense)) + " damage.");
        this.HP -= Math.abs(damageTaken - totalDefense);
    }

    public void attack(Charactor target) {
        System.out.println(this.name + " attacked " + target.name);
        int totalDamage = this.attackDmg;
        if (this.swordEquip != null) {
            totalDamage += this.swordEquip.getSwordDamage();
        }
        target.takeDamage(totalDamage);
    }


}
