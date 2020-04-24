// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode : No
// Any problem you faced while coding this : 


// Your code here along with comments explaining your approach

class Solution {
    public int findMin(int[] nums) {
        int min=Integer.MAX_VALUE;
        int low=0;
        int high=nums.length-1;
        
        while(low<=high){
            int mid = low + (high-low)/2;
            
            if(nums[mid]<min){
                min=nums[mid];
                low=mid+1;
            }
            
            else if(nums[mid] > min){
                high=mid-1;
            }
        }
        return min;
    }
}