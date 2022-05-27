import java.util.Scanner;

class Main extends Game {
    
    public static void main ( String[] args ) {
      
        Main main = new Main();
        main.play();
    }
    public void play()
    {
        Scanner scanner = new Scanner( System.in );
        setTSpeed( 20 );
        //main starts here
        System.out.print(SCREEN_CLEAR);
        //cheat code start
        sPrint( "ENTER CHEAT CODE (or not)" );
        String cheatCode;
        cheatCode = scanner.nextLine( );
        if ( cheatCode.equals( "gay" ) ) {
            isGay = true;
        } else if (cheatCode.equals("backwards")) {
            isBackwards = true;
        } else if (cheatCode.equals("Roomba")) {
            isRoomba = true;
        } else if (cheatCode.equals("or not")) {
            run.exit(69420);
        }
        isDiscord = choice("Are you a part of the discord server? ");
        //cheat code end
        sPrintln( GREEN + "The text is currently at a speed of 20, if you lower that number it will speed up the text, if you raise the number it will move slower" );
        sPrint( "what should the text speed be?   " );
        setTSpeed( scanner.nextInt( ) );
        System.out.println( );
        sPrintln( RED + "This game does not condone any violence. This is a work of fiction, and any resemblance to characters, real or fictional, is a coincidence." );
        System.out.println("BEGIN LOADING IN 3");
        wait(500);
        System.out.println("BEGIN LOADING IN 2");
        wait(500);
        System.out.println("BEGIN LOADING IN 1");
        wait(500);
        grabSave( );
        loading( );
        System.out.println("LOAD COMPLETE");
        wait(1000);
        System.out.println(SCREEN_CLEAR);
        System.out.flush();
        double passedTime = (double)(System.currentTimeMillis()/3600000)-login;
        if(passedTime>0)
        {
            int total = (int)(passedTime*missionNum*2);
            sPrintln("Last login was "+passedTime+" Hours ago Earned: "+total+" exp");
            exp1+=total;
            save();
            if(isDiscord)
            {
                C+=total;
            }
        }
        game( );
    }
    
}