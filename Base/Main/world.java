package Main;
//this class contains the world

import java.awt.*;
import java.io.PrintStream;
import java.util.Random;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class world {
    JProgressBar Health = new JProgressBar();
    JProgressBar enemyHealth = new JProgressBar();
    int buttonChoice;
    boolean fleeTry = false;
    Random r = new Random();
    boolean combat = true;
    player chosenChar;
    Enemies currentEnemy;
    boolean running =true;
    FlowLayout theLayout = new FlowLayout();
    int stage = 0;
    int enemyHealthmax;

    JPanel controls = new JPanel();
    JFrame frame = new JFrame ("Phantom Fields");
    JButton button1 = new JButton("1");
    JButton button2 = new JButton("2");
    JButton button3 = new JButton("3");
    JButton button4 = new JButton("4");
    JLabel PHP = new JLabel("Your HP:");
    JLabel EHP = new JLabel(":Enemy HP");
    Enemies Warlock = new Enemies("Warlock", 10, 71, 184, 102, enemyHP(), 220, 12);
    Enemies Brute = new Enemies("Brute", 25, 168, 20, 60, enemyHP(), 0, 10);
    Enemies Elf = new Enemies("Dark Elf", 9, 50, 92, 41, enemyHP(), 105, 11);
    Enemies Vampire = new Enemies("Vampire", 12, 81, 105, 74, enemyHP(), 0, 13);
    Enemies Spriggan = new Enemies("Spriggan", 30, 170, 86, 110, enemyHP(), 127, 10);




    public void run() throws InterruptedException {



        player Witch = new player("Dahlia", "Witch", "Magic Missile", 5, 75, 75, 15);
        player Berzerker = new player("Grufrol", "Berzerker", "Crush", 10, 100,100,10);
        player Archer = new player("Taranath", "Archer", "Aimed Shot" ,7,85, 85, 12);
        running = true;
        enemyHealth.setValue(0);
        Health.setValue(0);
        if (chosenChar==null){
            System.out.println("1." + Witch + "\n");
            System.out.println("2." + Berzerker + "\n");
            System.out.println("3." + Archer + "\n");
        }

        while(stage == 0 && running){
            if (chosenChar==null){
                buttonPress();
                switch (buttonChoice){
                    case 1:
                        clearButton();
                        Thread.sleep(500);
                        chosenChar = Witch;
                        System.out.println("You chose: " + chosenChar.getName() + " the " + chosenChar.getClassType());
                        Thread.sleep(500);
                        System.out.println("\nYou have been chosen to deliver a message to your king. you must go through a dark gloomy forest.\nRival kingdoms spies are trying to intercept the message.\n");
                        stage ++;
                        break;
                    case 2:
                        clearButton();
                        Thread.sleep(500);
                        chosenChar = Berzerker;
                        System.out.println("You chose: " + chosenChar.getName() + " the " + chosenChar.getClassType());
                        Thread.sleep(500);
                        System.out.println("\nYou have been chosen to deliver a message to your king. you must go through a dark gloomy forest.\nRival kingdoms spies are trying to intercept the message.\n");
                        stage +=1;
                        break;
                    case 3:
                        clearButton();
                        chosenChar = Archer;
                        Thread.sleep(500);
                        System.out.println("You chose: " + chosenChar.getName() + " the " + chosenChar.getClassType());
                        Thread.sleep(500);
                        System.out.println("\nYou have been chosen to deliver a message to your king. you must go through a dark gloomy forest.\nRival kingdoms spies are trying to intercept the message.\n");
                        stage +=1;
                        break;
                }


            }//char select
            Thread.sleep(500);
            buttonPress();

        }

        Health.setToolTipText("HP :" + chosenChar.getHP());
        Health.setMaximum(chosenChar.getMaxHP());
        Health.setStringPainted(true);
        Health.setIndeterminate(true);
        Health.setIndeterminate(false);


        enemyHealth.setToolTipText("");
        enemyHealth.setStringPainted(true);
        enemyHealth.setIndeterminate(true);
        enemyHealth.setIndeterminate(false);
        enemyHealth.setValue(0);
        Health.setValue(chosenChar.getHP());
        Thread.sleep(1000);
        while (stage == 1 && running) {
            System.out.println("current stage = " + stage);
            randomEncounter();

        }
        while (stage == 2 && running) {
            System.out.println("current stage = " + stage);
            randomEncounter();

        }
        while (stage == 3 && running) {
            System.out.println("current stage = " + stage);
            randomEncounter();

        }
        while (stage == 4 && running) {
            System.out.println("current stage = " + stage);
            randomEncounter();

        }
        while (stage == 5 && running) {
            System.out.println("current stage = " + stage);
            randomEncounter();

        }
        while (stage == 6 && running) {
            System.out.println("current stage = " + stage);
            randomEncounter();

        }
        while (stage == 7 && running) {
            System.out.println("current stage = " + stage);
            randomEncounter();

        }
        while (stage == 8 && running) {
            System.out.println("current stage = " + stage);
            randomEncounter();

        }
        while (stage == 9 && running) {
            System.out.println("current stage = " + stage);
            System.out.println("you delivered the message to your king!\n\n");
            break;}
    }   //the core game
    public void randomEncounter() throws InterruptedException {
        if(stage == 8){
            randomizeEnemy();
            enemymaxHP();
            System.out.println("You can see the King's castle, and start running as fast as you can towards the castle. \nBut unfortunately " + currentEnemy + " runs up and catches you.\nThis time you can't flee as you are so close to the castle.\nDefeat the enemy!");
            startEncounter();
        }else {
            combat=true;
            int encounter = r.nextInt(4) + 1;
            clearButton();
            Thread.sleep(100);
            switch (encounter) {
                case 1 -> {
                    randomizeEnemy();
                    enemymaxHP();
                    enemyHealth.setToolTipText("EnemyHP :" + currentEnemy.getHP());
                    Thread.sleep(500);
                    System.out.println("As you are walking in the woods, A " + currentEnemy + " approaches, do you:\n");
                    System.out.println("\t1. Attack!\n\t2. Befriend\n\t3. Flee\n\n\t4. return to main menu");
                    Thread.sleep(500);
                    clearButton();
                    while (buttonChoice > 6) {
                        buttonPress();
                        switch (buttonChoice) {
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
                    }
                }   //random enemy walks to you
                case 2 -> {
                    randomizeEnemy();
                    enemymaxHP();
                    System.out.println("On your path you see a tavern, it looks as if there could be outlaws residing inside it.");
                    System.out.println("But, there could also be someone that can help you on your quest.");
                    System.out.println("Do you enter the tavern?:");
                    System.out.println("\t1.Yes\n\t2.No");
                    Thread.sleep(1000);
                    clearButton();
                    while (buttonChoice > 6) {
                        buttonPress();
                        switch (buttonChoice) {
                            case 1:
                                clearButton();
                                System.out.println("As you enter the tavern, you have the choice of talking to the barkeep or start a fight!");
                                System.out.println("\n1.Speak to the barkeep\n2.Pick a fight with someone in the bar");
                                Thread.sleep(1000);

                                clearButton();
                                while (buttonChoice > 6) {
                                    buttonPress();
                                    switch (buttonChoice) {
                                        case 1:
                                            clearButton();
                                            charm();
                                            break;
                                        case 2:
                                            clearButton();
                                            startEncounter();
                                            break;
                                    }
                                }
                                break;
                            case 2:
                                clearButton();
                                stage += 1;
                                break;

                        }
                    }
                }   //Tavern encounter
                case 3 -> {
                    randomizeEnemy();

                    enemymaxHP();
                    System.out.println("A farmer runs up to you, and asks for your help.\nHis farm is being attacked\n");
                    System.out.println("What would you like to do?");
                    System.out.println("\t1. Help!\n\t2. Try talking to the attacker\n\t3. Ignore his request");
                    Thread.sleep(1000);
                    clearButton();
                    while (buttonChoice > 6) {
                        buttonPress();
                        switch (buttonChoice) {
                            case 1:
                                clearButton();
                                startEncounter();
                                break;
                            case 2:
                                clearButton();
                                charm();
                                break;
                            case 3:
                                clearButton();
                                fleeAttempt();
                                break;
                        }
                    }
                }   //Farmer Encounter
                case 4 -> {
                    randomizeEnemy();
                    enemymaxHP();
                    System.out.println("A small child approaches, saying their mother has been captured by a monster and asks for your help.\n");
                    System.out.println("What would you like to do?");
                    System.out.println("\t1. Help!\n\t2. Try talking to the attacker\n\t3. Ignore their request");
                    Thread.sleep(1000);
                    clearButton();
                    while (buttonChoice > 6) {
                        buttonPress();
                        switch (buttonChoice) {
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
                    }
                }   //child encounter
            }
        }
    }   //encounter randomizer method
    public void startEncounter() throws InterruptedException {
        if(combat==true){
            HPupdate();
            Thread.sleep(1000);
            System.out.println("\n\t#The " + currentEnemy + " engages you in combat#\n");
            Thread.sleep(1000);
            Thread.sleep(1000);
            combatChoice();
            clearButton();
            clearButton();
            clearButton();
            HPupdate();
            Thread.sleep(100);
            while(currentEnemy.getHP() > 0 || chosenChar.getHP()> 0 ){
                buttonPress();
                HPupdate();
                switch (buttonChoice) {

                    case 1:
                        clearButton();
                        clearButton();
                        Thread.sleep(500);
                        System.out.println(">You attack the enemy with " + chosenChar.getAttackType() + " and deal " + chosenChar.getATK() + " damage\n");
                        currentEnemy.setHP(currentEnemy.getHP() - chosenChar.getATK());
                        if(currentEnemy.getHP()<= 0){
                            stage+=1;
                            int drop = r.nextInt(100)+1;
                            System.out.println(">You defeated the " + currentEnemy);
                            if(drop<chosenChar.getHPPotionDropChance()){
                                chosenChar.pickUpHealthPotion();
                                System.out.println(">and it dropped a healthpotion\nYou currently have " + chosenChar.getNumberHealthPotions() + " health-potions");
                            }
                            run();
                            break;
                        }
                        Thread.sleep(100);
                        Thread.sleep(100);
                        System.out.println(">" + currentEnemy + " retaliates and deals " + currentEnemy.getATK() + "damage\n");
                        chosenChar.setHP(chosenChar.getHP() - currentEnemy.getATK());
                        Thread.sleep(500);
                        if(chosenChar.getHP()<=0){
                            System.out.println(">You died!");
                            System.out.println(".");
                            Thread.sleep(500);
                            System.out.print(".");
                            Thread.sleep(500);
                            System.out.print(".");
                            Thread.sleep(500);
                            System.out.print(".");
                            Thread.sleep(500);
                            System.out.print(".");
                            returnToMain();
                            break;
                        }
                        HPupdate();
                        Thread.sleep(100);
                        Health.repaint();
                        combatChoice();
                        break;
                    case 2:
                        Thread.sleep(100);
                        clearButton();
                        chosenChar.useHealthPotion();
                        combatChoice();
                        break;
                    case 3:
                        Thread.sleep(100);
                        clearButton();
                        combatFleeAttempt();
                        break;
                    case 4:
                        returnToMain();
                        break;
                }continue;
            }
            if(currentEnemy.getHP() <= 0){
                stage++;
                int drop = r.nextInt(100)+1;

                if(drop<chosenChar.getHPPotionDropChance()){
                    chosenChar.pickUpHealthPotion();
                    Thread.sleep(100);
                    System.out.println("You defeated the " + currentEnemy + " and it dropped a healthpotion\nYou currently have " + chosenChar.getNumberHealthPotions() + " health-potions");
                    enemyHealth.setValue(0);
                    run();
                }
                System.out.println("You defeated the " + currentEnemy + " and progress further towards your goal.\n");
                enemyHealth.setValue(0);
                run();
            }if(chosenChar.getHP()<0){
                System.out.println(">You died!");
                System.out.println(".");
                Thread.sleep(500);
                System.out.print(".");
                Thread.sleep(500);
                System.out.print(".");
                Thread.sleep(500);
                System.out.print(".");
                Thread.sleep(500);
                System.out.print(".");
                returnToMain();
            }else if(combat==false){
                stage++;


            }
        }}  //combat encounter method with attacks etc.
    public void charm() throws InterruptedException {
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
    } //charm attempt method
    public void responseOnSuccess(){
        int lines = r.nextInt(3)+1;
        switch (lines){
            case 1:
                System.out.println("Please, I don't want to fight. I can show you the way forward.\n*he looks really frightened. shows you the right direction and runs off*\n");
                stage+=1;
                break;
            case 2:
                System.out.println("The king told me about you, he told me to show you the way forward.\n*he looks at you with honor, and shows you the direction you need to go*\n");
                stage+=1;
                break;
            case 3:
                System.out.println("Lets have a drink! After that I can show you the way forward.\n");
                System.out.println("*you both take a drink and after that you continue your journey*\n");
                stage+=1;
                break;

        }
    }   //charm success dialogue
    public void fleeAttempt() throws InterruptedException {
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
    }   //flee attempt method for normal flee.
    public void randomizeEnemy(){
        int enemy = r.nextInt(5);
        switch (enemy) {
            case 0 -> {currentEnemy = Warlock;}
            case 1 -> {currentEnemy = Brute;}
            case 2 -> {currentEnemy = Elf; }
            case 3 -> {currentEnemy = Vampire;}
            case 4 -> {currentEnemy = Spriggan;}
        }
        currentEnemy.setHP(enemyHP());
    }   //method for randomizing enemy
    public int enemyHP(){
        int randomHP = r.nextInt(40)+60;
        return randomHP;
    }       //enemy health randomizer
    public void combatFleeAttempt() throws InterruptedException {
        if (fleeTry == true){
            System.out.println("you cant try to flee again");
        }
        else if(fleeTry==false){
            String fortune;
            int diceRoll = r.nextInt(10)+1;
            if (diceRoll >= 8){
                fortune = "2";
            }else{
                fortune = "1";
            }
            switch (fortune) {
                case "1":
                    Thread.sleep(500);
                    System.out.println("Your diceroll was " + diceRoll + " and you need 8 or higher to succeed");
                    System.out.println(currentEnemy + " You failed to flee!\n");
                    chosenChar.setHP(chosenChar.getHP() - currentEnemy.getATK());
                    Thread.sleep(500);
                    System.out.println(currentEnemy + " hits you for " + currentEnemy.getATK());
                    if(chosenChar.getHP()>0){
                        combatChoice();
                    }
                    fleeTry = true;
                    break;
                case "2":
                    Thread.sleep(500);
                    System.out.println("Your diceroll was " + diceRoll + " and you need 8 or higher to succeed");
                    Thread.sleep(500);
                    System.out.println("You successfully fled!\n");
                    Thread.sleep(500);
                    fleeTry = true;
                    stage++;
                    break;
            }}
    }   //flee attempt method for combat
    public void buttonPress(){
        button1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buttonChoice = 1;
            }});
        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buttonChoice = 2;
            }});
        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buttonChoice = 3;
            }});
        button4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buttonChoice = 4;
            }});
    }   //action event listener for pressing buttons on GUI
    public void clearButton() throws InterruptedException {
        if(buttonChoice<5){
            buttonChoice = 100;
            Thread.sleep(10);
        }
    }   //clears button choice
    public void showGUI(){
        frame.setLayout(theLayout);
        theLayout.setAlignment(FlowLayout.LEADING);
        JTextArea textArea = new JTextArea (25, 80);
        textArea.setEditable (false);
        textArea.setLineWrap(true);
        controls.setLayout(new FlowLayout());
        Container contentPane = frame.getContentPane ();
        contentPane.setLayout (new FlowLayout());


        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        controls.add(PHP);
        controls.add(Health);
        controls.add(button1);
        controls.add(button2);
        controls.add(button3);
        controls.add(button4);
        controls.add(enemyHealth);
        controls.add(EHP);
        contentPane.add (
                new JScrollPane (
                        textArea,
                        JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                        JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED));
        contentPane.add (controls);
        frame.pack ();
        frame.setVisible (true);

        JTextAreaOutputStream out = new JTextAreaOutputStream (textArea);
        System.setOut (new PrintStream(out));
        frame.setBounds(40,40,920,500);
        frame.setResizable(false);
    }   //Starts the GUI
    public void HPupdate(){
        Health.setValue(chosenChar.getHP());
        Health.setToolTipText("HP :" + chosenChar.getHP());
        Health.invalidate();
        Health.validate();
        Health.repaint();
        enemyHealth.setToolTipText("HP :" + currentEnemy.getHP());
        enemyHealth.setValue(currentEnemy.getHP());
        enemyHealth.invalidate();
        enemyHealth.validate();
        enemyHealth.repaint();
    }  //validates healthbars
    public void enemymaxHP(){
        enemyHealthmax = currentEnemy.getHP();
        enemyHealth.setMaximum(enemyHealthmax);
    } //GUI setting enemy health-bar to maximum
    public void returnToMain() throws InterruptedException {
        System.out.println(">returning to Main Menu");
        chosenChar = null;
        stage = 0;
        run();

    }
    public void combatChoice(){
        System.out.println("What do you want to do?\n");
        System.out.println("\t1.Attack!");
        System.out.println("\t2.Use Health-Potion");
        System.out.println("\t3.Flee\n\n");
        System.out.println("\t4.restart game!\n");
    }



}
