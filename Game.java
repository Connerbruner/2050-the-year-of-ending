import java.util.Scanner;

//Main class
class Game extends Tools {

    //2069 and 2077 vars (non save)
    int HP2069;
    int attackNum = 0;
    boolean attackType;
    int lastAttack = 0;
    int attackTime = 0;
    int attackStun = 0;
    // Array vars (placed in Save.txt)
    int missionNum = 10;
    int HPmax = 50;
    int cureTier = 1;
    int level2069 = 1;
    int exp1 = 0;
    int levelR1 = 20;
    int maxHit = 5;
    //misc
    int num = 0;
    //obj
    Dungeon subway = new Dungeon( "Underground subway" , 20 );
    Dungeon local6_11 = new Dungeon( "Rubble filled 6-11" , 10 );
    Dungeon factory = new Dungeon( "Run down Factory" , 30 );
    Dungeon city = new Dungeon( "Rubble filled City" , 35 );
    Dungeon highway = new Dungeon( "Highway 101" , 30 );

    //bill gates
    BossAttack triSlash = new BossAttack( 7 , 21 , "TRI SLASH" );
    BossAttack powerSlash  = new BossAttack( 1 , 30 , "POWER SLASH" );
    BossAttack laserBlast = new BossAttack( 10 , 15 , "LASER BLAST" );
    BossAttack[] attackGates = { triSlash , powerSlash , laserBlast };
    //Elon musk
    BossAttack spear = new BossAttack( 5 , 20 , "SPEAR RUSH" );
    BossAttack revenge = new BossAttack( 7 , 15 , "REVENGE OF THE SPEAR" );
    BossAttack powerful = new BossAttack( 1 , 30 , "POWERFUL SPEAR" );
    BossAttack[] attacksElon = { spear , powerful , revenge };
    //jeff bezos
    BossAttack roomba = new BossAttack( 15 , 25 , "ROOMBA INVASION" );
    BossAttack mech = new BossAttack( 10 , 30 , "MECH CANNON" );
    BossAttack laser = new BossAttack( 1 , 50 , "DUAL LASER" );
    BossAttack[] attacksJeff = { roomba , mech , laser };
    //Mark Zuckerberg
    BossAttack finalSlash = new BossAttack( 0 , 75 , "ROOMBA INVASION" );
    BossAttack dualHit  = new BossAttack( 15 , 30 , "DOUBLE SLASH" );
    BossAttack zero = new BossAttack( 30 , 35 , "ZERO SLASH" );
    BossAttack[] attacksMark = { roomba , mech , laser };


    Phase Elon = new Phase( attacksElon , 500 , "Elon Musk" , 20 , 10 );
    Phase Gates = new Phase( attacksElon , 500 , "Bill Gates" , 20 , 5 );
    Phase Jeff = new Phase( attacksElon , 500 , "Bill Gates" , 30 , 5 );

    Phase ElonP = new Phase( attacksElon , 750 , "Elon Musk" , 15 , 12 );
    Phase GatesP  = new Phase( attacksElon , 750 , "Bill Gates" , 12 , 12 );
    Phase JeffP = new Phase( attacksElon , 750 , "Bill Gates" , 20 , 7 );


    Phase[] arrTri1 = {Elon,Gates,Jeff};
    Phase[] arrTri2 = {ElonP,GatesP,JeffP};






    Scanner scanner = new Scanner( System.in );
    Attack aqua = new Attack( "Aqua" , 7 , 15 , 7 , 8 );
    Attack lasershot = new Attack( "Lasershot" , 7 , 10 , 5 , 6 );
    Attack ember = new Attack( "Ember" , 17 , 30 , 10 , 10 );

    Text text = new Text( );

