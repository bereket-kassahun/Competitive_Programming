 public static int countingValleys(int steps, String path) {
        Stack<Character> s = new Stack();
        int valleys = 0;
        for(int i = 0; i < path.length(); i++){
            Character current = path.charAt(i);
            if( s.isEmpty() || s.peek() == current){
                s.push(current);
            }else{
                if(s.size() == 1 && current == 'U')
                    valleys++;
                s.pop();
            }
        }
        return valleys;
    }
