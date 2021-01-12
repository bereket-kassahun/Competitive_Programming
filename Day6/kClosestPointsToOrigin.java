class Solution {
    public int[][] kClosest(int[][] points, int K) {
        double[] distance = new double[points.length];
        int[][] ret = new int[K][2];
        double min = Double.MAX_VALUE;
        int minInd = 0;
        for(int i = 0; i < points.length; i++){
            distance[i] = Math.sqrt(points[i][0]*points[i][0] + points[i][1]*points[i][1]);
            if(distance[i] < min){
                min = distance[i];
                minInd = i;
            }       
        }
        
        for(int i = 0; i < K; i++){
            
            distance[minInd] = Double.MAX_VALUE;
            ret[i][0] = points[minInd][0];
            ret[i][1] = points[minInd][1];
            min = Double.MAX_VALUE;
            minInd = 0;
            for(int j = 0; j < distance.length;j++){
                if(distance[j] < min){
                min = distance[j];
                minInd = j;
            }
            }
        }
        
        return ret;
    }
}