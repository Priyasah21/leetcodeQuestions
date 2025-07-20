class Solution {  
    public boolean check(int[] nums) {  
        int count = 0;  
        int n = nums.length;  

        // Count how many times the order breaks (nums[i] > nums[i+1])  
       for(int i =1;i<n;i++){
        if(nums[i-1]>nums[i]){
            count++;
            }
        }
       if(nums[n-1]>nums[0])
       count++;

       return count<=1;
    }  
}  
