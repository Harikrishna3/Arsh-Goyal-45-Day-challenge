class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        List<Integer> ls = new ArrayList<>();
        
        for(int i=0;i<arr.length;i++){

            int idx = Math.abs(arr[i])-1;

            if(arr[idx]<0) ls.add(Math.abs(arr[i]));
            
            arr[idx]=-arr[idx];
            
        }
    return ls;
    }
}