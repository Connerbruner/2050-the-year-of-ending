import attack
import boss
import random
import exp
import enter
import GAME_OVER
bill_HP = 300
ellon_HP = 150
target = 0
Tri_HP = 1000
Mark_Zuckerberg=300
def boss_bill(): 
   global bill_HP
   while bill_HP>0: 
    print("2069's health", attack.HP1)
    print("2077's health", attack.HP2)
    print("Bill's health", bill_HP)

    if attack.HP1 > 0:
        attack.attack1()

    if attack.HP2 > 0:
        attack.attack2()
    bill_HP -= attack.damage
    boss.attack_bill()

    if attack.HP2 < 0 and attack.HP1 < 0:


        GAME_OVER.restart()
   exp.exp1+=random.randint(100,200)
   exp.exp2+=random.randint(100,200)
   exp.gain()
   exp.level()
def attack_bill():
    global target
    global bill_HP
    bill = random.randint(2,3)
    if bill_HP > 0:

     if target == 0:
         bill = 1

     if bill == 1:
         target = random.randint(1,2)

         if target == 1:
             enter.print_slow("Bill is now targeting 2069.")
             
             

         if target == 2:
             enter.print_slow("Bill is now targeting 2077.")
             
                

     if bill == 2:
        enter.print_slow("SLASH RAGE")
        
        if target == 1:
            hit = random.randint(5,15)
            attack.HP1 -= hit
            print("Bill deals ", hit," damage to 2069.")
            
            

        if target == 2:
            hit = random.randint(5,15)
            attack.HP2 -= hit
            print("Bill deals ", hit," damage to 2077")
            
            

        if target == 1:
             enter.print_slow("Bill has stopped targeting 2069.")
             
             

        if target == 2:  
             enter.print_slow("Bill has stopped targeting 2077.")
             
             

        target = 0

     if bill == 3:
         print("TRIPLE SLASH")
         
         triple = random.randint(0,3)

         while triple > 0:

           if target == 2:
            enter.print_slow("Bill deals 5 damage to 2077.")
            
            attack.HP2 -= 5

           if target == 1:
            enter.print_slow("Bill deals 5 damage to 2069.")
            
            attack.HP1 -= 5
         triple-=1

def ellon_musk():
   global ellon_HP
   while ellon_HP>0:
    print("2069's health", attack.HP1)
    print("2077's health", attack.HP2)
    print("Ellon's health", ellon_HP)

    if attack.HP1 > 0:
        attack.attack1()

    if attack.HP2 > 0:
        attack.attack2()
    
    ellon_HP -= attack.damage
    boss.attack_ellon()

    if attack.HP2 < 0 and attack.HP1 < 0:


        GAME_OVER.restart
   exp.exp1+=random.randint(100,200)
   exp.exp2+=random.randint(100,200)
   exp.gain()
   exp.level()
def attack_ellon():
     bill = random.randint(1,3)
     if bill == 1:
         enter.print_slow("TOXIC")
         

         enter.print_slow("Both 2077 and 2069 are poisoned")
         
         
     if bill == 2:
        enter.print_slow("CONFUSING MIST")

        attack.mp1-=10
        
        
        enter.print_slow("2069 and 2077 are both confused and 2069 loses 10 mp")
     if bill == 3:
         enter.print_slow("BURNING SPEAR")
         damage=random.randint(5,10)
         attack.HP1-=damage
         attack.HP2-=damage
         print("2069 and 2077 and burned and take ",damage,"damage")
def double_boss():
   global bill_HP
   global ellon_HP
   while ellon_HP>0: 
    print("2069's health", attack.HP1)
    print("2077's health", attack.HP2)
    print("Bill's health", bill_HP)
    print("Jeff's health",ellon_HP)

    if attack.HP1 > 0:
        attack.attack1()

    if attack.HP2 > 0:
        attack.attack2()
    if bill_HP>0: 
     bill_HP -= attack.damage
    else:
     ellon_HP -= attack.damage
    if bill_HP>0:
     boss.attack_bill()
    boss.jeff_attack()

    if attack.HP2 < 0 and attack.HP1 < 0:

        GAME_OVER.restart()
   exp.exp1+=random.randint(200,400)
   exp.exp2+=random.randint(200,400)
   exp.gain()
   exp.level()
def jeff_attack():
    enter.print_slow("MIND BEND")
    damage=random.randint(1,4)
    attack.HP1-=damage*random.randint(1,3)
    attack.HP2-=damage*random.randint(1,3)
    enter.print_slow("2069 and 2077 take a random amount of damage")
def roomba_beam():
    enter.print_slow("ROOMBA BEAM")
    enter.print_slow("2069 and 2077 both are now no 1 HP")
    attack.HP1=1
    attack.HP2=1
def boss_rush():
    global Tri_HP
    while Tri_HP>0:
        if Tri_HP>0:
            boss.Tri_attack()
        if attack.HP1>0:
            attack.attack1()
        if attack.HP2>0:
            attack.attack2()

        Tri_HP-=attack.damage
