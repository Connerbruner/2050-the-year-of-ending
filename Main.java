import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Tools tools = new Tools();
        Game game = new Game();
        System.gc();
        //Debug stuff
        game.grabSave();
        //clears the screen
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Scanner scanner = new Scanner(System.in);
        tools.setTSpeed(20);
        //main starts here
        String cheatcode = "";
        cheatcode = scanner.nextLine();
        if (cheatcode.equals("gay")) {
            tools.isGay = true;
        }

        tools.sPrintln(Tools.Colors.GREEN.label + "The text is currently at a speed of 20, if you lower that number it will speed up the text, if you raise the number it will move slower");
        tools.sPrint("what should the text speed be?   ");
        tools.setTSpeed(scanner.nextInt());
        System.out.println();

        tools.sPrintln(Tools.Colors.RED.label + "This game does not condone any violence. This is a work of fiction, and any resemblance to characters, real or fictional, is a coincidence.");
        System.out.flush();
        game.game();


    }
}