public class MageNecklace implements Accessory,Necklace{
    private String name;
    private String jobRequire = "MAGE";
    private int levelRequire ;
    private int intIncrease;
    private Charactor owner;

    public MageNecklace(String name,int levelRequire,int intIncrease ) {
        this.name = name;
        this.levelRequire = levelRequire;
        this.intIncrease = intIncrease;
    }

    @Override
    public void hpRecover() {
        System.out.println("recovering.....");
        owner.HP += 1;
    }

    @Override
    public void equip(Charactor charactor) {
        this.owner = charactor;
    }

    @Override
    public int getLevelRequirement() {
        return levelRequire;
    }


    @Override
    public String getJobRequirement() {
        return jobRequire;
    }

    @Override
    public int getIntIncrease() {
        return intIncrease;
    }

    @Override
    public void useSkill(){
       hpRecover();
    }

}
