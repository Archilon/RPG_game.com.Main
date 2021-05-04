package Main;
//this class contains the enemy constructor
public class Enemies {

    private String name;
    private double armor;
    private int str;
    private int wis;
    private int agi;
    private double HP;
    private int MP;
    private double ATK;

    public int getStr() {
        return str;
    }
    public void setStr(int str) {
        this.str = str;
    }

    public int getWis() {
        return wis;
    }
    public void setWis(int wis) {
        this.wis = wis;
    }

    public int getAgi() {
        return agi;
    }
    public void setAgi(int agi) {
        this.agi = agi;
    }

    public double getHP() {
        return HP;
    }
    public void setHP(double HP) {
        this.HP = HP;
    }

    public double getATK() {
        return ATK;
    }
    public void setATK(double ATK) {
        this.ATK = ATK;
    }

    public double getArmor() {
        return armor;
    }
    public void setArmor(double armor) {
        this.armor = armor;
    }

    public Enemies(String n, int ar, int s, int w, int a, int hp, int mp, int atk){

        this.name = n;
        this.armor = ar;
        this.str = s;
        this.wis = w;
        this.agi = a;
        this.HP = hp;
        this.MP = mp;
        this.ATK = atk;
    }


    public String toString() {
        return name ;
    }

    }
