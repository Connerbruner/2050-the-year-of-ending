import java.util.ArrayList;

class Boss extends Tools {
    public ArrayList < Phase > differntPhases = new ArrayList<>();

    public Boss ( ) {
    }

    public Boss ( Phase[] arr ) {
        for ( int i = 0; i < arr.length; i++ )
            differntPhases.add( arr[ i ] );
    }



    public void checkArray ( ) {
        if ( differntPhases.get( 0 ).getHP( ) <= 0 ) {
            differntPhases.remove( 0 );
        }
    }


}

    