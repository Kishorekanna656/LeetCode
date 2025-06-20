class Solution {
    public boolean isHappy(int n) {
        int ans = 0;
        int temp = 0;
        int copy = n;
        while(n>0){
            while(n > 0){
                ans = ans + ((n%10)*(n%10));
                n /= 10;
            }
            if(ans == 145){
              return false;
            }
            if(ans == 1){
                return true;
            }
            n = ans;
            ans = 0; 
        }
        return false;
    }
}