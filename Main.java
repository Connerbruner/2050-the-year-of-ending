import java.util.Scanner;
import java.lang.SecurityManager;
class Main
{
    public static void main(String[] args) {
    Game game = new Game();
    SecurityManager sec = new SecurityManager();
    System.out.println(sec.getSecurityContext());
    sec.checkRead("Save.txt");
    System.out.println("Save found and no SecurityException");
    game.grabSave(); 
    System.out.print("\033[H\033[2J");  
    System.out.flush();
    Scanner scanner = new Scanner(System.in);
    game.print_slow("The text is currently at a speed of 20, if you lower that number it will speed up the text, if you raise the number it will move slower");
    System.out.println("what should the text speed be?   ");

    game.speed = scanner.nextInt();
    System.out.println();

    game.print_slow("This game does not condone any violence. This is a work of fiction, and any resemblance to characters, real or fictional, is a coincidence.");
    game.game();


  }
}