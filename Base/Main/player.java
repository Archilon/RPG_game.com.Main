package Main;
//this class contains the player character
public class player {
    private String name;
    private String classType;
    private int age;
    private int str;
    private int wis;
    private int agi;
    private int HP;
    private int MP;
    private int ATK;
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

        public int getAge() {
        return age;
    }
        public void setAge(int age) {
        this.age = age;
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

        public int getMP() {
        return MP;
    }
        public void setMP(int MP) {
        this.MP = MP;
    }

        public int getATK() {
        return ATK;
    }
        public void setATK(int ATK) {
        this.ATK = ATK;
    }

    public player(String n, String c, int a, int s, int w, int ag, int hp, int mp, int atk){

        this.name = n;
        this.classType = c;
        this.age = a;
        this.str = s;
        this.wis = w;
        this.agi = ag;
        this.HP = hp;
        this.MP = mp;
        this.ATK = atk;
    }

    player addNameLater = new player("name", "witch", 30, 10,89,20,100,200,15);
    player addNameLater2 = new player("name2","berzerker", 45, 91,5, 15,150,0,10);
    player addNameLater3 = new player("name3", "archer", 20, 12, 20, 79, 100, 0, 15);












}