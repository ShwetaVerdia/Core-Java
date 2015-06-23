
public class InsertionSort {
	
	public static void main(String[] args) {
		int [] arr = {5,7,6,8,4,2,3,1};
	
		InsertionSort.InsertSort(arr);
		for(int newarr: arr){
			System.out.printf("%2s",newarr);
		}
		
	}
	
	public static int[] InsertSort(int[] arr1){
		
		for(int i=1;i<=arr1.length-1;i++){
			int value =arr1[i];
			int j=i-1;
			while(j>=0 && arr1[j]>value){
				arr1[j+1]=arr1[j];
				j--;
			}
			arr1[j+1]=value;
		
		}
		return(arr1);
		
	}

}
