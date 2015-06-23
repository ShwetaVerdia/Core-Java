import java.util.Arrays;


public class Array_DuplicateRemove {
	
	public static void main (String [] args){
		int [] arr ={1, 3, 2, 4, 3, 2 ,1, 6 ,7 ,7,5};
		int [] newarr= removeDuplicates(arr);
		for(int newarray : newarr){
			System.out.println(newarray);
			
		}
		
	}
	
	
	public static int[] removeDuplicates(int[] input){
		if(input.length<2)
			return input;
		int j=0;
		int i=1;
		while (i<input.length){
			if(input[i]==input[j]){
				i++;
			}
			else{
				j++;
				input[j]=input[i];
				i++;
			}
		}
		
		
		int[] newarr = Arrays.copyOf(input,j+1);
		
	return newarr;
	}
	
}
