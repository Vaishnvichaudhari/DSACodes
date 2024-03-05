package day6Algorithm;

public class SelectionSort {
	static void printArray(int a[])
    {
        for(int i=0;i<a.length;i++)
          System.out.print(a[i]+",");
    }
  static void SelectionSort(int a[]) {
	  int i,j,min,pos;
	  for(i=0;i<a.length-1;i++) {
		  min=a[i];
		  pos=i;
		  for(j=i+1; j<a.length;j++) {
			  if (a[j]<min) {
				  min=a[j];  // only updates the value
				  pos=j;
				  
			  }
		  }
		  a[pos]=a[i];
		  a[i]=min;
	  }
	  
  }
  public static void main(String args[]) {
	  int a[]= {99,22,44,55,66,11};
	  System.out.println("Before Sort");
	  SelectionSort.printArray(a);
	  SelectionSort.SelectionSort(a);
	  System.out.println("\nAfter Sort");
	  SelectionSort.printArray(a);
	
	  
	  
  }
}
