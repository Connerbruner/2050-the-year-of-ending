import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

//Main class
class Game extends Tools {
        //emmi is enemie vars
    int emmi_HP = 0;
    int emmi_level = 0;
    int emmi_attack = 0;
    String emmi_type = "";
    //2069 and 2077 vars (non save)
    int HP1;
    int attack_num = 0;
    boolean attack_type;
    int last_attack=0;
    // boss health
    int bill_HP = 300;
    int Elon_HP = 150;
    int target = 0;
    int Tri_HP = 1000;
    int Mark_Zuckerberg = 300;
    // Array vars (placed in Save.txt)
    int missionnum = 10;
    int HP1m = 50;
    int cure_tier = 1;
    int level1 = 1;
    int exp1 = 0;
    int levelr1 = 20;

    int cureTier = 1;
    int max_hit = 5;


    //dungeon vars
    int dungeon_length = 0;
    //misc
    double power = 0;
    int num = 0;
    int type_num = 0;
    int speed = 20;
    int num1 = 0;
    int num2 = 0;
    int bonus = 0;
    int hit = 0;
    int damage = 0;
    int move_tier = 0;
    int attackTime = 0;
    int attackStun = 0;
    //obj
    Dungeon subway = new Dungeon("Underground subway",20,false);
    
    Scanner scanner = new Scanner(System.in);
    Attack aqua = new Attack("Aqua",7,15,7,8);
    Attack lasershot = new  Attack("Lasershot",7,10,5,6);
    Attack ember = new Attack("Ember",17,30,10,10);

    //Starts up 2069
    public void game() {
        //reset all health and MP values
        bill_HP = 300;
        Elon_HP = 150;
        target = 0;
        Tri_HP = 1000;
        Mark_Zuckerberg = 2000;
        HP1 = HP1m;
        //Runs mission forever
        while (true) {
            String choice = "STR";
            sPrint("Type 1 -> " + missionnum + " to try that Mission");
            //Tells you how to roll the gotcha
            if (missionnum > 1) {
                sPrint("Type 'exp' to trade exp for new moves");
            }
            sPrint("which Mission would you like to try?   ");
            choice = scanner.nextLine();
            System.out.println();;
//mission 1
            if (choice.equals("1")) {
                sPrintln("CHAPTER 1: The Tower of Power");
                sPrintln("Mission 1: The Awakening of  The Revolution");
                if (skip()) {
                    mission1_1();
                    mission1_2();
                }

                if (skip()) {
                    mission1_3();
                }
                mission1_4();

                if (missionnum < 2) {
                    missionnum = 2;
                    sPrintln("MISSION 2 UNLOCKED");
                    emmi_type = "NOT";
                }
            }
//Mission 2
            if ((choice.equals("2")) && (missionnum >= 2)) {
                sPrintln("Mission 2: First Encounters");

                if (skip()) {
                    mission2_1();
                }

                if (skip()) {
                    mission2_2();
                }
                boss_bill();

                if (skip()) {
                    mission2_3();
                }
                if (missionnum < 3) {
                    missionnum = 3;
                    sPrintln("MISSION 3 UNLOCKED");
                }
            }
//Misson 3
            if ((missionnum >= 3) && (choice.equals("3"))) {
                sPrintln("MISSION 3: Rest In The Rubble");
                if (skip()) {
                    mission3_1();
                }

                if (skip()) {
                    mission3_2();
                }
                Elon_musk();

                if (skip()) {
                    mission3_3();
                }

                if (skip()) {
                    mission3_4();
                }
                if (missionnum < 4) {
                    missionnum = 4;
                    sPrintln("MISSION 4 UNLOCKED");
                }
                sPrintln("MISSION 3 END");
            }
//Mission 4
            if ((missionnum >= 4) && (choice.equals("4"))) {
                sPrintln("Mission 4: 101 battles");

                if (skip()) {
                    mission4_1();
                }

                if (skip()) {
                    mission4_2();
                }
                if (missionnum < 5) {
                    missionnum = 5;
                    sPrintln("mission 5 UNLOCKED");
                }
            }
//Mission 5
            if ((missionnum >= 5) && (choice.equals("5"))) {
                sPrintln("Mission 5: Rematch Squared");

                if (skip()) {
                    mission5_1();
                }

                if (skip()) {
                    mission5_2();
                }
                double_boss();
                if (skip()) {
                    mission5_3();
                }
                if (missionnum < 6) {
                    missionnum = 6;
                    sPrintln("MISSION 6 UNLOCKED");
                }
            }
//Mission 6
            if ((missionnum >= 6) && (choice.equals("6"))) {
                sPrintln("Mission 6: The Smoking Gun");
                if (skip()) {
                    mission6_1();
                }
                
                if (skip()) {
                    mission6_2();
                }
                if (missionnum < 7) {
                    missionnum = 7;
                    sPrintln("MISSION 7 UNLOCKED");
                }
            }
//Mission 7
            if ((missionnum >= 7) && (choice.equals("7"))) {
                sPrintln("Mission 7: The Rules Of The Roomba");

                if (skip()) {
                    mission7_1();
                }

                if (skip()) {
                    mission7_2();
                }
                if (missionnum < 8) {
                    missionnum = 8;
                    sPrintln("MISSION 8 UNLOCKED");
                }
            }
//Mission 8
            if ((missionnum >= 8) && (choice.equals("8"))) {
                sPrintln("MISSION 8 When I Step off");
                mission8_1();

                mission8_2();
                if (missionnum < 9) {
                    missionnum = 9;
                    sPrintln("MISSION 9 UNLOCKED");
                }
            }
//Mission 9
            if ((missionnum >= 9) && (choice.equals("9"))) {
                sPrintln("Mission 9: Face-Off On The Grand Tower");
                mission9_1();
                boss_rush();
                mission9_2();
                if (missionnum < 9) {
                    missionnum = 9;
                    sPrintln("MISSION 9 UNLOCKED");
                }
            }
//Mission 10
            if ((missionnum >= 10) && (choice.equals("10"))) {
                sPrintln("mission 10: 2 Sides Of The Same Coin");
                mission10_1();
                Final();
                mission10_2();
                if (missionnum < 11) {
                    missionnum = 11;
                    sPrintln("MISSION 11 UNLOCKED");
                }
            }
            if ((missionnum >= 11) && (choice.equals("11"))) {
                sPrintln("CHAPTER 2: Rising Tides");
                sPrintln("mission 11: X3090");

            }
//Gotcha system
            if ((choice.equals("exp")) && (missionnum > 1)) {
                pull();
            }
                ArrayList<Object> arrList = new ArrayList<Object>();
        arrList.add(missionnum);
        arrList.add(HP1m);
        arrList.add(aqua.attackTier);
        arrList.add(lasershot.attackTier);
        arrList.add(cure_tier);
        arrList.add(ember.attackTier);
        arrList.add(level1);
        arrList.add(exp1);
        arrList.add(levelr1);
        arrList.add(max_hit);
        Edit("Save.txt", arrList);
        }
        
    }

