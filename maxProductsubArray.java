class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int l = 1, r = 1;
        int ans = nums[0];

        for (int i = 0; i < n; i++) {
            l = l == 0 ? 1 : l;         // Reset l to 1 if it was 0
            r = r == 0 ? 1 : r;         // Reset r to 1 if it was 0
            l *= nums[i];               // Forward product
            r *= nums[n - 1 - i];       // Backward product
            ans = Math.max(ans, Math.max(l, r)); // Update max product
        }

        return ans;
    }
}
