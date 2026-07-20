class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int N = flowerbed.length;
        int count = 0;

        for(int i=0;i<N;i++){

            if(flowerbed[i]==1)
             continue;

            boolean l = (i==0 || flowerbed[i-1]==0);
            boolean r = (i==N-1 || flowerbed[i+1]==0);

            if(l==true && r==true){
                flowerbed[i] = 1;
                count++;
            }  
        }

        return count>=n;
        
    }
}