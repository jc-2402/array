// Question 4:Given n non-negative integers representing an elevation
// //  map where the width of each bar is 1, compute how much water it can trap after raining.
// Example 1:Input:height = [0, 1, 0,  2, 1, 0, 1, 3, 2, 1, 2, 1]Output:   6
// Explanation:The above elevation map (black section) is represented by array 
//[0,1,0,2,1,0,1,3,2,1,2,1]. 
// In this case, 6 units of rain water (blue section) are being trapped
public class array17{
    public static int trappedwater(int height[]){
        int n = height.length;
        //calculate left max array
        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for(int i=1; i<n; i++){
            leftmax[i] = Math.max(height[i], leftmax[i-1]);
        }
        //calculate right max array
        int rightmax[] = new int[n];
        rightmax[n-1] = height[n-1];
        for(int i =n-2; i>=0; i--){
            rightmax[i] = Math.max(height[i], rightmax[i+1]);
        } 
        //loop
        int trappedw =0;
        for(int i=0; i<n; i++){ 
          // wl = min(lm,rm)
          int wl = Math.min(leftmax[i],rightmax[i]);
          //trappedw = wl - height[i]
          trappedw += wl - height[i];
        }
        return trappedw;
        
        
    }
    public static void main(String[] args) {
        int height[] ={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trappedwater(height));
    }
}