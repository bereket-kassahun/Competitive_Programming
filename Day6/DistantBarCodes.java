class Solution {
    public int[] rearrangeBarcodes(int[] barcodes) {
        if(barcodes.length < 3)
            return barcodes;
        int maxVal = 0;
        for(int i = 0; i < barcodes.length; i++){
            if(barcodes[i] > maxVal)
                maxVal = barcodes[i];
        }
        int[] count = new int[maxVal];
        for(int i = 0; i < barcodes.length; i++){
            count[barcodes[i]-1] += 1;
        }
        PriorityQueue<Pair<Integer,Integer>> pq = 
        new PriorityQueue<Pair<Integer,Integer>>(26,(a, b) -> b.getValue() - a.getValue());
        for(int i = 0; i < maxVal;i++){
            pq.add(new Pair<Integer, Integer>(i,count[i]));
        }
        int t = 0;
        int  temp = 0;
        int key = 0;
        while(!pq.isEmpty()){
            Pair<Integer, Integer> pair = pq.remove();
            temp = pair.getValue();
            key = pair.getKey();
            while(temp > 0){
                if(t > (barcodes.length-1))
                    t = 1;
                barcodes[t] = key+1;
                t += 2;
                temp--;
            }
        }
        
        return barcodes;
    }
    

}