class Dungeon extends Tools
{
    String dungeonName;
    int dungeonLevel;
    int dungeonLength;
    int amountMoved;
    public Dungeon(String name,int length) {
        dungeonName=name;
        dungeonLength=length;
    }
    public void start() {
        sPrint("Welcome to the "+dungeonName+" (length: " + dungeonLength + " )");
        amountMoved=0;
        }
        public void move() {
            int steps = random(1, 5);
            amountMoved=+steps;
            sPrintln("You move " + steps + " feet");  
        }
          
    }
