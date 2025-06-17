class Solution {
    public boolean isPerfectSquare(int num) {

        int start = 1;
        int end = num;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid * mid == num) {
                return true;
            } else if ((long) mid * mid < num) { //1 <= num <= 231 - 1 --> After multiplication of mid by itself 
                                                //it Can be large value so for handling that large num value 
                                                //i have to write (long) mid * mid
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;

    }
}