    //Starts up 2069
    public void game ( ) {
        HP2069 = HPmax;
        //Runs mission forever
        while ( true ) {
            String choice;
            sPrint( "Type 1 -> " + missionNum + " to try that Mission" );
            //Tells you how to roll the gotcha
            if ( missionNum > 1 ) {
                sPrint( "Type 'exp' to trade exp for new moves" );
            }
            sPrint( "which Mission would you like to try?   " );
            choice = scanner.nextLine( );
            System.out.println( );
            //mission 1
            if ( choice.equals( "1" ) ) {
                sPrintln( "Mission 1: The Awakening of  The Revolution" );
                if ( skip( ) ) {
                    text.mission1_1( );
                    text.mission1_2( );
                }
                subway.start( );
                while ( subway.dungeonLength > subway.amountMoved ) {
                    subway.move( );
                    battle( );
                }


                if ( skip( ) ) {
                    text.mission1_3( );
                }
                mission1_4( );

                if ( missionNum < 2 ) {
                    missionNum = 2;
                    sPrintln( "MISSION 2 UNLOCKED" );
                }
            }
//Mission 2
            if ( ( choice.equals( "2" ) ) && ( missionNum >= 2 ) ) {
                sPrintln( "Mission 2: First Encounters" );

                if ( skip( ) ) {
                    text.mission2_1( );
                }
                city.start( );
                while ( city.dungeonLength > city.amountMoved ) {
                    city.move( );
                    battle( );
                }

                if ( skip( ) ) {
                    text.mission2_2( );
                }

                if ( skip( ) ) {
                    text.mission2_3( );
                }
                if ( missionNum < 3 ) {
                    missionNum = 3;
                    sPrintln( "MISSION 3 UNLOCKED" );
                }
            }
//Mission 3
            if ( ( missionNum >= 3 ) && ( choice.equals( "3" ) ) ) {
                sPrintln( "MISSION 3: Rest In The Rubble" );
                if ( skip( ) ) {
                    text.mission3_1( );
                }
                local6_11.start( );
                while ( local6_11.dungeonLength > local6_11.amountMoved ) {
                    local6_11.move( );
                    battle( );
                }

                if ( skip( ) ) {
                    text.mission3_2( );
                }

                if ( skip( ) ) {
                    text.mission3_3( );
                }

                if ( skip( ) ) {
                    text.mission3_4( );
                }
                if ( missionNum < 4 ) {
                    missionNum = 4;
                    sPrintln( "MISSION 4 UNLOCKED" );
                }
                sPrintln( "MISSION 3 END" );
            }
//Mission 4
            if ( ( missionNum >= 4 ) && ( choice.equals( "4" ) ) ) {
                sPrintln( "Mission 4: 101 battles" );

                if ( skip( ) ) {
                    text.mission4_1( );
                }
                highway.start( );
                while ( highway.dungeonLength > highway.amountMoved ) {
                    highway.move( );
                    battle( );
                }

                if ( skip( ) ) {
                    text.mission4_2( );
                }
                if ( missionNum < 5 ) {
                    missionNum = 5;
                    sPrintln( "mission 5 UNLOCKED" );
                }
            }
//Mission 5
            if ( ( missionNum >= 5 ) && ( choice.equals( "5" ) ) ) {
                sPrintln( "Mission 5: Rematch Squared" );

                if ( skip( ) ) {
                    text.mission5_1( );
                }
                local6_11.start( );
                while ( local6_11.dungeonLength > local6_11.amountMoved ) {
                    local6_11.move( );
                    battle( );
                }

                if ( skip( ) ) {
                    text.mission5_2( );
                }
                if ( skip( ) ) {
                    text.mission5_3( );
                }
                if ( missionNum < 6 ) {
                    missionNum = 6;
                    sPrintln( "MISSION 6 UNLOCKED" );
                }
            }
//Mission 6
            if ( ( missionNum >= 6 ) && ( choice.equals( "6" ) ) ) {
                sPrintln( "Mission 6: The Smoking Gun" );
                if ( skip( ) ) {
                    text.mission6_1( );
                }
                highway.start( );
                while ( highway.dungeonLength > highway.amountMoved ) {
                    highway.move( );
                    battle( );
                }

                if ( skip( ) ) {
                    text.mission6_2( );
                }
                if ( missionNum < 7 ) {
                    missionNum = 7;
                    sPrintln( "MISSION 7 UNLOCKED" );
                }
            }
//Mission 7
            if ( ( missionNum >= 7 ) && ( choice.equals( "7" ) ) ) {
                sPrintln( "Mission 7: The Rules Of The Roomba" );

                if ( skip( ) ) {
                    text.mission7_1( );
                }
                factory.start( );
                while ( factory.dungeonLength > factory.amountMoved ) {
                    factory.move( );
                    battle( );
                }
                Emmi giga = new Emmi( level2069 );
                battle( );

                if ( skip( ) ) {
                    text.mission7_2( );
                }
                if ( missionNum < 8 ) {
                    missionNum = 8;
                    sPrintln( "MISSION 8 UNLOCKED" );
                }
            }
//Mission 8
            if ( ( missionNum >= 8 ) && ( choice.equals( "8" ) ) ) {
                sPrintln( "MISSION 8 When I Step off" );
                text.mission8_1( );
                highway.start( );
                while ( highway.dungeonLength > highway.amountMoved ) {
                    highway.move( );
                    battle( );
                }
                Emmi giga = new Emmi( level2069 );
                battle( );

                text.mission8_2( );
                if ( missionNum < 9 ) {
                    missionNum = 9;
                    sPrintln( "MISSION 9 UNLOCKED" );
                }
            }
//Mission 9
            if ( ( missionNum >= 9 ) && ( choice.equals( "9" ) ) ) {
                sPrintln( "Mission 9: Face-Off On The Grand Tower" );
                Emmi giga = new Emmi( level2069 );
                battle( );

                text.mission9_1( );
                text.mission9_2( );
                if ( missionNum < 9 ) {
                    missionNum = 9;
                    sPrintln( "MISSION 9 UNLOCKED" );
                }
            }
//Mission 10
            if ( ( missionNum >= 10 ) && ( choice.equals( "10" ) ) ) {
                sPrintln( "mission 10: 2 Sides Of The Same Coin" );
                text.mission10_1( );
                text.mission10_2( );
                if ( missionNum < 11 ) {
                    missionNum = 11;
                    sPrintln( "MISSION 11 UNLOCKED" );
                }
            }

//Gotcha system
            if ( ( choice.equals( "exp" ) ) && ( missionNum > 1 ) ) {
                pull( );
            }
            Object[] arrList = new Object[]{ missionNum , HPmax , level2069, exp1, 
 levelR1,aqua.att};


            Edit( "Save.txt" , arrList );
        }

    }
    //embers method

