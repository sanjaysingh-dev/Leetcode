class Solution {
    public int longestConsecutive(int[] nums) {

        HashMap<Integer, Boolean> map = new HashMap<>();
        int max = 0;

        for(int x: nums)
         map.put(x,true);

        for(int x: map.keySet()){
            if(map.containsKey(x-1))
              map.put(x,false);
        } 

        for(int x: map.keySet()){
            if(map.get(x)==true){

                int l = 1;
                int curr = x;

                  while(map.containsKey(curr+1)){
                    l++;
                    curr++;
                  }    

                 max = Math.max(max,l); 
              }
            }

            return max;
        }    
 }

    