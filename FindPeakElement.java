// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
    public int findPeakElement(int[] nums) {
        int low=0;
        int high=nums.length-1;
        
        if(nums.length==0 ||nums==null)
            return -1;
        
        while(low<=high){
            int mid = low + (high-low)/2;
            if((mid==0 || nums[mid]>nums[mid-1]) && (mid==nums.length-1 || nums[mid]>nums[mid+1]) )
                return mid;
            else if(nums[mid]<nums[mid+1])
                low=mid+1;
            else 
                high=mid-1;
        }
        return -1;
    }
}