    //shows you what attacks you can use
    public void attack ( ) {

        attackNum = 0;
        sPrint( "2069's turn" );

        sPrint( "1: " + aqua.attackName );

        sPrint( "2: " + lasershot.attackName );

        sPrint( "3: Cure" );

        sPrint( "4: " + ember.attackName );
        System.out.println( );
        //This while loop just
        long start_Time = System.currentTimeMillis( );

        sPrint( "Which attack? (1-4)   " );
        attackNum = scanner.nextInt( );

        System.out.println( );

        sPrint( "Out Power or Out Speed (Power=false)(Speed=true)" );
        attackType = scanner.nextBoolean( );
        System.out.println( );

        long end_Time = System.currentTimeMillis( );
        attackTime = ( int ) ( ( end_Time - start_Time ) / 1000 );
        if ( attackNum == 1 ) {
            attackTime += aqua.getSpeed( attackType );
            attackStun = aqua.getStun( attackType );
        }
        if ( attackNum == 2 ) {
            attackTime += lasershot.getSpeed( attackType );
            attackStun = lasershot.getStun( attackType );

        }
        if ( attackNum == 4 ) {
            attackTime += ember.getSpeed( attackType );
            attackStun = ember.getStun( attackType );
        }
        if( attackNum==3 )
        {
            attackStun=0;
        }
    }

    /**
     * @return how much damage you did
     */
    public int choseAttack ( double power ) {
        if ( attackNum == 1 ) {
            num = aqua.attack( power , attackType );
        }
        if ( attackNum == 2 ) {
            num = lasershot.attack( power , attackType );
        }
        if ( attackNum == 3 ) {
            cure( power );
        }
        if ( attackNum == 4 ) {
            num = ember.attack( power , attackType );
        }
        lastAttack = attackNum;
        return num;
    }

