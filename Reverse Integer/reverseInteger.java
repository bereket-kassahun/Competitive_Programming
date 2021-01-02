public int reverse(int x) {
        int rev = 0;
        int sign = x > 0? 1 : -1;
        x = x < 0? x*-1: x;
        int digit = 0;
        while(x != 0){
            digit++;
            if(digit >= 9 && rev > 214748364){
                return 0;
            }
            rev = (rev*10)  + (x%10);
            x /= 10;
            if(rev < 0){
                return 0;
            }
        }
        return rev*sign;
}