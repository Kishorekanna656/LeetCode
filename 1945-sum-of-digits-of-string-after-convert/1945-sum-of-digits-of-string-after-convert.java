class Solution {
    public int getLucky(String s, int k) {
        String ans = "";
        for(int i = 0 ; i < s.length() ; i++){
            ans = ans + ((int)(s.charAt(i)-'a')+1);
        }
        int temp = 0;
       
        int a = 0;
        
        for(int i = k ; i > 0 ; i--){
            a=0;
            for(int j = 0 ; j < ans.length() ; j++ ){
            
                 a = a + (int)(ans.charAt(j)-'0');
            }
            ans = "" + a;
            
        }

        return Integer.parseInt(ans);
         




          
    }
}