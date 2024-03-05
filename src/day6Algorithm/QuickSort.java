package day6Algorithm;

public class QuickSort {
	static void printArray(int a[]) {
		for(int i=0;i<a.length; i++) {
			 System.out.print(a[i]+",");
		}
	}
	
	static void QuickSort(int a[],int start,int end)
	{
	   int i=start;
	   int j=end;
	   int pivot=start;
	while(i<j)
	 {
	    while(a[i]<a[pivot])
		i++;
	    while(a[j]>a[pivot])
		j--;
	 if(i<j)
	   {
	     int t=a[i];
		 a[i]=a[j];
		 a[j]=t;
	   }
	}
	 if(i<end)
	     QuickSort(a,i+1,end);
	 if(j>start)
		QuickSort(a,start,j-1);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={55,11,77,33,22,99,88,44,66};
	     System.out.println("Befor Sort:");
	     QuickSort.printArray(a);
	     QuickSort.QuickSort(a, 0, a.length-1);
	     System.out.println("\nAfter Sort:");
	     QuickSort.printArray(a);

	}

}
