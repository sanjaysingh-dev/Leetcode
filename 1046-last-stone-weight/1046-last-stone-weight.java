class Solution {
    public int lastStoneWeight(int[] stones) {

        PriorityQueue<Integer> maxpq = new PriorityQueue<>(Collections.reverseOrder());

        for(int i=0;i<stones.length;i++)
         maxpq.offer(stones[i]);


        while(maxpq.size()>1){
            int v1 = maxpq.poll();
            int v2 = maxpq.poll();

            if(v1!=v2)
             maxpq.add(v1-v2);
        }

        if(maxpq.size()==0)
         return 0;

        else  
         return maxpq.poll(); 

    }
}