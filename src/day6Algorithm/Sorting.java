package day6Algorithm;

public class Sorting {
    static void printArray(int a[])
    {
        for(int i=0;i<a.length;i++)
          System.out.print(a[i]+",");
    }
    
static void BubbleSort(int a[ ])
{
  int i, j,t;
  for(i=0;i<a.length-1;i++)//paases
   {System.out.println("pass:"+(i+1));
      for(j=0;j<a.length-1;j++)
	//j stops at second last
	{
		if(a[j]>a[j+1])
              {
			t=a[j];
			a[j]=a[j+1];
			a[j+1]=t;
		 }
       }
   }
}
//Improved Version of Bubbled Sort:If not found its break the loop and came out
static void BubbleSort_V2(int a[ ])
{
  int i, j,t;
  for(i=0;i<a.length-1;i++)//paases
   {
      System.out.println("\npass:"+(i+1));
      boolean done=true;
      for(j=0;j<a.length-i-1;j++);
	{
		if(a[j]>a[j+1])
              {
			t=a[j];
			a[j]=a[j+1];
			a[j+1]=t;
                        done=false;
		 }
      }
      if(done==true)//sorted so stop
          break;
   }
}
public static void main(String args[])
 {
     int a[]={11,22,33,44,55};
     System.out.println("Befor Sort:");
     Sorting.printArray(a);
     Sorting.BubbleSort(a);
     Sorting.BubbleSort_V2(a);
     System.out.println("\nAfter Sort:");
     Sorting.printArray(a);

 }


}
