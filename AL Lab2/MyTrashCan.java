package hw1;
import java.util.*;
import loader.TrashCanAb;



public class MyTrashCan extends TrashCanAb {
	
	public  ArrayList<Integer> objal=new ArrayList<Integer>(); //°ÊºA°}¦C	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	}
	public void Insert(int garbage) {
		objal.add(garbage);
	}
	public void Empty() {
		   objal.clear();	   
	}
	public String ToString(){
	    int[] arr=new int[objal.size()];
		for(int i=0 ;i<objal.size();i++){
			arr[i]=objal.get(i);
		}
		 return Arrays.toString(arr).replaceAll(", ",",");//Arrays.toString(°}¦C);
		 
	}


}
