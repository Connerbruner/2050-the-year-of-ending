class Attack extends Game{
    /**
     * @param name
     * self explanitory
     * @param speedRange
     * low, high
     * @param damRange
     * low, high
     */
    String attackName = "";
    int speed = 0;
    int high;
    int low;
    int attackTier = 1;
    int stun = 0;

    /**
     *
     * @param name
     * @param l
     * @param h
     * @param spd
     * @param stn
     */
    public Attack(String name, int l, int h, int spd, int stn){

        attackName = name;
        high=h;
        low=l;
        speed = spd;
        stun = stn;
    }
    public String getAttackName() {
        return attackName;
    }

    public int getSpeed() {
        return speed;
    }

    public int getAttackTier() {
        return attackTier;
    }

    public int getStun() {
        return stun;
    }

    public void setAttackTier(int attackTier) {
        this.attackTier = attackTier;
    }


    public int attack(double power, boolean style){
        if(style)
        {
            print_slow("Fast "+attackName);
            return (int)((random(low,high)*attackTier)*(power*2));
        }
        else
        {
            print_slow("Powerful "+attackName);
            return (int)((random(low,high)*attackTier)*power);
        }
    }
}