    /**
     *
     */
    //cure method
    public void cure ( double power ) {
        if ( attackType ) {
            sPrintln( "dodging Cure" );
            num = ( int ) ( random( cureTier * 2 , cureTier * 5 ) * power ) * 2;
        } else {
            sPrintln( "Cure shield" );
            num = ( int ) ( random( cureTier * 5 , cureTier * 20 ) * power );
        }
        HP2069 += num;
        sPrintln( "2069's heal " + num + " damage" );
    }

    //2077's code

    /**
     * @return 2077s damage dealt
     */
    public int attack2 ( ) {
        sPrintln( "2077's turn" );

//starts quicktime event
        long startTime = System.currentTimeMillis( );
        int i = 0;
        while ( startTime + 10000 > System.currentTimeMillis( ) ) {
            sPrint( "Type Kick" );
            while ( startTime + 10000 > System.currentTimeMillis( ) ) {
                if ( scanner.nextLine( ).equals( "Kick" ) ) {
                    break;
                }

            }
            sPrint( "Type Punch" );
            while ( startTime + 10000 > System.currentTimeMillis( ) ) {
                if ( scanner.nextLine( ).equals( "Punch" ) ) {
                    break;
                }

            }
            i++;

        }
        num = i * maxHit;
        sPrintln( "2077 Deals " + num + " Damage" );
        return num;

    }


    public void mission1_4 ( ) {
        sPrintln( "old man: Thank you. I can't thank you enough. I am forever in your debt." );

        sPrintln( "old man: As a gift here is 100xp" );

        String choice = "";
        //old man gift
        while ( ( ! choice.equals( "2069" ) ) && ( ! choice.equals( "2077" ) ) ) {
            sPrintln( "Who will you give this exp to? (2069 or 2077)   " );
            choice = scanner.nextLine( );
        }

        if ( choice.equals( "2069" ) ) {
            exp1 += 100;
        }

        levelUp( );

        sPrintln( "Old Man: Oh I should tell you my name. Its 2020" );
        sPrintln( "2020: I can teach you new abilities in trade for " );
    }
    //Mission Text


    public void pull ( ) {

        if ( exp1 > 0 ) {
            sPrintln( "2069 exp " + exp1 );
            sPrint( "how much exp would you like to use? " );
            num = scanner.nextInt( );
            int pull_num = num / 25;
            exp1 -= num;
            if ( exp1 < 0 ) {
                num = - exp1;
            }
            exp1 = 0;

            while ( pull_num > 0 ) {

                int[] odds = new int[]{ 1 , 1 , 1 , 1 , 2 , 2 , 2 , 3 , 3 , 3 , 4 , 4 , 5 , 6 , 7 };
                int tier = odds[ random( 0 , odds.length - 1 ) ];
                if ( tier == 1 ) {
                    HPmax += 2;
                    sPrintln( "2069's max Hp increased by 2" );
                } else if ( ( tier == 2 ) || ( tier == 3 ) || ( tier == 4 ) || ( tier == 5 ) ) num = random( 1 , 4 );
                //Ember level up
                if ( num == 4 ) {
                    if ( tier > ember.attackTier ) {
                        sPrintln( "ember leveled up" );
                        sPrintln( ember.attackTier + " --> " + tier );
                        ember.setAttackTier( tier );
                    }
                    // Cure level up
                    if ( num == 3 ) {
                        if ( tier > cureTier ) {
                            sPrintln( "Cure leveled up" );
                            sPrintln( cureTier + " -->" + tier );
                            cureTier = tier;
                        }

                    }
                }
                //aqua level up
                if ( num == 1 ) {
                    if ( tier > aqua.attackTier ) {
                        sPrintln( "Aqua leveled up" );
                        sPrintln( aqua.attackName + " --> " + tier );
                        aqua.setAttackTier( tier );
                    }
                }
                //Laser level up
                if ( num == 2 ) {
                    if ( tier > lasershot.attackTier ) {
                        sPrintln( "Laser leveled up" );
                        sPrintln( lasershot.attackTier + " --> " + tier );
                        lasershot.setAttackTier( tier );

                    }
                }
                if ( tier == 6 ) {
                    maxHit += 1;
                    sPrintln( "2077's power of each hit increases by 1" );
                }
                if ( tier == 7 ) {
                    maxHit += 2;
                    sPrintln( "2077's power of each hit increases by 2" );
                }
                sPrintln( "roll complete" );
                pull_num -= 1;
            }
        } else {
            sPrintln( "YOU NEED MORE EXP POOR PERSON" );
        }

    }


