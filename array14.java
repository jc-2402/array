
import java.util.Scanner;

// Question 1:Given an integer array nums, return true if any value appears at least twice in 
// the array, and return false if every element is distinct.
// Example 1:Input:nums = [1, 2, 3, 1]Output:   true 
// Example 2:Input:nums = [1, 2, 3, 4]Output:   false 
// Example 3:Input:nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]Output:   true
public class array14{
    public static boolean checkduplicate(int nums[]){
        //to check twice
        //brute force - ek ek karke check
        // for(int i=0; i<nums.length -1; i++){
        //     for(int j= i+1; j<nums.length; j++){
        //       if(nums[i] == nums[j]){
        //         return true;
        //        }
        //     }
        // }
        // return false;
        for(int i=0; i<nums.length-1 ; i++)
         { for(int j=i+1; j<nums.length ; j++ ) 
         { if( nums[i] == nums[j] ) {
             return true ; 
             }
              }
         } 
        return false;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int nums[] = new int[10];
        System.out.println("enter array elements");
        //input array elements
        for(int i=0; i<5; i++){
            nums[i] = s.nextInt();
        }
        System.out.println(checkduplicate(nums));
    }
}