    //shows you what attacks you can use
    public void attack()  {

        attack_num = 0;
        sPrint("2069's turn");

        sPrint("1: " + aqua.attackName);

        sPrint("2: " + lasershot.attackName);

        sPrint("3: Cure");

        sPrint("4: " + ember.attackName);
        System.out.println();;
        //This while loop just
        long start_Time = System.currentTimeMillis();

        sPrint("Which attack? (1-4)   ");
        attack_num = scanner.nextInt();

        System.out.println();;

        sPrint("Out Power or Out Speed (Power=false)(Speed=true)");
        attack_type = scanner.nextBoolean();
        System.out.println();;

        long end_Time = System.currentTimeMillis();
        attackTime = (int)((end_Time-start_Time)/1000);
        if(attack_num==1)
        {
            attackTime+=aqua.getSpeed(attack_type);
            attackStun=aqua.getSpeed(attack_type);
        }
        if(attack_num==2)
        {
            attackTime+=lasershot.getSpeed(attack_type);
            attackStun=lasershot.getStun(attack_type);

        }
        if(attack_num==4)
        {
            attackTime+=ember.getSpeed(attack_type);
            attackStun=ember.getSpeed(attack_type);
        }
    }
    //choses a method
    public int choseAttack(double power) {
        if (attack_num == 1) {
            num = aqua.attack(power,attack_type);
        }
        if (attack_num == 2) {
            num = lasershot.attack(power,attack_type);
        }
        if (attack_num == 3) {
            cure(power);
        }
        if (attack_num == 4) {
            num = ember.attack(power,attack_type);
        }
        last_attack=attack_num;
        return num;
    }
    //embers method

    //cure method
    public void cure(double power) {
        if(attack_type)
        {
            sPrintln("dodging Cure");
            num=(int) (random(cure_tier * 2, cure_tier * 5) * power)*2;
        }
        else
        {
            sPrintln("Cure shield");
            num=(int) (random(cure_tier * 5, cure_tier * 20) * power);
        }
        HP1 += num;
        sPrintln("2069's heal " + num + " damage");
    }


    //2077's code
    public int attack2() {
        sPrintln("2077's turn");

//starts quicktime event
        num = quickTime() * max_hit;
        sPrintln("2077 Deals " + num + " Damage");
        return num;

    }

    public int quickTime() {
        long startTime = System.currentTimeMillis();
        int i = 0;
        while (startTime + 10000 > System.currentTimeMillis()) {
            sPrint("Type Kick");
            while (startTime + 10000 > System.currentTimeMillis()) {
                if (scanner.nextLine().equals("Kick")) {
                    break;
                }

            }
            sPrint("Type Punch");
            while (startTime + 10000 > System.currentTimeMillis()) {
                if (scanner.nextLine().equals("Punch")) {
                    break;
                }

            }
            i++;

        }
        return i;
    }

    //Bill Gates boss fight
    public void boss_bill() {
        while (bill_HP > 0) {
            sPrintln("2069's health " + HP1);
            sPrintln("Bill's health " + bill_HP);
            //2069 attacks
            if (HP1 > 0) {
                attack();
            }
            //2077 attacks
            bill_HP -= damage;
            //bill gates attacks
            attack_bill();
            //checks for game over
            if (HP1 < 0) {
                restart();
            }

        }
        //gives the player some exp for winning
        exp1 += random(100, 200);
        gain();

    }

    //bill gates attack
    public void attack_bill() {

        int bill = random(1, 3);


        if (bill_HP > 0) {
//small bit of smarts
            if (target == 0) {
                bill = 1;
            }
//target attack
            if (bill == 1) {
                target = random(1, 2);

                if (target == 1) {
                    sPrintln("Bill is now targeting 2069.");
                }


                if (target == 2) {
                    sPrintln("Bill is now targeting 2077.");
                }


            }
            //slash rage attack
            if (bill == 2) {
                sPrintln("SLASH RAGE");

                if (target == 1) {
                    hit = random(5, 15);
                    HP1 -= hit;
                    sPrintln("Bill deals  " + hit + "  damage to 2069.");
                }


                if (target == 2) {
                    hit = random(5, 15);
                    sPrintln("Bill deals  " + hit + "  damage to 2077");
                }


                if (target == 1) {
                    sPrintln("Bill has stopped targeting 2069.");
                }


                if (target == 2) {
                    sPrintln("Bill has stopped targeting 2077.");
                }


                target = 0;
            }
            //Triple slash attack
            if (bill == 3) {
                sPrintln("TRIPLE SLASH");

                int triple = random(0, 3);

                while (triple > 0) {
                    if (target == 2) {
                        sPrintln("Bill deals 5 damage to 2077.");
                    }

                    if (target == 1) {
                        sPrintln("Bill deals 5 damage to 2069.");

                        HP1 -= 5;
                    }
                    triple -= 1;
                }
            }
        }

    }

    //Elon musk boss fight
    public void Elon_musk() {
        while (Elon_HP > 0) {
            sPrintln("2069's health " + HP1);
            sPrintln("Elon's health " + Elon_HP);
            //2069 attacks
            if (HP1 > 0) {
                attack();
            }
            //2077 attacks

            Elon_HP -= damage;
            //Elon attacks
            attack_Elon();
            //checks for games over
            if (HP1 < 0) {
                restart();
            }
        }
        //gives a you some exp for winning
        exp1 += random(100, 200);
        gain();

    }

