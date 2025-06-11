class Solution {
    public int reverse(int x) {
        int num= Math.abs(x);
        int rev = 0;
        while(num!=0){
            int lastdigit= num%10;
            if (rev > (Integer.MAX_VALUE - lastdigit) / 10) {
                return 0;  // Agar overflow hua, toh 0 return kardo
            }
            rev= rev*10+lastdigit;
            num= num/10;
        }
        return (x < 0) ? (-rev) : rev;





    }
}
