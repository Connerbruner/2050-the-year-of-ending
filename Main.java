import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        System.out.println(  );
        Tools tools = new Tools();
        Game game = new Game();
        //Debug stuff
        game.grabSave();
        //clears the screen
        System.out.print("\033[H\033[2J");
        System.out.flush();
        Scanner scanner = new Scanner(System.in);
        tools.setTSpeed(20);
        //main starts here
        tools.sPrint("ENTER CHEAT CODE (or not)");
        String cheatCode;
        cheatCode = scanner.nextLine();
        if (cheatCode.equals("gay")) {
            tools.isGay = true;
        }

        tools.sPrintln(Tools.GREEN + "The text is currently at a speed of 20, if you lower that number it will speed up the text, if you raise the number it will move slower");
        tools.sPrint("what should the text speed be?   ");
        tools.setTSpeed(scanner.nextInt());
        System.out.println();

        tools.sPrintln(Tools.RED + "This game does not condone any violence. This is a work of fiction, and any resemblance to characters, real or fictional, is a coincidence.");
        System.out.flush();
        game.game();


    }
}