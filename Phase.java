class Phase extends Tools {
    int HP;
    Attack[] attacks;
    int HPM;
    String name;
    int curAttack;
    int speed;
    int stun;

    public Phase ( Attack[] arr , int health , String n , int sd , int st ) {
        attacks = arr;
        HP = health;
        name = n;
        speed = sd;
        stun = st;
    }

    public int getHP ( ) {
        return HP;
    }


    public void loseHP ( int HP ) {
        this.HP -= HP;
    }

    public void pickAttack ( ) {
        curAttack = random( 0 , attacks.length - 1 );
        sPrint( attacks[ curAttack ].name );
    }

}