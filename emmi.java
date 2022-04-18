class Emmi
{
int emmi_HP = 0;
int emmi_level = 0;
String emmi_type = "";
int hit=0;
Enter enter = new Enter();
Attack attack = new Attack();
Emmi emmi = new Emmi();
    
public void new_emmi(int type1)
{
    
    if (type1==1)
    {
        emmi_type="Roomba";
        emmi_level=exp.level1;
        emmi_HP=30+(emmi_level*2);
        enter.print_slow("A Roomba appears");
    }
    if (type1==2)
{
        emmi_type="Dog bot";
        emmi_level=exp.level1;
        emmi_HP=35+(emmi_level*emmi_level*3);
        enter.print_slow("A Dog bot appears");
}
    if (type1==3)
{
        emmi_type="Robot with a sword";
        emmi_level=exp.level1;
        emmi_HP=30+(emmi_level*emmi_level*3);
        enter.print_slow("A Robot with a sword appears");
}
    if (type1==4)
{
        emmi_type="Robot with a spear";
        emmi_level=exp.level1;
        emmi_HP=25+(emmi_level*emmi_level*2);
        enter.print_slow("A Robot with a spear appears");
}
    if (type1==5)
{
            emmi_type="Robot with a gun";
        emmi_level=exp.level1;
        emmi_HP=40+(emmi_level*emmi_level*4);
        enter.print_slow("A Robot with a gun appears");
}
    if (type1==6)
    {
        emmi_type="Mech";
        emmi_level=exp.level1;
        emmi_HP=200+(emmi_level*emmi_level*5);
        enter.print_slow("A Mech appears");
    }
    if (type1==7)
    {
        emmi_type="Giga Mech";
        emmi_level=exp.level1;
        emmi_HP=300+(emmi_level*emmi_level*6);
        enter.print_slow("Suddenly 2069 and 2077 hear loud engine sounds");
        enter.print_slow("A Giga Mech Comes Crashing down behind 2069 and 2077");
    }
    if (type1==8)
    {
        emmi_type="Mini Mech";
        emmi_level=exp.level1;
        emmi_HP=150+(emmi_level*emmi_level*4);
        enter.print_slow("A Mini Mech appears");
    }
    if (type1==9)
    {
        emmi_type="Cyborg";
        emmi_level=exp.level1;
        emmi_HP=125+(emmi_level*emmi_level*4);
        enter.print_slow("A Cyborg appears");
    }
}
public void attack_emmi()
{
if (emmi_type == "Roomba")
{
        enter.print_slow("ROOMBA RUSH");
        hit = emmi_HP*2;
        if (hit < 0)
            hit = 0;
        attack.HP1 -= hit;
        attack.HP2 -= hit;
         enter.print_slow("2069 takes "+ hit+ " damage");
         enter.print_slow("2077 takes "+ hit+ " damage");
}
        
    if (emmi_type == "Dog bot")
    {
         enter.print_slow("SPEED TACKLE");
        attack.HP1 -= 5 + (3 * emmi_level*emmi_level);
         enter.print_slow("2069 takes "+ 5 + (3 * emmi_level*emmi_level)+ " damage");
    }

    if (emmi_type == "Robot with a sword")
    {
        enter.print_slow("ZERO BLADE");
        attack.HP2 -= 7 + (2 * emmi_level*emmi_level);
         enter.print_slow("2077 takes "+ 7 + (2 * emmi_level*emmi_level)+ " damage");
    }
        
    if (emmi_type == "Robot with a spear")
    {
         enter.print_slow("ZERO SPEAR");
        attack.HP1 -=10 + (2 * emmi_level*emmi_level);
         enter.print_slow("2069 takes "+10 +  (2 * emmi_level*emmi_level)+"damage");
    }
        
    if (emmi_type == "Robot with a gun")
    {
        enter.print_slow("DUAL BLASTER");
        attack.HP1 -= 5 + (2 * emmi_level*emmi_level);
        attack.HP2 -= 5 + (2 * emmi_level*emmi_level);
         enter.print_slow("2069 takes "+ 5 + (2 * emmi_level*emmi_level)+ " damage");
         enter.print_slow("2077 takes "+ 5 + (2 * emmi_level*emmi_level)+ " damage");
    }
        
    if (emmi_type == "Mech")
    {
        enter.print_slow("DUAL CANNON");
        attack.HP1 -= 20 + (2 * emmi_level*emmi_level);
        attack.HP2 -= 20 + (2 * emmi_level*emmi_level);
         enter.print_slow("2069 takes "+ 20 + (2 * emmi_level*emmi_level)+ " damage");
         enter.print_slow("2077 takes "+ 20 + (2 * emmi_level*emmi_level)+ " damage");
    }
        
    if (emmi_type == "Giga Mech")
    {
        enter.print_slow("OMEGA BEAM");
        attack.HP1 -= 30 + (2 * emmi_level*emmi_level);
        attack.HP2 -= 30 + (2 * emmi_level*emmi_level);
         enter.print_slow("2069 takes "+ 30 + (2 * emmi_level*emmi_level)+ " damage");
         enter.print_slow("2077 takes "+ 30 + (2 * emmi_level*emmi_level)+ " damage");
    }
        
    if (emmi_type == "Mini Mech")
    {
        enter.print_slow("LASER RAIN");
        attack.HP1 -= 10 + (2 * emmi_level*emmi_level);
        attack.HP2 -= 10 + (2 * emmi_level*emmi_level);
         enter.print_slow("2069 takes "+ 10 + (2 * emmi_level*emmi_level)+ " damage");
         enter.print_slow("2077 takes "+ 10 + (2 * emmi_level*emmi_level)+ " damage");
    }
        
    if (emmi_type == "Cyborg")
    {
        enter.print_slow("RUSH");
        attack.HP1 -= 5 + (5 * emmi_level*emmi_level);
        attack.HP2 -= 5 + (5 * emmi_level*emmi_level);
         enter.print_slow("2069 takes "+ 5 + (5 * emmi_level*emmi_level)+ " damage");
         enter.print_slow("2077 takes "+ 5 + (5 * emmi_level*emmi_level)+ " damage"); 
    } 
}
      
  
}


