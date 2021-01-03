 static long repeatedString(String s, long n) {
        long count = 0;
        
        if(n <= s.length()){
            long size = Math.min(s.length(), n);
            for(int i = 0; i < size; i++){
                if(s.charAt(i) == 'a'){
                    count++;
                }
            }
            return count;
        }else{
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < s.length(); i++){
                if(s.charAt(i) == 'a'){
                    list.add(i);
                }
            }
            count = (list.size()*(n/s.length()));
            long rem = n%s.length();
            if(rem != 0){
                for(int i: list){
                    if(i < rem)
                        count++;
                }
            }
            
            return count;
        }
 }
