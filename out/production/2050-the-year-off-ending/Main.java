import java.util.Scanner;
import java.lang.SecurityManager;
class Main
{
    public static void main(String[] args) {
        Game game = new Game();
        System.gc();
        //Debug stuff
        System.out.println("Save found and no SecurityException");
        game.grabSave();
        //clears the screen
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Scanner scanner = new Scanner(System.in);
        game.print_slow(game.GREEN + "The text is currently at a speed of 20, if you lower that number it will speed up the text, if you raise the number it will move slower");
        System.out.println("what should the text speed be?   ");

        game.speed = scanner.nextInt();
        System.out.println();
    }}