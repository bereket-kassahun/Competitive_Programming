class Solution {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[][] ret = new int[R*C][2];
        PriorityQueue<Integer[]> pq= 
            new PriorityQueue<Integer[]>(26,(a, b) -> (b[0]+b[1]) - (a[0]+a[1]));
        for(int i = 0; i < R; i++){
            for(int j = 0; j < C; j++){
                pq.add(new Integer[]{i,j});
            }
        }
        Iterator<Integer[]> i = pq.iterator();
        Integer[] temp = null;
        int index = 0;
        while(i.hasNext()){
            temp = i.next();
            ret[index][0] = temp[0];
            ret[index][1] = temp[1];
            index++;
        }
        
        return ret;
        
    }
}
