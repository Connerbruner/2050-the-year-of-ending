import java.util.ArrayList;

class Boss extends Tools {
    public ArrayList < Phase > differntPhases;

    public Boss ( ) {}

    public Boss ( Phase p ) {
        addPhase( p );
    }

    public void addPhase ( Phase newStuff ) {
        differntPhases.add( newStuff );
    }

    public void checkArray ( ) {
        if ( differntPhases.get( 0 ).getHP( ) <= 0 ) {
            differntPhases.remove( 0 );
        }
    }


}

    