import java.util.Scanner;

class Main {

    public static void main ( String[] args ) {
        System.out.println( );
        Tools tools = new Tools( );
        Game game = new Game( );
        //clears the screen
        
        Scanner scanner = new Scanner( System.in );
        tools.setTSpeed( 20 );
        //main starts here
        //cheat code start
        tools.sPrint(tools.SCREEN_CLEAR);
        tools.sPrint( "ENTER CHEAT CODE (or not)" );
        String cheatCode;
        cheatCode = scanner.nextLine( );
        if ( cheatCode.equals( "gay" ) ) {
            tools.isGay = true;
        } else if (cheatCode.equals("backwards")) {
            tools.isBackwards = true;
        } else if (cheatCode.equals("Roomba")) {
            tools.isRoomba = true;
        } else if (cheatCode.equals("or not")) {
            Crash crash = new Crash();
        }
        //cheat code end
        tools.sPrintln( Tools.GREEN + "The text is currently at a speed of 20, if you lower that number it will speed up the text, if you raise the number it will move slower" );
        tools.sPrint( "what should the text speed be?   " );
        tools.setTSpeed( scanner.nextInt( ) );
        System.out.println( );
        tools.sPrintln( Tools.RED + "This game does not condone any violence. This is a work of fiction, and any resemblance to characters, real or fictional, is a coincidence." );
        System.out.println("BEGIN LOADING IN 3");
        tools.wait(500);
        System.out.println("BEGIN LOADING IN 2");
        tools.wait(500);
        System.out.println("BEGIN LOADING IN 1");
        tools.wait(500);
        game.grabSave( );
        tools.loading( );
        System.out.println("LOAD COMPLETE");
        tools.wait(1000);
        System.out.println(tools.SCREEN_CLEAR);
        System.out.flush();
        game.game( );


    }
    
}