    //Elon musk attack
    public void attack_Elon() {
        int bill = random(1, 3);
        //heals musk
        if (bill == 1) {
            sPrintln("HEALING MIST");
            Elon_HP += 10;
            sPrintln("Elon heals 10 damage");
        }
        //lowers your MP
        if (bill == 2) {
            sPrintln("SPEAR RUSH");
            num = random(1, 2);
            if (num == 1) {
                damage = random(5, 15);
                sPrintln("2077 take  " + damage + " damage");
            }
            if (num == 2) {
                damage = random(5, 15);
                sPrintln("2060 take  " + damage + " damage");
            }

        }
        //Deals damage
        if (bill == 3) {
            sPrintln("BURNING SPEAR");
            damage = random(5, 10);
            HP1 -= damage;
            sPrintln("2069 and 2077 take  " + damage + " damage");
        }
    }

    //Double boss (bill gates and Jeff bezos)
    public void double_boss() {
        while (Elon_HP > 0) {
            sPrintln("2069's health " + HP1);
            sPrintln("Bill's health " + bill_HP);
            sPrintln("Jeff's health " + Elon_HP);
            //2069 attacks
            if (HP1 > 0) {
                attack();
            }
            //2077 attacks

            if (bill_HP > 0) {
                bill_HP -= damage;
            } else {
                Elon_HP -= damage;
            }
            //bill attack
            if (Elon_HP > 0) {
                attack_bill();
                jeff_attack();
            }
            //checks for gameOver
            if (HP1 < 0) {
                restart();
            }
        }
        //Gives you exp
        exp1 += random(200, 400);
        gain();

    }

    //jeff bezos attack
    public void jeff_attack() {
        sPrintln("MIND BEND");
        damage = random(1, 4);
        HP1 -= damage * random(1, 3);
        sPrintln("2069 and 2077 take a random amount of damage");
    }

    //sets 2069s and 2077s hp to 1
    public void roomba_beam() {
        sPrintln("ROOMBA BEAM");
        sPrintln("2069 and 2077 both are now no 1 HP");
        HP1 = 1;
    }

    //Fight all the tech giants
    public void boss_rush() {
        while (Tri_HP > 0) {
            Tri_attack();
            if (HP1 > 0) {
                attack();
            }

            Tri_HP -= damage;
            if  (HP1 < 0) {
                restart();
            }
        }
    }

    //Tech gaint rush
    public void Tri_attack() {

        sPrintln("TRI FORCE");
        damage = 0;
        int people_num = (Tri_HP / 200) + 1;
        int person = random(1, 2);
        if (person == 1) {
            person = 2069;
        }
        if (person == 2) {
            person = 2077;
        }
        if (people_num == 4) {
            sPrintln("FULL ON RUSH");
            sPrintln("Elon musk: " + person + " YOUR ABOUT TO FEEL IT");
            sPrintln("Bill gates: RAGE SLASH");
            num = random(10, 20);
            sPrintln("Bill Gates deals " + num + " Damage and takes " + (num / 3) + " damage");
            System.out.println();;
            Tri_HP -= num / 3;
            damage += num;
            sPrintln("Jeff bezos) RANDOM FORCE");
            sPrintln("Everyone takes a random amount of damage");
            damage += random(-10, 20);
            Tri_HP += random(-10, 20);
            sPrintln("Elon musk) SPEAR RUSH");
            num = random(2, 7);
            int num1 = random(2, 7);
            int num2 = random(2, 7);
            damage += num + num1 + num2;
            sPrintln("Elon musk deals " + num + num1 + num2 + " Damage");
        }
        if (people_num == 3) {
            sPrintln("TRI RUSH");
            sPrintln("Elon musk) " + person + " YOUR ABOUT TO FEEL IT");
            sPrintln("Bill Gates) RAGE SLASH");
            num = random(10, 20);
            sPrintln("Bill Gates deals " + num + " Damage and takes " + (num / 2) + " damage");
            System.out.println();;
            Tri_HP -= num / 2;
            damage += num;
            sPrintln("Jeff bezos) RANDOM FORCE");
            sPrintln("Everyone takes a random amount of damage");
            damage += random(-20, 20);
            Tri_HP += random(-20, 20);
            sPrintln("Elon musk) SPEAR RUSH");
            num = random(2, 5);
            num1 = random(2, 5);
            num2 = random(2, 5);
            damage += num + num1 + num2;
            sPrintln("Elon musk deals " + num + num1 + num2 + " Damage");
        }
        if (people_num == 2) {
            sPrintln("DUAL RUSH");
            sPrintln("Elon musk) " + person + " YOUR ABOUT TO FEEL IT");
            sPrintln("Jeff bezos) RANDOM FORCE");
            sPrintln("Everyone takes a random amount of damage");
            damage += random(-20, 20);
            Tri_HP += random(-20, 20);
            sPrintln("Elon musk) SPEAR RUSH");
            num = random(2, 5);
            num1 = random(2, 5);
            num2 = random(2, 5);
            damage += num + num1 + num2;
            sPrintln("Elon musk deals " + num + num1 + num2 + " Damage");
        }
        if (people_num == 1) {
            sPrintln("SOLO RUSH");
            sPrintln("Elon musk) " + person + " YOUR ABOUT TO FEEL IT");
            sPrintln("Elon musk) SPEAR RUSH");
            num = random(2, 5);
            num1 = random(2, 5);
            num2 = random(2, 5);
            damage += num + num1 + num2;
            sPrintln("Elon musk deals " + num + num1 + num2 + " Damage");
        }
        if (person == 2069) {
            HP1 -= damage;
        }
        if (person == 2077) {
        }
    }

    //Final boss
    public void Final() {
        while (Mark_Zuckerberg > 0) {
            Mark();
            if (HP1 > 0) {
                attack();
            }
            if (move_tier < 3) {
                Mark_Zuckerberg -= damage;
            }
            if(HP1 < 0) {
                restart();
            } else {
                sPrintln("Mark Zuckerberg: YOU HAVE NO POWER IN THIS WORLD");
                sPrintln("Mark Zuckerberg takes 0 damage from your attacks");
            }
        }

    }

