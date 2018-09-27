/*

Name: Tapiwa Karen Tafa
Project Name: IntQueue
Date: 09/27/18

*/



public class IntQueue {

      IntLinkedList myQueue;

      IntQueue() {
         myQueue = new IntLinkedList();         // constructor
      }

      public void enQueue( int itemToPush ) {
         myQueue.prepend( itemToPush );
      }

      public int peek() {
         return myQueue.getIteratorAt( myQueue.getSize()-1).getCurrentInt();     // we use the iterator
      }

      public int deQueue() {
         return myQueue.removeAt(myQueue.getSize()-1);
      }

      public int getSize() {
          return myQueue.getSize();
      }



      public static void main( String[] args ) {



         IntQueue testQueue = new IntQueue();
         testQueue.enQueue( 19 );
         testQueue.enQueue( 23 );
         testQueue.enQueue( 29 );
         testQueue.enQueue( 31 );
         testQueue.enQueue( 37 );
         testQueue.enQueue( 41 );
         testQueue.enQueue( 43 );
         testQueue.enQueue( 47 );
         testQueue.enQueue( 51 );
         testQueue.enQueue( 57 );
         testQueue.getSize();

         System.out.println("Lets test this queue out! ");

         System.out.println( "The end of the queue: " + testQueue.peek() );      
         System.out.println( "Removing end thing: " + testQueue.deQueue() );         
         System.out.println( "The end of the queue: " + testQueue.peek() );      
         System.out.println( "Removing end thing: " + testQueue.deQueue() );        
         System.out.println( "The end of the queue: " + testQueue.peek() );      
         System.out.println( "Removing end thing: " + testQueue.deQueue() );         
         System.out.println( "The end of the queue: " + testQueue.peek() );      
      System.out.println( "Removing end thing: " + testQueue.deQueue() );
         System.out.println( "The end of the queue: " + testQueue.peek() );      
      }

   }
