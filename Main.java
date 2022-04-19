import java.util.Scanner;
import java.util.Random;
class Main {
int emmi_HP = 0;
int emmi_level = 0;
int hit=0;   
int damage = 0;
int attack1_power=1;
int attack2_power=1;
int move_tier=0;
int mp1 = 100;
int HP1 = 35;
int HP1m = 50;
int HP2 = 35;
int HP2m = 50;
int max_hit = 4;
int hit = 0;
int missionnum = 10;
int bill_HP = 300;
int ellon_HP = 150;
int target = 0;
int Tri_HP = 1000;
int Mark_Zuckerberg=300;
int attack1_1mp = 0;
int attack1_2mp = 10;
int attack1_3mp = 15;
int attack1_4mp = 20;
int attack1_teir = 1;
int attack2_teir= 1;
int attack3_teir = 1;
int attack4_teir= 1;
int level1 = 1;
int level2 = 1;
int exp1 = 0;
int exp2 = 0;
int levelr1 = 20;
int levelr2 = 20;
int bonus = 0;
int dungon_lenght = 0;
int dungon_level = 0;
String attack1_1 = "charge";
String attack1_2 = "lasershot";
String attack1_3 = "cure";
String attack1_4 = "ember";
String customspace_1="     ";
String customspace_2="  ";
String customspace_3="       ";
String customspace_4="      ";
String emmi_type = "";
//place  Holders
int num=0;
int damage=0;
//obj
Scanner scanner = new Scanner(System.in);


    
public static void main(String[] args) {
  
    System.out.println();
    System.out.println();
print_slow("The text is currently at a speed of 20, if you lower that number it will speed up the text, if you raise the number it will move slower");
System.out.println("what should the text speed be?   ");
      
speed = scanner.next(int)();   
System.out.println();

print_slow("This game does not condone any violence. This is a work of fiction, and any resemblance to characters, real or fictional, is a coincidence.");



  }

public void game()
{
    /*boss.bill_HP = 300;
  boss.ellon_HP = 150;
  boss.target = 0;
  boss.Tri_HP = 1000;
  boss.Mark_Zuckerberg=2000;*/
  HP1=HP1m;
  HP2=HP2m;
  mp1=100;
  while (true)
  {String choice="STR";
      print_slow("Type 1 -> "+missionnum+" to try that Mission");
      print_slow("");
    if (missionnum>1)
    {
    print_slow("Type 'exp' to trade exp for new moves");
    print_slow("which Mission would you like to try?   ");
    choice=scanner.nextLine();
    print_slow("");
    }
if (choice == "1")
{
       print_slow("Mission 1: The Awakening of  The Revolution");
        if(skip())
        {
         text.misson1_1();
         text.misson1_2();
        }
        dungon.dungon1();
        
        if(skip())
        {
         text.misson1_3();
        }
        text.misson1_4();
    
        if (missionnum<2)
        {
        missionnum=2;
        print_slow("MISSION 2 UNLOCKED");
        emmi.emmi_type="NOT";
        }
}

    if ((choice == "2")&&(missionnum>=2))
        print_slow("Mission 2: First Encounters");
        skip=input("Skip cutscene?   ");
        if(skip())
         text.misson2_1();
        dungon.dungon2();
        skip=input("Skip cutscene?   ");
        if(skip())
         text.misson2_2();
        boss.boss_bill();
        skip=input("Skip cutscene?   ");
        if(skip())
         text.misson2_3();
        if missionnum<3:
         missionnum=3;
         print_slow("MISSION 3 UNLOCKED");

    if ((missionnum >= 3) && (choice == "3"))
      {
        print_slow("MISSION 3: Rest In The Rubble");
        if(skip())
        {
         text.misson3_1();   
        }
        dungon.dungon3();

        if(skip())
        {
         text.misson3_2();   
        }
        boss.ellon_musk();
        
        if(skip())
        {
         text.misson3_3(); 
        }
        dungon.dungon4();
    
       if(skip())
       {
         text.misson3_4();   
       }
       if (missionnum<4)
          {
           missionnum=4;
           print_slow("MISSION 4 UNLOCKED");
          }
       print_slow("MISSION 3 END");
      }
    if ((missionnum >= 4)&&(choice == "4"))
       print_slow("Mission 4: 101 battles");
       skip=input("Skip cutscene?   ");
       if(skip())
        text.misson4_1();
       dungon.dungon5();
       skip=input("Skip cutscene?   ");
       if(skip())
        text.misson4_2();
       if missionnum<5:
           missionnum=5;
           print_slow("MISSON 5 UNLOCKED");
    if missionnum >= 5 and choice; == "5":
        print_slow("Mission 5: Rematch Squared");
        skip=input("Skip cutscene?   ");
        if(skip())
         text.misson5_1();
        dungon.dungon6();
        skip=input("Skip cutscene?   ");
        if(skip())
         text.misson5_2();
        boss.double_boss();
        if missionnum<6:
           missionnum=6;
           print_slow("MISSION 6 UNLOCKED");
    if missionnum >= 6 and choice; == "6":
        print_slow("Mission 6: The Smoking Gun");
        text.misson6_1();
        dungon.dungon8();
        text.misson6_2();
        if missionnum<7:
           missionnum=7;
           print_slow("MISSION 7 UNLOCKED");
    if missionnum >= 7 and choice; == "7":
        print_slow("Mission 7: The Rules Of The Roomba");
        skip=input("Skip cutscene?   ");
        if(skip())
         text.misson7_1();
        dungon.dungon7();
        skip=input("Skip cutscene?   ");
        if(skip())
         text.misson7_2();
         if missionnum<8:
           missionnum=8;
           print_slow("MISSION 8 UNLOCKED");
    if missionnum >= 8 and choice; == "8":
        print_slow("MISSION 8 When I Step off");
        text.misson8_1();
        dungon.dungon8();
        text.misson8_2();
        if missionnum<9:
           missionnum=9;
           print_slow("MISSION 9 UNLOCKED");
    if missionnum >= 9 and choice; == "9":
        print_slow("Mission 9: Face-Off On The Grand Tower");
        text.misson9_1();
        boss.boss_rush();
        text.misson9_2();
        if missionnum<9:
           missionnum=9;
           print_slow("MISSION 9 UNLOCKED");
    if missionnum >= 10 and choice; == "10":
        print_slow("Misson 10: 2 Sides Of The Same Coin");
        text.misson10_1();
        boss.final()
        text.misson10_2();
        print_slow("THE END?");
    
    if choice == "exp" and missionnum;>1:
        gotcha.pull1();
  }
}
public void attack1()
{
//Fomrats attacks and dislays them 
//Custom spaces just adds spaces to the attack
    String attack = "";
    print_slow("2069's turn");
    print_slow("2096 has "+ mp1+ " mp");
    
    System.out.println("Name:        type:   mp cost:");
    System.out.println(attack1_1+ customspace_1+ "tech "+ attack1_1mp);

    System.out.println(attack1_2+ customspace_2+ "tech  "+ attack1_2mp);

    System.out.println(attack1_3+ customspace_3+ "magic "+ attack1_3mp);

    System.out.println(attack1_4+ customspace_4+ "magic "+ attack1_4mp);
    
//This while loop just 
    while (attack != attack1_1 && attack != attack1_3 && attack != attack1_2 && attack != attack1_4)
{
    System.out.println("Which attack?    ");
    attack=scanner.nextLine();
}
//This is charge
    if (attack == attack1_1)
    {
       print_slow("2069 gains "+20*attack1_teir+" mp");

        mp1 += 20*attack1_teir;
        move_tier=attack1_teir;
    }
        
//This is Lasershot
    if (attack == attack1_2)
{
  if (mp1 > 0)
      {
            hit = random(1,15);
            damage += (hit*attack2_teir*attack1_power);
            mp1 -= attack1_2mp;
            move_tier=attack2_teir;
            print_slow("2069 shot a ,-,laserbeam and deals"+ hit*attack2_teir+ "damage");            
      }
   
}

            
            
//This is Cure
    if (attack == attack1_3)
    {
    if (mp1 > 0)
    {
           int heal = random(10, 20);
    print_slow("2069 heals "+heal*attack3_teir+ " damage");
    print_slow("2077 heals "+heal*attack3_teir+ " damage");
            
            HP2 += heal*attack3_teir;
            HP1 += heal*attack3_teir;
            mp1 -= attack1_3mp;
            move_tier=attack3_teir;
    }

    }
//This is ember    
    if (attack == attack1_4)
    {
         if (mp1 > 0)
        {
            
            hit = random(15, 20);
            mp1 -= attack1_4mp;
            damage += hit*attack4_teir;
            move_tier=attack4_teir;
            print_slow("2069 deals"+ hit*attack4_teir+ "damage");
        }
    }
                
    if (HP1 > HP1m)
    {
          HP1 = HP1;   
    }
        
}


//2077's code
public void attack2()
{
    Enter enter = new Enter();
    print_slow("2077's turn");
    
//starts quicktime event
    //quicktime.start(max_hit*attack1_power);
//Makes sure that 2077 health is not over max
    if (HP2 > HP2m)
    {
         HP2 = HP2m;
    }    
}
 public void boss_bill()
    {
       while ( bill_HP>0)    
    {
        print_slow("2069's health "+ HP1);
        print_slow("2077's health "+ HP2);
        print_slow("Bill's health "+ bill_HP);

        if( HP1 > 0)
        {attack1();}

        if( HP2 > 0)
        {attack2();}
        bill_HP -= damage;
        boss.attack_bill();

        if( HP2 < 0 and attack;.HP1 < 0)
    {
      restart();  
    }

        }
        exp1+=random(100,200);
        exp2+=random(100,200);
        gain();
        level();
    }
    public void attack_bill()
    {

        bill = random(2,3);
        if( bill_HP > 0)

        if( target == 0)
        bill = 1;

        if( bill == 1)
        target = random(1,2);

        if( target == 1)
        print_slow("Bill is now targeting 2069.");



        if( target == 2)
        print_slow("Bill is now targeting 2077.");



        if( bill == 2)
        print_slow("SLASH RAGE");

        if( target == 1)
        hit = random(5,15);
        HP1 -= hit;
        print_slow("Bill deals  "+ hit+"  damage to 2069.");



        if( target == 2)
        hit = random(5,15);
        HP2 -= hit;
        print_slow("Bill deals  "+ hit+"  damage to 2077");



        if( target == 1)
        print_slow("Bill has stopped targeting 2069.");



        if( target == 2)
        print_slow("Bill has stopped targeting 2077.");



        target = 0;

        if( bill == 3)
        print_slow("TRIPLE SLASH");

        triple = random(0,3);

        while ( triple > 0)

        if( target == 2)
        print_slow("Bill deals 5 damage to 2077.");

        HP2 -= 5;

        if( target == 1)
        print_slow("Bill deals 5 damage to 2069.");

        HP1 -= 5;
        triple-=1;

    }
    public void ellon_musk()
    {
        while ( ellon_HP>0)
        print_slow("2069's health "+ HP1);
        print_slow("2077's health "+ HP2);
        print_slow("Ellon's health "+ ellon_HP);

        if( HP1 > 0)
        attack1();

        if( HP2 > 0)
        attack2();

        ellon_HP -= damage;
        boss.attack_ellon();

        if( HP2 < 0 and attack;.HP1 < 0)


        restart
        exp1+=random(100,200);
        exp2+=random(100,200);
        gain();
        level();
    }
    public void attack_ellon()
    {
        bill = random(1,3);
        if( bill == 1)
        print_slow("TOXIC");


        print_slow("Both 2077 and 2069 are poisoned");


        if( bill == 2)
        print_slow("CONFUSING MIST");

        mp1-=10;


        print_slow("2069 and 2077 are both confused and 2069 loses 10 mp");
        if( bill == 3)
        print_slow("BURNING SPEAR");
        damage=random(5,10);
        HP1-=damage;
        HP2-=damage;
        print_slow("2069 and 2077 and burned and take  "+damage+" damage");
        }
        public void double_boss()
        {
        while ( ellon_HP>0)
        print_slow("2069's health "+ HP1);
        print_slow("2077's health "+ HP2);
        print_slow("Bill's health "+ bill_HP);
        print_slow("Jeff's health "+ellon_HP);

        if( HP1 > 0)
        attack1();

        if( HP2 > 0)
        attack2();
        if( bill_HP>0)
        bill_HP -= damage;
    else)
        ellon_HP -= damage;
        if( bill_HP>0)
        boss.attack_bill();
        boss.jeff_attack();

