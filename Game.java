import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

//Main class
class Game extends Tools {

    //2069 and 2077 vars (non save)
    int HP1;
    int attack_num = 0;
    boolean attack_type;
    int last_attack = 0;
    // boss health
    int bill_HP = 300;
    int Elon_HP = 150;
    int target = 0;
    int Tri_HP = 1000;
    int Mark_Zuckerberg = 300;
    // Array vars (placed in Save.txt)
    int missionNum = 10;
    int HP1m = 50;
    int cure_tier = 1;
    int level1 = 1;
    int exp1 = 0;
    int levelR1 = 20;

    int cureTier = 1;
    int max_hit = 5;


    //dungeon vars
    //misc
    int num = 0;
    int num1 = 0;
    int num2 = 0;
    int hit = 0;
    int damage = 0;
    int move_tier = 0;
    int attackTime = 0;
    int attackStun = 0;
    //obj
    Dungeon subway = new Dungeon("Underground subway", 20);
    Dungeon local6_11 = new Dungeon("Rubble filled 6-11", 10);
    Dungeon factory = new Dungeon("Run down Factory", 30);
    Dungeon city = new Dungeon("Rubble filled City", 35);
    Dungeon highway = new Dungeon("Highway 101", 30);


    Scanner scanner = new Scanner(System.in);
    Attack aqua = new Attack("Aqua", 7, 15, 7, 8);
    Attack lasershot = new Attack("Lasershot", 7, 10, 5, 6);
    Attack ember = new Attack("Ember", 17, 30, 10, 10);
    Text text = new Text();

    //edit txt (update save)
    public static void Edit(String filePath, ArrayList<Object> arr) {
        File fileToBeModified = new File(filePath);
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
                assert writer != null;
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * @return array of saved vars
     */
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
        //Runs mission forever
        while (true) {
            String choice;
            sPrint("Type 1 -> " + missionNum + " to try that Mission");
            //Tells you how to roll the gotcha
            if (missionNum > 1) {
                sPrint("Type 'exp' to trade exp for new moves");
            }
            sPrint("which Mission would you like to try?   ");
            choice = scanner.nextLine();
            System.out.println();
            //mission 1
            if (choice.equals("1")) {
                sPrintln("Mission 1: The Awakening of  The Revolution");
                if (skip()) {
                    text.mission1_1();
                    text.mission1_2();
                }
                subway.start();
                while (subway.dungeonLength > subway.amountMoved) {
                    subway.move();
                    battle();
                }


                if (skip()) {
                    text.mission1_3();
                }
                mission1_4();

                if (missionNum < 2) {
                    missionNum = 2;
                    sPrintln("MISSION 2 UNLOCKED");
                }
            }
//Mission 2
            if ((choice.equals("2")) && (missionNum >= 2)) {
                sPrintln("Mission 2: First Encounters");

                if (skip()) {
                    text.mission2_1();
                }
                city.start();
                while (city.dungeonLength > city.amountMoved) {
                    city.move();
                    battle();
                }

                if (skip()) {
                    text.mission2_2();
                }
                boss_bill();

                if (skip()) {
                    text.mission2_3();
                }
                if (missionNum < 3) {
                    missionNum = 3;
                    sPrintln("MISSION 3 UNLOCKED");
                }
            }
//Mission 3
            if ((missionNum >= 3) && (choice.equals("3"))) {
                sPrintln("MISSION 3: Rest In The Rubble");
                if (skip()) {
                    text.mission3_1();
                }
                local6_11.start();
                while (local6_11.dungeonLength > local6_11.amountMoved) {
                    local6_11.move();
                    battle();
                }

                if (skip()) {
                    text.mission3_2();
                }
                Elon_musk();

                if (skip()) {
                    text.mission3_3();
                }

                if (skip()) {
                    text.mission3_4();
                }
                if (missionNum < 4) {
                    missionNum = 4;
                    sPrintln("MISSION 4 UNLOCKED");
                }
                sPrintln("MISSION 3 END");
            }
//Mission 4
            if ((missionNum >= 4) && (choice.equals("4"))) {
                sPrintln("Mission 4: 101 battles");

                if (skip()) {
                    text.mission4_1();
                }
                highway.start();
                while (highway.dungeonLength > highway.amountMoved) {
                    highway.move();
                    battle();
                }

                if (skip()) {
                    text.mission4_2();
                }
                if (missionNum < 5) {
                    missionNum = 5;
                    sPrintln("mission 5 UNLOCKED");
                }
            }
//Mission 5
            if ((missionNum >= 5) && (choice.equals("5"))) {
                sPrintln("Mission 5: Rematch Squared");

                if (skip()) {
                    text.mission5_1();
                }
                local6_11.start();
                while (local6_11.dungeonLength > local6_11.amountMoved) {
                    local6_11.move();
                    battle();
                }

                if (skip()) {
                    text.mission5_2();
                }
                double_boss();
                if (skip()) {
                    text.mission5_3();
                }
                if (missionNum < 6) {
                    missionNum = 6;
                    sPrintln("MISSION 6 UNLOCKED");
                }
            }
//Mission 6
            if ((missionNum >= 6) && (choice.equals("6"))) {
                sPrintln("Mission 6: The Smoking Gun");
                if (skip()) {
                    text.mission6_1();
                }
                highway.start();
                while (highway.dungeonLength > highway.amountMoved) {
                    highway.move();
                    battle();
                }

                if (skip()) {
                    text.mission6_2();
                }
                if (missionNum < 7) {
                    missionNum = 7;
                    sPrintln("MISSION 7 UNLOCKED");
                }
            }
//Mission 7
            if ((missionNum >= 7) && (choice.equals("7"))) {
                sPrintln("Mission 7: The Rules Of The Roomba");

                if (skip()) {
                    text.mission7_1();
                }
                factory.start();
                while (factory.dungeonLength > factory.amountMoved) {
                    factory.move();
                    battle();
                }
                Emmi giga = new Emmi(level1);
                battle();

                if (skip()) {
                    text.mission7_2();
                }
                if (missionNum < 8) {
                    missionNum = 8;
                    sPrintln("MISSION 8 UNLOCKED");
                }
            }
//Mission 8
            if ((missionNum >= 8) && (choice.equals("8"))) {
                sPrintln("MISSION 8 When I Step off");
                text.mission8_1();
                highway.start();
                while (highway.dungeonLength > highway.amountMoved) {
                    highway.move();
                    battle();
                }
                Emmi giga = new Emmi(level1);
                battle();

                text.mission8_2();
                if (missionNum < 9) {
                    missionNum = 9;
                    sPrintln("MISSION 9 UNLOCKED");
                }
            }
//Mission 9
            if ((missionNum >= 9) && (choice.equals("9"))) {
                sPrintln("Mission 9: Face-Off On The Grand Tower");
                Emmi giga = new Emmi(level1);
                battle();

                text.mission9_1();
                boss_rush();
                text.mission9_2();
                if (missionNum < 9) {
                    missionNum = 9;
                    sPrintln("MISSION 9 UNLOCKED");
                }
            }
//Mission 10
            if ((missionNum >= 10) && (choice.equals("10"))) {
                sPrintln("mission 10: 2 Sides Of The Same Coin");
                text.mission10_1();
                Final();
                text.mission10_2();
                if (missionNum < 11) {
                    missionNum = 11;
                    sPrintln("MISSION 11 UNLOCKED");
                }
            }

//Gotcha system
            if ((choice.equals("exp")) && (missionNum > 1)) {
                pull();
            }
            ArrayList<Object> arrList = new ArrayList<>();
            arrList.add(missionNum);
            arrList.add(HP1m);
            arrList.add(aqua.attackTier);
            arrList.add(lasershot.attackTier);
            arrList.add(cure_tier);
            arrList.add(ember.attackTier);
            arrList.add(level1);
            arrList.add(exp1);
            arrList.add(levelR1);
            arrList.add(max_hit);
            Edit("Save.txt", arrList);
        }

    }
    //embers method

