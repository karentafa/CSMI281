     

/* Name: Tapiwa Karen Tafa
   Project: List Interface
   Date: 09/13/18
 */

package IntListInterface;

public class Main implements IntListInterface {
    private int[] theList;
    private int   size;

    private static final int STARTING_SIZE = 19;

    public Main() {
        theList = new int[STARTING_SIZE];
        size = 0;
    }

    public int getValueAtIndex( int index ) throws ArrayIndexOutOfBoundsException {
        if( size == index ) {
            throw new ArrayIndexOutOfBoundsException( "The list is empty!" );   // maybe not the best...
        } else if( index > size ) {
            throw new ArrayIndexOutOfBoundsException( "The index value is too large" );
        } else if( index < 0 ) {
            throw new ArrayIndexOutOfBoundsException( "The index value is too small");
        } else {
            return theList[index];
        }
    }

    public boolean append( int valueToAdd ) {
        if( size < theList.length ) {
            theList[size] = valueToAdd;
            size++;
            return true;
        } else {
            // what should we do here, if there's no room?
        }
        return false;
    }

    // we've gotta have these to actually get things to compile
    public boolean insertValueAtIndex( int value, int index ) {
        checkIndex(index);
        if( size < theList.length ) {
            holeFiller(index);
            theList[index] = value;
            return true;
        } else {
            int[] storage = theList;
            theList = new int[storage.length+STARTING_SIZE];
            for(int i = 0; i<storage.length; i ++){
                theList[i] = storage[i];
            }
            insertValueAtIndex(value, index);
        }
        final boolean b = false;
        if (b) {
            return true;
        } else {
            return false;
        }



    }

    public int removeValueAtIndex( int index ) throws ArrayIndexOutOfBoundsException {
        int value = theList[index];
        if( size == 0 ) {
            throw new ArrayIndexOutOfBoundsException( "The list is empty!" );   // maybe not the best...
        } else if( index > size ) {
            throw new ArrayIndexOutOfBoundsException( "The index value is too large" );
        } else if( index < 0 ) {
            throw new ArrayIndexOutOfBoundsException( "The index value is too small");
        } else {
            holeFiller( index );
        }
        return value;
    }

    private void holeFiller( int index ) {
        for( int i = index; i < size - 1; i++ ) {
            theList[i] = theList[i+1];
        }
        size--;
    }

    public boolean checkIndex( int index){
        if(index < theList.length) {
            return true;
        }
            else if(index >= 0) {
                 return true;
             }else{
                    return false;
             }
    }

    public boolean prepend( int valueToAdd ) {
        if( size < theList.length ) {
            holeFiller(0);
            theList[0] = valueToAdd;
            return true;
        } else {
           
        }
        return false;
    }


    public static void main( String[] args ) {
        Main list = new Main();
        list.append( 2 );
        list.append( 3 );
        list.append( 5 );
        list.append( 7 );
        System.out.println( list.getValueAtIndex( 3 ) );   // should return the value 7
        list.append( 11 );
        list.append( 13 );
        list.append( 17 );
        list.append( 19 );
        System.out.println( list.getValueAtIndex( 7 ) );      // should return the value 19
        System.out.println( list.removeValueAtIndex( 3 ) );   // should return the value 7
        System.out.println( list.getValueAtIndex( 3 ) );      // should return the value 11
        System.out.println( list.getValueAtIndex( 18 ) );
        System.out.println( list.insertValueAtIndex(5,18 ) );
        System.out.println( list.prepend( 18 ) );
         System.out.println( list.checkIndex( 18 ) );

    }
}