def Tri_attack():
    global Tri_HP
    enter.print_slow("TRI FORCE")
    damage=0
    people_num=int(Tri_HP/200)+1
    person=random.randint(1,2)
    if person==1:
            person=2069
    if person==2:
            person=2077
    if people_num==4:
        enter.print_slow("FULL ON RUSH")
        print("Ellon musk:",person,"YOUR ABOUT TO FEEL IT")
        enter.print_slow("Bill Gates: RAGE SLASH")
        num=random.randint(10,20)
        print("Bill Gates deals",num,"Damage and takes",int(num/3),"damage")
        print()
        Tri_HP-=int(num/3)
        damage+=num
        enter.print_slow("Jeff bezos: RANDOM FORCE")
        enter.print_slow("Everyone takes a random amount of damage")
        damage+=random.randint(-10,20)
        Tri_HP+=random.randint(-10,20)
        enter.print_slow("Ellon musk: SPEAR RUSH")
        num=random.randint(2,7)
        num1=random.randint(2,7)
        num2=random.randint(2,7)
        damage+=num+num1+num2
        print("Ellon musk deals",num+num1+num2,"Damage")
    if people_num==3:
        enter.print_slow("TRI RUSH")
        print("Ellon musk:",person,"YOUR ABOUT TO FEEL IT")
        enter.print_slow("Bill Gates: RAGE SLASH")
        num=random.randint(10,20)
        print("Bill Gates deals",num,"Damage and takes",int(num/2),"damage")
        print()
        Tri_HP-=int(num/2)
        damage+=num
        enter.print_slow("Jeff bezos: RANDOM FORCE")
        enter.print_slow("Everyone takes a random amount of damage")
        damage+=random.randint(-20,20)
        Tri_HP+=random.randint(-20,20)
        enter.print_slow("Ellon musk: SPEAR RUSH")
        num=random.randint(2,5)
        num1=random.randint(2,5)
        num2=random.randint(2,5)
        damage+=num+num1+num2
        print("Ellon musk deals",num+num1+num2,"Damage")
    if people_num==2:
        enter.print_slow("DUAL RUSH")
        print("Ellon musk:",person,"YOUR ABOUT TO FEEL IT")
        enter.print_slow("Jeff bezos: RANDOM FORCE")
        enter.print_slow("Everyone takes a random amount of damage")
        damage+=random.randint(-20,20)
        Tri_HP+=random.randint(-20,20)
        enter.print_slow("Ellon musk: SPEAR RUSH")
        num=random.randint(2,5)
        num1=random.randint(2,5)
        num2=random.randint(2,5)
        damage+=num+num1+num2
        print("Ellon musk deals",num+num1+num2,"Damage")
    if people_num==1:
        enter.print_slow("SOLO RUSH")
        print("Ellon musk:",person,"YOUR ABOUT TO FEEL IT")
        enter.print_slow("Ellon musk: SPEAR RUSH")
        num=random.randint(2,5)
        num1=random.randint(2,5)
        num2=random.randint(2,5)
        damage+=num+num1+num2
        print("Ellon musk deals",num+num1+num2,"Damage")
    if person==2069:
        attack.HP1-=damage
    if person==2077:
        attack.HP2-=damage
def final():
        global Mark_Zuckerberg
        while Mark_Zuckerberg>0:
         if Mark_Zuckerberg>0:
            boss.Mark()
         if attack.HP1>0:
            attack.attack1()
            status.status_update2069()
         if attack.HP2>0:
            attack.attack2()
            status.status_update2077()
         if attack.move_tier<3:
          Mark_Zuckerberg-=attack.damage
         else:
          enter.print_slow("Mark Zuckerberg: YOU HAVE NO POWER IN THIS WORLD")
          enter.print_slow("Mark Zuckerberg takes 0 damage from your attacks")
def Mark():
    global Mark_Zuckerberg
    Mark=random.randint(1,5)
    if Mark==3:
     if Mark_Zuckerberg-20<=10:
        Mark=2
    if Mark_Zuckerberg<50:
        Mark=2
    if attack.HP2!=1 and attack.HP1!=1:
        Mark=1
    if Mark==1:
        enter.print_slow("FINAL SLASH")
        enter.print_slow("2069 and 2077 both are now no 1 HP")
        attack.HP1=1
        attack.HP2=1
    if Mark==2:
        enter.print_slow("LASH OUT")
        attack.HP1-=int((300-Mark_Zuckerberg)/4)
        attack.HP2-=int((300-Mark_Zuckerberg)/4)
        print("Both 2069 and 2077 take ",int((300-Mark_Zuckerberg)/4),"damage")
    if Mark==3:
        enter.print_slow("DOUBLE EDGED RUSH")
        attack.HP1-=20
        attack.HP2-=20
        Mark_Zuckerberg-=20
        enter.print_slow("Everyone takes 20 damage")
    if Mark==4:
        enter.print_slow("DARK RUSH")
        hit=4
        while hit>0:
         num=random.randint(1,2)
         if num==1:
          attack.HP1-=5
          print("2069 takes 5 damage")
          hit=random.randint(0,3)
         if num==2:
          attack.HP2-=5
          print("2077 takes 5 damage")
          hit=random.randint(0,3)
    if Mark==4:
       enter.print_slow("FIRE BLADE OF DARKNESS")
       num=random.randint(1,2)
       if num==1:
          attack.HP1-=30
          print("2069 takes 30 damage")
       if num==1:
          attack.HP2-=30
          print("2077 takes 30 damage")
          hit=random.randint(0,3)
    if attack.HP1<0 and attack.HP2>0:
        enter.print_slow("Mark Zuckerberg: YOUR FATE HAS BEEN SEALED 2077")
        attack.HP2=-999
    if attack.HP1>0 and attack.HP2<0:
        enter.print_slow("Mark Zuckerberg: YOUR FATE HAS BEEN SEALED 2069")
        attack.HP1=-999
    