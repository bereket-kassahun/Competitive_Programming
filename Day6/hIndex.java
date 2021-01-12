class Solution {
    public int hIndex(int[] citations) {
        if(citations.length == 1 && citations[0] != 0)
            return 1;
        Arrays.sort(citations);
        int length = citations.length;
        int max = 0;
        for(int i = 0; i < length; i++){
            if(length-i > max && length-i <= citations[i]){
                max = length-i;
            }
        }
        return max;
    }
}