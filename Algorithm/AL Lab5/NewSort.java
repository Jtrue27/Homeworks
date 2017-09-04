package hw5;
import loader.SortAbstract;
public class NewSort extends SortAbstract {

	public static void main(String[] args) {
		/*NewSort S=new NewSort();
		int a[]={21,21,46,57,62,45};
		S.MySort(a);
		for(int e:a){
			System.out.print(e);
			System.out.print(" ");
		}
        */
	}



	private static int Partition(int inputarry[],int low,int hight)//分部
	{
	      int i=low;
	      int j=hight;
	      int temp;
	      int pivot=inputarry[(low+hight)/2];//pivot直接取中間

	      while (i<=j){
	            while (inputarry[i]<pivot)
	                  i++;
	            while (inputarry[j]>pivot)
	                  j--;
	            if (i<=j){
	                  temp=inputarry[i];
	                  inputarry[i]=inputarry[j];
	                  inputarry[j]=temp;
	                  i++;
	                  j--;
	            }
	      }
	      return i;
	}
	private static void quickSort(int arr[],int low,int hight) {//遞迴呼叫quicksort
	      int position=Partition(arr,low,hight);
	      if (low<position-1)//左半部排序
	            quickSort(arr,low,k-1);
	      if (position<hight)//右半部排序
	            quickSort(arr,k,hight);
	}
	public  int[] MySort(int[] array){//實作abstract method
	    quickSort(array,0,array.length-1);
		return array;
	}
}
