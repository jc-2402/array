//binary search
public class array5{
    public static int binarysearch(int arr[], int key){
        int start =0 ;
        int end = arr.length -1;
        while(start<=end){
            int mid = (start + end )/2;
            //compare
            if(arr[mid] == key){
                return mid; 
            }
            if(arr[mid] < key){//right
                start = mid+1;
            }
            else{//left
                end = mid-1;
            }
        }
        return -1;// not found
    }
    public static void main(String[] args) {
        int arr[]= {2,4,6,8,10,12,14};
        int key = 100;
        System.err.println("key is at "+binarysearch(arr, key));
    }
}