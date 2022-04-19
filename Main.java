import java.util.Scanner; 
class Main {
Enter enter = new Enter();
Attack attack = new Attack();
Text text = new Text();
Emmi emmi = new Emmi();
Dungon dungon = new Dungon();
Scanner scanner = new Scanner(System.in);
int missionnum = 10;
    
  public static void main(String[] args) {
      Enter enter = new Enter();
      System.out.println();
      System.out.println();
      Scanner scanner = new Scanner(System.in);

enter.print_slow("The text is currently at a speed of 20, if you lower that number it will speed up the text, if you raise the number it will move slower");
System.out.println("what should the text speed be?   ");
      
enter.speed = scanner.nextInt();   
System.out.println();

enter.print_slow("This game does not condone any violence. This is a work of fiction, and any resemblance to characters, real or fictional, is a coincidence.");



  }

public void game()
{
    /*boss.bill_HP = 300;
  boss.ellon_HP = 150;
  boss.target = 0;
  boss.Tri_HP = 1000;
  boss.Mark_Zuckerberg=2000;*/
  attack.HP1=attack.HP1m;
  attack.HP2=attack.HP2m;
  attack.mp1=100;
  while (true)
  {String choice="STR";
      enter.print_slow("Type 1 -> "+missionnum+" to try that Mission");
      enter.print_slow();
    if (missionnum>1)
    {
    enter.print_slow("Type 'exp' to trade exp for new moves");
    enter.print_slow("which Mission would you like to try?   ");
    choice=scanner.nextLine();
    enter.print_slow("");
    }
if (choice == "1")
{
       enter.print_slow("Mission 1: The Awakening of  The Revolution");
        if(enter.skip())
        {
         text.misson1_1();
         text.misson1_2();
        }
        dungon.dungon1();
        
        if(enter.skip())
        {
         text.misson1_3();
        }
        text.misson1_4();
    
        if (missionnum<2)
        {
        missionnum=2;
        enter.print_slow("MISSION 2 UNLOCKED");
        emmi.emmi_type="NOT";
        }
}

    if ((choice == "2")&&(missionnum>=2))
        enter.print_slow("Mission 2: First Encounters");
        skip=input("Skip cutscene?   ");
        if skip!="yes":
         text.misson2_1();
        dungon.dungon2();
        skip=input("Skip cutscene?   ");
        if skip!="yes":
         text.misson2_2();
        boss.boss_bill();
        skip=input("Skip cutscene?   ");
        if skip!="yes":
         text.misson2_3();
        if missionnum<3:
         missionnum=3;
         enter.print_slow("MISSION 3 UNLOCKED");

    if ((missionnum >= 3) && (choice == "3"))
      {
        enter.print_slow("MISSION 3: Rest In The Rubble");
        if(enter.skip())
        {
         text.misson3_1();   
        }
        dungon.dungon3();

        if(enter.skip())
        {
         text.misson3_2();   
        }
        boss.ellon_musk();
        
        if(enter.skip())
        {
         text.misson3_3(); 
        }
        dungon.dungon4();
    
       if(enter.skip())
       {
         text.misson3_4();   
       }
       if (missionnum<4)
          {
           missionnum=4;
           enter.print_slow("MISSION 4 UNLOCKED");
          }
       enter.print_slow("MISSION 3 END");
      }
    if ((missionnum >= 4)&&(choice == "4"))
       enter.print_slow("Mission 4: 101 battles");
       skip=input("Skip cutscene?   ");
       if skip!="yes":
        text.misson4_1();
       dungon.dungon5();
       skip=input("Skip cutscene?   ");
       if skip!="yes":
        text.misson4_2();
       if missionnum<5:
           missionnum=5;
           enter.print_slow("MISSON 5 UNLOCKED");
    if missionnum >= 5 and choice; == "5":
        enter.print_slow("Mission 5: Rematch Squared");
        skip=input("Skip cutscene?   ");
        if skip!="yes":
         text.misson5_1();
        dungon.dungon6();
        skip=input("Skip cutscene?   ");
        if skip!="yes":
         text.misson5_2();
        boss.double_boss();
        if missionnum<6:
           missionnum=6;
           enter.print_slow("MISSION 6 UNLOCKED");
    if missionnum >= 6 and choice; == "6":
        enter.print_slow("Mission 6: The Smoking Gun");
        text.misson6_1();
        dungon.dungon8();
        text.misson6_2();
        if missionnum<7:
           missionnum=7;
           enter.print_slow("MISSION 7 UNLOCKED");
    if missionnum >= 7 and choice; == "7":
        enter.print_slow("Mission 7: The Rules Of The Roomba");
        skip=input("Skip cutscene?   ");
        if skip!="yes":
         text.misson7_1();
        dungon.dungon7();
        skip=input("Skip cutscene?   ");
        if skip!="yes":
         text.misson7_2();
         if missionnum<8:
           missionnum=8;
           enter.print_slow("MISSION 8 UNLOCKED");
    if missionnum >= 8 and choice; == "8":
        enter.print_slow("MISSION 8 When I Step off");
        text.misson8_1();
        dungon.dungon8();
        text.misson8_2();
        if missionnum<9:
           missionnum=9;
           enter.print_slow("MISSION 9 UNLOCKED");
    if missionnum >= 9 and choice; == "9":
        enter.print_slow("Mission 9: Face-Off On The Grand Tower");
        text.misson9_1();
        boss.boss_rush();
        text.misson9_2();
        if missionnum<9:
           missionnum=9;
           enter.print_slow("MISSION 9 UNLOCKED");
    if missionnum >= 10 and choice; == "10":
        enter.print_slow("Misson 10: 2 Sides Of The Same Coin");
        text.misson10_1();
        boss.final()
        text.misson10_2();
        enter.print_slow("THE END?");
    
    if choice == "exp" and missionnum;>1:
        gotcha.pull1();
  }
}
  
}