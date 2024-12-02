public class ThiefBoots implements Accessory, Boots {
    private String name;
    private String jobRequire = "THIEF";
    private int levelRequire ;
    private double moveSpeed;
    private Charactor owner;

    public ThiefBoots(String name,int levelRequire,double moveSpeed ) {
        this.name = name;
        this.levelRequire = levelRequire;
        this.moveSpeed = moveSpeed;
    }


    @Override
    public String getJobRequirement() {
        return "THIEF";
    }

    @Override
    public int getLevelRequirement() {
        return this.levelRequire;
    }


    public void equip(Charactor charactor) {
        this.owner = charactor;
    }

    @Override
    public void sprint() {
        owner.speed += moveSpeed;
        System.out.println("Gotta go fast!");
    }

    @Override
    public double getMoveSpeed() {
        return moveSpeed;
    }
    @Override
    public void useSkill(){
        sprint();
    }


}
