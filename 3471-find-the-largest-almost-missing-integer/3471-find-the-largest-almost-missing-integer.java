class Solution {
    public int largestInteger(int[] nums, int k) {

        int N = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<k;i++)
            set.add(nums[i]);

        for(int i: set)
            map.put(i,map.getOrDefault(i,0)+1);
    
        int s = 1;
        int e = k;    

         while(e<N){
            int st = s;
            set = new HashSet<>();
            
            while(st<=e){
            set.add(nums[st]);
            st++;
            }

           for(int i: set)
            map.put(i,map.getOrDefault(i,0)+1);

            s++;
            e++;
         }   

         int max = Integer.MIN_VALUE;

         for(int i: map.keySet()){
            if(map.get(i)==1)
              max = Math.max(max,i);
         }

         if(max == Integer.MIN_VALUE)
          return -1;

         return max;
    }
}