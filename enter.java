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


}