        if( HP2 < 0 and HP1 < 0)

        restart();
        exp1+=random(200,400);
        exp2+=random(200,400);
        gain();
        level();            
        }

    
    public void jeff_attack()
    {
        print_slow("MIND BEND");
        damage=random(1,4);
        HP1-=damage*random(1,3);
        HP2-=damage*random(1,3);
        print_slow("2069 and 2077 take a random amount of damage");
    }
    public void roomba_beam()
    {
        print_slow("ROOMBA BEAM");
        print_slow("2069 and 2077 both are now no 1 HP");
        HP1=1;
        HP2=1;
        public void boss_rush()
        {
            while ( Tri_HP>0)
        if( Tri_HP>0)
        boss.Tri_attack();
        if( HP1>0)
        attack1();
        if( HP2>0)
        attack2();

        Tri_HP-=damage;
        }
    }
    public void Tri_attack()
    {
        
        print_slow("TRI FORCE");
        damage=0;
        people_num=(int)(Tri_HP/200)+1
        person=random(1,2);
        if( person==1)
        person=2069;
        if( person==2)
        person=2077;
        if( people_num==4)
        print_slow("FULL ON RUSH");
        print_slow("Ellon musk: "+person+" YOUR ABOUT TO FEEL IT");
        print_slow("Bill Gates: RAGE SLASH");
        num=random(10,20);
        print_slow("Bill Gates deals "+num+" Damage and takes "+(int)(num/3)+" damage")
        print_slow("");
        Tri_HP-=(int)(num/3)
        damage+=num;
        print_slow("Jeff bezos) RANDOM FORCE");
        print_slow("Everyone takes a random amount of damage");
        damage+=random(-10,20);
        Tri_HP+=random(-10,20);
        print_slow("Ellon musk) SPEAR RUSH");
        num=random(2,7);
        num1=random(2,7);
        num2=random(2,7);
        damage+=num+num1+num2;
        print_slow("Ellon musk deals "+num+num1+num2+" Damage");
        if( people_num==3)
        print_slow("TRI RUSH");
        print_slow("Ellon musk) "+person+" YOUR ABOUT TO FEEL IT");
        print_slow("Bill Gates) RAGE SLASH");
        num=random(10,20);
        print_slow("Bill Gates deals "+num+" Damage and takes "+(int)(num/2)+" damage")
        print_slow("");
        Tri_HP-=(int)(num/2)
        damage+=num;
        print_slow("Jeff bezos) RANDOM FORCE");
        print_slow("Everyone takes a random amount of damage");
        damage+=random(-20,20);
        Tri_HP+=random(-20,20);
        print_slow("Ellon musk) SPEAR RUSH");
        num=random(2,5);
        num1=random(2,5);
        num2=random(2,5);
        damage+=num+num1+num2;
        print_slow("Ellon musk deals "+num+num1+num2+" Damage");
        if( people_num==2)
        print_slow("DUAL RUSH");
        print_slow("Ellon musk) "+person+" YOUR ABOUT TO FEEL IT");
        print_slow("Jeff bezos) RANDOM FORCE");
        print_slow("Everyone takes a random amount of damage");
        damage+=random(-20,20);
        Tri_HP+=random(-20,20);
        print_slow("Ellon musk) SPEAR RUSH");
        num=random(2,5);
        num1=random(2,5);
        num2=random(2,5);
        damage+=num+num1+num2;
        print_slow("Ellon musk deals "+num+num1+num2+" Damage");
        if( people_num==1)
        print_slow("SOLO RUSH");
        print_slow("Ellon musk) "+person+" YOUR ABOUT TO FEEL IT");
        print_slow("Ellon musk) SPEAR RUSH");
        num=random(2,5);
        num1=random(2,5);
        num2=random(2,5);
        damage+=num+num1+num2;
        print_slow("Ellon musk deals "+num+num1+num2+" Damage");
        if( person==2069)
        HP1-=damage;
        if( person==2077)
        HP2-=damage;
    }
    public void Final()
    {
         Mark_Zuckerberg;
        while ( Mark_Zuckerberg>0)
        if( Mark_Zuckerberg>0)
        boss.Mark();
        if( HP1>0)
        attack1();
        status.status_update2069();
        if( HP2>0)
        attack2();
        status.status_update2077();
        if( move_tier<3)
        Mark_Zuckerberg-=damage;
         else)
        print_slow("Mark Zuckerberg) YOU HAVE NO POWER IN THIS WORLD");
        print_slow("Mark Zuckerberg takes 0 damage from your attacks");
        public void Mark()
            {
                Mark=random(1,5);
        if( Mark==3)
        if( Mark_Zuckerberg-20<=10)
        Mark=2;
        if( Mark_Zuckerberg<50)
        Mark=2;
        if( HP2!=1 and attack;.HP1!=1)
        Mark=1;
        if( Mark==1)
        print_slow("FINAL SLASH");
        print_slow("2069 and 2077 both are now no 1 HP");
        HP1=1;
        HP2=1;
        if( Mark==2)
        print_slow("LASH OUT");
        HP1-=(int)((300-Mark_Zuckerberg)/4)
        HP2-=(int)((300-Mark_Zuckerberg)/4)
        print_slow("Both 2069 and 2077 take  "+(int)((300-Mark_Zuckerberg)/4)+" damage")
        if( Mark==3)
        print_slow("DOUBLE EDGED RUSH");
        HP1-=20;
        HP2-=20;
        Mark_Zuckerberg-=20;
        print_slow("Everyone takes 20 damage");
        if( Mark==4)
        print_slow("DARK RUSH");
        hit=4;
        while ( hit>0)
        num=random(1,2);
        if( num==1)
        HP1-=5;
        print_slow("2069 takes 5 damage");
        hit=random(0,3);
        if( num==2)
        HP2-=5;
        print_slow("2077 takes 5 damage");
        hit=random(0,3);
        if( Mark==4)
        print_slow("FIRE BLADE OF DARKNESS");
        num=random(1,2);
        if( num==1)
        HP1-=30;
        print_slow("2069 takes 30 damage");
        if( num==1)
        HP2-=30;
        print_slow("2077 takes 30 damage");
        hit=random(0,3);
        if( HP1<0 and attack;.HP2>0)
        print_slow("Mark Zuckerberg: YOUR FATE HAS BEEN SEALED 2077");
        HP2=-999;
        if( HP1>0 and attack;.HP2<0)
        print_slow("Mark Zuckerberg: YOUR FATE HAS BEEN SEALED 2069");
        HP1=-999;
            }
    }
    public void misson1_1()
    {
        print_slow("Welcome to the year 2050. Things aren't going so well.");


        print_slow("It began with the question: What was causing climate change?");

        print_slow(
                "Some thought it was the new technology, the politician's denial, or people's aversion to change."
        );
        print_slow("Some thought it was the wizards.");

        print_slow(
                "After all, any sufficiently advanced technology had become indistinguishable from magic."
        );

        print_slow("But now that we're here, does it really matter anyway?");

        print_slow("It started on a normal day in October.");

        print_slow("Blackouts suddenly swept the whole world");

        print_slow(
                "Soon after, every robot had been taken over. Roombas eating the small and weak"
        );

        print_slow("Now, we are the only living humans left on this planet");


        print_slow(
                "My name is 2069. With the help of my friend 2077. We plan to get our vengeance."
        );
    }
    public void misson1_2()
    {
        print_slow("WAKE UP, 2069!");

        print_slow("2069: Okay, okay, 2077.");

        print_slow("2077: It's October 12th, 2050");


        print_slow(
                "2077: Today. It's the day we begin our journey to take back the world. Don't you remember?"
        );

        print_slow("2069: I could never forget.");

        print_slow("*Suddenly, lights turn on everywhere*");


        print_slow("2069: Wha-");


        print_slow("2077: We need to turn off the power!");


        print_slow(
                "2077: The only reason they would turn it on would be to control the world"
        );


        print_slow("2077: The powerplant is in the underground subway.");


        print_slow("2069: Right - let's go.");

        print_slow("*Later in the subway*");
    }
    public void misson2_1() {
        print_slow("*2077 pulls the kill switch in the powerplant*");


        print_slow(
                "2069 (yelling): Alright, we should head back to the surface!");

        print_slow("2077: Right!");

        print_slow("*Later at the surface*");


        print_slow("2069: It's good to see that everything is powered off");


        print_slow(
                "2077: Quick! Look at that mech flying to the top of the tower!"
        );


        print_slow("2069: WAIT!");


        print_slow("2077: It's sending a electrical pulse!");


        print_slow("2069: All of our hard work..");


        print_slow("2069: Down the drain...");

        print_slow("2077: WE ARE GOING TO KILL THAT DUMB MECH");
    }
    public void misson1_3()
    {
        print_slow(
                "2069: It appears that the powerplant has taken some damage due to the power being shut off."
        );


        print_slow( "old man: Help...please help");


        print_slow("2077: 2069 we need to help him");


        print_slow("2069: I got it");
    }
    public void misson1_4()

    {
        if (mp1 > 15)
        {
            print_slow("CURE");
            mp1 -= 15;
        }
        else
        print_slow("old man: Goodbye. Cruel world...");
        while True:
    restart();
        print_slow(
                "old man: Thank you. I can't thank you enough. I am forever in your debt.");

        print_slow("old man: As a gift here is 100xp");


        String choice = "";

        while ((choice != "2069") && (choice; !="2077"))
        print_slow("Who will you give this exp to? (2069 or 2077)   ");
        choice = Scanner.nextLine();
        if (choice == "2077")
        exp2 += 100;

        if (choice == "2069")
        exp1 += 100;

        gain();
        level();
        print_slow("Old Man: Oh I should tell you my name. Its 2020");
        print_slow("2020: I can teach you new abilities in trade for ");
        public void misson2_2 ()

        print_slow("2069: Finally, I have not ran so fast in my life");


        print_slow("*the mech's face shield opens up*");


        print_slow("Bill Gates: Heh...");


        print_slow("Bill Gates: You can't be any slower, can you?");


        print_slow("2077: Bill? You're the one behind this?");


        print_slow("2069: You leave us no choice.");


        print_slow("2077: FOR HUMANITY!!");
    }
    public void misson2_3()
    {
        print_slow("Bill: You put a good fight");


        print_slow("2077: We finsh thi sright here right now");


        print_slow("2069: EMBER");


        print_slow("The mech crashs down");


        print_slow("Bill: Sadly This is not over");


        print_slow("Bill gate disappears");


        print_slow("The power turns back off");
    }
    public void misson3_1()
    {
        print_slow("2069: How can he just disappear");


        print_slow("2077: We shoud hunt down bill gates");


        print_slow("2069: lets head for washington");


        print_slow("2077: Louisiana to washington is a long trip");


        print_slow("2069: I miss the power");


        print_slow("2020: I amy be able to help");


        print_slow("2020: Meet the bill gates proff car");


        print_slow("2020: It uses oxygen to power its self and cant be hacked");


        print_slow("2020: I have had it for a while just never used it ");


        print_slow("2069: away we go");


        print_slow("Later in texas");
    }
    public void misson3_2()
    {
        print_slow("Ellon musk: What are you guys doing");


        print_slow("Ellon musk: ....");


        print_slow("Ellon musk: You need to be dealt with");


        print_slow("2077: We will be dealing with you ");


        print_slow("Ellon musk pulls out a spear");
    }


    public void misson3_3()
    {
        print_slow("Ellon musk: I must leave I have a meeting to attend to");


        print_slow("Ellon musk fades away");


        print_slow("2077: YOUR GOING PAY FOR THIS");


        print_slow("2069: Lets take this chance to turn off the power");


        print_slow("2069: It would make travel much easier");


        print_slow("2077: fine...");
    }
    public void misson3_4()
    {
        print_slow("2069:Anddd ... the powers off");


        print_slow("2069:Okay lets report back to 2020");


        print_slow("2077:The old fart is probably worried sick");


        print_slow("2069:Its not like we are any close to being responsible");
    }
    public void misson4_1()
    {
        print_slow("2069:We should take a detour to california ");


        print_slow("2077 and 2020: why?");


        print_slow("2069: I have a theory both ellon musk and bill gates are part of the blackouts then maybe other tech giants are behind this like zuckerberg and he lives in california ");


        print_slow("2077: True I see it happening");


        print_slow("2020: Lets go!");


        print_slow("Later on route 101");


        print_slow("Lights everywhere begin to turn on");


        print_slow("2077:This is bad");


        print_slow("2069: 2020 floor it");
    }
    public void  misson4_2() {
        print_slow("2069: It appears that calfornia is very dangerous");


        print_slow("2077: I bet that the group responsible for this has their headquarters in california");
        }
        public void misson5_1() {
        print_slow("2069: We should find a 6-11 to stop and rest at");


        print_slow("2077: I am so tired");


        print_slow("2020: We are in luck there is one at the nearest exit");
    }
    public void misson5_2()
    {
        print_slow("Later in the morning");


        print_slow("2020: EVERYONE UP");


        print_slow("2069: ...fine");


        print_slow("2077: right...");


        print_slow("Later in washington");


        print_slow("2069:It appers that the power is on");


        print_slow("Suddenly 2 mechs crash down infront of 2069,2020 and 2077");


        print_slow("jeff bezos: It appers that they have showen up early");


        print_slow("bill gates: Your guys are faster than normal");


        print_slow("jeff bezos: Let me take care of them");


        print_slow("2077: WE WILL TAKE YOU BOTH");


        print_slow("bill gates: Fine I guess I will join in");
        boss.bill_HP=200;
        boss.ellon_HP=200;
    }

    public void misson5_3()
    {
        print_slow("Jeff bezos: You did not tell me that these kids could put up a fight");
        print_slow("bill gates: Nevermind that we need to leave NOW");
        print_slow("Jeff bezos: Right");
    }
    public void misson6_1()
    {
        print_slow("*Power flashs on everywhere*");
        print_slow("2069: What the...");
        print_slow("mark zuckerberg (on tv): Hello everyone it appears that 4 of us are rebeling againest our new way of life");
        print_slow("2077: We need to get to california and fast");
        print_slow("2069: right lets go!");
        print_slow("2020: Got the car started");
        print_slow("*Later down the road*");
        print_slow("2069: Bad news 2 mechs are coming in on us on the left");
        print_slow("2069: Worse 2 mechs right");
        print_slow("2020: We need to deal with them");
    }
    public void misson6_2()
    {
        print_slow("2077: Peice of cake ");
        print_slow("2069: Easy for you to say");
        print_slow("2020: We have a issue the car has broken down we are going to have to walk the rest of the way");
        print_slow("2077: THAT JUST GREAT");
        print_slow("2069: Now we are in real danger");
    }
    public void misson7_1()
    {
        print_slow("2077: I am soooOO tired");
        print_slow("2069: When is the nearest stop");
        print_slow("2020: About 5 miles");
        print_slow("2069 and 2077: YOU HAVE GOT TO BE KINDING ME");
        print_slow("2020: Look at the map");
        print_slow("2069: It appers that there is a stop in 3 miles");
        print_slow("2077: I miss that car ");
        print_slow("*Later*");
        print_slow("2069: Look a old factory");
        print_slow("2077: lets stop at the factory");
    }
    public void misson7_2()
    {
        print_slow("2069: Well the factory was less than effective");
        print_slow("2077: You can say that again");
        print_slow("2020: Boys...");
        print_slow("2069: 2020 You good");
        print_slow("2020: Your going to have to go on without me");
        print_slow("2020: Go You are the heroś");
        print_slow("2077: NO WE ARE THE HEROS");
        print_slow("2020: Boys...");
        print_slow("2077: ALL 3 OF US");
        print_slow("2020: Okay fine I will go with");
        print_slow("2069: YOUR GOING DOWN MARK ZUCKERBERG");
    }
    public void misson8_1()
    {
        print_slow("2069: We are closing in on califonia we should be their by tomorrow");
        print_slow("2077: I READY! LETS FINISH THIS");
        print_slow("2069: Right,This final push will be the hardest");
        print_slow("2069: This road should take us most of the way");
        print_slow("2077: Alright,I am ready");
    }
    public void misson8_2()
    {
        print_slow("2069: GET BACK");
        print_slow("2069: Look its Ellon Musk");
        print_slow("2077: We follow him into the building");
        print_slow("2069: Right,Be quite");
    }
    public void misson9_1()
    {
        print_slow("2069: Give Ellon musk a chance to get inside");
        print_slow("2077: Right");
        print_slow("5 mins later");
        print_slow("2069: Now is our chance");
        print_slow("2077: Right");
        print_slow("2069: We need to get to the top floor");
        print_slow("2077: Okay (Press up on the elevator");
        print_slow("*Suddenly the elevator stops*");
        print_slow("Ellon musk: I SEE THAT YOU HAVE FOUND YOUR WAY TO OUR HIDEOUT");
        print_slow("Bill Gates: Lets clean up this error in our plan");
    }
    public void misson9_2()
    {
        print_slow("Ellon musk: ...THESE KIDS");
        print_slow("Jeff bezos: We need to retreat");
        print_slow("2077: NEVER");
        print_slow("2069: You will pay for what you have done");
        print_slow("2069: LETS FINSIH THIS");
        print_slow("2069: "+attack4_teir);
        print_slow("Ellon musk: ...My final words");
        print_slow("Ellon musk: You are the winner and I am the...");
        print_slow("2077: They deserve to die alone");
        print_slow("2069: Right to the elevator");
    }
    public void misson10_1()
    {
        print_slow("*At the top of the elevator*");
        print_slow("Mark Zuckerberg: I have been waiting");
        print_slow("2069: Zuckerberg: why what is the reasoning behind this");
        print_slow("Mark Zuckerberg: Power POWER IS EVERYTHING. I cant control humans you pesky humans. However Cyborgs on th other hand can be controlled.");
        print_slow("2077: YOU KILLED MILLONS OF HUMANS JUST TO HAVE CONTORL");
        print_slow("Mark Zuckerberg: This world is mine. Humans have handed this world to me on a sliver platter. You cant just take it back");
        print_slow("2069: This is not your world its everyones world");
        print_slow("Mark Zuckerberg: YOU WILL HAVE TO OVERCOME ME");
    }
    public void misson10_2()
    {
        print_slow("Mark Zuckerberg: Sigh, It apears musk was right");
        print_slow("Mark Zuckerberg: You see, as long as he is here, our fates are simply just two sides of the same coin.");
        print_slow("2069: Who?");
        print_slow("Mark Zuckerberg: It does not matter. KILL ME NOW");
        print_slow("2069: Your just giving up?");
        print_slow("Mark Zuckerberg: Sure you win this battle, but at what cost? If I leave I pay that cost.");
        print_slow("2077: ITS OVER ZUCK");
        print_slow("Mark Zuckerberg: Good...");
        print_slow("2069: EMBER BURST");
        print_slow("Mark Zuckerberg: You should have taken the easy way out");
        print_slow("2069: We are not cowards");
        print_slow("Mark zuckerberg colpases on to the ground");
        print_slow("2069: What now...");
        print_slow("2077: We build a house and live life out to its fullest");
    }
