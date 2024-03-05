package day6Algorithm;

public class InsertionSort {
	static void printArray(int a[])
    {
        for(int i=0;i<a.length;i++)
          System.out.print(a[i]+",");
    }
    static void InsertionExample(int a[]) {
    	 int i , j , new_element;
    	 for(i=0;i<a.length-1; i++) {
    		 new_element=a[i+1];
    		 j=i+1;
    		 while(j>0 && a[j-1]>new_element){
    			 a[j]=a[j-1];
    			 j--;	 
    		 }
    		 a[j]= new_element;
    	 }
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a[] = {10,2,5,1};
      System.out.println("Before Sort:");
      InsertionSort.printArray(a);
      InsertionSort.InsertionExample(a);
      System.out.println("\nAfter Sort:");
      InsertionSort.printArray(a);
	}

}