    //shows you what attacks you can use
    public void attack() {

        attack_num = 0;
        sPrint("2069's turn");

        sPrint("1: " + aqua.attackName);

        sPrint("2: " + lasershot.attackName);

        sPrint("3: Cure");

        sPrint("4: " + ember.attackName);
        System.out.println();
        //This while loop just
        long start_Time = System.currentTimeMillis();

        sPrint("Which attack? (1-4)   ");
        attack_num = scanner.nextInt();

        System.out.println();

        sPrint("Out Power or Out Speed (Power=false)(Speed=true)");
        attack_type = scanner.nextBoolean();
        System.out.println();

        long end_Time = System.currentTimeMillis();
        attackTime = (int) ((end_Time - start_Time) / 1000);
        if (attack_num == 1) {
            attackTime += aqua.getSpeed(attack_type);
            attackStun = aqua.getSpeed(attack_type);
        }
        if (attack_num == 2) {
            attackTime += lasershot.getSpeed(attack_type);
            attackStun = lasershot.getStun(attack_type);

        }
        if (attack_num == 4) {
            attackTime += ember.getSpeed(attack_type);
            attackStun = ember.getSpeed(attack_type);
        }
    }

    /**
     * @return how much damage you did
     */
    public int choseAttack(double power) {
        if (attack_num == 1) {
            num = aqua.attack(power, attack_type);
        }
        if (attack_num == 2) {
            num = lasershot.attack(power, attack_type);
        }
        if (attack_num == 3) {
            cure(power);
        }
        if (attack_num == 4) {
            num = ember.attack(power, attack_type);
        }
        last_attack = attack_num;
        return num;
    }

    /**
     *
     */
    //cure method
    public void cure(double power) {
        if (attack_type) {
            sPrintln("dodging Cure");
            num = (int) (random(cure_tier * 2, cure_tier * 5) * power) * 2;
        } else {
            sPrintln("Cure shield");
            num = (int) (random(cure_tier * 5, cure_tier * 20) * power);
        }
        HP1 += num;
        sPrintln("2069's heal " + num + " damage");
    }

