class Solution {
    public int missingNumber(int[] nums) {
    //     int i = 0 ;
    //     while(i < nums.length){
    //         int correct = nums[i];
    //         if(nums[i] < nums.length && nums[i] != nums[correct]){
    //             swap(nums,i,correct);
    //         }else{
    //             i++;
    //         }
    //     }

    //     for(int j=0 ; j < nums.length ; j++){
    //         if(nums[j] != j){
    //             return j;
    //         }
    //     }

    //     return nums.length;
    int sum = (nums.length*(nums.length+1))/2;
    int add = 0;
    for(int i : nums){
        add += i;
    }
    return sum-add;
     }

    // public void swap(int[] arr , int first , int second){
    //     arr[first] = arr[first] + arr[second];
    //     arr[second] = arr[first] - arr[second];
    //     arr[first] = arr[first] - arr[second];
    // }
}