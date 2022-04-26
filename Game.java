import java.util.Scanner;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

//Main class
class Game {
    //the Colors of gay
    public static final String GO_BACK = "\"\\u001B[A\"";
    public static final String SCREEN_CLEAR = "\033[H\033[2J";
    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";
    //emmi is enemie vars
    int emmi_HP = 0;
    int emmi_level = 0;
    int emmi_attack = 0;
    String emmi_type = "";
    //2069 and 2077 vars (non save)
    int HP1;
    int HP2 = 35;
    int attack_num=0;
    boolean attack_type;
    // boss health
    int bill_HP = 300;
    int Elon_HP = 150;
    int target = 0;
    int Tri_HP = 1000;
    int Mark_Zuckerberg = 300;
    // Array vars (placed in Save.txt)
    int missionnum = 10;
    int HP1m = 50;
    int HP2m = 50;
    int attack1_tier = 1;
    int attack2_tier = 1;
    int attack3_tier = 1;
    int attack4_tier = 1;
    int level1 = 1;
    int level2 = 1;
    int exp1 = 0;
    int exp2 = 0;
    int levelr1 = 20;
    int levelr2 = 20;
    String attack1 = "fall";
    String attack2 = "shot";
    String attack3 = "";
    String attack4 = "";
    int max_hit = 5;


    //dungeon vars
    int dungeon_length = 0;
    //misc
    int num = 0;
    int type_num = 0;
    int speed = 20;
    int num1 = 0;
    int num2 = 0;
    int bonus = 0;
    int hit = 0;
    int damage = 0;
    int move_tier = 0;

    //obj
    Scanner scanner = new Scanner(System.in);

