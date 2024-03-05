package day1;

import java.util.Scanner;


public class DecToBinary{

	 int MaxSize,tos,stack[];
     void createStack(int size)
    {
       MaxSize=size;
       tos=-1;
       stack=new int[MaxSize];
    }
   void push(int e)
   {
       tos++;
       stack[tos]=e;
       System.out.println("Pushed "+e);
   }
  
   int pop()
   {
       int temp=stack[tos];
       tos--;
       return temp;
   }
	public static void main(String[] args) {
	
		
		Scanner in = new Scanner(System.in);
		DecToBinary stc = new DecToBinary();
		System.out.println("Enter number:  ");
		
		int  num= in.nextInt();
		stc.createStack(64);
		int temp =num;
		
		while(num>0) {
			stc.push(num%2);
			num= num/2;
		}
		
		while(temp>0) {
			System.out.print(stc.pop());
			temp= temp/2;
		}

	}

}