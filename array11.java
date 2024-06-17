//kadane's algo.
//find max subarray sum
public class array11{
    public static void kadane(int arr[]){
        int cs=0;
        int ms = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            cs = cs + arr[i];
            if( cs < 0){ //kadanes algo .. ki negative cs ko 0 le lena
                cs = 0;
            }
            ms = Math.max(ms,cs);

        }
        System.out.println("max sum is : "+ms);
    }
    public static void main(String[] args) {
        int nums[] = {-2,-3,4,-1,-2,1,5,-3};
        kadane(nums);
    }
}