    {
        HP1 = HP1m;
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



    //Starts up 2069
    public void game() {
        //reset all health and MP values
        bill_HP = 300;
        Elon_HP = 150;
        target = 0;
        Tri_HP = 1000;
        Mark_Zuckerberg = 2000;
        HP1 = HP1m;
        HP2 = HP2m;
        //Runs mission forever
        while (true) {
            if ((attack1_tier == 5) && (attack2_tier == 5) && (attack3_tier == 5) && (attack4_tier == 5)) {
                if (missionnum == 10) {
                }
            }
            String choice = "STR";
            System.out.println("Type 1 -> " + missionnum + " to try that Mission");
            //Tells you how to roll the gotcha
            if (missionnum > 1) {
                System.out.println("Type 'exp' to trade exp for new moves");
            }
            System.out.println("which Mission would you like to try?   ");
            choice = scanner.nextLine();
            System.out.println();
//mission 1
            if (choice.equals("1")) {
                print_slow("CHAPTER 1: The Tower of Power");
                print_slow("Mission 1: The Awakening of  The Revolution");
                if (skip()) {
                    mission1_1();
                    mission1_2();
                }
                dungeon1();

                if (skip()) {
                    mission1_3();
                }
                mission1_4();

                if (missionnum < 2) {
                    missionnum = 2;
                    print_slow("MISSION 2 UNLOCKED");
                    emmi_type = "NOT";
                }
            }
//Mission 2
            if ((choice.equals("2")) && (missionnum >= 2)) {
                print_slow("Mission 2: First Encounters");

                if (skip()) {
                    mission2_1();
                }
                dungeon2();

                if (skip()) {
                    mission2_2();
                }
                boss_bill();

                if (skip()) {
                    mission2_3();
                }
                if (missionnum < 3) {
                    missionnum = 3;
                    print_slow("MISSION 3 UNLOCKED");
                }
            }
//Misson 3
            if ((missionnum >= 3) && (choice.equals("3"))) {
                print_slow("MISSION 3: Rest In The Rubble");
                if (skip()) {
                    mission3_1();
                }
                dungeon3();

                if (skip()) {
                    mission3_2();
                }
                Elon_musk();

                if (skip()) {
                    mission3_3();
                }
                dungeon4();

                if (skip()) {
                    mission3_4();
                }
                if (missionnum < 4) {
                    missionnum = 4;
                    print_slow("MISSION 4 UNLOCKED");
                }
                print_slow("MISSION 3 END");
            }
//Mission 4
            if ((missionnum >= 4) && (choice.equals("4"))) {
                print_slow("Mission 4: 101 battles");

                if (skip()) {
                    mission4_1();
                }
                dungeon5();

                if (skip()) {
                    mission4_2();
                }
                if (missionnum < 5) {
                    missionnum = 5;
                    print_slow("mission 5 UNLOCKED");
                }
            }
//Mission 5
            if ((missionnum >= 5) && (choice.equals("5"))) {
                print_slow("Mission 5: Rematch Squared");

                if (skip()) {
                    mission5_1();
                }
                dungeon6();

                if (skip()) {
                    mission5_2();
                }
                double_boss();
                if (skip()) {
                    mission5_3();
                }
                if (missionnum < 6) {
                    missionnum = 6;
                    print_slow("MISSION 6 UNLOCKED");
                }
            }
//Mission 6
            if ((missionnum >= 6) && (choice.equals("6"))) {
                print_slow("Mission 6: The Smoking Gun");
                if (skip()) {
                    mission6_1();
                }
                dungeon8();
                if (skip()) {
                    mission6_2();
                }
                if (missionnum < 7) {
                    missionnum = 7;
                    print_slow("MISSION 7 UNLOCKED");
                }
            }
//Mission 7
            if ((missionnum >= 7) && (choice.equals("7"))) {
                print_slow("Mission 7: The Rules Of The Roomba");

                if (skip()) {
                    mission7_1();
                }
                dungeon7();

                if (skip()) {
                    mission7_2();
                }
                if (missionnum < 8) {
                    missionnum = 8;
                    print_slow("MISSION 8 UNLOCKED");
                }
            }
//Mission 8
            if ((missionnum >= 8) && (choice.equals("8"))) {
                print_slow("MISSION 8 When I Step off");
                mission8_1();
                dungeon8();
                mission8_2();
                if (missionnum < 9) {
                    missionnum = 9;
                    print_slow("MISSION 9 UNLOCKED");
                }
            }
//Mission 9
            if ((missionnum >= 9) && (choice.equals("9"))) {
                print_slow("Mission 9: Face-Off On The Grand Tower");
                mission9_1();
                boss_rush();
                mission9_2();
                if (missionnum < 9) {
                    missionnum = 9;
                    print_slow("MISSION 9 UNLOCKED");
                }
            }
//Mission 10
            if ((missionnum >= 10) && (choice.equals("10"))) {
                print_slow("mission 10: 2 Sides Of The Same Coin");
                mission10_1();
                Final();
                mission10_2();
                if (missionnum < 11) {
                    missionnum = 11;
                    print_slow("MISSION 11 UNLOCKED");
                }
            }
            if ((missionnum >= 11) && (choice.equals("11"))) {
                print_slow("CHAPTER 2: Rising Tides");
                print_slow("mission 11: X3090");

            }
//Gotcha system
            if ((choice.equals("exp")) && (missionnum > 1)) {
                pull();
            }
        }
        }


        public void attack() {

            attack_num=0;
            print_slow("2069's turn");

            System.out.println("1: "+attack1);

            System.out.println("2: "+attack2);

            System.out.println("3: "+attack3);

            System.out.println("4: "+attack4);
            System.out.println();
//This while loop just
            System.out.println("Which attack?    ");
            while (attack_num!=4 && attack_num!=3 && attack_num!=2 && attack_num!=2) {
                attack_num = scanner.nextInt();

            }
            System.out.print("Out Power or Out Speed (power or speed)");
            String style = "";
            while (!style.equals("speed") && !style.equals("power")) {
                style = scanner.nextLine();
            }
            attack_type=true;
            if (style.equals("power")) {
                attack_type = false;
            }
            if (style.equals("speed")) {
                attack_type = true;
            }
        }
        public void choseAttack()
        {
            atta
        }
    public int ember()
    {
    return random(attack4_tier*5,attack4_tier*5);
    }
    public int aqua()
    {
        return random(attack4_tier,attack4_tier*10);
    }
    public int lasershot()
    {
        return random(attack2_tier*2,15)*attack2_tier;
    }
    public void cure()
    {
            num=random(attack2_tier*2,20);
            HP1+=num;
            HP2+=num;
            print_slow("2069 and 2077 heal "+num+" damage");
    }

        //2077's code
        public void attack2() {
            print_slow("2077's turn");

//starts quicktime event
            num = quickTime() * max_hit;
            System.out.println("2077 Deals " + num + " Damage");
            emmi_HP -= num;

            if (HP2 > HP2m) {
                HP2 = HP2m;
            }
        }

        public int quickTime() {
            long startTime = System.currentTimeMillis();
            int i = 0;
            while (startTime + 10000 > System.currentTimeMillis()) {
                System.out.println("Type Kick");
                while (startTime + 10000 > System.currentTimeMillis()) {
                    if (scanner.nextLine().equals("Kick")) {
                        break;
                    }

                }
                System.out.println("Type Punch");
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
                print_slow("2069's health " + HP1);
                print_slow("2077's health " + HP2);
                print_slow("Bill's health " + bill_HP);
                //2069 attacks
                if (HP1 > 0) {
                    attack();
                }
                //2077 attacks
                bill_HP -= damage;
                //bill gates attacks
                attack_bill();
                //checks for game over
                if ((HP2 < 0) && (HP1 < 0)) {
                    restart();
                }

            }
            //gives the player some exp for winning
            exp1 += random(100, 200);
            exp2 += random(100, 200);
            gain();
            level();
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
                        print_slow("Bill is now targeting 2069.");
                    }


                    if (target == 2) {
                        print_slow("Bill is now targeting 2077.");
                    }


                }
                //slash rage attack
                if (bill == 2) {
                    print_slow("SLASH RAGE");

                    if (target == 1) {
                        hit = random(5, 15);
                        HP1 -= hit;
                        print_slow("Bill deals  " + hit + "  damage to 2069.");
                    }


                    if (target == 2) {
                        hit = random(5, 15);
                        HP2 -= hit;
                        print_slow("Bill deals  " + hit + "  damage to 2077");
                    }


                    if (target == 1) {
                        print_slow("Bill has stopped targeting 2069.");
                    }


                    if (target == 2) {
                        print_slow("Bill has stopped targeting 2077.");
                    }


                    target = 0;
                }
                //Triple slash attack
                if (bill == 3) {
                    print_slow("TRIPLE SLASH");

                    int triple = random(0, 3);

                    while (triple > 0) {
                        if (target == 2) {
                            print_slow("Bill deals 5 damage to 2077.");
                            HP2 -= 5;
                        }

                        if (target == 1) {
                            print_slow("Bill deals 5 damage to 2069.");

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
                print_slow("2069's health " + HP1);
                print_slow("2077's health " + HP2);
                print_slow("Elon's health " + Elon_HP);
                //2069 attacks
                if (HP1 > 0) {
                    attack();
                }
                //2077 attacks

                Elon_HP -= damage;
                //Elon attacks
                attack_Elon();
                //checks for games over
                if ((HP2 < 0) && (HP1 < 0)) {
                    restart();
                }
            }
            //gives a you some exp for winning
            exp1 += random(100, 200);
            exp2 += random(100, 200);
            gain();
            level();
        }

        //Elon musk attack
        public void attack_Elon() {
            int bill = random(1, 3);
            //heals musk
            if (bill == 1) {
                print_slow("HEALING MIST");
                Elon_HP += 10;
                print_slow("Elon heals 10 damage");
            }
            //lowers your MP
            if (bill == 2) {
                print_slow("SPEAR RUSH");
                num = random(1, 2);
                if (num == 1) {
                    damage = random(5, 15);
                    HP2 -= damage;
                    print_slow("2077 take  " + damage + " damage");
                }
                if (num == 2) {
                    damage = random(5, 15);
                    HP2 -= damage;
                    print_slow("2060 take  " + damage + " damage");
                }

            }
            //Deals damage
            if (bill == 3) {
                print_slow("BURNING SPEAR");
                damage = random(5, 10);
                HP1 -= damage;
                HP2 -= damage;
                print_slow("2069 and 2077 take  " + damage + " damage");
            }
        }

        //Double boss (bill gates and Jeff bezos)
        public void double_boss() {
            while (Elon_HP > 0) {
                print_slow("2069's health " + HP1);
                print_slow("2077's health " + HP2);
                print_slow("Bill's health " + bill_HP);
                print_slow("Jeff's health " + Elon_HP);
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
                if ((HP2 < 0) && (HP1 < 0)) {
                    restart();
                }
            }
            //Gives you exp
            exp1 += random(200, 400);
            exp2 += random(200, 400);
            gain();
            level();
        }

        //jeff bezos attack
        public void jeff_attack() {
            print_slow("MIND BEND");
            damage = random(1, 4);
            HP1 -= damage * random(1, 3);
            HP2 -= damage * random(1, 3);
            print_slow("2069 and 2077 take a random amount of damage");
        }

        //sets 2069s and 2077s hp to 1
        public void roomba_beam() {
            print_slow("ROOMBA BEAM");
            print_slow("2069 and 2077 both are now no 1 HP");
            HP1 = 1;
            HP2 = 1;
        }

        //Fight all the tech giants
        public void boss_rush() {
            while (Tri_HP > 0) {
                Tri_attack();
                if (HP1 > 0) {
                    attack();
                }

                Tri_HP -= damage;
                if ((HP2 < 0) && (HP1 < 0)) {
                    restart();
                }
            }
        }

        //Tech gaint rush
        public void Tri_attack() {

            print_slow("TRI FORCE");
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
                print_slow("FULL ON RUSH");
                print_slow("Elon musk: " + person + " YOUR ABOUT TO FEEL IT");
                print_slow("Bill gates: RAGE SLASH");
                num = random(10, 20);
                print_slow("Bill Gates deals " + num + " Damage and takes " + (num / 3) + " damage");
                System.out.println();
                Tri_HP -= num / 3;
                damage += num;
                print_slow("Jeff bezos) RANDOM FORCE");
                print_slow("Everyone takes a random amount of damage");
                damage += random(-10, 20);
                Tri_HP += random(-10, 20);
                print_slow("Elon musk) SPEAR RUSH");
                num = random(2, 7);
                int num1 = random(2, 7);
                int num2 = random(2, 7);
                damage += num + num1 + num2;
                print_slow("Elon musk deals " + num + num1 + num2 + " Damage");
            }
            if (people_num == 3) {
                print_slow("TRI RUSH");
                print_slow("Elon musk) " + person + " YOUR ABOUT TO FEEL IT");
                print_slow("Bill Gates) RAGE SLASH");
                num = random(10, 20);
                print_slow("Bill Gates deals " + num + " Damage and takes " + (num / 2) + " damage");
                System.out.println();
                Tri_HP -= num / 2;
                damage += num;
                print_slow("Jeff bezos) RANDOM FORCE");
                print_slow("Everyone takes a random amount of damage");
                damage += random(-20, 20);
                Tri_HP += random(-20, 20);
                print_slow("Elon musk) SPEAR RUSH");
                num = random(2, 5);
                num1 = random(2, 5);
                num2 = random(2, 5);
                damage += num + num1 + num2;
                print_slow("Elon musk deals " + num + num1 + num2 + " Damage");
            }
            if (people_num == 2) {
                print_slow("DUAL RUSH");
                print_slow("Elon musk) " + person + " YOUR ABOUT TO FEEL IT");
                print_slow("Jeff bezos) RANDOM FORCE");
                print_slow("Everyone takes a random amount of damage");
                damage += random(-20, 20);
                Tri_HP += random(-20, 20);
                print_slow("Elon musk) SPEAR RUSH");
                num = random(2, 5);
                num1 = random(2, 5);
                num2 = random(2, 5);
                damage += num + num1 + num2;
                print_slow("Elon musk deals " + num + num1 + num2 + " Damage");
            }
            if (people_num == 1) {
                print_slow("SOLO RUSH");
                print_slow("Elon musk) " + person + " YOUR ABOUT TO FEEL IT");
                print_slow("Elon musk) SPEAR RUSH");
                num = random(2, 5);
                num1 = random(2, 5);
                num2 = random(2, 5);
                damage += num + num1 + num2;
                print_slow("Elon musk deals " + num + num1 + num2 + " Damage");
            }
            if (person == 2069) {
                HP1 -= damage;
            }
            if (person == 2077) {
                HP2 -= damage;
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
                if ((HP2 < 0) && (HP1 < 0)) {
                    restart();
                } else {
                    print_slow("Mark Zuckerberg: YOU HAVE NO POWER IN THIS WORLD");
                    print_slow("Mark Zuckerberg takes 0 damage from your attacks");
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
            if ((HP2 != 1) && (HP1 != 1)) {
                Mark = 1;
            }
            if (Mark == 1) {
                print_slow("FINAL SLASH");
                print_slow("2069 and 2077 both are now no 1 HP");
                HP1 = 1;
                HP2 = 1;
            }
            if (Mark == 2) {
                print_slow("LASH OUT");
                HP1 -= (300 - Mark_Zuckerberg) / 4;
                HP2 -= (300 - Mark_Zuckerberg) / 4;
                print_slow("Both 2069 and 2077 take  " + ((300 - Mark_Zuckerberg) / 4) + " damage");
            }

            if (Mark == 3) {

                print_slow("DOUBLE EDGED RUSH");

                HP1 -= 20;
                HP2 -= 20;
                Mark_Zuckerberg -= 20;

                print_slow("Everyone takes 20 damage");
            }
            if (Mark == 4) {
                print_slow("DARK RUSH");
                hit = 4;
                while (hit > 0) {
                    num = random(1, 2);
                    if (num == 1) {
                        HP1 -= 5;
                        print_slow("2069 takes 5 damage");
                        hit = random(0, 3);
                    }
                    if (num == 2) {
                        HP2 -= 5;
                        print_slow("2077 takes 5 damage");
                        hit = random(0, 3);
                    }
                }
            }
            if (Mark == 5) {
                print_slow("FIRE BLADE OF DARKNESS");
                num = random(1, 2);
                if (num == 1) {
                    HP1 -= 30;
                    print_slow("2069 takes 30 damage");
                }
                if (num == 1) {
                    HP2 -= 30;
                    print_slow("2077 takes 30 damage");
                }
            }
            if ((HP1 < 0) && (HP2 > 0)) {
                print_slow("Mark Zuckerberg: YOUR FATE HAS BEEN SEALED 2077");
                HP2 = -999;
            }
            if ((HP1 > 0) && (HP2 < 0)) {
                print_slow("Mark Zuckerberg: YOUR FATE HAS BEEN SEALED 2069");
                HP1 = -999;
            }
        }

        //Mission Text
        public void mission1_1() {
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

        //Mission Text
        public void mission1_2() {
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

        public void mission2_1() {
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

        public void mission1_3() {
            print_slow(
                    "2069: It appears that the powerplant has taken some damage due to the power being shut off."
            );


            print_slow("old man: Help...please help");


            print_slow("2077: 2069 we need to help him");


            print_slow("2069: I got it");
        }

        public void mission1_4() {
            print_slow(
                    "old man: Thank you. I can't thank you enough. I am forever in your debt.");

            print_slow("old man: As a gift here is 100xp");


            String choice = "";
            //old man gift
            while ((!choice.equals("2069")) && (!choice.equals("2077"))) {
                print_slow("Who will you give this exp to? (2069 or 2077)   ");
                choice = scanner.nextLine();
            }
            if (choice.equals("2077")) {
                exp2 += 100;
            }

            if (choice.equals("2069")) {
                exp1 += 100;
            }

            gain();
            level();
            print_slow("Old Man: Oh I should tell you my name. Its 2020");
            print_slow("2020: I can teach you new abilities in trade for ");
        }

        public void mission2_2() {
            print_slow("2069: Finally, I have not ran so fast in my life");


            print_slow("*the mech's face shield opens up*");


            print_slow("Bill gates: Heh...");


            print_slow("Bill gates: You can't be any slower, can you?");


            print_slow("2077: Bill? You're the one behind this?");


            print_slow("2069: You leave us no choice.");


            print_slow("2077: FOR HUMANITY!!");
        }

        public void mission2_3() {
            print_slow("Bill: You put a good fight");


            print_slow("2077: We finsh this sight here right now");


            print_slow("2069: EMBER");


            print_slow("The mech crashes down");


            print_slow("Bill: Sadly This is not over");


            print_slow("Bill gate disappears");


            print_slow("The power turns back off");
        }

        public void mission3_1() {
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

        public void mission3_2() {
            print_slow("Elon musk: What are you guys doing");


            print_slow("Elon musk: ....");


            print_slow("Elon musk: You need to be dealt with");


            print_slow("2077: We will be dealing with you ");


            print_slow("Elon musk pulls out a spear");
        }

        public void mission3_3() {
            print_slow("Elon musk: I must leave I have a meeting to attend to");


            print_slow("Elon musk fades away");


            print_slow("2077: YOUR GOING PAY FOR THIS");


            print_slow("2069: Lets take this chance to turn off the power");


            print_slow("2069: It would make travel much easier");


            print_slow("2077: fine...");
        }

        public void mission3_4() {
            print_slow("2069:And ... the powers off");


            print_slow("2069:Okay lets report back to 2020");


            print_slow("2077:The old fart is probably worried sick");


            print_slow("2069:Its not like we are any close to being responsible");
        }

        public void mission4_1() {
            print_slow("2069:We should take a detour to california ");


            print_slow("2077 and 2020: why?");


            print_slow("2069: I have a theory both Elon musk and bill gates are part of the blackouts then maybe other tech giants are behind this like zuckerberg and he lives in california ");


            print_slow("2077: True I see it happening");


            print_slow("2020: Lets go!");


            print_slow("Later on route 101");


            print_slow("Lights everywhere begin to turn on");


            print_slow("2077:This is bad");


            print_slow("2069: 2020 floor it");
        }

        public void mission4_2() {
            print_slow("2069: It appears that calfornia is very dangerous");


            print_slow("2077: I bet that the group responsible for this has their headquarters in california");
        }

        public void mission5_1() {
            print_slow("2069: We should find a 6-11 to stop and rest at");


            print_slow("2077: I am so tired");


            print_slow("2020: We are in luck there is one at the nearest exit");
        }

        public void mission5_2() {
            print_slow("Later in the morning");


            print_slow("2020: EVERYONE UP");


            print_slow("2069: ...fine");


            print_slow("2077: right...");


            print_slow("Later in washington");


            print_slow("2069:It appers that the power is on");


            print_slow("Suddenly 2 mechs crash down infront of 2069,2020 and 2077");


            print_slow("Jeff bezos: It appers that they have showen up early");


            print_slow("Bill gates: Your guys are faster than normal");


            print_slow("Jeff bezos: Let me take care of them");


            print_slow("2077: WE WILL TAKE YOU BOTH");


            print_slow("Bill gates: Fine I guess I will join in");
            bill_HP = 200;
            Elon_HP = 200;
        }

        public void mission5_3() {
            print_slow("Jeff bezos: You did not tell me that these kids could put up a fight");
            print_slow("Bill gates: Nevermind that we need to leave NOW");
            print_slow("Jeff bezos: Right");
        }

        public void mission6_1() {
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

        public void mission6_2() {
            print_slow("2077: Peice of cake ");
            print_slow("2069: Easy for you to say");
            print_slow("2020: We have a issue the car has broken down we are going to have to walk the rest of the way");
            print_slow("2077: THAT JUST GREAT");
            print_slow("2069: Now we are in real danger");
        }

        public void mission7_1() {
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

        public void mission7_2() {
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

        public void mission8_1() {
            print_slow("2069: We are closing in on califonia we should be their by tomorrow");
            print_slow("2077: I READY! LETS FINISH THIS");
            print_slow("2069: Right,This final push will be the hardest");
            print_slow("2069: This road should take us most of the way");
            print_slow("2077: Alright,I am ready");
        }

        public void mission8_2() {
            print_slow("2069: GET BACK");
            print_slow("2069: Look its Elon Musk");
            print_slow("2077: We follow him into the building");
            print_slow("2069: Right,Be quite");
        }

        public void mission9_1() {
            print_slow("2069: Give Elon musk a chance to get inside");
            print_slow("2077: Right");
            print_slow("5 mins later");
            print_slow("2069: Now is our chance");
            print_slow("2077: Right");
            print_slow("2069: We need to get to the top floor");
            print_slow("2077: Okay (Press up on the elevator");
            print_slow("*Suddenly the elevator stops*");
            print_slow("Elon musk: I SEE THAT YOU HAVE FOUND YOUR WAY TO OUR HIDEOUT");
            print_slow("Bill gates: Lets clean up this error in our plan");
        }

        public void mission9_2() {
            print_slow("Elon musk: ...THESE KIDS");
            print_slow("Jeff bezos: We need to retreat");
            print_slow("2077: NEVER");
            print_slow("2069: You will pay for what you have done");
            print_slow("2069: LETS FINSIH THIS");
            print_slow("2069: " + attack4_tier);
            print_slow("Elon musk: ...My final words");
            print_slow("Elon musk: You are the winner and I am the...");
            print_slow("2077: They deserve to die alone");
            print_slow("2069: Right to the elevator");
        }

        public void mission10_1() {
            print_slow("*At the top of the elevator*");
            print_slow("Mark Zuckerberg: I have been waiting");
            print_slow("2069: Zuckerberg: why what is the reasoning behind this");
            print_slow("Mark Zuckerberg: Power POWER IS EVERYTHING. I cant control humans you pesky humans. However Cyborgs on th other hand can be controlled.");
            print_slow("2077: YOU KILLED MILLIONS OF HUMANS JUST TO HAVE CONTROL");
            print_slow("Mark Zuckerberg: This world is mine. Humans have handed this world to me on a sliver platter. You cant just take it back");
            print_slow("2069: This is not your world its everyone's world");
            print_slow("Mark Zuckerberg: YOU WILL HAVE TO OVERCOME ME");
        }

        public void mission10_2() {
            print_slow("Mark Zuckerberg: Sigh, It apears musk was right");
            print_slow("2069: What?");
            print_slow("Mark Zuckerberg: Luckly I was ready for this");
            print_slow("Mark Zuckerberg: I present the X3090");
            print_slow("Mark Zuckerberg: A nuclear missile containg 1000s of the parsite Z");
            print_slow("Mark Zuckerberg: The same parasite That killed 1000s. It takes control of technology. IT Alos is VERY hostile to humans");
            print_slow("Mark Zuckerberg: Said missile is set to land rihgt dead center in the middle of the arctic causing rapid cimiate change and rising sea levels ");
            print_slow("Mark Zuckerberg: All triggered by THIS BUTTON");
            print_slow("Mark Zuckerberg: 3                              2                                           1");
            print_slow("2077: NOOOOOOOOOOOO");
            print_slow("2069: NOOOOOOOOOOOO");
            print_slow("Mark Zuckerberg: GoodBye");
            print_slow("*Mark Zuckerberg disappears*");
        }

        public void mission11_1() {
            print_slow("2069: 2077 Exit?");
            print_slow("2077: Exit over there");
            print_slow("2069: Great");
            print_slow("2069: The Bomb should raise the sea level 750ft. Meaning most buildings are going to be submearged");
            print_slow("2069: We have 1 hour before the sea will be submearged");
            print_slow("2077: Lets use this Tower as out base. I need to start work on a way to move from tower to tower");
            print_slow("2069: sounds good");
            print_slow("2069: While you do that Let me scout");
        }

        public void pull() {
            int expt = exp1 + exp2;
            if (expt > 0) {
                print_slow("2069 exp " + exp1);
                print_slow("2069 exp " + exp2);
                print_slow("total exp " + expt);
                System.out.println("how much exp would you like to use? ");
                num = scanner.nextInt();
                if (num > expt) {
                    num = expt;
                }
                int pull_num = num / 25;
                exp1 -= num;
                if (exp1 < 0)
                    num = -exp1;
                exp1 = 0;
                exp2 -= num;
                while (pull_num > 0) {
                    roll();
                    pull_num -= 1;
                }
            } else {
                print_slow("YOU NEED MORE EXP POOR PERSON");
            }

        }

        //gotcha
        public void roll() {
            int tier = random(1, 10);
            if (tier == 5) {
                tier = random(1, 5);
            }
            if (tier == 5) {
                tier = random(1, 5);
            }
            if (tier == 10) {
                tier = random(6, 10);
            }
            if (tier == 10) {
                tier = random(6, 10);
            }
            if (tier == 9) {
                tier = random(6, 9);
            }
            if (tier == 4) {
                tier = random(1, 4);
            }
            if (tier == 1) {
                HP1m += 2;
                print_slow("2069's max Hp increased by 2");
            } else if ((tier == 2) || (tier == 3) || (tier == 4) || (tier == 5))
                num = random(1, 4);
            //Ember level up
            if (num == 4) {
                if (tier > attack4_tier) {
                    print_slow("ember leveled up");
                    print_slow(attack4_tier + " --> " + tier);
                    if (tier == 5) {
                        attack1 = "Omega Ember";

                        attack1_tier = 5;
                    }

                    if (tier == 4) {
                        attack1 = "Ultra Ember";
                        attack1_tier = 4;

                    }
                    if (tier == 3) {
                        attack1 = "Tri Ember";

                        attack1_tier = 3;
                    }

                    if (tier == 2) {
                        attack1 = "Dual Ember";

                        attack1_tier = 2;
                    }

                }
                // Cure level up
                if (num == 3) {
                    if (tier > attack3_tier)
                        print_slow("Cure leveled up");
                    print_slow(attack3_tier + " -->" + tier);

                    if (tier == 5) {
                        attack3 = "Omega Cure";

                        attack3_tier = 5;
                    }

                    if (tier == 4) {
                        attack3 = "Ultra Cure";
                        attack3_tier = 4;

                    }
                    if (tier == 3) {
                        attack3 = "Tri Cure";

                        attack3_tier = 3;
                    }

                    if (tier == 2) {
                        attack3 = "Dual Cure";

                        attack3_tier = 2;
                    }
                }
            }
            //Charge level up
            if (num == 1) {
                if (tier > attack1_tier) {
                    print_slow("Aqua leveled up");
                    print_slow(attack1_tier + " --> " + tier);

                    if (tier == 5) {
                        attack1 = "Omega Aqua";

                        attack1_tier = 5;
                    }
                    if (tier == 4) {
                        attack1 = "Ultra Aqua";

                        attack1_tier = 4;
                    }

                    if (tier == 3) {
                        attack1 = "Tri Aqua";

                        attack1_tier = 3;
                    }

                    if (tier == 2) {
                        attack1 = "Dual Aqua";

                        attack1_tier = 2;
                    }
                }
            }
            //Laser level up
            if (num == 2) {
                if (tier > attack2_tier) {
                    print_slow("Laser leveled up");
                    print_slow(attack2_tier + " --> " + tier);
                    if (tier == 5) {
                        attack2 = "Omega Laser";

                        attack2_tier = 5;
                    }

                    if (tier == 4) {
                        attack2 = "Ultra Laser";

                        attack2_tier = 4;
                    }

                    if (tier == 3) {
                        attack2 = "Tri Laser";

                        attack2_tier = 3;
                    }

                    if (tier == 2) {
                        attack2 = "Dual Laser";
                        attack2_tier = 2;
                    }
                }
            }
            // other rewards
            if (tier == 6) {
                HP2m += 1;
                print_slow("2077's max Hp increased by 1");
            }
            if (tier == 7) {
                HP2m += 2;
                print_slow("2077's max Hp increased by 2");
            }
            if (tier == 8) {
                HP2m += 3;
                print_slow("2077's max Hp increased by 3");
            }
            if (tier == 9) {
                max_hit += 1;
                print_slow("2077's power of each hit incressesed by 1");
            }
            if (tier == 10) {
                max_hit += 2;
                print_slow("2077's power of each hit incressesed by 2");
            }
            print_slow("roll complete");
        }

        //
        public void level() {

            if (exp2 >= levelr2) {
                print_slow("LEVEL UP");
                print_slow(level2 + " --> " + (level2 + 1));
                print_slow("2077's health is restored fully");
                HP2 = HP2m;
                level2 += 1;
                levelr2 = exp2 + 20 * (level2 * level2) / 2;
                print_slow("2069 has" + (levelr1 - exp1) + "exp till leveling up");
                print_slow("2077 has" + (levelr2 - exp2) + "exp till leveling up");
            }
            if (exp2 >= levelr1) {
                print_slow("LEVEL UP");
                print_slow(level1 + " --> " + (level1 + 1));
                print_slow("2069: max health +1");
                HP1m++;
                level1++;
                levelr1 = exp1 + 20 * (level1 * level1) / 2;
                print_slow("2069 has" + (levelr1 - exp1) + "exp till leveling up");
                print_slow("2077 has" + (levelr2 - exp2) + "exp till leveling up");
            }


        }

        //Get bonus exp for no doing a ton of overkill
        public void gain() {
            if (emmi_HP == 0) {
                bonus = (100 * emmi_level);
                print_slow("You received a bonus " + bonus + " exp");
            } else if (emmi_HP >= -5) {
                bonus = (75 * emmi_level) - (emmi_HP * 10);
                print_slow("You received a bonus " + bonus + " exp");
            } else {
                bonus = 0;
                exp1 += (emmi_level) + bonus;
                exp2 += (emmi_level) + bonus;
            }
        }

        //fight enemies
        public void battle() {
            while (emmi_HP > 0) {
                print_slow("2069 health " + HP1);
                print_slow("2077 health " + HP2);
                print_slow(emmi_type + " health " + emmi_HP);

                emmi_attack = 0;
                emmi_prep();
                if (HP1 > 0) {
                    attack();
                }
                attack_emmi();

                if (HP1 > HP1m) {
                    HP1 = HP1m;
                }

                if (HP2 > HP2m) {
                    HP2 = HP2m;
                }

                emmi_HP -= damage;
                damage = 0;

                if ((HP2 < 0) && (HP1 < 0)) {
                    restart();
                }
            }

            gain();
            level();
        }
        //dungeon number 1
        public void dungeon1() {
            dungeon_length = 10;
            print_slow("Welcome to the underground subway(length: " + dungeon_length + " )");

            while (dungeon_length > 0) {
                int steps = random(1, 5);
                dungeon_length -= steps;
                print_slow("You move " + steps + " feet");

                if (dungeon_length <= 0) {
                    print_slow("2069:We made it");
                } else {
                    print_slow("2069:Whats that!");
                    type_num = random(1, 8);
                    if (type_num > 6) {
                        type_num = random(1, 8);
                    }
                    new_emmi(type_num);
                    battle();
                }

            }
        }

        //dungeon number 2
        public void dungeon2() {
            dungeon_length = 20;
            print_slow("Welcome to rubble filled city (length: " + dungeon_length + " )");

            while (dungeon_length > 0) {
                int steps = random(1, 5);
                dungeon_length -= steps;
                print_slow("You move " + steps + " feet");

                if (dungeon_length <= 0) {
                    print_slow("2069:We made it");
                } else {
                    print_slow("2069:Whats that!");
                    type_num = random(1, 8);
                }
                if (type_num > 6) {
                    type_num = random(1, 8);
                    new_emmi(type_num);
                    battle();
                }
            }

        }

        //dungeon number 3
        public void dungeon3() {
            dungeon_length = 5;
            print_slow("Welcome to rubble filled 6-11 (length: " + dungeon_length + " )");
            while (dungeon_length > 0) {
                int steps = random(1, 5);
                dungeon_length -= steps;
                print_slow("You move " + steps + " feet");

                if (dungeon_length <= 0) {
                    print_slow("2069:We made it");
                } else {
                    print_slow("2069:Whats that!");
                    type_num = random(1, 8);
                }
                if (type_num > 6) {
                    type_num = random(1, 8);
                    new_emmi(type_num);
                    battle();
                }
            }

        }

        //dungeon number 4
        public void dungeon4() {
            dungeon_length = 20;
            print_slow("Welcome to damaged power plant (length: " + dungeon_length + " )");

            while (dungeon_length > 0) {
                int steps = random(1, 5);
                dungeon_length -= steps;
                print_slow("You move " + steps + " feet");

                if (dungeon_length <= 0) {
                    giga_mech();
                    print_slow("2069:We made it");
                } else {
                    print_slow("2069:Whats that!");
                    type_num = random(1, 8);
                }
                if (type_num > 6) {
                    type_num = random(1, 8);
                    new_emmi(type_num);
                    battle();
                }
            }
        }

        //dungeon number 5
        public void dungeon5() {
            dungeon_length = 100;
            print_slow("Welcome to highway 101 (length: " + dungeon_length + " )");

            while (dungeon_length > 0) {
                int steps = random(1, 5);
                dungeon_length -= steps;
                print_slow("You move " + steps + " feet");

                if (dungeon_length <= 0) {
                    giga_mech();
                    print_slow("2069:We made it");
                } else {
                    print_slow("2069:Whats that!");
                    type_num = random(1, 8);
                }
                if (type_num > 6) {
                    type_num = random(1, 8);
                    new_emmi(type_num);
                    battle();
                }
            }
        }

        //dungeon number 6
        public void dungeon6() {
            dungeon_length = 5;
            print_slow("Welcome to rubble filled 6-11  (length: " + dungeon_length + " )");

            while (dungeon_length > 0) {
                int steps = random(1, 5);
                dungeon_length -= steps;
                print_slow("You move " + steps + " feet");

                if (dungeon_length <= 0) {
                    giga_mech();
                    print_slow("2069:We made it");
                } else {
                    print_slow("2069:Whats that!");
                    type_num = random(1, 8);
                }
                if (type_num > 6) {
                    type_num = random(1, 8);
                    new_emmi(type_num);
                    battle();
                }
            }
        }

        //dungeon number 7
        public void dungeon7() {
            dungeon_length = 20;
            print_slow("Welcome to old factory (length: " + dungeon_length + " )");

            while (dungeon_length > 0) {
                int steps = random(1, 5);
                dungeon_length -= steps;
                print_slow("You move " + steps + " feet");

                if (dungeon_length <= 0) {
                    giga_mech();
                    print_slow("2069:We made it");
                } else {
                    print_slow("2069:Whats that!");
                    type_num = random(1, 8);
                }
                if (type_num > 6) {
                    type_num = random(1, 8);
                    new_emmi(type_num);
                    battle();
                    roomba_beam();
                }
            }
        }

        //dungeon number 8
        public void dungeon8() {
            dungeon_length = 50;
            print_slow("Welcome to Central Fwy(length: " + dungeon_length + " )");

            while (dungeon_length > 0) {
                int steps = random(1, 5);
                dungeon_length -= steps;
                print_slow("You move " + steps + " feet");

                if (dungeon_length <= 0) {
                    giga_mech();
                    print_slow("2069:We made it");
                } else {
                    print_slow("2069:Whats that!");
                    type_num = random(1, 8);
                }
                if (type_num > 6) {
                    type_num = random(1, 8);
                    new_emmi(type_num);
                    battle();
                }
            }
        }

        //dungeon number 9
        public void dungeon9() {
            dungeon_length = 10;
            print_slow("On top of the Tower (length: " + dungeon_length + " )");

            while (dungeon_length > 0) {
                dungeon_length -= 1;
                print_slow("You move 1 feet");

                if (dungeon_length <= 0) {
                    print_slow("2069:We made it");
                } else {
                    print_slow("2069:Whats that!");
                    type_num = random(2, 3);
                }
                if (type_num > 6) {
                    type_num = random(1, 8);
                    new_emmi(type_num);
                    battle2();
                }
            }
        }

        //battle but with only 2069
        public void battle2() {
            while (emmi_HP > 0) {
                print_slow("2069 health " + HP1);
                print_slow(emmi_type + " health " + emmi_HP);
                if (HP1 > 0) {
                    attack();
                }


                if (HP1 > HP1m) {
                    HP1 = HP1m;
                }

                emmi_HP -= damage;
                damage = 0;
                attack_emmi();


                if (HP1 < 0) {
                    restart();
                }
            }

            gain();
            level();
        }

        //print method
        public void print_slow(String str) {
            //if 2069 is talking BLUE
            if (str.contains("2069:")) {
                for (int i = 0; i < str.length(); i++) {
                    System.out.print(BLUE + str.charAt(i));
                    wait(speed);
                }
            }
            //if 2077 is talking CYAN
            if (str.contains("2077:")) {
                for (int i = 0; i < str.length(); i++) {
                    System.out.print(CYAN + str.charAt(i));
                    wait(speed);
                }

            }
            //Tech gaint talking RED
            if (str.contains("Mark Zuckerberg:") || str.contains("Elon musk:") || str.contains("Bill gates:") || str.contains("Jeff bezos:")) {
                for (int i = 0; i < str.length(); i++) {
                    System.out.print(RED + str.charAt(i));
                    wait(speed);
                }
            }
            //if sounds then
            if (str.contains("*")) {
                for (int i = 0; i < str.length(); i++) {
                    System.out.print(GREEN + str.charAt(i));
                    wait(speed);
                }
            }
            //??? talks
            if (str.contains("???:")) {
                for (int i = 0; i < str.length(); i++) {
                    if (random(0, 15) == 10) {
                        System.out.print((char) (random(0, 256)));
                    } else {
                        System.out.print(PURPLE + str.charAt(i));
                    }
                    wait(speed);
                }
            }
            //Anyhthing else
            else {
                for (int i = 0; i < str.length(); i++) {
                    System.out.print(str.charAt(i));
                    wait(speed);
                }
            }
            System.out.println();
            System.out.println(RESET);
            System.out.println("> enter <");
            scanner.nextLine();
        }

        //wait method
        public void wait(int time) {
            //groups up all vars
            ArrayList<Object> arrList = new ArrayList<Object>();
            arrList.add(missionnum);
            arrList.add(HP1m);
            arrList.add(HP2m);
            arrList.add(attack1_tier);
            arrList.add(attack2_tier);
            arrList.add(attack3_tier);
            arrList.add(attack4_tier);
            arrList.add(level1);
            arrList.add(level2);
            arrList.add(exp1);
            arrList.add(exp2);
            arrList.add(levelr1);
            arrList.add(levelr2);
            arrList.add(attack1);
            arrList.add(attack2);
            arrList.add(attack3);
            arrList.add(attack4);
            arrList.add(max_hit);
            Edit("Save.txt", arrList);
            System.gc();
            long startTime = System.currentTimeMillis();
            while (startTime + time > System.currentTimeMillis()) ;
        }

        //random int (high to low)
        public int random(int low, int high) {
            int range = high - low + 1;
            return (int) (Math.random() * range) + low;
        }

        //Game Over
        public void restart() {
            print_slow("GAME OVER");
            print_slow("???: You seem to be overwhelmed");
            print_slow("???: I may be able to help");
            print_slow("???: Your only hope now is to turn back the hands of time");
            print_slow("2077:I see nothing wrong with that");
            print_slow("2069: Please help us");
            String choice = "How are you doing";
            while (!choice.equals("START")) {
                System.out.println("Type ¨START¨ to continue     ");
                choice = scanner.nextLine();
            }
            System.out.println();
            print_slow("PUT GAME HERE");
        }

        /**
         * Returns false on "Yes, yes, y, or Y"
         */
        public boolean skip() {
            System.out.println("Skip cutscene?   ");

            String skip = scanner.nextLine();
            boolean yesSkip = false;
            if (skip.equals("yes") || skip.equals("Yes") || skip.equals("Y") || skip.equals("y")) {
                yesSkip = true;
            }
            return !yesSkip;
        }

        //Creates new enemie
        public void new_emmi(int type1) {

            if (type1 == 1) {
                emmi_type = "Roomba";
                emmi_level = level1;
                emmi_HP = 30 + (emmi_level * 2);
                print_slow("A Roomba appears");
            }
            if (type1 == 2) {
                emmi_type = "Dog bot";
                emmi_level = level1;
                emmi_HP = 35 + (emmi_level * 3);
                print_slow("A Dog bot appears");
            }
            if (type1 == 3) {
                emmi_type = "Robot with a spear";
                emmi_level = level1;
                emmi_HP = 25 + (emmi_level * 2);
                print_slow("A Robot with a spear appears");
            }
            if (type1 == 4) {
                emmi_type = "Robot with a sword";
                emmi_level = level1;
                emmi_HP = 30 + (emmi_level * 3);
                print_slow("A Robot with a sword appears");
            }

            if (type1 == 5) {
                emmi_type = "Robot with a gun";
                emmi_level = level1;
                emmi_HP = 40 + (emmi_level * 4);
                print_slow("A Robot with a gun appears");
            }
            if (type1 == 6) {
                emmi_type = "Mech";
                emmi_level = level1;
                emmi_HP = 200 + (emmi_level * 5);
                print_slow("A Mech appears");
            }

            if (type1 == 7) {
                emmi_type = "Mini Mech";
                emmi_level = level1;
                emmi_HP = 150 + (emmi_level * 4);
                print_slow("A Mini Mech appears");
            }
            if (type1 == 8) {
                emmi_type = "Cyborg";
                emmi_level = level1;
                emmi_HP = 125 + (emmi_level * 4);
                print_slow("A Cyborg appears");
            }
        }

        public void emmi_prep() {
            emmi_attack=random(1,3);
            if (emmi_type.equals("Roomba"))
            {
                if(emmi_attack==1)
                {
                    print_slow("ROOMBA RUSH");
                }
                if(emmi_attack==2)
                {
                    print_slow("RECHARGE");
                }
                if(emmi_attack==3)
                {
                    print_slow("DARK RUSH");
                }
            }
            if (emmi_type.equals("Dog bot"))
            {
                if(emmi_attack==1)
                {
                    print_slow("SPEED TACKLE");
                }
                if(emmi_attack==2)
                {
                    print_slow("BATTERY RAM");
                }
                if(emmi_attack==3)
                {
                    print_slow("BITE FURY");
                }
            }
            if (emmi_type.equals("Robot with a sword"))
            {
                if(emmi_attack==1)
                {
                    print_slow("TRIPLE SLASH");
                }
                if(emmi_attack==2)
                {
                    print_slow("BLADE OF DESTRUCTION");
                }
                if(emmi_attack==3)
                {
                    print_slow("ZERO SLASH");
                }
            }
            if (emmi_type.equals("Robot with a gun"))
            {
                if(emmi_attack==1)
                {
                    print_slow("BULLET RUSH");
                }
                if(emmi_attack==2)
                {
                    print_slow("ZERO BLAST");
                }
                if(emmi_attack==3)
                {
                    print_slow("POWER SHOT");
                }
            }
            if (emmi_type.equals("Robot with a spear"))
            {
                if(emmi_attack==1)
                {
                    print_slow("SPEAR RUSH");
                }
                if(emmi_attack==2)
                {
                    print_slow("ZERO SPEAR");
                }
                if(emmi_attack==3)
                {
                    print_slow("ULTIMATE SPEAR");
                }
            }
            if (emmi_type.equals("Giga Mech"))
            {
                if(emmi_attack==1)
                {
                    print_slow("LASER RAIN");
                }
                if(emmi_attack==2)
                {
                    print_slow("DUAL BLADE");
                }
                if(emmi_attack==3)
                {
                    print_slow("ZERO BEAM");
                }
            }
            if (emmi_type.equals("Mech"))
            {
                if(emmi_attack==1)
                {
                    print_slow("LASER RAIN");
                }
                if(emmi_attack==2)
                {
                    print_slow("POWER BURST");
                }
                if(emmi_attack==3)
                {
                    print_slow("ULTIMATE RUSH");
                }
            }
            if (emmi_type.equals("Mini Mech"))
            {
                if(emmi_attack==1)
                {
                    print_slow("LASER SHOT");
                }
                if(emmi_attack==2)
                {
                    print_slow("POWER BURST");
                }
                if(emmi_attack==3)
                {
                    print_slow("TRIPLE SLASH");
                }
            }
            if (emmi_type.equals("Cyborg"))
            {
                if(emmi_attack==1)
                {
                    print_slow("LASER SHOT");
                }
                if(emmi_attack==2)
                {
                    print_slow("LASER SLASH");
                }
                if(emmi_attack==3)
                {
                    print_slow("CHARGE BEAM");
                }
            }
        }

        //enemies attack
        public void attack_emmi() {
            if (emmi_type.equals("Roomba")) {
                if(emmi_attack==1)
                {}
                if(emmi_attack==2)
                {}
                if(emmi_attack==3)
                {}
            }
            if (emmi_type.equals("Dog bot")) {
                if(emmi_attack==1)
                {}
                if(emmi_attack==2)
                {}
                if(emmi_attack==3)
                {}
            }

            if (emmi_type.equals("Robot with a spear")) {
                if(emmi_attack==1)
                {}
                if(emmi_attack==2)
                {}
                if(emmi_attack==3)
                {}
            }

            if (emmi_type.equals("Robot with a gun")) {
                if(emmi_attack==1)
                {}
                if(emmi_attack==2)
                {}
                if(emmi_attack==3)
                {}
            }
            if (emmi_type.equals("Robot with a sword")) {
                if(emmi_attack==1)
                {}
                if(emmi_attack==2)
                {}
                if(emmi_attack==3)
                {}
            }
            if (emmi_type.equals("Mech")) {
                if(emmi_attack==1)
                {}
                if(emmi_attack==2)
                {}
                if(emmi_attack==3)
                {}
            }

            if (emmi_type.equals("Giga Mech")) {
                if(emmi_attack==1)
                {}
                if(emmi_attack==2)
                {}
                if(emmi_attack==3)
                {}
            }

            if (emmi_type.equals("Mini Mech")) {
                if(emmi_attack==1)
                {}
                if(emmi_attack==2)
                {}
                if(emmi_attack==3)
                {}
            }

            if (emmi_type.equals("Cyborg")) {
                if(emmi_attack==1)
                {}
                if(emmi_attack==2)
                {}
                if(emmi_attack==3)
                {}
            }
        }

        //Create a giga mech
        public void giga_mech() {
            emmi_type = "Giga Mech";
            emmi_level = level1;
            emmi_HP = 200 + (emmi_level * 20);
            print_slow("Giga Mech");
        }

        //uses READ to update save
        public void grabSave() {
            ArrayList<Object> Save = Read("Save.txt");

            for (int i = 0; i < 17; i++) {
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
                    HP2m = val;
                }

                if (i == 3) {
                    attack1_tier = val;
                }
                if (i == 4) {
                    attack2_tier = val;
                }
                if (i == 5) {
                    attack3_tier = val;
                }
                if (i == 6) {
                    attack4_tier = val;
                }
                if (i == 7) {
                    level1 = val;
                }
                if (i == 8) {
                    level2 = val;
                }
                if (i == 9) {
                    levelr1 = val;
                }
                if (i == 10) {
                    levelr2 = val;
                }
                if (i == 11) {
                    exp1 = val;
                }
                if (i == 12) {
                    exp2 = val;
                }
                if (i == 13) {
                    attack1 = var;
                }
                if (i == 14) {
                    attack2 = var;
                }
                if (i == 15) {
                    attack3 = var;
                }
                if (i == 16) {
                    attack4 = var;

                }
                if (i == 17) {
                    max_hit = val;
                }

            }
            System.out.println("Save grabbed");


        }

//checks if you can cast a str to a int
        public boolean strIsInt(String string){
            try{
                int value=Integer.parseInt(string);
                return true;
            }catch(NumberFormatException e){
                return false;
            }
        }

    }


//main
