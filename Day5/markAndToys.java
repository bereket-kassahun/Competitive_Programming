static int maximumToys(int[] prices, int k) {
        Arrays.sort(prices);
        int count = 0;
        int sum = 0;
        for(int i = 0; i < prices.length; i++){
            sum += prices[i];
            if(sum > k)
                break;
            count++;
        }
        
        return count;
    }