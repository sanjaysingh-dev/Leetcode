class Solution {
    public int candy(int[] ratings) {

        int N = ratings.length;

        int cL[] = new int[N];
        int cR[] = new int[N];

        cL[0] =1;

        for(int i=1;i<N;i++){
            if(ratings[i]>ratings[i-1])
            cL[i] = cL[i-1]+1;

            else 
             cL[i] = 1;
        }

        cR[N-1] = 1;

        for(int i=N-2;i>=0;i--){
            if(ratings[i]>ratings[i+1])
             cR[i] = cR[i+1]+1;

             else 
              cR[i] = 1;
        }

        int sum = 0;

        for(int i=0;i<N;i++)
         sum+=Math.max(cL[i],cR[i]);

         return sum;
        
    }
}