    //2077's code

    /**
     * @return 2077s damage dealt
     */
    public int attack2() {
        sPrintln("2077's turn");

//starts quicktime event
        num = quickTime() * max_hit;
        sPrintln("2077 Deals " + num + " Damage");
        return num;

    }

    /**
     * @return 2077s damage dealt
     */

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
        levelUp();

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

    //Elon's musk boss fight
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
        //gives you some exp for winning
        exp1 += random(100, 200);
        levelUp();

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
        levelUp();

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
            if (HP1 < 0) {
                restart();
            }
        }
    }

    //The trio boss rush
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
            System.out.println();
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
            System.out.println();
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
            if (HP1 < 0) {
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
        if (HP1 != 1) {
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

    public void mission1_4() {
        sPrintln("old man: Thank you. I can't thank you enough. I am forever in your debt.");

        sPrintln("old man: As a gift here is 100xp");


        String choice = "";
        //old man gift
        while ((!choice.equals("2069")) && (!choice.equals("2077"))) {
            sPrintln("Who will you give this exp to? (2069 or 2077)   ");
            choice = scanner.nextLine();
        }

        if (choice.equals("2069")) {
            exp1 += 100;
        }

        levelUp();

        sPrintln("Old Man: Oh I should tell you my name. Its 2020");
        sPrintln("2020: I can teach you new abilities in trade for ");
    }
    //Mission Text


    public void pull() {

        if (exp1 > 0) {
            sPrintln("2069 exp " + exp1);
            sPrint("how much exp would you like to use? ");
            num = scanner.nextInt();
            int pull_num = num / 25;
            exp1 -= num;
            if (exp1 < 0) num = -exp1;
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
        int[] odds = new int[]{1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 5, 6, 7};
        int tier = odds[random(0, odds.length - 1)];
        if (tier == 1) {
            HP1m += 2;
            sPrintln("2069's max Hp increased by 2");
        } else if ((tier == 2) || (tier == 3) || (tier == 4) || (tier == 5)) num = random(1, 4);
        //Ember level up
        if (num == 4) {
            if (tier > ember.attackTier) {
                sPrintln("ember leveled up");
                sPrintln(ember.attackTier + " --> " + tier);
                ember.setAttackTier(tier);
            }
            // Cure level up
            if (num == 3) {
                if (tier > cure_tier) {
                    sPrintln("Cure leveled up");
                    sPrintln(cure_tier + " -->" + tier);
                    cure_tier = tier;
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
            sPrintln("2077's power of each hit increases by 1");
        }
        if (tier == 7) {
            max_hit += 2;
            sPrintln("2077's power of each hit increases by 2");
        }
        sPrintln("roll complete");
    }

    public void levelUp() {
        if (exp1 >= levelR1) {
            sPrintln("LEVEL UP");
            sPrintln(level1 + " --> " + (level1 + 1));
            sPrintln("2069: max health +1");
            HP1m++;
            level1++;
            levelR1 = exp1 + 20 * (level1 * level1) / 2;
            sPrintln("2069 has" + (levelR1 - exp1) + "exp till leveling up");
        }


    }

    //fight enemies
    public void battle() {
        Emmi emmi = new Emmi(random(1, 7), level1);
        while (emmi.emmi_HP > 0) {
            sPrint("2069 health " + HP1);
            sPrint(emmi.emmi_type + " health " + emmi.emmi_HP);
            System.out.println();
            emmi.emmi_attack = 0;
            emmi.emmi_prep();
            attack();
            num = 0;
            double[] arr = emmi.attack_emmi(attackTime, attackStun);
            emmi.emmi_HP -= choseAttack(arr[1]);
            if (arr[1] > 0) {
                emmi.emmi_HP -= attack2();
            } else {
                HP1 -= arr[0];
            }
            if (HP1 > HP1m) {
                HP1 = HP1m;
            }
            restart();

        }

        levelUp();

    }


    //enemies attack


    //Create a giga mech

    //Game Over
    public void restart() {
        if (HP1 < 0) {
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
            System.out.println();

            sPrintln("PUT GAME HERE");
        }

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

    //uses READ to update save
    public void grabSave() {
        ArrayList<Object> Save = Read("Save.txt");

        for (int i = 0; i < 10; i++) {
            String var = Save.get(i).toString();
            int val = 0;
            if (strIsInt(var)) {
                val = Integer.parseInt(var);
            }
            if (i == 0) {
                missionNum = val;
            }
            if (i == 1) {
                HP1m = val;
            }
            if (i == 2) {
                level1 = val;
            }
            if (i == 3) {
                levelR1 = val;
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

    /**
     * @return Is that string castable
     */
    public boolean strIsInt(String string) {
        try {
            int value = Integer.parseInt(string);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
//don't pass this comment
}
