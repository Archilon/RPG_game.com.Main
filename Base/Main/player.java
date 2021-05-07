package Main;
//this class contains the player constructor
public class player {
    private String attackType;
    private String name;
    private String classType;
    private double armor;
    private double HP;
    private double maxHP;
    private double ATK;
    private int numberHealthPotions = 3;
    private double healthPotion = 25.0;
    private int HPPotionDropChance = 25;

    //int lvl;
    //double xp;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getClassType() {
        return classType;
    }
    public void setClassType(String classType) {
        this.classType = classType;
    }

    public double getHP() {
        return HP;
    }
    public void setHP(double HP) {
        this.HP = HP;
    }

    public double getArmor() {
        return armor;
    }
    public void setArmor(double armor) {
        this.armor = armor;
    }

    public double getATK() {
        return ATK;
    }
    public void setATK(int ATK) {
        this.ATK = ATK;
    }

    public int getNumberHealthPotions(){
        return numberHealthPotions;
    }            //getter for number of healthpotions
    public void useHealthPotion(){
        if (HP == maxHP) {
            System.out.println("You are currently at max HP, no potions used.");
        }else if(numberHealthPotions > 0) {
            this.HP = HP + healthPotion;
            numberHealthPotions--;

            System.out.println("\t>You used a health-potion, healing yourself by " + healthPotion + " you currently have: " + numberHealthPotions + " potions left\n");
            healthCheck();
        }else{
            System.out.println("\t>You don't have any health-potions left.\n");
        }
    }           //method for using healthpotions
    public void pickUpHealthPotion(){
        numberHealthPotions++;}
    public void healthCheck(){
        if(HP>maxHP){
            HP=maxHP;
            System.out.println("\t>you healed to max HP\n");

        }


    }
    public int getHPPotionDropChance(){
        return HPPotionDropChance;

    }

    public String getAttackType() {
        return attackType;

    }
    public void setAttackType(String attackType) {
        this.attackType = attackType;
    }

    public player(String n, String c, String at, double ar,double hp, double mHP, double atk){
        this.attackType = at;
        this.name = n;
        this.classType = c;
        this.armor = ar;
        this.HP = hp;
        this.maxHP = mHP;
        this.ATK = atk;
    }


    public String toString() {
        return name + " The " + classType;
    }










}
