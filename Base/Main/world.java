package Main;
//this class contains the world
import java.util.Random;
import java.util.Scanner;
public class world {
    Scanner sc = new Scanner(System.in);
    Random r = new Random();
    boolean running =true;
    boolean proceed =true;
    int stage = 0;
    public void run() {
        running = true;

        System.out.println("Welcome to Phantom Fields..");
        while (stage == 1 && running) {
            System.out.println("A stranger approaches, do you:");
            System.out.println("\n1. Attack!\n2. Befriend\n3. Flee");
            int combatStart = sc.nextInt();
            if (combatStart > 0 && combatStart < 4) {
                switch (combatStart) {
                    case 1 -> startEncounter();
                    case 2 -> charm();
                    case 3 -> fleeAttempt();
                }
            } else {
                System.out.println("Thank you for playing.");
                running = false;
            }

        }
        proceed = true;
        while (proceed){
            System.out.println("test");
            proceed = false;
        }
    }
    public void startEncounter(){

    stage +=1;
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
            case "1" -> {
                System.out.println("Your diceroll was " + diceRoll + " and you need 4 or higher to succeed.");
                System.out.println("You failed to befriend the enemy!");
                startEncounter();
            }
            case "2" -> {
                System.out.println("Your diceroll was " + diceRoll + " and you need 4 or higher to succeed.");
                System.out.println("You successfully befriended the enemy!");
                stage += 1;
            }
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
            case "1" -> {
                System.out.println("your diceroll was " + diceRoll + " and need 3 or higher to succeed");
                System.out.println("you failed to flee");
                startEncounter();
            }
            case "2" -> {
                System.out.println("your diceroll was " + diceRoll + " and need 3 or higher to succeed");
                System.out.println("you successfully fled!");
                stage += 1;
            }
        }
    }
}