    //Final boss attack
    public void Mark() {
        int Mark = random(1, 5);
        if (Mark == 3) {
            if (Mark_Zuckerberg - 20 <= 10) {
                Mark = 2;
            }
        }
        if (Mark_Zuckerberg < 50) {
            Mark = 2;
        }
        if ( HP1 != 1) {
            Mark = 1;
        }
        if (Mark == 1) {
            sPrintln("FINAL SLASH");
            sPrintln("2069 and 2077 both are now no 1 HP");
            HP1 = 1;
        }
        if (Mark == 2) {
            sPrintln("LASH OUT");
            HP1 -= (300 - Mark_Zuckerberg) / 4;
            sPrintln("Both 2069 and 2077 take  " + ((300 - Mark_Zuckerberg) / 4) + " damage");
        }

        if (Mark == 3) {

            sPrintln("DOUBLE EDGED RUSH");

            HP1 -= 20;
            Mark_Zuckerberg -= 20;

            sPrintln("Everyone takes 20 damage");
        }
        if (Mark == 4) {
            sPrintln("DARK RUSH");
            hit = 4;
            while (hit > 0) {
                num = random(1, 2);
                if (num == 1) {
                    HP1 -= 5;
                    sPrintln("2069 takes 5 damage");
                    hit = random(0, 3);
                }
                if (num == 2) {
                    sPrintln("2077 takes 5 damage");
                    hit = random(0, 3);
                }
            }
        }
        if (Mark == 5) {
            sPrintln("FIRE BLADE OF DARKNESS");
            num = random(1, 2);
            if (num == 1) {
                HP1 -= 30;
                sPrintln("2069 takes 30 damage");
            }
            if (num == 1) {
                sPrintln("2077 takes 30 damage");
            }
        }
    }

    //Mission Text
    public void mission1_1() {
        sPrintln("Welcome to the year 2050. Things aren't going so well.");


        sPrintln("It began with the question: What was causing climate change?");

        sPrintln(
                "Some thought it was the new technology, the politician's denial, or people's aversion to change."
        );
        sPrintln("Some thought it was the wizards.");

        sPrintln(
                "After all, any sufficiently advanced technology had become indistinguishable from magic."
        );

        sPrintln("But now that we're here, does it really matter anyway?");

        sPrintln("It started on a normal day in October.");

        sPrintln("Blackouts suddenly swept the whole world");

        sPrintln(
                "Soon after, every robot had been taken over. Roombas eating the small and weak"
        );

        sPrintln("Now, we are the only living humans left on this planet");


        sPrintln(
                "My name is 2069. With the help of my friend 2077. We plan to get our vengeance."
        );
    }

    //Mission Text
    public void mission1_2() {
        sPrintln("WAKE UP, 2069!");

        sPrintln("2069: Okay, okay, 2077.");

        sPrintln("2077: It's October 12th, 2050");


        sPrintln(
                "2077: Today. It's the day we begin our journey to take back the world. Don't you remember?"
        );

        sPrintln("2069: I could never forget.");

        sPrintln("*Suddenly, lights turn on everywhere*");


        sPrintln("2069: Wha-");


        sPrintln("2077: We need to turn off the power!");


        sPrintln(
                "2077: The only reason they would turn it on would be to control the world"
        );


        sPrintln("2077: The powerplant is in the underground subway.");


        sPrintln("2069: Right - let's go.");

        sPrintln("*Later in the subway*");
    }

    public void mission2_1() {
        sPrintln("*2077 pulls the kill switch in the powerplant*");


        sPrintln(
                "2069 (yelling): Alright, we should head back to the surface!");

        sPrintln("2077: Right!");

        sPrintln("*Later at the surface*");


        sPrintln("2069: It's good to see that everything is powered off");


        sPrintln(
                "2077: Quick! Look at that mech flying to the top of the tower!"
        );


        sPrintln("2069: WAIT!");


        sPrintln("2077: It's sending a electrical pulse!");


        sPrintln("2069: All of our hard work..");


        sPrintln("2069: Down the drain...");

        sPrintln("2077: WE ARE GOING TO KILL THAT DUMB MECH");
    }

    public void mission1_3() {
        sPrintln(
                "2069: It appears that the powerplant has taken some damage due to the power being shut off."
        );


        sPrintln("old man: Help...please help");


        sPrintln("2077: 2069 we need to help him");


        sPrintln("2069: I got it");
    }

    public void mission1_4() {
        sPrintln(
                "old man: Thank you. I can't thank you enough. I am forever in your debt.");

        sPrintln("old man: As a gift here is 100xp");


        String choice = "";
        //old man gift
        while ((!choice.equals("2069")) && (!choice.equals("2077"))) {
            sPrintln("Who will you give this exp to? (2069 or 2077)   ");
            choice = scanner.nextLine();
        }
        if (choice.equals("2077")) {
        }

        if (choice.equals("2069")) {
            exp1 += 100;
        }

        gain();

        sPrintln("Old Man: Oh I should tell you my name. Its 2020");
        sPrintln("2020: I can teach you new abilities in trade for ");
    }

    public void mission2_2() {
        sPrintln("2069: Finally, I have not ran so fast in my life");


        sPrintln("*the mech's face shield opens up*");


        sPrintln("Bill gates: Heh...");


        sPrintln("Bill gates: You can't be any slower, can you?");


        sPrintln("2077: Bill? You're the one behind this?");


        sPrintln("2069: You leave us no choice.");


        sPrintln("2077: FOR HUMANITY!!");
    }

    public void mission2_3() {
        sPrintln("Bill: You put a good fight");


        sPrintln("2077: We finsh this sight here right now");


        sPrintln("2069: EMBER");


        sPrintln("The mech crashes down");


        sPrintln("Bill: Sadly This is not over");


        sPrintln("Bill gate disappears");


        sPrintln("The power turns back off");
    }

