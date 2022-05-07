class Phase {
    int HP;
    BossAttack[] attacks;
    int HPM;
    public Phase(BossAttack[] arr,int health)
    {
        attacks=arr;
        HP=health;
        HPM=health;
    }
    public int getHP() {
        return HP;
    }
    public int getHPM() {
        return HPM;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }
}