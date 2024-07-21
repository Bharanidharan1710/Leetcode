class Solution {
    public boolean isPalindrome(int x) {
        if( x<0 || x!=0 && x%10==0 ){
            return false;
            
        }
        int num=x;
        int y=0;
        int rev; 
        while(num!=0){
            rev=num%10;
            num= num/10;
            y=y*10 + rev;
            
        }
        return y==x;
        
    }
}
