/* Name: Tapiwa Karen Tafa
   Project: List Interface
   (updated because i named the original folder wrong(ClassWork02)
   
 */




package IntListInterface;

public interface IntList {

    int getValueAtIndex(int index);
    boolean append( int valueToAdd );
    boolean insertValueAtIndex( int value, int index );
    int removeValueAtIndex( int index );
}
