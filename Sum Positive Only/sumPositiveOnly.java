public static String sum(String num1, String num2){
        num1 = new StringBuilder(num1).reverse().toString();
        num2 = new StringBuilder(num2).reverse().toString();
        StringBuilder ret = new StringBuilder();
        int maxSize = Math.max(num1.length(), num2.length());
        int carry  = 0;
        int sum = 0;
        for(int i = 0; i < maxSize; i++){
            sum = (i < num1.length() ? num1.charAt(i) - '0' : 0)+ (i < num2.length() ? num2.charAt(i) - '0' : 0)+carry;
            ret.append(sum%10);
            carry = sum / 10;
        }

        if(carry != 0){
            ret.append(carry);
        }
        return ret.reverse().toString();
}