    public void levelUp ( ) {
        if ( exp1 >= levelR1 ) {
            sPrintln( "LEVEL UP" );
            sPrintln( level2069 + " --> " + ( level2069 + 1 ) );
            sPrintln( "2069: max health +1" );
            HPmax++;
            level2069++;
            levelR1 = exp1 + 20 * ( level2069 * level2069 ) / 2;
            sPrintln( "2069 has" + ( levelR1 - exp1 ) + "exp till leveling up" );
        }


    }

    //fight enemies
    public void battle ( ) {
        Emmi emmi = new Emmi( random( 1 , 7 ) , level2069 );
        while ( emmi.emmi_HP > 0 ) {
            sPrint( "2069 health " + HP2069 );
            sPrint( emmi.emmi_type + " health " + emmi.emmi_HP );
            System.out.println( );
            emmi.emmi_attack = 0;
            emmi.emmi_prep( );
            attack( );
            num = 0;
            double[] arr = emmi.attack_emmi( attackTime , attackStun );
            emmi.emmi_HP -= choseAttack( arr[ 1 ] );
            if ( arr[ 1 ] > 0 ) {
                emmi.emmi_HP -= attack2( );
            } else {
                HP2069 -= arr[ 0 ];
            }
            if ( HP2069 > HPmax ) {
                HP2069 = HPmax;
            }
            restart( );

        }

        levelUp( );

    }

    //Create a giga mech

    //Game Over
    public void restart ( ) {
        if ( HP2069 < 0 ) {
            sPrintln( "The world around you begins to fade to black" );
            sPrintln( "???: Welcome back to this world of nothingness " );
            sPrintln( "2069: no..." );
            sPrintln( "???: Your only hope now is to turn back the hands of time" );
            sPrintln( "2077:I see nothing wrong with that" );
            sPrintln( "2069: Please help us" );
            String choice = "How are you doing";
            while ( ! choice.equals( "START" ) ) {
                sPrint( "Type ¨START¨ to continue     " );
                choice = scanner.nextLine( );
            }
            System.out.println( );

            game( );
        }

    }


    //uses READ to update save
    public void grabSave ( ) {
        Object[] Save = Read( "Save.txt" );

        for ( int i = 1; i < Save.length-1; i++ ) {
            String var = Save[ i ].toString( );
            val = Integer.parseInt( var );
            }
            if ( i == 0 ) {
                missionNum = val;
            }
            if ( i == 1 ) {
                HPmax = val;
            }
            if ( i == 2 ) {
                level2069 = val;
            }
            if ( i == 3 ) {
                levelR1 = val;
            }
            if ( i == 4 ) {
                exp1 = val;
            }
            if ( i == 5 ) {
                aqua.attackTier = val;
            }
            if ( i == 6 ) {
                lasershot.attackTier = val;
            }
            if ( i == 7 ) {
                cureTier = val;
            }
            if ( i == 8 ) {
                ember.attackTier = val;
            }
            if ( i == 9 ) {
                maxHit = val;
            }

        }
        sPrint( "Save grabbed" );

    }

    public void bossFight ( Boss boss ) {

        while ( ! boss.differntPhases.isEmpty( ) ) {

            boss.checkArray( );
            Phase current = boss.differntPhases.get( 0 );

            sPrint( current.name + "'s Health " + current.getHP( ) );
            sPrintln( "2069's Health " + HP2069 );

            current.pickAttack( );
            attack( );

            if ( attackTime < current.speed ) {
                current.loseHP( choseAttack( 1 ) );

                if ( attackStun > current.stun ) {
                    current.loseHP( attack2( ) );

                }
            }
            if ( attackStun < current.stun ) {
                num = current.useAttack( );
                current.printAttack( num );
                HP2069 -= num;
            }
            restart( );
        }
        exp1+=100;
        levelUp( );
    }
//don't pass this comment
}
