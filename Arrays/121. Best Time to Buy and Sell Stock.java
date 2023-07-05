class Solution {
    public int maxProfit(int[] price) {

        int min=Integer.MAX_VALUE;
        int maxp=0,tp=0;
        for(int i=0;i<price.length;i++){
            if(price[i]<min){
            min=price[i];
        }
        tp=price[i]-min;
        if(tp>maxp){
            maxp=tp;
        }
        }
    return maxp;
    }
}