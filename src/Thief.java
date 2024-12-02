public class Thief extends Charactor implements ThiefSkillSet{
    Accessory accessory;
    String job = "THIEF";
    public Thief(String name){
        super(name);
    }
    public void hide(){
        super.isVisible = false;
        System.out.println(super.name + " become invisible");
    }
    public void show(){
        super.isVisible = true;
        System.out.println(super.name + " become visible");
    }

    public void doubleAttack(Charactor enemy) {
        System.out.println(super.name + " using double attack!");
        super.attack(enemy);
        super.attack(enemy);
    }

    @Override
    public void rob(Charactor target) {
        System.out.println(super.name + " is Robbing " + target.name);
        if(Math.random() < 0.4){
            System.out.println("Rob successful got 1 item");
        }
        else {
            System.out.println("Failed to rob T-T");
        }
    }

    public void equip(Accessory acc){
        if (this.job.equals(acc.getJobRequirement())
                && super.level >= acc.getLevelRequirement()
        ){
            this.accessory = acc;
            accessory.equip(this);
            System.out.println("Acc equipped.");
        }
        else{
            System.out.println("Can't equip this accessory.");
        }
    }
    public Accessory getAccessory(){
        return this.accessory;
    }
}
