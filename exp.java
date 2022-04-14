class Exp
{
String attack1_1 = "charge";
String attack1_2 = "lasershot";
String attack1_3 = "cure";
String attack1_4 = "ember";
String customspace_1="     ";
String customspace_2="  ";
String customspace_3="       ";
String customspace_4="      ";
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


public void levelup()
{
Enter enter = new Enter();
 if (exp1 >= levelr1)
{
    
    if (emmi.emmi_HP==0)
    {
        int bonus=(100*emmi.emmi_level);
         enter.print_slow("You recivered a bonus "+bonus+" exp");
    }
    else if (emmi.emmi_HP>=-5)
    {
        int bonus=(75*emmi.emmi_level)-(emmi.emmi_HP*10);
         enter.print_slow("You recivered a bonus "+bonus+" exp");
    }
    else
    {
        int bonus=0;
        exp1+= (emmi.emmi_level*emmi.emmi_level)+bonus;
        exp2+=(emmi.emmi_level*emmi.emmi_level)+bonus;  
    }

}
    if (exp2 >= levelr2)
        enter.print_slow("LEVEL UP");
        print(level2+ " --> "+ (level2 + 1));
        enter.print_slow("2077's health is restored fully");
        attack.HP2=attack.HP2m;
        level2 += 1;
        levelr2 = exp2 + 20 * (level2 * level2) / 2;
     enter.print_slow("2069 has"+ (levelr1 - exp1)+ "exp till leveling up");
     enter.print_slow("2077 has"+ (levelr2 - exp2)+ "exp till leveling up");

  
}
   
public void bonus()
{
Enter enter = new Enter();
    if (emmi.emmi_HP==0)
    {
        bonus=(100*emmi.emmi_level);
        enter.print_slow("You recivered a bonus "+bonus+" exp");   
    }
    else if (emmi.emmi_HP>=-5)
    {
        bonus=(75*emmi.emmi_level)-(emmi.emmi_HP*10);
        enter.print_slow("You recivered a bonus "+bonus+" exp");
    }
    else
    {
    bonus=0;
    exp1+= (emmi.emmi_level*emmi.emmi_level)+bonus;
    exp2+=(emmi.emmi_level*emmi.emmi_level)+bonus;   
    }  
}
  

    
}
