public class Mage extends Charactor implements MageSkillSet{
    String job = "MAGE";
    Accessory accessory;

    public Mage(String name){
        super(name);
    }

    @Override
    public void fireBall(Charactor target1, Charactor target2) {
        System.out.println(super.name + " using fireball");
        target1.takeDamage(super.status.getInt()*2+15);
        target2.takeDamage(super.status.getInt()*2+15);
    }

    @Override
    public void thunderBolt(Charactor target1) {
        System.out.println(super.name + " using thunderbolt");
        target1.takeDamage(super.status.getInt()*2+25);
    }

    @Override
    public void increaseInt(){
        super.status = new Stat(super.status.getAtk(),super.status.getVit(),super.status.getAgi(),super.status.getInt()+10);
        super.calculateStat();
    }

    public void equip(Accessory acc){
        if (this.job.equals(acc.getJobRequirement())
                && super.level >= acc.getLevelRequirement()
        ){
            this.accessory = acc;
            acc.equip(this);
            System.out.println("Acc equiped.");
        }
        else{
            System.out.println("Can't equip this accessory.");
        }
    }

    public Accessory getAccessory(){
        return this.accessory;
    }
}
