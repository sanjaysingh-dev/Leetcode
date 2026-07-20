class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {

        int N = flowerbed.length;
        int count =0;

       for(int i=0;i<N;i++){ 

        if(flowerbed[i]==1)
         continue;

        boolean check = true;

        for(int j=Math.max(0,i-1);j<=Math.min(N-1,i+1);j++){    
            if(j!=i && flowerbed[j]==1){
                check = false;
                break;
            }
        }

        if(check==true){
            flowerbed[i] = 1;
            count++;
        }
       }

       return count>=n;  
    }
}