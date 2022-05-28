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
        sPrintln("???: Hello, Welcome to Last breath of the Billionares");
        sPrintln("???: Please enter a cheat code");
        sPrint( "ENTER CHEAT CODE (or not)" );
        
        //cheat code start
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
        //cheat code end
        isDiscord = choice("Are you a part of the discord server? ");

        sPrintln( RED + "This game does not condone any violence. This is a work of fiction, and any resemblance to characters, real or fictional, is a coincidence." );
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