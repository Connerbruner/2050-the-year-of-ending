# 2050-the-year-off-ending
HOW TO PLAY:

DOCS:
GENRAL methods:
Void - print_slow(String) - 2069s upgraded print methods 

Void - wait(milliseconds int) - Wait in milliseconds 

ArrayList<Object> - grabSave(String FileName) - Reads the file of the String you put in based on Save editing order (look at Save editing order)

Void - Edit(String FileName) - Edits the file of the String you put in based on Save editing order (look at Save editing order)

boolean - skip() checks if you want to skip the cutscene
boolean - strIsInt(String str) - is that String castAble to a int


GOTCHA methods:
Void - pull() Start/Setup Gotcha 
Void - roll() Random weighted prize

BOSS methods:

Void - attack_(name)() The bosses attack
Void - (Name of boss)() The boss fight its self

EXP methods:
Void - gain() gives you exp for killing a enemy
Void - levelup() Checks for level up

ATTACK  methods:

Void - attack1() 2069s attack method
Void - attack2() 2077s attack method
int - quickTime() starts a quickTime event

TEXT/HOW DOES GAME() WORK
Void - Mission(mission_num)_(cutscene number) Plays a cutscene
Void - Game() Starts Game and Lets you chose a Mission 


Save editing order:
    missionnum
    HP1m
    HP2m
    attack1_1mp
    attack1_2mp
    attack1_3mp
    attack1_4mp
    attack1_tier
    attack2_tier
    attack3_tier
    attack4_tier 
    level1
    level2
    exp1
    exp2
    levelr1
    levelr2
    String attack1_1
    String attack1_2
    String attack1_3
    String attack1_4
    String customspace_1
    String customspace_2
    String customspace_3
    String customspace_4
    max_hit