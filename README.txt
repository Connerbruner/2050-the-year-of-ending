# 2050-the-year-off-ending
HOW TO PLAY:

DOCS:
GENRAL methods:
Void - print_slow(String) - 2069s upgraded print methods
Void - wait(milliseconds int) - Wait in milliseconds

ArrayList<Object> - Read(String FileName) - Reads the file of the String you put in based on Save editing order (look at Save editing order)
Void - GetSave() - Uses Read to update game
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

DUNGEONS
Void - Battle() - fight enemies
Void - Battle2() - fight enemies 2069 only
Void - Dungeons(number) - dungeon

VARIABLES:
 public static final String SCREEN_CLEAR = "\u001b[H\u001b[2J";
    public static final String RESET = reset Screen
    public static final String BLACK = makes text black
    public static final String RED = makes text red
    public static final String GREEN = makes text green
    public static final String YELLOW = makes text yellow
    public static final String BLUE = makes text blue
    public static final String PURPLE = makes text purple
    public static final String CYAN = makes text cyan
    public static final String WHITE = makes text white
    int emmi_HP = enemie HP
    int emmi_level = enemie level
    String emmi_type = enemie name
    int mp1 = 2069 mp
    int HP1 = 2069 hp
    int HP2 = 2077 hp
    int bill_HP = bill gates HP
    int Elon_HP = Elon HP
    int target = who is being attacked by bill gates
    int Tri_HP = Tech giant
    int Mark_Zuckerberg = Zuckerberg HP
    int missionnum = missions unlocked
    int HP1m = 2069 max HP
    int HP2m = 2077 max HP
    int attack1_1mp = mp cost
    int attack1_tier = tier of the move
    int level1 = 2069 level
    int level2 = 2077 level
    int exp1 = 2069 exp
    int exp2 = 2077 exp
    int levelr1 = level up Requirement 2069
    int levelr2 = level up Requirement 2077
    String attack1_1 = attack name
    String customspace_1 = spacing attack
    int max_hit = number of damage per hit
    int dungeon_length = length of dungeon
    int num = placeholder
    int type_num = placeholder
    int speed = text speed
    int num1 = placeholder
    int num2 = placeholder
    int bonus = placeholder exp
    int hit = placeholder
    int damage = damage placeholder
    int attack1_power = null
    int move_tier = power of move

Save editing order:
    missionnum
    HP1m
    level1
    levelr1
    exp1
    attack1_tier
    attack2_tier
    attack3_tier
    attack4_tier
    max_hit