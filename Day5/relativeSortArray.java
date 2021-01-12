class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int[] count = new int[1001];
        for(int i = 0; i < arr1.length; i++){
            count[arr1[i]] += 1;
        }
        int pointer = 0;
        int temp = 0;
        for(int i = 0; i < arr2.length; i++){
            temp = count[arr2[i]];
            while(temp != 0){
                arr1[pointer] = arr2[i];
                temp--;
                pointer++;
            }
            count[arr2[i]] = 0;
        }
        
        for(int i =0; i < count.length; i++){
            if(count[i] != 0){
                temp = count[i];
                while(temp != 0){
                    arr1[pointer] = i;
                    temp--;
                    pointer++;
                }
            }
        }
        
        return arr1;
    }
}