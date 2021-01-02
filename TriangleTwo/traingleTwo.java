public static void triangleTwo(int n){
        for(int i = 0; i < n; i++){
            for(int k = n; k > i; k--){
                System.out.print(' ');
            }
            for(int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            for(int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
}