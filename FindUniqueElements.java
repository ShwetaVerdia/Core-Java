
public class FindUniqueElements {
 
    public static void findUnique(int[] arr){
         
        for(int i=0;i<arr.length;i++){
            boolean isUnique = false;
            for(int j=0;j<i;j++){
                if(arr[i] == arr[j]){
                    isUnique = true;
                    break;
                }
            }
            if(!isUnique){
                System.out.print(arr[i]+" ");
            }
        }
    }
     
    public static void main(String a[]){
         
        int[] nums = {1,2,2,3,1};
        findUnique(nums);
    }
}