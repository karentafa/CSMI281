/*

Name: Tapiwa Karen Tafa
Project Name: IntLinkedList
Date: 09/19/18

*/


public class IntLinkedListTester {
    public static void main(String[] args) {

        IntLinkedList myList = new IntLinkedList();
        myList.prepend( 23 );
        myList.prepend( 19 );
        myList.prepend( 17 );
        myList.prepend( 13 );
        myList.prepend( 11 );
        myList.prepend(  7 );
        myList.prepend(  5 );
        myList.prepend(  3 );
        myList.prepend(  2 );
        IntLinkedList.Iterator myIt = myList.getIteratorAt( 0 );
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 2
        myIt.next();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 3
        myIt.next();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 5
        myIt.next();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 7
        myIt = myList.getIteratorAt( 3 );
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 7
        myIt.next();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 11
        myIt.next();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 13
        myIt.next();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 17
        myIt.next();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 19
        myIt.next();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );    // 23

        // Testing Remove Method

        System.out.println("\nLets Test removeAt()\n");

        myList.removeAt(1);
        System.out.println("\n Here is the new list \n");
  
        myIt = myList.getIteratorAt( 0 );
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );    
        myIt.next();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );   
        myIt.next();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );    
        myIt.next();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );    
        myIt = myList.getIteratorAt( 3 );
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );    
        myIt.next();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );    
        myIt.next();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );    
        myIt.next(); 
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );
        myIt.next();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );


        myList.removeAt(2);

         System.out.println("\n Here is the new list\n");
  
        myIt = myList.getIteratorAt( 0 );
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );    
        myIt.next();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );   
        myIt.next();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );    
        myIt.next();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );    
        myIt = myList.getIteratorAt( 3 );
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );    
        myIt.next();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );    
        myIt.next();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );    
        myIt.next(); 
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );


        myList.removeAt(3);

        System.out.println(" \n Here is the new list\n");
  
        myIt = myList.getIteratorAt( 0 );
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );    
        myIt.next();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );    
        myIt.next();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );    
        myIt.next();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );   
        myIt = myList.getIteratorAt( 3 );
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );    
        myIt.next();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );    
        myIt.next();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );    
        myIt.next();



        // Testing Insert Method

        System.out.println("\n Lets Test insertAt()\n");

        myList.insertAt(10  , 1); 
        myList.insertAt(16, 4);
        myList.insertAt(38  , 3); 

         myIt = myList.getIteratorAt( 0 );
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );    
        myIt.next();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );    
        myIt.next();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );    
        myIt.next();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );    
        myIt = myList.getIteratorAt( 3 );
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );    
        myIt.next();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );    
        myIt.next();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );    
        myIt.next();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );    
        myIt.next();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );    
        myIt.next();
        System.out.println( "Current Node is: " + myIt.getCurrentInt() );    



    }
}





