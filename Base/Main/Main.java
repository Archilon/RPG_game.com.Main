package Main;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        boolean mainMenu = true;
        Scanner sc = new Scanner(System.in);
        world r= new world();
        while(mainMenu) {
            System.out.println("\n\n\tPress any button to continue\n\tOr x to exit game");
            String mm = sc.nextLine();
            if(mm.contains("x")){
                mainMenu=false;

                System.out.println("Shutting down");
            }else{
                r.run();}
        }


        // write your code here
    }
}
