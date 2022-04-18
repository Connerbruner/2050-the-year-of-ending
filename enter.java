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
    enter.print_slow("GAME OVER")
    enter.print_slow("???: You seem to be overwhelmed")
    enter.print_slow("???: I may be able to help")
    enter.print_slow("???: Your only hope now is to turn back the hands of time")
    enter.print_slow("2077:I see nothing wrong with that")
    enter.print_slow("2069: Please help us")
    choice="How are you doing"
    while (choice!="START")
    {
    choice=input("Type ¨START¨ to continue     ")
    }
    print()
   print("PUT GAME HERE")
}
public bolean skip()
{
    enter.print_slow("Skip cutscene?   ");
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