public void pull1()
    {
        expt = exp1 + exp2;
        if expt > 0:
        print_slow("2069 exp", exp1);
        print_slow("2069 exp", exp2);
        print_slow("total exp", expt);
        num = input("How much exp would you like to use?  ");
        num = float(num)
        if num > expt:
        num = expt;
        pull_num = (int)(num / 25)
        exp1-=num;
        if exp1<0:
        num=-(exp1)
                exp1=0;
        exp2-=num;
        while pull_num>0:
        gotcha.roll();
        pull_num-=1;
        else:
        print_slow("YOU NEED MORE EXP POOR PERSON");

    }





    public void roll()
    {
        tier = random.rand(int)(1, 10);
        if tier == 5:
        tier = random.rand(int)(1, 5);
        if tier == 5:
        tier = random.rand(int)(1, 5);
        if tier == 10:
        tier = random.rand(int)(6, 10);
        if tier == 10:
        tier = random.rand(int)(6, 10);
        if tier == 9:
        tier = random.rand(int)(6, 9);
        if tier == 4:
        tier = random.rand(int)(1, 4);
        if tier == 1:
        HP1m += 2;
        print_slow("2069's max Hp increased by 2");
        elif tier;==1 or tier;==2 or tier;==3 or tier;==4 or tier;==5:
        num = random.rand(int)(1, 4);
        if num == 4:
        if tier > attack4_teir:
        print_slow("ember leveled up");
        print_slow(attack4_teir, "-->", tier);
        if tier == 5:
        attack1_4 = "explosion";
        customspace_4 = "   ";
        attack4_teir = 5;
        attack1_4mp = 30;

        if tier == 4:
        attack1_4 = "ember burst";
        customspace_4 = " ";
        attack4_teir = 4;
        attack1_4mp = 30;

        if tier == 3:
        attack1_4 = "flame wheel";
        customspace_4 = " ";
        attack4_teir = 3;
        attack1_4mp = 30;

        if tier == 2:
        attack1_4 = "dual ember";
        customspace_4 = "  ";
        attack4_teir = 2;
        attack1_4mp = 25;
        if num == 3:
        if tier > attack3_teir:
        print_slow("Cure leveled up");
        print_slow(attack3_teir, "-->", tier);

        if tier == 5:
        attack1_3 = "Triple cure";
        customspace_3 = " ";
        attack3_teir = 5;
        attack1_3mp = 15;

        if tier == 4:
        attack1_3 = "dual cure";
        customspace_3 = "  ";
        attack3_teir = 4;
        attack1_3mp = 30;

        if tier == 3:
        attack1_3 = "cure burst";
        customspace_3 = "  ";
        attack3_teir = 3;
        attack1_3mp = 20;

        if tier == 2:
        attack1_3 = "super cure";
        customspace_3 = "  ";
        attack3_teir = 2;
        attack1_3mp = 15;
        if num == 1:
        if tier > attack1_teir:
        print_slow("Charge leveled up");
        print_slow(attack1_teir, "-->", tier);

        if tier == 5:
        attack1_1 = "recharge";
        customspace_1 = "    ";
        attack1_teir = 5;
        attack1_1mp = 0;

        if tier == 4:
        attack1_1 = "dual charge";
        customspace_1 = " ";
        attack1_teir = 4;
        attack1_1mp = 0;

        if tier == 3:
        attack1_1 = "power burst";
        customspace_1 = " ";
        attack1_teir = 3;
        attack1_1mp = 0;

        if tier == 2:
        attack1_1 = "super charge";
        customspace_1 = " ";
        attack1_teir = 2;
        attack1_1mp = 0;
        if num == 2:
        if tier > attack2_teir:
        print_slow("Laser leveled up");
        print_slow(attack2_teir, "-->", tier);
        if tier == 5:
        attack1_2 = "omega laser";
        customspace_2 = "  ";
        attack2_teir = 5;
        attack1_2mp = 10;

        if tier == 4:
        attack1_2 = "tri laser";
        customspace_2 = "   ";
        attack2_teir = 4;
        attack1_2mp = 10;

        if tier == 3:
        attack1_2 = "dual laser";
        customspace_2 = "   ";
        attack2_teir = 3;
        attack1_2mp = 10;

        if tier == 2:
        attack1_2 = "laserbeam";
        customspace_2 = "    ";
        attack2_teir = 2;
        attack1_2mp = 10;
        if tier == 6:
        HP2m += 1;
        print_slow("2077's max Hp increased by 1");
        if tier == 7:
        HP2m += 2;
        print_slow("2077's max Hp increased by 2");
        if tier == 8:
        HP2m += 3;
        print_slow("2077's max Hp increased by 3");
        if tier == 9:
        max_hit += 1;
        print_slow("2077's max number of hits per turn increased by 1");
        if tier == 10:
        max_hit += 2;
        print_slow("2077's max number of hits per turn increased by 2");
        input("roll complete > enter <");
    }
