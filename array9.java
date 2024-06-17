//brute force
//print max subarray sum
public class array9{
    public static void maxsubarray(int arr[]){
        int currsum=0;
        int maxsum= Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            int start = i;
            for(int j=i; j<arr.length; j++){
                int end = j;
                currsum =0;
                for(int k = start; k<=end; k++){
                    currsum += arr[k];
                }
                System.out.println("current sum is "+currsum);
                if(maxsum < currsum){
                    maxsum = currsum;
                }
            }
        }
        System.out.println("max sum = "+maxsum);
    }
    public static void main(String[] args) {
        int arr[] ={1,-2,6,-1,3};
        maxsubarray(arr);
    }
}