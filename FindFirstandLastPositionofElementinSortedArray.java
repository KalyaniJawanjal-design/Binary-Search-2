// Time Complexity :
// Space Complexity :
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        
        if(nums.length==0 || nums==null){
            return new int[]{-1,-1};
        }
        
        if(target<nums[0] || target>nums[nums.length-1]){
            return new int[]{-1,-1};
        }
        
        int first = binarySearchFirst(nums, target, low, high);
        int last = binarySearchLast(nums, target, first, high);
        int[] arr=new int[2];
        arr[0]=first;
        arr[1]=last;
        return arr;
    }
    
    public int binarySearchFirst(int[] nums, int target, int low, int high){
        while(low<=high){    
            int mid = low + (high-low)/2;
            if(nums[mid]==target){
                if(mid==0 || nums[mid]>nums[mid-1])
                    return mid;
                else
                    high=mid-1;
            } 
            else if(nums[mid]<target)
                low=mid+1;

            else //if(nums[mid]>target)
                high=mid-1;
        }
        return -1;
    }
    
    public int binarySearchLast(int[] nums, int target, int low, int high){
        while(low<=high){
            int mid = low + (high-low)/2;
            if(nums[mid]==target){
                if(mid==nums.length-1 || nums[mid]<nums[mid+1])
                    return mid;
                else
                    low=mid+1;
            }
            else if(nums[mid]>target)
                high=mid-1;
            else
                low=mid+1;
        }   
        return -1;
    }
}