package day1;

import java.util.Scanner;

public class Palindrome {
	
	int MaxSize,tos;
	char stack[];
    void createStack(int size)
   {
      MaxSize=size;
      tos=-1;
      stack=new char[MaxSize];
   }
  void push(char e)
  {
      tos++;
      stack[tos]=e;
    
  }
 
  char pop()
  {
      char temp=stack[tos];
      tos--;
      return temp;
  }

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter Data:  ");
		
		String data = in.nextLine();
		
		Palindrome obj1 = new Palindrome();
		Palindrome obj2 = new Palindrome();
		Palindrome obj3 = new Palindrome();
		
		obj1.createStack(data.length());
		obj2.createStack(data.length());
		obj3.createStack(data.length());
		boolean flag= true;
		
		for(int i=0;i<data.length();i++) {
			char ch = data.charAt(i);
			obj1.push(ch);
		}
		
		for(int i=data.length()-1;i>=0;i--)
		{
			char ch = data.charAt(i);
			obj2.push(ch);
		}
		
		for(int i=0;i<data.length();i++)
		{
			char ch = data.charAt(i);
			obj3.push(ch);
		}
		char ch;
		System.out.println("Reversed String is: ");
		for(int i=0;i<data.length();i++) {
			System.out.print(obj3.pop());
		}
		for(int i=0;i<data.length();i++) {
			
			
			if(obj1.pop()!=obj2.pop()) {
				flag= false;
				break;
		}
	
	
				
			
		}
		if(flag == false) {
			System.out.println("\nNot a Palindrome");
		}
		else
			System.out.println("\nPalindrome");
	}

}
