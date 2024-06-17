//print max subarray ka sum
//prefix sum
public class array10{
    public static void maxsubarraysum(int arr[]){
        int currsum =0;
        int maxsum= Integer.MIN_VALUE;
        int prefixarr[] = new int[arr.length];

        prefixarr[0] = arr[0];//1st
        //calcutate rest prefix array 
        for(int i=1; i<prefixarr.length; i++){
            prefixarr[i] = prefixarr[i-1] + arr[i];
        }
       // calculate subarray sum
        for(int i=0; i<arr.length; i++){
            int start =i;
            for(int j=i; j<arr.length; j++){
                int end =j;

                currsum = start == 0 ? prefixarr[end] : prefixarr[end] -prefixarr[start-1];
                System.out.println("currsum :"+currsum);
                if(maxsum < currsum){
                    maxsum = currsum;
                }
            }
        }
        System.out.println("max sum = "+maxsum);
    }
    public static void main(String[] args) {
        int arr[] ={1,-2,6,-1,3};
        maxsubarraysum(arr);
    }
}