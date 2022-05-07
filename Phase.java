class Phase extends Tools {
    int HP;
    BossAttack[] attacks;
    int HPM;
    String name;
    int curAttack;
    int speed;
    int stun;

    public Phase ( BossAttack[] arr , int health , String n , int sd , int st ) {
        attacks = arr;
        HP = health;
        HPM = health;
        name = n;
        speed = sd;
        stun = st;
    }

    public int getHP ( ) {
        return HP;
    }

    public int getHPM ( ) {
        return HPM;
    }

    public void loseHP ( int HP ) {
        this.HP -= HP;
    }

    public void pickAttack ( ) {
        curAttack = random( 0 , attacks.length - 1 );
        sPrint( attacks[ curAttack ].name );
    }

    public int useAttack ( ) {
        return attacks[ curAttack ].do_damage( );
    }
    public void printAttack(int num)
    {
        sPrint(attacks[curAttack].name);
        sPrint( name+" deals "+num );
    }
}