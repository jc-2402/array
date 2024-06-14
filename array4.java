//find largest n smallest from a given array by linear search
public class array4{
    public static int larsmall(int arr[]){
            int largest = Integer.MIN_VALUE;//-INFINITY
            int smallest = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++ ){
            if(largest < arr[i]){
                largest = arr[i];
            }
            if(smallest > arr[i]){
                smallest = arr[i];
            }
        }
        System.out.println("smallest value is :"+ smallest);
        return largest;
    }
    public static void main(String[] args) {
        int num[] = {1,2,6,3,5};
        System.out.println("largest value is : "+larsmall(num));
    }
}