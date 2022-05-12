class Dungeon extends Tools {
    String dungeonName;
    int dungeonLevel;
    int dungeonLength;
    int amountMoved;

    int star = 1;

    boolean starsUnlocked;

    /**
     *
     * @param name
     * @param length
     * @param stars
     * @param starUnlock
     */
    public Dungeon(String name, int length, int stars, boolean starUnlock) {

        star = stars;
        dungeonName = name;
        dungeonLength = length;
        starsUnlocked = starUnlock;
    }

    public boolean getStarsUnlocked(){
        return starsUnlocked;
    }

    public void setStarsUnlocked(boolean starsUnlocked) {
        this.starsUnlocked = starsUnlocked;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        if(starsUnlocked) {
            this.star = star;
        }
    }

    public void start() {
        sPrint("Welcome to the " + dungeonName + " (length: " + dungeonLength + " )");
        amountMoved = 0;
    }

    public void move() {
        int steps = random(1, 5);
        amountMoved = steps;
        sPrintln("You move " + steps + " feet");
    }

}
