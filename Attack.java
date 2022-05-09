class Attack extends Tools {

    String attackName;
    int speed;
    int high;
    int low;
    int attackTier;
    int stun;
    int num;

    /**
     * @param name
     * @param l
     * @param h
     * @param spd
     * @param stn
     */
    public Attack ( String name , int l , int h , int spd , int stn ) {
        attackName = name;
        low = l;
        high = h;
        speed = spd;
        stun = stn;
        attackTier=1;
    }

    public String getAttackName ( ) {
        return attackName;
    }

    /**
     * @param style
     *
     * @return
     */
    public int getSpeed ( boolean style ) {
        if ( style ) {
            return speed / 2;
        } else {
            return speed * 2;
        }
    }

    public int getAttackTier ( ) {
        return attackTier;
    }

    /**
     * @param attackTier
     */
    public void setAttackTier ( int attackTier ) {
        this.attackTier = attackTier;
    }

    /**
     * @param style
     *
     * @return
     */

    public int getStun ( boolean style ) {
        if ( style ) {
            return stun / 2;
        } else {
            return stun * 2;
        }
    }

    /**
     * @param power
     * @param style
     *
     * @return
     */
    public int attack ( double power , boolean style ) {
        if ( style ) {
            sPrint( "Fast " + attackName );
            num = ( int ) ( ( random( low , high ) * attackTier ) * ( power * 2 ) );
        } else {
            sPrint( "Powerful " + attackName );
            num = ( int ) ( ( random( low , high ) * attackTier ) * power );

        }
        sPrintln( "2069 deals " + num + " damage" );
        return num;
    }
}