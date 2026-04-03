class Solution {
    public int firstMissingPositive(int[] nums) {

        int N = nums.length;
        int element = 0;

        for (int i = 0; i < N; i++) {
            if (nums[i] <= 0)
                nums[i] = N + 2;
        }

        for (int i = 0; i < N; i++) {
            element = Math.abs(nums[i]);

            if (element >= 1 && element <= N) {
                if (nums[element - 1] > 0)
                    nums[element - 1] *= -1;
            }
        }

        for (int i = 0; i < N; i++) {
            if (nums[i] > 0)
                return i + 1;
        }

        return N + 1;

    }
}