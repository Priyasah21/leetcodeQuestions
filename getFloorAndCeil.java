class Solution {
    public int[] getFloorAndCeil(int[] nums, int x) {
        int floor = Integer.MIN_VALUE;
        int ceil = Integer.MAX_VALUE;
        
        // Binary search for floor
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] <= x) {
                floor = nums[mid];
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        // Binary search for ceil
        low = 0;
        high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] >= x) {
                ceil = nums[mid];
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        
        return new int[]{floor, ceil};
    }
}
