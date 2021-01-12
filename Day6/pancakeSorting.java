class Solution {
    public List<Integer> pancakeSort(int[] arr) {
        int[] copy  = arr.clone();
        Arrays.sort(copy);
        List<Integer> ret = new ArrayList();
        int curr = copy[arr.length-1];
        int currInd = arr.length-1;
        for(int i = arr.length-1; i >= 0; i--){
            if(arr[i] != copy[currInd]){
               for(int j = 0; j < arr.length; j++){
                   if(arr[j] == copy[currInd]){
                       swap(arr,0,j);
                       ret.add(j+1);
                       swap(arr, 0,currInd);
                       ret.add(currInd+1);
                       break;
                   }
               }
                
            }      
            currInd--;
        }
        // System.out.println(Arrays.toString(arr));
        return ret;
    }
    
    public void swap(int[] arr, int i, int j){
        int temp = 0;
        while(i < j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            j--;
            i++;
        }
    }
}