    public void mission3_1() {
        sPrintln("2069: How can he just disappear");


        sPrintln("2077: We shoud hunt down bill gates");


        sPrintln("2069: lets head for washington");


        sPrintln("2077: Louisiana to washington is a long trip");


        sPrintln("2069: I miss the power");


        sPrintln("2020: I amy be able to help");


        sPrintln("2020: Meet the bill gates proff car");


        sPrintln("2020: It uses oxygen to power its self and cant be hacked");


        sPrintln("2020: I have had it for a while just never used it ");


        sPrintln("2069: away we go");


        sPrintln("Later in texas");
    }

    public void mission3_2() {
        sPrintln("Elon musk: What are you guys doing");


        sPrintln("Elon musk: ....");


        sPrintln("Elon musk: You need to be dealt with");


        sPrintln("2077: We will be dealing with you ");


        sPrintln("Elon musk pulls out a spear");
    }

    public void mission3_3() {
        sPrintln("Elon musk: I must leave I have a meeting to attend to");


        sPrintln("Elon musk fades away");


        sPrintln("2077: YOUR GOING PAY FOR THIS");


        sPrintln("2069: Lets take this chance to turn off the power");


        sPrintln("2069: It would make travel much easier");


        sPrintln("2077: fine...");
    }

    public void mission3_4() {
        sPrintln("2069:And ... the powers off");


        sPrintln("2069:Okay lets report back to 2020");


        sPrintln("2077:The old fart is probably worried sick");


        sPrintln("2069:Its not like we are any close to being responsible");
    }

    public void mission4_1() {
        sPrintln("2069:We should take a detour to california ");


        sPrintln("2077 and 2020: why?");


        sPrintln("2069: I have a theory both Elon musk and bill gates are part of the blackouts then maybe other tech giants are behind this like zuckerberg and he lives in california ");


        sPrintln("2077: True I see it happening");


        sPrintln("2020: Lets go!");


        sPrintln("Later on route 101");


        sPrintln("Lights everywhere begin to turn on");


        sPrintln("2077:This is bad");


        sPrintln("2069: 2020 floor it");
    }

    public void mission4_2() {
        sPrintln("2069: It appears that calfornia is very dangerous");


        sPrintln("2077: I bet that the group responsible for this has their headquarters in california");
    }

    public void mission5_1() {
        sPrintln("2069: We should find a 6-11 to stop and rest at");


        sPrintln("2077: I am so tired");


        sPrintln("2020: We are in luck there is one at the nearest exit");
    }

    public void mission5_2() {
        sPrintln("Later in the morning");


        sPrintln("2020: EVERYONE UP");


        sPrintln("2069: ...fine");


        sPrintln("2077: right...");


        sPrintln("Later in washington");


        sPrintln("2069:It appers that the power is on");


        sPrintln("Suddenly 2 mechs crash down infront of 2069,2020 and 2077");


        sPrintln("Jeff bezos: It appers that they have showen up early");


        sPrintln("Bill gates: Your guys are faster than normal");


        sPrintln("Jeff bezos: Let me take care of them");


        sPrintln("2077: WE WILL TAKE YOU BOTH");


        sPrintln("Bill gates: Fine I guess I will join in");
        bill_HP = 200;
        Elon_HP = 200;
    }

    public void mission5_3() {
        sPrintln("Jeff bezos: You did not tell me that these kids could put up a fight");
        sPrintln("Bill gates: Nevermind that we need to leave NOW");
        sPrintln("Jeff bezos: Right");
    }

    public void mission6_1() {
        sPrintln("*Power flashs on everywhere*");
        sPrintln("2069: What the...");
        sPrintln("mark zuckerberg (on tv): Hello everyone it appears that 4 of us are rebeling againest our new way of life");
        sPrintln("2077: We need to get to california and fast");
        sPrintln("2069: right lets go!");
        sPrintln("2020: Got the car started");
        sPrintln("*Later down the road*");
        sPrintln("2069: Bad news 2 mechs are coming in on us on the left");
        sPrintln("2069: Worse 2 mechs right");
        sPrintln("2020: We need to deal with them");
    }

    public void mission6_2() {
        sPrintln("2077: Peice of cake ");
        sPrintln("2069: Easy for you to say");
        sPrintln("2020: We have a issue the car has broken down we are going to have to walk the rest of the way");
        sPrintln("2077: THAT JUST GREAT");
        sPrintln("2069: Now we are in real danger");
    }

    public void mission7_1() {
        sPrintln("2077: I am soooOO tired");
        sPrintln("2069: When is the nearest stop");
        sPrintln("2020: About 5 miles");
        sPrintln("2069 and 2077: YOU HAVE GOT TO BE KINDING ME");
        sPrintln("2020: Look at the map");
        sPrintln("2069: It appers that there is a stop in 3 miles");
        sPrintln("2077: I miss that car ");
        sPrintln("*Later*");
        sPrintln("2069: Look a old factory");
        sPrintln("2077: lets stop at the factory");
    }

    public void mission7_2() {
        sPrintln("2069: Well the factory was less than effective");
        sPrintln("2077: You can say that again");
        sPrintln("2020: Boys...");
        sPrintln("2069: 2020 You good");
        sPrintln("2020: Your going to have to go on without me");
        sPrintln("2020: Go You are the heroś");
        sPrintln("2077: NO WE ARE THE HEROS");
        sPrintln("2020: Boys...");
        sPrintln("2077: ALL 3 OF US");
        sPrintln("2020: Okay fine I will go with");
        sPrintln("2069: YOUR GOING DOWN MARK ZUCKERBERG");
    }

    public void mission8_1() {
        sPrintln("2069: We are closing in on califonia we should be their by tomorrow");
        sPrintln("2077: I READY! LETS FINISH THIS");
        sPrintln("2069: Right,This final push will be the hardest");
        sPrintln("2069: This road should take us most of the way");
        sPrintln("2077: Alright,I am ready");
    }

    public void mission8_2() {
        sPrintln("2069: GET BACK");
        sPrintln("2069: Look its Elon Musk");
        sPrintln("2077: We follow him into the building");
        sPrintln("2069: Right,Be quite");
    }

