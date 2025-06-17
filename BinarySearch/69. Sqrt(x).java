class Solution {
    public int mySqrt(int x) {
        int start = 1;
        int end = x;
        int ans = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid * mid == x) {
                return mid;
            } else if ((long) mid * mid < x) { //after start * start it can be large
                ans = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return ans;

    }
}