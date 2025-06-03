class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        // Find a candidate
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        // Optional: Verify candidate really is majority
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > nums.length / 2) {
            return candidate;
        }

        // No majority element (if this is possible in your context)
        return -1;
    }
}
