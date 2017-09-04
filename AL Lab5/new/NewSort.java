package hw5;
import loader.SortAbstract;
public class NewSort extends SortAbstract {

	public static void main(String[] args) {
		NewSort S=new NewSort();
		int a[]={21,21,46,57,62,45};
		S.MySort(a);
		for(int e:a){
			System.out.print(e);
			System.out.print(" ");
		}
        
	}
	private static int Divide2Part(int mostle,int mostri,int inarr[]){
	      int i=mostle, j=mostri,  temp;
	      int medain=inarr[(mostle+mostri)/2];//pivot select middle
	      while (i<=j){
	            while (inarr[i]<medain)
	                  i++;
	            while (inarr[j]>medain)
	                  j--;
	            if (i<=j){
	                  temp=inarr[i];
	                  inarr[i]=inarr[j];
	                  inarr[j]=temp;
	                  i++;
	                  j--;
	            }
	      }
	      return i;
	}
	private static void Sort(int low,int high,int arr[]) {//call sort recursively
	      int position=Divide2Part(low,high,arr);
	      if (low<position-1)//left part sort
	            Sort(low,position-1,arr);
	      if (position<high)//right part sort
	            Sort(position,high,arr);
	}
	public  int[] MySort(int[] array){// implement abstract method
	    Sort(0,array.length-1,array);
		return array;
	}
}
