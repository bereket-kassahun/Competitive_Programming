static int twoStacks(int x, int[] a, int[] b) {
        /*
         * Write your code here.
         */
         int sum = 0;
         int count = 0;
         int pointerA  = 0;
         int pointerB = 0;
         while(sum < x){
             if(a[pointerA] < b[pointerB]){
                 if(pointerA < a.length){
                     sum += a[pointerA];
                     pointerA++;
                 }
             }else{
                 if(pointerB < b.length){
                    sum += b[pointerB];
                    pointerB++;
                 }
             }
             count++;
         }
         return count-1;

}