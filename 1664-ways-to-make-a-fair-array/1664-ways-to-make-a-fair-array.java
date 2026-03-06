class Solution {
    public int waysToMakeFair(int[] nums) {

        int N = nums.length;
        int count = 0;

        int peven[] = new int[N];
        int podd[] = new int [N];

        peven[0] = nums[0];
        for(int i=1;i<N;i++){
            if(i%2==0)
              peven[i] = peven[i-1]+nums[i];

             else 
              peven[i] = peven[i-1];   
        }

        podd[0] = 0;
        for(int i=1;i<N;i++){
            if(i%2!=0)
             podd[i] = podd[i-1]+nums[i];

            else 
             podd[i] = podd[i-1]; 
        }

      int oddsum = peven[N-1]-peven[0];
      int evensum = podd[N-1]-podd[0];

      if(oddsum==evensum)
        count++;

        for(int i=1;i<N;i++){
            oddsum = podd[i-1]+peven[N-1]-peven[i];
            evensum = peven[i-1]+podd[N-1]-podd[i];

            if(oddsum==evensum)
             count++;
        }

       return count;         
    }
}