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
    int randomHP = r.nextInt(40)+60;
    Enemies Warlock = new Enemies("Warlock", 10, 71, 184, 102, randomHP, 220, 17);
    Enemies Brute = new Enemies("Brute", 25, 168, 20, 60, randomHP, 0, 10);
    Enemies Elf = new Enemies("Dark Elf", 9, 50, 92, 41, randomHP, 105, 14);
    Enemies Vampire = new Enemies("Vampire", 12, 81, 105, 74, randomHP, 0, 16);
    Enemies Spriggan = new Enemies("Spriggan", 30, 170, 86, 110, randomHP, 127, 18);
    public void run() {




        player Witch = new player("Dahlia", "Witch", "Magic Missile", 0.93, 75, 75, 15);
        player Berzerker = new player("Grufrol", "Berzerker", "Crush", 0.85, 100,100,10);
        player Archer = new player("Taranath", "Archer", "Aimed Shot" ,0.90,85, 85, 12);
        running = true;
        while(stage == 0 && running){
            System.out.println("Welcome to Phantom Fields...\n");
            System.out.println("Choose your character:\n");
            System.out.println("\t1.Witch: magical caster, less health than others but deals more damage");
            System.out.println("\t2.Berzerker: a brute with less brain and more muscle. high health");
            System.out.println("\t3.Archer: agile and stealthy.decent damage, decent health.\n");
            int choice = sc.nextInt();
            if(choice > 0 && choice < 4 ){
                switch (choice) {
                    case 1:
                        chosenChar = Witch;
                        stage +=1;
                        break;
                    case 2:
                        chosenChar = Berzerker;
                        stage +=1;
                        break;
                    case 3:
                        chosenChar = Archer;
                        stage +=1;
                        break;
                }
            }
        }


        System.out.println("You chose: " + chosenChar);
        System.out.println("\nYou have been chosen to deliver a message to your king. you must go through a dark gloomy forest.\nRival kingdoms spies are trying to intercept the message.\n");
        while (stage == 1 && running) {
            int enemy = r.nextInt(3)+1;
            switch (enemy) {
                case 1:
                    currentEnemy = Warlock;
                    stage +=1;
                    break;
                case 2:
                    currentEnemy = Brute;
                    stage +=1;
                    break;
                case 3:
                    currentEnemy = Elf;
                    stage +=1;
                    break;
                case 4:
                    currentEnemy = Vampire;
                    stage +=1;
                    break;
                case 5:
                    currentEnemy = Spriggan;
                    stage +=1;
                    break;
            }


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
            }

        }
        while (stage == 2 && running){
            int enemy = r.nextInt(3)+1;
            switch (enemy) {
                case 1:
                    currentEnemy = Warlock;
                    stage +=1;
                    break;
                case 2:
                    currentEnemy = Brute;
                    stage +=1;
                    break;
                case 3:
                    currentEnemy = Elf;
                    stage +=1;
                    break;

            }

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
            }

        }

    }

    public void startEncounter(){
        combat = true;
        System.out.println("\nThe " + currentEnemy + " engages you in combat\n");
        while(currentEnemy.getHP() > 0 || chosenChar.getHP() > 0 && combat){
            System.out.println(currentEnemy + " currently has " + currentEnemy.getHP());
            System.out.println("and you currently have " + chosenChar.getHP());
            System.out.println("What do you want to do?\n");
            System.out.println("\t1.Attack!");
            System.out.println("\t2.Defend!");
            System.out.println("\t3.Flee\n");
            int combatChoice = sc.nextInt();
            if (combatChoice > 0 && combatChoice < 4){
                switch (combatChoice) {
                    case 1:
                        System.out.println("You attack the enemy with " + chosenChar.getAttackType() + " and deal " + chosenChar.getATK() + " damage\n");
                        currentEnemy.setHP(currentEnemy.getHP() - chosenChar.getATK());
                        System.out.println(currentEnemy + " retaliates and deals " + currentEnemy.getATK() + "damage\n");
                        chosenChar.setHP(chosenChar.getHP() - currentEnemy.getATK());
                        break;
                    case 2:
                        chosenChar.setHP(chosenChar.getHP()-(currentEnemy.getATK()*chosenChar.getArmor()));
                        break;
                    case 3:
                        fleeAttempt();
                        break;
                } }else{
                System.out.println("Invalid choice");
            }if(currentEnemy.getHP() < 0){
                System.out.println("You defeated the " + currentEnemy + " and progress further towards your goal.");
                stage += 1;
            }else if(chosenChar.getHP()<0){
                System.out.println("You died!");
                running=false;
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
                System.out.println("Your diceroll was " + diceRoll + " and you need 4 or higher to succeed.");
                System.out.println("You failed to befriend the enemy!");
                startEncounter();
                break;
            case "2":
                System.out.println("Your diceroll was " + diceRoll + " and you need 4 or higher to succeed.");
                System.out.println("You successfully befriended the enemy!");
                responseOnSuccess();
                break;

        }
    }
    private void responseOnSuccess(){
        int lines = r.nextInt(4)+1;
        switch (lines){
            case 1:
                System.out.println("Please, I don't want to fight. I can show you the way forward.");
                stage += 1;
                break;
            case 2:
                System.out.println("The king told me about you, he told me to show you the way forward.");
                stage += 1;
                break;
            case 3:
                System.out.println("Lets have a drink! After that I can show you the way forward.");
                stage += 1;
                break;

        }
    }
    public void fleeAttempt(){
        String fortune;
        int diceRoll = r.nextInt(10)+1;
        if (diceRoll < 3){
            fortune = "1";
        }else{
            fortune = "2";
        }
        switch (fortune) {
            case "1":
                System.out.println("Your diceroll was " + diceRoll + " and you need 3 or higher to succeed");
                System.out.println(currentEnemy + " Chased you and caught you!");
                startEncounter();
                break;
            case "2":
                System.out.println("Your diceroll was " + diceRoll + " and you need 3 or higher to succeed");
                System.out.println("You successfully fled!");
                combat = false;
                stage += 1;
                break;
        }
    }
    public void randomizeEnemy(){
        while (running) {
            int enemy = r.nextInt(5)+1;
            switch (enemy) {
                case 1:
                    currentEnemy = Warlock;
                    stage +=1;
                    break;
                case 2:
                    currentEnemy = Brute;
                    stage +=1;
                    break;
                case 3:
                    currentEnemy = Elf;
                    stage +=1;
                    break;
                case 4:
                    currentEnemy = Vampire;
                    stage +=1;
                    break;
                case 5:
                    currentEnemy = Spriggan;
                    stage +=1;
                    break;

            }

        }
    }}
