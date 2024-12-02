
public class Main {
    public static void main(String[] args) {
//        Charactor player1 = new Charactor("Gongz");
//        Charactor player2 = new Charactor("Dinosour");

//        player1.printStats();
//        System.out.println("-----------------------------------");
//        player1.getExperience(200);
//        player1.printStats();
//
//        lab3.Sword s1 = new lab3.Sword(5,3,"Doran Blade");
//        player1.equip(new lab3.Shield(5,3,"Doran lab3.Shield"));
//        player1.equip(s1);
//        player1.printStats();
//        s1.swordLevelUp();
//        System.out.println("-----------------------------------");
//        player1.printStats();


//        player2.attack(player1);
//        player1.equip(new lab3.Sword(10, 10, "Damascus"));
//        player1.attack(player2);
//        System.out.println("-----------------------------------");
//        player1.printStats();
//        System.out.println("-----------------------------------");
//        player2.printStats();
        Mage mage1 = new Mage("InwMage");
        Thief thief1 = new Thief("ThiefZa");
        Charactor dummy1 = new Charactor("Dummy1");
        Charactor dummy2 = new Charactor("Dummy2");


//        mage1.thunderBolt(thief1);
//        System.out.println("-------------------------------------");
//        mage1.fireBall(dummy1,dummy2);
//        System.out.println("-------------------------------------");
//        mage1.increaseInt();
//        mage1.thunderBolt(thief1);

//        thief1.hide();
//        thief1.show();
//        System.out.println("-------------------------------------");
//        thief1.doubleAttack(dummy1);
//        System.out.println("-------------------------------------");
//        thief1.rob(dummy1);

        ThiefBoots boots = new ThiefBoots("Thief Boots",1,0.5);
//        System.out.println(boots.getJobRequirement());
//        System.out.println(boots.getLevelRequirement());
//        System.out.println(boots.getMoveSpeed());
//        System.out.println("----------------------------------------");
//
//        thief1.printStats();
//        System.out.println("----------------------------------------");
//        thief1.equip(boots);
//        thief1.getExperience(10);
//        thief1.equip(boots);
//        thief1.getAccessory().useSkill();
//        thief1.printStats();

        MageNecklace necklace1 = new MageNecklace("n1",2,1);
        System.out.println(necklace1.getJobRequirement());
        System.out.println(necklace1.getLevelRequirement());
        System.out.println(necklace1.getIntIncrease());
        System.out.println("----------------------------------------");

        mage1.equip(necklace1);
        mage1.getExperience(20);
        mage1.equip(necklace1);
        mage1.equip(boots);

        System.out.println("----------------------------------------");
        mage1.printStats();
        System.out.println("----------------------------------------");
        mage1.takeDamage(20);
        mage1.getAccessory().useSkill();
        mage1.printStats();
    }
}