    public void mission9_1() {
        sPrintln("2069: Give Elon musk a chance to get inside");
        sPrintln("2077: Right");
        sPrintln("5 mins later");
        sPrintln("2069: Now is our chance");
        sPrintln("2077: Right");
        sPrintln("2069: We need to get to the top floor");
        sPrintln("2077: Okay (Press up on the elevator");
        sPrintln("*Suddenly the elevator stops*");
        sPrintln("Elon musk: I SEE THAT YOU HAVE FOUND YOUR WAY TO OUR HIDEOUT");
        sPrintln("Bill gates: Lets clean up this error in our plan");
    }

    public void mission9_2() {
        sPrintln("Elon musk: ...THESE KIDS");
        sPrintln("Jeff bezos: We need to retreat");
        sPrintln("2077: NEVER");
        sPrintln("2069: You will pay for what you have done");
        sPrintln("2069: LETS FINSIH THIS");
        sPrintln("2069: " + ember.attackName);
        sPrintln("Elon musk: ...My final words");
        sPrintln("Elon musk: You are the winner and I am the...");
        sPrintln("2077: They deserve to die alone");
        sPrintln("2069: Right to the elevator");
    }

    public void mission10_1() {
        sPrintln("*At the top of the elevator*");
        sPrintln("Mark Zuckerberg: I have been waiting");
        sPrintln("2069: Zuckerberg: why what is the reasoning behind this");
        sPrintln("Mark Zuckerberg: Power POWER IS EVERYTHING. I cant control humans you pesky humans. However Cyborgs on th other hand can be controlled.");
        sPrintln("2077: YOU KILLED MILLIONS OF HUMANS JUST TO HAVE CONTROL");
        sPrintln("Mark Zuckerberg: This world is mine. Humans have handed this world to me on a sliver platter. You cant just take it back");
        sPrintln("2069: This is not your world its everyone's world");
        sPrintln("Mark Zuckerberg: YOU WILL HAVE TO OVERCOME ME");
    }

    public void mission10_2() {
        sPrintln("Mark Zuckerberg: Sigh, It apears musk was right");
        sPrintln("2069: What?");
        sPrintln("Mark Zuckerberg: Luckly I was ready for this");
        sPrintln("Mark Zuckerberg: I present the X3090");
        sPrintln("Mark Zuckerberg: A nuclear missile containg 1000s of the parsite Z");
        sPrintln("Mark Zuckerberg: The same parasite That killed 1000s. It takes control of technology. IT Alos is VERY hostile to humans");
        sPrintln("Mark Zuckerberg: Said missile is set to land rihgt dead center in the middle of the arctic causing rapid cimiate change and rising sea levels ");
        sPrintln("Mark Zuckerberg: All triggered by THIS BUTTON");
        sPrintln("Mark Zuckerberg: 3                              2                                           1");
        sPrintln("2077: NOOOOOOOOOOOO");
        sPrintln("2069: NOOOOOOOOOOOO");
        sPrintln("Mark Zuckerberg: GoodBye");
        sPrintln("*Mark Zuckerberg disappears*");
    }

    public void mission11_1() {
        sPrintln("2069: 2077 Exit?");
        sPrintln("2077: Exit over there");
        sPrintln("2069: Great");
        sPrintln("2069: The Bomb should raise the sea level 750ft. Meaning most buildings are going to be submearged");
        sPrintln("2069: We have 1 hour before the sea will be submearged");
        sPrintln("2077: Lets use this Tower as out base. I need to start work on a way to move from tower to tower");
        sPrintln("2069: sounds good");
        sPrintln("2069: While you do that Let me scout");
    }

    public void pull() {

        if (exp1 > 0) {
            sPrintln("2069 exp " + exp1);
            sPrint("how much exp would you like to use? ");
            num = scanner.nextInt();
            int pull_num = num / 25;
            exp1 -= num;
            if (exp1 < 0)
                num = -exp1;
            exp1 = 0;
            while (pull_num > 0) {
                roll();
                pull_num -= 1;
            }
        } else {
            sPrintln("YOU NEED MORE EXP POOR PERSON");
        }

    }

    //gotcha
    public void roll() {
        int[] odds = new int[] {1,1,1,1,2,2,2,3,3,3,4,4,5,6,7};
        int tier = random(0,odds.length-1);
        if (tier == 1) {
            HP1m += 2;
            sPrintln("2069's max Hp increased by 2");
        } else if ((tier == 2) || (tier == 3) || (tier == 4) || (tier == 5))
            num = random(1, 4);
        //Ember level up
        if (num == 4) {
            if (tier > ember.attackTier) {
                sPrintln("ember leveled up");
                sPrintln(ember.attackTier + " --> " + tier);
                ember.setAttackTier(tier);


            }
            // Cure level up
            if (num == 3) {
                if (tier > cure_tier)
                {
                    sPrintln("Cure leveled up");
                    sPrintln(cure_tier + " -->" + tier);
                    cure_tier=tier;
                }

            }
        }
        //aqua level up
        if (num == 1) {
            if (tier > aqua.attackTier) {
                sPrintln("Aqua leveled up");
                sPrintln(aqua.attackName + " --> " + tier);
                aqua.setAttackTier(tier);



            }
        }
        //Laser level up
        if (num == 2) {
            if (tier > lasershot.attackTier) {
                sPrintln("Laser leveled up");
                sPrintln(lasershot.attackTier + " --> " + tier);
                lasershot.setAttackTier(tier);

            }
        }
        if (tier == 6) {
            max_hit += 1;
            sPrintln("2077's power of each hit incressesed by 1");
        }
        if (tier == 7) {
            max_hit += 2;
            sPrintln("2077's power of each hit incressesed by 2");
        }
        sPrintln("roll complete");
    }


    public void gain(){
        if (emmi_HP == 0) {
            bonus = (100 * emmi_level);
            sPrintln("You received a bonus " + bonus + " exp");
        } else if (emmi_HP >= -5) {
            bonus = (75 * emmi_level) - (emmi_HP * 10);
            sPrintln("You received a bonus " + bonus + " exp");
        } else {
            bonus = 0;
            exp1 += (emmi_level) + bonus;
        }
        if (exp1 >= levelr1) {
            sPrintln("LEVEL UP");
            sPrintln(level1 + " --> " + (level1 + 1));
            sPrintln("2069: max health +1");
            HP1m++;
            level1++;
            levelr1 = exp1 + 20 * (level1 * level1) / 2;
            sPrintln("2069 has" + (levelr1 - exp1) + "exp till leveling up");
        }



    }