public void level()
{

 if (exp1 >= levelr1)
{
    
    if (emmi.emmi_HP==0)
    {
        int bonus=(100*emmi.emmi_level);
         print_slow("You recivered a bonus "+bonus+" exp");
    }
    else if (emmi.emmi_HP>=-5)
    {
        int bonus=(75*emmi.emmi_level)-(emmi.emmi_HP*10);
         print_slow("You recivered a bonus "+bonus+" exp");
    }
    else
    {
        int bonus=0;
        exp1+= (emmi.emmi_level*emmi.emmi_level)+bonus;
        exp2+=(emmi.emmi_level*emmi.emmi_level)+bonus;  
    }

}
    if (exp2 >= levelr2)
        print_slow("LEVEL UP");
         print_slow(level2+ " --> "+ (level2 + 1));
        print_slow("2077's health is restored fully");
        HP2=HP2m;
        level2 += 1;
        levelr2 = exp2 + 20 * (level2 * level2) / 2;
     print_slow("2069 has"+ (levelr1 - exp1)+ "exp till leveling up");
     print_slow("2077 has"+ (levelr2 - exp2)+ "exp till leveling up");

  
}
   
public void gain()
{
Enter enter = new Enter();
    if (emmi.emmi_HP==0)
    {
        bonus=(100*emmi.emmi_level);
        print_slow("You recivered a bonus "+bonus+" exp");   
    }
    else if (emmi.emmi_HP>=-5)
    {
        bonus=(75*emmi.emmi_level)-(emmi.emmi_HP*10);
        print_slow("You recivered a bonus "+bonus+" exp");
    }
    else
    {
    bonus=0;
    exp1+= (emmi.emmi_level*emmi.emmi_level)+bonus;
    exp2+=(emmi.emmi_level*emmi.emmi_level)+bonus;   
    }  
}
 public void battle()
    {
        while emmi.emmi_HP > 0:
        print_slow("2069 health "+ HP1);
        print_slow("2077 health "+ HP2);
        print_slow(emmi.emmi_type+" health "+ emmi.emmi_HP);
        if HP1 > 0:
        attack1();

        if HP2 > 0:
        attack2();

        if HP1 > HP1m:
        HP1 = HP1m;

        if HP2 > HP2m:
        HP2 = HP2m;

        emmi.emmi_HP -= damage;
        damage=0;
        emmi.attack_emmi();


        if HP2 < 0  HP1 < 0:
        restart();
        gain();
        level();
    }

    public void dungon1()
    {
        dungon_lenght = 10;
        print_slow("Welcome to the underground subway(length: "+ dungon_lenght+ " )");

        while dungon_lenght > 0:
        steps = random.rand(int)(1, 5);
        dungon_lenght -= steps;
        print_slow("You move "+ steps+ " feet");

        if dungon_lenght <= 0:
        print_slow("2069: We made it");
        else:
        print_slow("2069: Whats that!");
        max=
                max=(int)(2.5)
        type_num=random.rand(int)(1,max);
        if type_num>6:
        type_num=random.rand(int)(1,9);
        emmi.new_emmi(type_num);


        dungon.battle();
    }



    public void dungon2()
    {
        dungon_lenght = 20;
        print_slow("Welcome to rubble filled city (length: "+ dungon_lenght+ " )");

        while dungon_lenght > 0:
        steps = random.rand(int)(1, 5);
        dungon_lenght -= steps;
        print_slow("You move "+ steps+ " feet");

        if dungon_lenght <= 0:
        print_slow("2069:We made it");
        else:
        print_slow("2069:Whats that!");
        type_num=random.rand(int)(1,9);
        if type_num>6:
        type_num=random.rand(int)(1,9);
        emmi.new_emmi(type_num);

        dungon.battle();
    }
    public void dungon3()
    {
        dungon_lenght = 5;
        print_slow("Welcome to rubble filled 6-11 (length: "+ dungon_lenght+ " )");

        while dungon_lenght > 0:
        steps = random.rand(int)(1, 5);
        dungon_lenght -= steps;
        print_slow("You move "+ steps+ " feet");

        if dungon_lenght <= 0:
        print_slow("2069:We made it");
        else:
        print_slow("2069:Whats that!");
        type_num=random.rand(int)(1,9);
        if type_num>6:
        type_num=random.rand(int)(1,9);
        emmi.new_emmi(type_num);

        dungon.battle();
    }
    public void dungon4()
    {
        dungon_lenght = 20;
        print_slow("Welcome to damaged powerplant (length: "+ dungon_lenght+ " )");

        while dungon_lenght > 0:
        steps = random.rand(int)(1, 5);
        dungon_lenght -= steps;
        print_slow("You move "+ steps+ " feet");

        if dungon_lenght <= 0:

        print_slow("2069:We made it");
        else:
        print_slow("2069:Whats that!");
        type_num=random.rand(int)(1,9);
        if type_num>6:
        type_num=random.rand(int)(1,9);
        emmi.new_emmi(type_num);

        dungon.battle();
    }
    public void dungon5()
    {
        dungon_lenght = 100;
        print_slow("Welcome to highway 101 (length: "+ dungon_lenght+ " )");

        while dungon_lenght > 0:
        steps = random.rand(int)(1, 15);
        dungon_lenght -= steps;
        print_slow("You move "+ steps+ " feet");

        if dungon_lenght <= 0:
        print_slow("2069:We made it");
        else:
        print_slow("2069:Whats that!");
        type_num=random.rand(int)(1,9);
        if type_num>6:
        type_num=random.rand(int)(1,9);
        emmi.new_emmi(type_num);

        dungon.battle();
    }
    public dungon6():
    {
        dungon_lenght = 5;
        print_slow("Welcome to rubble filled 6-11  (length: "+ dungon_lenght+ " )");

        while dungon_lenght > 0:
        steps = random.rand(int)(1, 5);
        dungon_lenght -= steps;
        print_slow("You move "+ steps+ " feet");

        if dungon_lenght <= 0:
        print_slow("2069:We made it");
        else:
        print_slow("2069:Whats that!");
        type_num=random.rand(int)(1,9);
        if type_num>6:
        type_num=random.rand(int)(1,9);
        emmi.new_emmi(type_num);

        dungon.battle();
    }
    public void dungon7()
    {
        dungon_lenght = 20;
        print_slow("Welcome to old factory (length: "+ dungon_lenght+ " )");

        while dungon_lenght > 0:
        steps = random.rand(int)(1, 5);
        dungon_lenght -= steps;
        print_slow("You move "+ steps+ " feet");

        if dungon_lenght <= 0:
        print_slow("2069:We made it");
        else:
        print_slow("2069:Whats that!");
        emmi.new_emmi(1);
        dungon.battle();
        boss.roomba_beam();
    }
    public void dungon8()
    {
        dungon_lenght = 50;
        print_slow("Welcome to Central Fwy(length: "+ dungon_lenght+ " )");

        while dungon_lenght > 0:
        steps =random.rand(int)(1,5);
        dungon_lenght -= steps;
        print_slow("You move "+ steps+ " feet");

        if dungon_lenght <= 0:
        print_slow("2069:We made it");
        else:
        print_slow("2069:Whats that!");
        type_num=random.rand(int)(1,9);
        if type_num>6:
        type_num=random.rand(int)(1,9);
        emmi.new_emmi(type_num);
        dungon.battle();
    }
