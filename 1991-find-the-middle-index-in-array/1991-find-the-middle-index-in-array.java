class Solution {
    public int findMiddleIndex(int[] nums) {
        int len = nums.length;
        int leftSum[] = new int[len];
        int rightSum[] = new int[len];

        for(int i = 0 ; i < len ; i++){
            int ans = 0;
            for(int j = i-1 ; j >=0 ; j--){
                ans = ans + nums[j];
            }
            leftSum[i] = ans;

            ans = 0 ;
            for(int k = i+1; k < len ; k++){
                ans = ans + nums[k];
            }
            rightSum[i] = ans;
            if(leftSum[i] == rightSum[i]){
                return i;
            }
        }
        return -1;
    }
}