        //fight enemies
    public void battle() {
        while (emmi_HP > 0) {
            sPrint("2069 health " + HP1);
            sPrint(emmi_type + " health " + emmi_HP);
            System.out.println();;
            emmi_attack = 0;
            emmi_prep();
            
            attack();
            
            attack_emmi();
            if(power>0)
            {
                emmi_HP -= choseAttack(power);
            }

            if(power>0)
            {
                emmi_HP-= attack2();
            }

            if (HP1 > HP1m) {
                HP1 = HP1m;
            }

            if (HP1 < 0) {
                restart();
            }
        }

        gain();

    }

    




    //Game Over
    public void restart() {
        sPrintln("GAME OVER");
        sPrintln("???: You seem to be overwhelmed");
        sPrintln("???: I may be able to help");
        sPrintln("???: Your only hope now is to turn back the hands of time");
        sPrintln("2077:I see nothing wrong with that");
        sPrintln("2069: Please help us");
        String choice = "How are you doing";
        while (!choice.equals("START")) {
            sPrint("Type ¨START¨ to continue     ");
            choice = scanner.nextLine();
        }
        System.out.println();;
        sPrintln("PUT GAME HERE");
    }

    /**
     * Returns false on "Yes, yes, y, or Y"
     */
    public boolean skip() {
        sPrint("Skip cutscene?   ");

        String skip = scanner.nextLine();
        boolean yesSkip = skip.equals("yes") || skip.equals("Yes") || skip.equals("Y") || skip.equals("y");
        return !yesSkip;
    }


   

    //enemies attack
    public void attack_emmi() {
        power = 1;
        //Roomba attacks
        if (emmi_type.equals("Roomba")) {
            if (emmi_attack == 1 && attackTime<23 &&attackStun<5) {
            
                    power = 0.3;
                    sPrintln("ROOMBA RUSH");
                    num = emmi_HP * 2;
                    HP1 -= num;
                    sPrintln("Roomba deals " + num + " damage");
                }
            
            if (emmi_attack == 2 && attackTime<15 &&attackStun<3) {
                    
                    sPrintln("RECHARGE");
                    num = (int) (emmi_HP * 0.5);
                    sPrintln("Roomba heals " + num + " damage");
                }
            
            if (emmi_attack == 3 && attackTime<15 &&attackStun<6) {
                    power = 0.6;
                    sPrintln("CHARGE BEAM");
                    num = (emmi_HP * random(1, 3));
                    HP1 -= num;
                    sPrintln("Roomba deals " + num + " damage");
                }
            
        }
        //Dog bot attacks
        if (emmi_type.equals("Dog bot")) {
            if (emmi_attack == 1 && attackTime<12 &&attackStun<3) {

                    power = 0.9;
                    sPrintln("SPEED TACKLE");
                    num = random(10, 15);
                    HP1 -= num;
                    sPrintln("Dog Bot deals " + num + " damage");
                }
    
            if (emmi_attack == 2 && attackTime<27 &&attackStun<7) {
               
                    power = 0.2;
                    sPrintln("BATTERY RAM");
                    num = random(10, 50);
                    HP1 -= num;
                    sPrintln("Dog Bot deals " + num + " damage");
                }
            
            if (emmi_attack == 3 && attackTime<15 &&attackStun<4) {
                    power = 0.75;
                    sPrintln("BITE RUSH");
                    num = random(5, 25);
                    HP1 -= num;
                    sPrintln("Dog Bot deals " + num + " damage");
                }   
        }
        //Robot with a spear attacks
        if (emmi_type.equals("Robot with a spear")) {
            if (emmi_attack == 1 && attackTime<15 &&attackStun<4) {

                    power = 0.75;
                    sPrintln("SPEAR RUSH");
                    num = random(5, 20);
                    HP1 -= num;
                    sPrintln("Robot with a spear deals " + num + " damage");
                }
            if (emmi_attack == 2 && attackTime<13 &&attackStun<3) {

                    power = 0.7;
                    sPrintln("ZERO SPEAR");
                    num = random(10, 15);
                    HP1 -= num;
                    sPrintln("Robot with a spear deals " + num + " damage");
                }
            
            if (emmi_attack == 3 && attackTime<27 &&attackStun<8) {

                    power = 0.3;
                    sPrintln("ULTIMATE SPEAR");
                    num = random(30, 50);
                    HP1 -= num;
                    sPrintln("Robot with a spear deals " + num + " damage");

                }
        }
        //Robot with a gun attacks
        if (emmi_type.equals("Robot with a gun")) {
            if (emmi_attack == 1 && attackTime<17 &&attackStun<3) {
                    power = 0.7;
                    sPrintln("BULLET RUSH");
                    num = random(1, 30);
                    HP1 -= num;
                    sPrintln("Robot with a gun deals " + num + " damage");

                }
            
            if (emmi_attack == 2 && attackTime<14 &&attackStun<4) {
                    power = 0.8;
                    sPrintln("ZERO BLAST");
                    num = random(10, 15);
                    HP1 -= num;
                    sPrintln("Robot with a gun deals deals " + num + " damage");

                }
            
            if (emmi_attack == 3 && attackTime<25 &&attackStun<7) {
               
                    power = 0.3;
                    sPrintln("CHARGE SHOT");
                    num = random(30, 50);
                    HP1 -= num;
                    sPrintln("Robot with a gun deals " + num + " damage");

                }
            
        }
        //Robot with a sword attack
        if (emmi_type.equals("Robot with a sword")) {
            if (emmi_attack == 1 && attackTime<14 &&attackStun<4) {
                    power = 0.6;
                    sPrintln("TRIPLE SLASH");
                    num = random(5, 15);
                    HP1 -= num;
                    sPrintln("Robot with a sword deals " + num + " damage");

                }
            
            if (emmi_attack == 2 && attackTime<30 &&attackStun<7) {
                    power = 0.25;
                    sPrintln("BLADE OF DESTRUCTION");
                    num = random(1, 100);
                    HP1 -= num;
                    sPrintln("Robot with a sword  deals " + num + " damage");

                }
            
            if (emmi_attack == 3 && attackTime<15 &&attackStun<3) {

                    power = 0.67;
                    sPrintln("ZERO SLASH");
                    num = random(5, 15);
                    HP1 -= num;
                    sPrintln("Robot with a sword  deals " + num + " damage");

                }
            }
        

        //Mechs Attack
        if (emmi_type.equals("Mech")) {
            if (emmi_attack == 1 && attackTime<23 &&attackStun<6) {
                        power = 0.3;
                        sPrintln("LASER RAIN");
                        num = random(20, 30);
                        HP1 -= num;
                        sPrintln("Mech deals " + num + " damage");
                    }

            if (emmi_attack == 2 && attackTime<27 &&attackStun<7) {

                        power = 0.3;
                        sPrintln("POWER BURST");
                        num = random(30, 50);
                        HP1 -= num;
                        sPrintln("Mech deals " + num + " damage");

            }
            if (emmi_attack == 3 && attackTime<40 &&attackStun<7) {

                        power = 0.1;
                        sPrintln("ULTIMATE RUSH");
                        num = random(30, 50);
                        HP1 -= num;
                        sPrintln("Mech deals " + num + " damage");

                }

            }
        
        //Giga mech attack
        if (emmi_type.equals("Giga Mech")) {
            if (emmi_attack == 1 && attackTime<25 &&attackStun<6) {
                
                        power = 0.75;
                        sPrintln("LASER RAIN");
                        num = random(20, 40);
                        HP1 -= num;
                        sPrintln("Giga Mech deals " + num + " damage");
                    }
                
            if (emmi_attack == 2 && attackTime<10 &&attackStun<3) {
                
                        power = 0.8;
                        sPrintln("DUAL BLADE");
                        num = random(10, 40);
                        HP1 -= num;
                        sPrintln("Giga Mech deals " + num + " damage");

                    }
                
            
            if (emmi_attack == 3 && attackTime<13 &&attackStun<6) {
                        power = 0.75;
                        sPrintln("ZERO BEAM");
                        num = random(15, 35);
                        HP1 -= num;
                        sPrintln("Giga Mech deals " + num + " damage");

                    }

            }
        
        //mini mech attacks
        if (emmi_type.equals("Mini Mech")) {
            if (emmi_attack == 1 && attackTime<15 &&attackStun<6) {

                        power = 0.67;
                        sPrintln("LASER SHOT");
                        num = random(10, 35);
                        HP1 -= num;
                        sPrintln("Mini Mech deals " + num + " damage");

                    }
                
                
            if (emmi_attack == 2 && attackTime<15 &&attackStun<5) {

                        power = 0.5;
                        sPrintln("LASER SHOT");
                        num = random(10, 30);
                        HP1 -= num;
                        sPrintln("Mini Mech deals " + num + " damage");
            }
            if (emmi_attack == 3 && attackTime<17 &&attackStun>6) {
               
                        power = 0.56;
                        sPrintln("TRIPLE SLASH");
                        num = random(5, 10)*3;
                        HP1 -= num;
                        sPrintln("Mini Mech deals " + num + " damage");
                    }
                
            }
        
        //Cyborg attack
        if (emmi_type.equals("Cyborg")) {
            if (emmi_attack == 1 && attackTime<15 &&attackStun>6) {

                    power = 0.65;
                    sPrintln("LASER SHOT");
                    num = random(5, 25);
                    HP1 -= num;
                    sPrintln("Cyborg deals " + num + " damage");
                }
            
            if (emmi_attack == 2 && attackTime<20 &&attackStun>6) {
                    power = 0;
                    sPrintln("LASER SLASH");
                    num = random(7, 20);
                    HP1 -= num;
                    sPrintln("Cyborg deals " + num + " damage");
                }
            
            if (emmi_attack == 3 && attackTime<25 &&attackStun>6) {

                    power = 0;
                    sPrintln("CHARGE BEAM");
                    num = random(7, 20);
                    HP1 -= num;
                    sPrintln("Cyborg deals " + num + " damage");
                }

            }
        }
    