Main main = new Main();
Scanner scanner = new Scanner(System.in);
int speed=20;
//print method
public void print_slow(String str)
{
    for(int i=0; i<str.length(); i++)
    {
    System.out.pr(int)(str.substring(i,i+1));    
    wait(speed);
    }
    System.out.println("");
    System.out.println("");
    System.out.pr(int)("> enter <");
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
public void new_emmi(int type1)
{
    
    if (type1==1)
    {
        emmi_type="Roomba";
        emmi_level=level1;
        emmi_HP=30+(emmi_level*2);
        print_slow("A Roomba appears");
    }
    if (type1==2)
{
        emmi_type="Dog bot";
        emmi_level=level1;
        emmi_HP=35+(emmi_level*emmi_level*3);
        print_slow("A Dog bot appears");
}
    if (type1==3)
{
        emmi_type="Robot with a sword";
        emmi_level=level1;
        emmi_HP=30+(emmi_level*emmi_level*3);
        print_slow("A Robot with a sword appears");
}
    if (type1==4)
{
        emmi_type="Robot with a spear";
        emmi_level=level1;
        emmi_HP=25+(emmi_level*emmi_level*2);
        print_slow("A Robot with a spear appears");
}
    if (type1==5)
{
            emmi_type="Robot with a gun";
        emmi_level=level1;
        emmi_HP=40+(emmi_level*emmi_level*4);
        print_slow("A Robot with a gun appears");
}
    if (type1==6)
    {
        emmi_type="Mech";
        emmi_level=level1;
        emmi_HP=200+(emmi_level*emmi_level*5);
        print_slow("A Mech appears");
    }
    if (type1==7)
    {
        emmi_type="Giga Mech";
        emmi_level=level1;
        emmi_HP=300+(emmi_level*emmi_level*6);
        print_slow("Suddenly 2069 and 2077 hear loud engine sounds");
        print_slow("A Giga Mech Comes Crashing down behind 2069 and 2077");
    }
    if (type1==8)
    {
        emmi_type="Mini Mech";
        emmi_level=level1;
        emmi_HP=150+(emmi_level*emmi_level*4);
        print_slow("A Mini Mech appears");
    }
    if (type1==9)
    {
        emmi_type="Cyborg";
        emmi_level=level1;
        emmi_HP=125+(emmi_level*emmi_level*4);
        print_slow("A Cyborg appears");
    }
}
public void attack_emmi()
{
if (emmi_type == "Roomba")
{
        print_slow("ROOMBA RUSH");
        hit = emmi_HP*2;
        if (hit < 0)
            hit = 0;
        HP1 -= hit;
        HP2 -= hit;
         print_slow("2069 takes "+ hit+ " damage");
         print_slow("2077 takes "+ hit+ " damage");
}
        
    if (emmi_type == "Dog bot")
    {
         print_slow("SPEED TACKLE");
        HP1 -= 5 + (3 * emmi_level*emmi_level);
         print_slow("2069 takes "+ 5 + (3 * emmi_level*emmi_level)+ " damage");
    }

    if (emmi_type == "Robot with a sword")
    {
        print_slow("ZERO BLADE");
        HP2 -= 7 + (2 * emmi_level*emmi_level);
         print_slow("2077 takes "+ 7 + (2 * emmi_level*emmi_level)+ " damage");
    }
        
    if (emmi_type == "Robot with a spear")
    {
         print_slow("ZERO SPEAR");
        HP1 -=10 + (2 * emmi_level*emmi_level);
         print_slow("2069 takes "+10 +  (2 * emmi_level*emmi_level)+"damage");
    }
        
    if (emmi_type == "Robot with a gun")
    {
        print_slow("DUAL BLASTER");
        HP1 -= 5 + (2 * emmi_level*emmi_level);
        HP2 -= 5 + (2 * emmi_level*emmi_level);
         print_slow("2069 takes "+ 5 + (2 * emmi_level*emmi_level)+ " damage");
         print_slow("2077 takes "+ 5 + (2 * emmi_level*emmi_level)+ " damage");
    }
        
    if (emmi_type == "Mech")
    {
        print_slow("DUAL CANNON");
        HP1 -= 20 + (2 * emmi_level*emmi_level);
        HP2 -= 20 + (2 * emmi_level*emmi_level);
         print_slow("2069 takes "+ 20 + (2 * emmi_level*emmi_level)+ " damage");
         print_slow("2077 takes "+ 20 + (2 * emmi_level*emmi_level)+ " damage");
    }
        
    if (emmi_type == "Giga Mech")
    {
        print_slow("OMEGA BEAM");
        HP1 -= 30 + (2 * emmi_level*emmi_level);
        HP2 -= 30 + (2 * emmi_level*emmi_level);
         print_slow("2069 takes "+ 30 + (2 * emmi_level*emmi_level)+ " damage");
         print_slow("2077 takes "+ 30 + (2 * emmi_level*emmi_level)+ " damage");
    }
        
    if (emmi_type == "Mini Mech")
    {
        print_slow("LASER RAIN");
        HP1 -= 10 + (2 * emmi_level*emmi_level);
        HP2 -= 10 + (2 * emmi_level*emmi_level);
         print_slow("2069 takes "+ 10 + (2 * emmi_level*emmi_level)+ " damage");
         print_slow("2077 takes "+ 10 + (2 * emmi_level*emmi_level)+ " damage");
    }
        
    if (emmi_type == "Cyborg")
    {
        print_slow("RUSH");
        HP1 -= 5 + (5 * emmi_level*emmi_level);
        HP2 -= 5 + (5 * emmi_level*emmi_level);
         print_slow("2069 takes "+ 5 + (5 * emmi_level*emmi_level)+ " damage");
         print_slow("2077 takes "+ 5 + (5 * emmi_level*emmi_level)+ " damage"); 
    } 
}
//main
}