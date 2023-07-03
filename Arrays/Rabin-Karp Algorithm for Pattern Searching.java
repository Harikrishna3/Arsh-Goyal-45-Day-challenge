class Solution
{
    
    ArrayList<Integer> search(String pat, String S)
    {
        // your code here
          ArrayList<Integer> list= new ArrayList<Integer>();
        int i=0, j=pat.length();
        while(j<=S.length()){
                String subS= S.substring(i,j);
                if(subS.equals(pat)){
                    list.add(i+1);
                }
                i++;
                j++;
        }
        if(list.isEmpty()){
            list.add(-1);
        }
        return list;
    }
}
