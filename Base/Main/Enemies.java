package Main;
import java.util.Random;
//this class contains the enemy constructor
public class Enemies {
    Random r = new Random();
    private String name;
    private int armor;
    private int str;
    private int wis;
    private int agi;
    private int HP;
    private int MP;
    private int ATK;
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
    public int getHP() {
        return HP;
    }
    public void setHP(int HP) {
        this.HP = HP;
    }
    public int getATK() {
        return ATK;
    }
    public void setATK(int ATK) {
        this.ATK = ATK;
    }
    public int getArmor() {
        return armor;
    }
    public void setArmor(int armor) {
        this.armor = armor;
    }

    public String toString() {
        return name ;
    }
}