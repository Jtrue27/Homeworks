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



	private static int Partition(int inputarry[],int low,int hight)//����
	{
	      int i=low;
	      int j=hight;
	      int temp;
	      int pivot=inputarry[(low+hight)/2];//pivot����������

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
	private static void quickSort(int arr[],int low,int hight) {//���j�I�squicksort
	      int position=Partition(arr,low,hight);
	      if (low<position-1)//���b���Ƨ�
	            quickSort(arr,low,k-1);
	      if (position<hight)//�k�b���Ƨ�
	            quickSort(arr,k,hight);
	}
	public  int[] MySort(int[] array){//��@abstract method
	    quickSort(array,0,array.length-1);
		return array;
	}
}
