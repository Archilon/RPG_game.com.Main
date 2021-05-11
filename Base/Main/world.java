package Main;
//this class contains the world
import java.util.Random;
import java.util.Scanner;
public class world {
    Scanner sc = new Scanner(System.in);
    Random r = new Random();
    boolean combat = true;
    player chosenChar;
    Enemies currentEnemy;
    boolean running =true;
    int stage = 0;

    Enemies Warlock = new Enemies("Warlock", 10, 71, 184, 102, enemyHP(), 220, enemyATK());
    Enemies Brute = new Enemies("Brute", 25, 168, 20, 60, enemyHP(), 0, enemyATK());
    Enemies Elf = new Enemies("Dark Elf", 9, 50, 92, 41, enemyHP(), 105, enemyATK());
    Enemies Vampire = new Enemies("Vampire", 12, 81, 105, 74, enemyHP(), 0, enemyATK());
    Enemies Spriggan = new Enemies("Spriggan", 30, 170, 86, 110, enemyHP(), 127, enemyATK());
    public void run() {

        player Witch = new player("Dahlia", "Witch", "Magic Missile", 0.93, 85, 75, 15);
        player Berzerker = new player("Grufrol", "Berzerker", "Crush", 0.85, 100,100,10);
        player Archer = new player("Taranath", "Archer", "Aimed Shot" ,0.90,90, 85, 12);
        running = true;
        System.out.println("Welcome to Phantom Fields...\n");
        System.out.println("Choose your character:\n");
        while(stage == 0 && running){
            System.out.println("\t1.Witch: magical caster, less health than others but deals more damage.");
            System.out.println("\t2.Berzerker: a brute with less brain and more muscle. High health.");
            System.out.println("\t3.Archer: agile and stealthy. Decent damage, decent health.\n");
            String choice = sc.nextLine();
            if(choice.contains("1")||choice.contains("2")||choice.contains("3") ){
                switch (choice) {
                    case "1":
                        chosenChar = Witch;
                        stage +=1;
                        break;
                    case "2":
                        chosenChar = Berzerker;
                        stage +=1;
                        break;
                    case "3":
                        chosenChar = Archer;
                        stage +=1;
                        break;
                }
            }else{
                System.out.println("Invalid choice");
            }
        } //char select


        System.out.println("You chose: " + chosenChar);
        System.out.println("\nYou have been chosen to deliver a message to your king. you must go through a dark gloomy forest.\nRival kingdom's spies are trying to intercept the message.\n");
        while (stage == 1 && running) {
            randomEncounter();
            /*
            randomizeEnemy();
            System.out.println("As you start your journey. A " + currentEnemy + " approaches, do you:\n");
            System.out.println("\t1. Attack!\n\t2. Befriend\n\t3. Flee");
            int combatStart = sc.nextInt();
            if (combatStart > 0 && combatStart < 4) {
                switch (combatStart) {
                    case 1:
                        startEncounter();
                        break;
                    case 2:
                        charm();
                        break;
                    case 3:
                        fleeAttempt();
                        break;
                }
            } else {
                System.out.println("Thank you for playing.");
                running = false;
            }*/

        }
        while (stage == 2 && running){
            randomEncounter();
            /*
            randomizeEnemy();
            System.out.println("On your path you see a tavern, it looks as if there could be outlaws residing inside it.");
            System.out.println("But, there could also be someone that can help you on your quest.");
            System.out.println("Do you enter the tavern?:");
            System.out.println("\t1.Yes\n\t2.No");
            int combatStart = sc.nextInt();
            if (combatStart > 0 && combatStart < 3) {
                switch (combatStart) {
                    case 1:
                        System.out.println("As you enter the tavern, you have the choice of talking to the barkeep or start a fight!");
                        System.out.println("\n1.Speak to the barkeep\n2.Pick a fight with someone in the bar");
                        int choice = sc.nextInt();
                        if (choice > 0 && choice < 3) {
                            switch (choice) {
                                case 1:
                                    charm();
                                    break;
                                case 2:
                                    startEncounter();
                                    break;
                            }}
                        break;
                    case 2:
                        stage+=1;
                        break;

                }
            } else {
                System.out.println("Thank you for playing.");
                running = false;
            }*/

        }
        while (stage == 3 && running) {
            randomEncounter();
            /*
            randomizeEnemy();
            System.out.println("A farmer runs up to you, and asks for your help.\nHis farm is being attacked\n");
            System.out.println("What would you like to do?");
            System.out.println("\t1. Help!\n\t2. Try talking to the attacker\n\t3. Ignore his request");
            int combatStart = sc.nextInt();
            if (combatStart > 0 && combatStart < 4) {
                switch (combatStart) {
                    case 1:
                        startEncounter();
                        break;
                    case 2:
                        charm();
                        break;
                    case 3:
                        fleeAttempt();
                        break;
                }
            } else {
                System.out.println("Thank you for playing.");
                running = false;
            }*/

        }
        while (stage == 4 && running) {
            randomEncounter();}
        while (stage == 5 && running) {
            randomEncounter();}
        while (stage == 6 && running) {
            randomEncounter();}
        while (stage == 7 && running) {
            randomEncounter();}
        while (stage == 8 && running) {
            randomEncounter();}
        while (stage == 9 && running) {
            System.out.println("you delivered the message to your king!");
            running=false;
            run();
        }

    }
    public void randomEncounter(){
        if(stage<8){
            int enemy = r.nextInt(4)+1;
            switch (enemy) {
                case 1 -> {
                    randomizeEnemy();
                    System.out.println("As you are walking in the woods, A " + currentEnemy + " approaches, do you:\n");
                    System.out.println("\t1. Attack!\n\t2. Befriend\n\t3. Flee");
                    int combatStart = sc.nextInt();
                    if (combatStart > 0 && combatStart < 4) {
                        switch (combatStart) {
                            case 1:
                                startEncounter();
                                break;
                            case 2:
                                charm();
                                break;
                            case 3:
                                fleeAttempt();
                                break;
                        }
                    } else {
                        System.out.println("Thank you for playing.");
                        running = false;
                    }
                }   //random enemy walks to you
                case 2 -> {
                    randomizeEnemy();
                    System.out.println("On your path you see a tavern, it looks as if there could be outlaws residing inside it.");
                    System.out.println("But, there could also be someone that can help you on your quest.");
                    System.out.println("Do you enter the tavern?:");
                    System.out.println("\t1.Yes\n\t2.No");
                    int combatStart = sc.nextInt();
                    if (combatStart > 0 && combatStart < 3) {
                        switch (combatStart) {
                            case 1:
                                System.out.println("As you enter the tavern, you have the choice of talking to the barkeep or start a fight!");
                                System.out.println("\n1.Speak to the barkeep\n2.Pick a fight with someone in the bar");
                                int choice = sc.nextInt();
                                if (choice > 0 && choice < 3) {
                                    switch (choice) {
                                        case 1:
                                            charm();
                                            break;
                                        case 2:
                                            startEncounter();
                                            break;
                                    }}
                                break;
                            case 2:
                                stage+=1;
                                break;

                        }
                    } else {
                        System.out.println("Thank you for playing.");
                        running = false;
                    }}   //Tavern encounter
                case 3 -> {
                    randomizeEnemy();
                    System.out.println("A farmer runs up to you, and asks for your help.\nHis farm is being attacked\n");
                    System.out.println("What would you like to do?");
                    System.out.println("\t1. Help!\n\t2. Try talking to the attacker\n\t3. Ignore his request");
                    int combatStart = sc.nextInt();
                    if (combatStart > 0 && combatStart < 4) {
                        switch (combatStart) {
                            case 1:
                                startEncounter();
                                break;
                            case 2:
                                charm();
                                break;
                            case 3:
                                fleeAttempt();
                                break;
                        }}}   //Farmer Encounter
                case 4 -> {
                    randomizeEnemy();
                    System.out.println("A small child approaches, saying their mother has been captured by a monster and asks for your help.\n");
                    System.out.println("What would you like to do?");
                    System.out.println("\t1. Help!\n\t2. Try talking to the attacker\n\t3. Ignore their request");
                    int combatStart = sc.nextInt();
                    if (combatStart > 0 && combatStart < 4) {
                        switch (combatStart) {
                            case 1:
                                startEncounter();
                                break;
                            case 2:
                                charm();
                                break;
                            case 3:
                                fleeAttempt();
                                break;
                        }}}//child monster encounter
                case 5 -> {
                    randomizeEnemy();
                    System.out.println("Merchants are being attacked and robbed within your view.\n");
                    System.out.println("What would you like to do?");
                    System.out.println("\t1. Help!\n\t2. Try talking to the attacker\n\t3. Ignore them");
                    int combatStart = sc.nextInt();
                    if (combatStart > 0 && combatStart < 4) {
                        switch (combatStart) {
                            case 1:
                                startEncounter();
                                break;
                            case 2:
                                charm();
                                break;
                            case 3:
                                fleeAttempt();
                                break;
                        }}} //merchant atk encounter
            }}else if(stage == 8){
            randomizeEnemy();
            System.out.println("You can see the King's castle, and start running as fast as you can towards the castle. \nBut unfortunately " + currentEnemy + " runs up and catches you.\nThis time you can't flee as you are so close to the castle.\nDefeat the enemy!");
            startEncounter();
        }
    }
    public void startEncounter(){
        combat=true;
        System.out.println("The " + currentEnemy + " engages you in combat!\n");
        while(currentEnemy.getHP() > 0 || chosenChar.getHP() > 0){
            System.out.println(currentEnemy + " currently has " + currentEnemy.getHP());
            System.out.println("and you currently have " + chosenChar.getHP());
            System.out.println("What do you want to do?\n");
            System.out.println("\t1.Attack!");
            System.out.println("\t2.Defend!");
            System.out.println("\t3.Use Health-Potion");
            System.out.println("\t4.Flee");

            int combatChoice = sc.nextInt();
            if (combatChoice > 0 && combatChoice < 5){
                switch (combatChoice) {
                    case 1:
                        System.out.println("You attack the enemy with " + chosenChar.getAttackType() + " and deal " + chosenChar.getATK() + " damage\n");
                        currentEnemy.setHP(currentEnemy.getHP() - chosenChar.getATK());
                        if(currentEnemy.getHP()<0){
                            break;
                        }
                        System.out.println(currentEnemy + " retaliates and deals " + currentEnemy.getATK() + "damage\n");
                        chosenChar.setHP(chosenChar.getHP() - currentEnemy.getATK());
                        break;
                    case 2:
                        chosenChar.setHP(chosenChar.getHP()-(currentEnemy.getATK()*chosenChar.getArmor()));
                        break;
                    case 4:
                        combatFleeAttempt();
                        break;
                    case 3:
                        chosenChar.useHealthPotion();
                        break;
                } }else{
                System.out.println("Invalid choice");
            }if(currentEnemy.getHP() <= 0){
                int drop = r.nextInt(100)+1;
                if(drop<chosenChar.getHPPotionDropChance()){
                    chosenChar.pickUpHealthPotion();
                    System.out.println("You defeated the " + currentEnemy + " and it dropped a healthpotion\nYou currently have: " + chosenChar.getNumberHealthPotions() + " health-potions.");
                }
                System.out.println("You defeated the " + currentEnemy + " and progress further towards your goal.\n");
                stage++;
                break;
            }else if(chosenChar.getHP()<0){
                System.out.println(">You died!");
                System.out.println(">Returning to Main Menu");
                stage = 0;
                running=false;
                break;
            }else if(combat==false){
                stage++;
                break;
            }
        }
    }
    public void charm(){
        String fortune;
        int diceRoll = r.nextInt(10)+1;
        if (diceRoll < 4){
            fortune = "1";
        }else{
            fortune = "2";
        }
        switch (fortune) {
            case "1":
                System.out.println("\t>Your diceroll was " + diceRoll + " and you need 4 or higher to succeed.");
                System.out.println("\t>You failed to befriend the enemy!\n");
                startEncounter();
                break;
            case "2":
                System.out.println("\t>Your diceroll was " + diceRoll + " and you need 4 or higher to succeed.");
                System.out.println("\t>You successfully befriended the enemy!\n");
                responseOnSuccess();
                break;

        }
    }
    public void responseOnSuccess(){
        int lines = r.nextInt(3)+1;
        switch (lines){
            case 1:
                System.out.println("Please, I don't want to fight. I can show you the way forward.\n*he looks really frightened. shows you the right direction and runs off*\n");
                stage++;
                break;
            case 2:
                System.out.println("The king told me about you, he told me to show you the way forward.\n*he looks at you with honor, and shows you the direction you need to go*\n");
                stage++;
                break;
            case 3:
                System.out.println("Lets have a drink! After that I can show you the way forward.\n");
                System.out.println("*you both take a drink and after that you continue your journey*\n");
                stage++;
                break;

        }
    }
    public void fleeAttempt(){
        String fortune;
        int diceRoll = r.nextInt(10)+1;
        if (diceRoll < 2){
            fortune = "1";
        }else{
            fortune = "2";
        }
        switch (fortune) {
            case "1":
                System.out.println("Your diceroll was " + diceRoll + " and you need 3 or higher to succeed");
                System.out.println(currentEnemy + " Chased you and caught you!\n");
                startEncounter();
                break;
            case "2":
                System.out.println("Your diceroll was " + diceRoll + " and you need 3 or higher to succeed");
                System.out.println("You successfully fled!\n");
                stage ++;
                break;
        }
    }
    public void randomizeEnemy(){
        int enemy = r.nextInt(5);
        switch (enemy) {
            case 0 -> {currentEnemy = Warlock;}
            case 1 -> {currentEnemy = Brute;}
            case 2 -> {currentEnemy = Elf; }
            case 3 -> {currentEnemy = Vampire;}
            case 4 -> {currentEnemy = Spriggan;}
        }}
    public int enemyHP(){
        int randomHP = r.nextInt(40)+60;
        return randomHP;
    }
    public int enemyATK(){
        int randomATK = r.nextInt(10)+3;
        return randomATK;
    }
    public void combatFleeAttempt(){
        String fortune;
        int diceRoll = r.nextInt(10)+1;
        if (diceRoll >= 8){
            fortune = "1";
        }else{
            fortune = "2";
        }
        switch (fortune) {
            case "1":
                System.out.println("Your diceroll was " + diceRoll + " and you need 8 or higher to succeed");
                System.out.println(currentEnemy + " Chased you and caught you!\n");
                break;
            case "2":
                System.out.println("Your diceroll was " + diceRoll + " and you need 8 or higher to succeed");
                System.out.println("You successfully fled!\n");
                combat=false;
                break;
        }
    }

}
