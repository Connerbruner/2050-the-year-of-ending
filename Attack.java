class Attack{
    Game g = new Game;
    /**
     * @param name
     * self explanitory
     * @param speedRange
     * low, high
     * @param damRange
     * low, high
     */
    String attackName = "";
    int[] speeds = new int[2];
    int[] damages = new int[2];
    int attackTier = 1;

    /**
     *
     * @param name
     * @param damRange
     * 2 long array, low, high
     * @param tier
     *
     */
    public Attack(String name, int[] damRange, int tier){

        attackName = name;
        damages = damRange;
        attackTier = tier;
    }
    public String getAttackName() {
        return attackName;
    }

    public int[] getSpeeds() {
        return speeds;
    }

    public int[] getDamages() {
        return damages;
    }

    public int getAttackTier() {
        return attackTier;
    }

    public void setAttackTier(int attackTier) {
        this.attackTier = attackTier;
    }

    public int[] attackRoll(int power){


        int[] pow = new int[]{damages[0]*attackTier*(1+(power*0.2)), damages[1]*attackTier*(1+(power*0.2))};

        int[] speedAndDamage = new int[]{g.random(pow[0], pow[1]), (g.random(1,10))+(100-(power*10))};
        return speedAndDamage;
    }
}