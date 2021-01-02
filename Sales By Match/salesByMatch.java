static int sockMerchant(int n, int[] ar) {
        Arrays.sort(ar);
        int left = 0;
        int right = 0;
        int pairs = 0;
        for(int i = 0; i < n; i++){
            if(i < n-1 && ar[i] == ar[i+1]){
                right++;
            }else{
                pairs += (right-left+1)/2;
                right++;
                left = right;
            }
        }
        return pairs;
}
