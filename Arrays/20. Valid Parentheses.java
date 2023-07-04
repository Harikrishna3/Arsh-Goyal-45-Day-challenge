class Solution {
    public boolean isValid(String s) {
     Stack<Character> paranthesis = new Stack<>();
        HashMap<Character,Character> match = new HashMap<>();
        match.put(')','(');
        match.put(']','[');
        match.put('}','{');
        
        for(int i=0; i<s.length(); i++){
            char current= s.charAt(i);
            if(paranthesis.empty() || !(match.containsKey(current))){
                paranthesis.push(s.charAt(i));
            }else{
                char peeked= paranthesis.peek();
                if(match.get(current)==peeked){
                    paranthesis.pop();
                }else{
                    paranthesis.push(current);
                }
            }
        }
        if(paranthesis.empty()){
            return true;
        }else{
            return false;
        }

    }
}
