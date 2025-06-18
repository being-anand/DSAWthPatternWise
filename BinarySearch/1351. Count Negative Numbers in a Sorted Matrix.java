class Solution {
    public int countNegatives(int[][] grid) {

        int count = 0;

        for(int[] n: grid){
            for(int num: n){
                if(num<0){
                    count++;
                }
            }
        }
        return count;
        
    }
}