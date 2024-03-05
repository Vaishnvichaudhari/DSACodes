package day2Queue;

import java.util.Scanner;

public class Queue_Example {
	 int front,MaxSize,rear,queue[];
	 void createQueue(int size) {
		 MaxSize = size;
		 front=0;
		 rear=-1;
		 queue= new int[MaxSize];
		 
	 }
	 void enqueue(int e) //Entry  on queue
	   {
	       rear++;
	       queue[rear]=e;
	       System.out.println("Enqueued "+e);
	   }
	  int dequeue()
	   {
	       int temp=queue[front];
	       front++;
	       return temp;
	   }
	 boolean isFull()     //rear 
	   {
	       if(rear==MaxSize-1)
	           return true;
	       else
	           return false;
	    }
	
	    boolean isEmpty()     //front=0; rear=-1 :front>rear
	   {
	       if(front>rear)
	           return true;
	       else
	           return false;
	    }
	    void printQueue()
	    {
	        System.out.println("Queue Has:");
	        for(int i=front;i<=rear;i++)
	            System.out.println(queue[i]);
	    }
	    
	    void SlidingWindow() {
	    	
	    }
	    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int ch;
          Scanner sc = new Scanner(System.in);
          Queue_Example q= new Queue_Example();
          System.out.print("Enter size of Queue:");
          int size=sc.nextInt();
          q.createQueue(size);
          do
          {
              System.out.print("\n1.Enqueue\n2.Dequeue\n3.Print\n0.Exit\n:");
              ch=sc.nextInt();
              switch(ch)
              {
                  case 1:
                      if(q.isFull()!=true)
                      {
                          System.out.print("Enter elment:");
                          int e=sc.nextInt();
                          q.enqueue(e);
                      }
                      else
                          System.out.print("Queue Full");
                      break;
                      
                  case 2:
                	  if(q.isEmpty()!=true)
                      {
                          System.out.print("Element Deuque:"+q.dequeue());
                      }
                     else
                          System.out.print("Queue Empty");
                     break;
                     
                  case 3:
                	  if(q.isEmpty()!=true) {
                		  q.printQueue();
                	  }
                   case 0:
                      System.out.print("Exiting code");
                      break;
                      
                   default:
                      System.out.print("Wrong input");
                      break;
                   
              }  
              }while(ch!=0);
          
	}

}
