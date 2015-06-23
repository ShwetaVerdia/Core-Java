import java.util.Arrays;


public class BubbleSort1 {
	
	public static void main(String[] args) {
		int [] arr = {2,4,1,7,3,5};
		BubbleSort1.BubbleSort(arr);
		for(int newarr: arr){
			System.out.printf("%2s",newarr);
		}
		
	}
	public static int[] BubbleSort(int[]arr1){
		int swap=0;
		for(int i=0; i<arr1.length-1; i++){
			int flag =0;
			for(int j=1;j<=arr1.length-1;j++){
				if(arr1[j-1]>arr1[j]){
					swap=arr1[j];
					arr1[j]=arr1[j-1];
					arr1[j-1]=swap;
				 flag=1;
				}
				
			}
			if(flag==0){
				break;
			}
		
		}
		
		return(arr1);
	}
}
