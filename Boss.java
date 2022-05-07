import java.util.ArrayList;
class Boss extends Tools {
    // boss health

    //Bill Gates boss fight
    ArrayList<Phase> differntPhases;

public void addPhase(Phase newStuff)
{
    differntPhases.add(newStuff);
}
    public void checkArray()
    {
        if(differntPhases.get(0).getHP()<=0)
        {
        differntPhases.remove(0);
        }
    }

}

    