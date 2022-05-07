public class BossAttack extends  Tools{
    int high;
    int low;
    String name;
    Phase currentPhase;

    public BossAttack(int l,int h,String n)
    {
        low=l;
        high=h;
        name=n;
    }
    public int do_damage()
    {
        return  random(low,high);
    }
    public void printAttack(int num)
    {
        sPrint(name);
        sPrint(currentPhase.name+" deals "+num+" damage");
    }
}
