import java.util.Scanner;
import java.util.Random;
class Enter
{

Scanner scanner = new Scanner(System.in);
int speed=20;
//print method
public void print_slow(String str)
{
    for(int i=0; i<str.length(); i++)
    {
    System.out.print(str.substring(i,i+1));    
    wait(speed);
    }
    System.out.println("");
    System.out.println("");
    System.out.print("> enter <");
    scanner.nextLine();
}
//wait method
	public void wait(int time) {
		long startTime = System.currentTimeMillis();
		while (startTime + time > System.currentTimeMillis())
			;
	}
public int random(int high,int low)
{
Random r = new Random();
int range = high - low + 1;
return (int)(Math.random() * range) + low;
}

public void restart()
{
    print_slow("GAME OVER");
    print_slow("???: You seem to be overwhelmed");
    print_slow("???: I may be able to help");
    print_slow("???: Your only hope now is to turn back the hands of time");
    print_slow("2077:I see nothing wrong with that");
    print_slow("2069: Please help us");
    String choice="How are you doing";
    while (choice!="START")
    {
        print_slow("Type ¨START¨ to continue     ");
        choice=scanner.nextLine();
    }
    print_slow("");
    print_slow("PUT GAME HERE");
}
public boolean skip()
{
    print_slow("Skip cutscene?   ");
    String skip=scanner.nextLine();
    if (skip!="yes")
    {
        return true;   
    }
    else
    {
        return false;
    }
}
}
