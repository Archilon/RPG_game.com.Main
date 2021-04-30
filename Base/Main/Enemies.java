package Main;
import java.util.Random;
//this class contains enemies
public class Enemies {
    Random r = new Random();

    private String name;
    //private String race;
    //private String klass;
    private int str;
    private int wis;
    private int agi;
    private int HP;
    private int MP;
    private int ATK;


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

    public Enemies(String n, int s, int w, int a, int hp, int mp, int atk){

        this.name = n;
        // this.race = r;
        //this.klass = k;
        //this.age = a;
        this.str = s;
        this.wis = w;
        this.agi = a;
        this.HP = hp;
        this.MP = mp;
        this.ATK = atk;
    }
    int randomHP = r.nextInt(100)+60;
    Enemies Warlock = new Enemies("Warlock", 71, 184, 102, randomHP, 220, 17);
    Enemies Brute = new Enemies("Brute",168, 20, 60, randomHP, 0, 10);
    Enemies Elf = new Enemies("Dark Elf",50, 92, 41, randomHP, 105, 14);
    @Override
    public String toString() {
        return "Enemies{" +
                "name='" + name + '\'' +
                ", str=" + str +
                ", wis=" + wis +
                ", agi=" + agi +
                ", HP=" + HP +
                ", MP=" + MP +
                ", ATK=" + ATK +
                '}';
    }



    }
