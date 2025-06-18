class Solution {
    public int maximumCount(int[] nums) {

        int lastZeroIndex = sol(nums, true);
        int firstZeroIndex = sol(nums, false);
        int pos = nums.length - lastZeroIndex;

        if (firstZeroIndex <= pos)
            return pos;
        return firstZeroIndex;
    }

    public int sol(int[] nums, boolean isLastIndex) {
        int low = 0;
        int high = nums.length - 1;

        if (isLastIndex) {
            while (low <= high) {
                int mid = (low + high) / 2;

                if (nums[mid] == 0) {
                    if (mid+1!=nums.length && nums[mid + 1] != 0 ) {
                        return mid + 1;
                    } else {
                        low = mid + 1;
                    }

                } else if (nums[mid] < 0) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            return low;
        } else {

            while (low <= high) {
                int mid = (low + high) / 2;

                if (nums[mid] == 0) {
                    if (mid!=0 && nums[mid - 1] != 0 ) {
                        return mid;
                    } else {
                        high = mid - 1;
                    }

                } else if (nums[mid] < 0) {
                    low = mid + 1;
                } else {
                    high = mid - 1;
                }
            }
            return low;

        }
    }
}