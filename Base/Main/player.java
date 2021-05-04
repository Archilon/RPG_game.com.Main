package Main;

import java.util.ArrayList;

//this class contains the player constructor
public class player {
    private String attackType;
    private String name;
    private String classType;
    private double armor;
    private double HP;
    private Double maxHP;
    private double ATK;
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