    //Create a giga mech
    public void giga_mech() {
        emmi_type = "Giga Mech";
        emmi_level = level1;
        emmi_HP = 200 + (emmi_level * 20);
        sPrintln("Giga Mech");
    }

    //uses READ to update save
    public void grabSave() {
        ArrayList<Object> Save = Read("Save.txt");

        for (int i = 0; i < 9; i++) {
            String var = Save.get(i).toString();
            int val = 0;
            if (strIsInt(var)) {
                val = Integer.parseInt(var);
            }
            if (i == 0) {
                missionnum = val;
            }
            if (i == 1) {
                HP1m = val;
            }
            if (i == 2) {
                level1 = val;
            }
            if (i == 3) {
                levelr1 = val;
            }
            if (i == 4) {
                exp1 = val;
            }
            if (i == 5) {
                aqua.attackTier = val;
            }
            if (i == 6) {
                lasershot.attackTier = val;
            }
            if (i == 7) {
                cure_tier = val;
            }
            if (i == 8) {
                ember.attackTier = val;
            }
            if (i == 9) {
                max_hit = val;
            }

        }
        sPrint("Save grabbed");


    }

    //checks if you can cast a str to a int
    public boolean strIsInt(String string) {
        try {
            int value = Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    //edit txt (update save)
    public static void Edit(String filePath, ArrayList<Object> arr) {
        File fileToBeModified = new File(filePath);
        BufferedReader reader = null;
        FileWriter writer = null;

        try {


            writer = new FileWriter(fileToBeModified);
            for (Object o : arr) {
                String print = o.toString() + "\n";
                writer.write(print);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                //Closing the resources
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    //Reads through txt
    public static ArrayList<Object> Read(String file) {

        try {
            File txt = new File(file);
            FileReader fileRead = new FileReader(txt);
            BufferedReader reader = new BufferedReader(fileRead);
            ArrayList<Object> arr = new ArrayList<>();
            Object var = reader.readLine();
            while (var != null) {
                arr.add(var);
                var = reader.readLine();

            }
            reader.close();
            return arr;
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }


    }
//dont pass this comment
}
