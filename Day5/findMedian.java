 static int findMedian(int[] arr) {
        int[] count = new int[20001];
        for(int i =0; i < arr.length; i++){
            count[arr[i]+10000] += 1;
        }
        int half = arr.length/2 +1;
        for(int i = 0; i < count.length; i++){
            half -= count[i];
            if(half <= 0)
                return i-10000;
        }
        return 0;
    }