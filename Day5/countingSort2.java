 static int[] countingSort(int[] arr) {
           int[] count = new int[101];
           int length = arr.length;
           for(int i = 0; i < length; i++){
               count[arr[i]] += 1;
           }
           int index = 0;
           for(int i = 0; i < 101; i++){
               while(count[i] > 0){
                   arr[index] = i;
                   index++;
                   count[i] -= 1;
               }
           }
           return arr;
    }
