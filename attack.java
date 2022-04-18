import java.util.Scanner; 
class Attack
{
Scanner scanner = new Scanner(System.in);
Enter enter = new Enter();
Emmi emmi = new Emmi();
Exp exp = new Exp();
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
//2069's code
public void attack()
{
//Fomrats attacks and dislays them 
//Custom spaces just adds spaces to the attack
    String attack = "";
    enter.print_slow("2069's turn");
    enter.print_slow("2096 has "+ mp1+ " mp");
    
    System.out.println("Name:        type:   mp cost:");
    System.out.println(exp.attack1_1+ exp.customspace_1+ "tech "+ exp.attack1_1mp);

    System.out.println(exp.attack1_2+ exp.customspace_2+ "tech  "+ exp.attack1_2mp);

    System.out.println(exp.attack1_3+ exp.customspace_3+ "magic "+ exp.attack1_3mp);

    System.out.println(exp.attack1_4+ exp.customspace_4+ "magic "+ exp.attack1_4mp);
    
//This while loop just 
    while (attack != exp.attack1_1 && attack != exp.attack1_3 && attack != exp.attack1_2 && attack != exp.attack1_4)
{
    System.out.println("Which attack?    ");
    attack=scanner.nextLine();
}
//This is charge
    if (attack == exp.attack1_1)
    {
       enter.print_slow("2069 gains "+20*exp.attack1_teir+" mp");

        mp1 += 20*exp.attack1_teir;
        move_tier=exp.attack1_teir;
    }
        
//This is Lasershot
    if (attack == exp.attack1_2)
{
  if (mp1 > 0)
      {
            hit = enter.random(1,15);
            damage += (hit*exp.attack2_teir*attack1_power);
            mp1 -= exp.attack1_2mp;
            move_tier=exp.attack2_teir;
            enter.print_slow("2069 shot a ,-,laserbeam and deals"+ hit*exp.attack2_teir+ "damage");            
      }
   
}

            
            
//This is Cure
    if (attack == exp.attack1_3)
    {
    if (mp1 > 0)
    {
           int heal = enter.random(10, 20);
    enter.print_slow("2069 heals "+heal*exp.attack3_teir+ " damage");
    enter.print_slow("2077 heals "+heal*exp.attack3_teir+ " damage");
            
            HP2 += heal*exp.attack3_teir;
            HP1 += heal*exp.attack3_teir;
            mp1 -= exp.attack1_3mp;
            move_tier=exp.attack3_teir;
    }

    }
//This is ember    
    if (attack == exp.attack1_4)
    {
         if (mp1 > 0)
        {
            
            hit = enter.random(15, 20);
            mp1 -= exp.attack1_4mp;
            damage += hit*exp.attack4_teir;
            move_tier=exp.attack4_teir;
            enter.print_slow("2069 deals"+ hit*exp.attack4_teir+ "damage");
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
    enter.print_slow("2077's turn");
    
//starts quicktime event
    //quicktime.start(max_hit*attack1_power);
//Makes sure that 2077 health is not over max
    if (HP2 > HP2m)
    {
         HP2 = HP2m;
    }    
}

}
