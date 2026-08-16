class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {

        List<List<Integer>> graph = new ArrayList<>();

        for(int i=0;i<numCourses;i++)
         graph.add(new ArrayList<>());

        int N = prerequisites.length;
        int ind[] = new int[numCourses];

        for(int i=0;i<N;i++){
            int des = prerequisites[i][0];
            int src = prerequisites[i][1];

            graph.get(src).add(des);
            ind[des]++;
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i=0;i<numCourses;i++){
            if(ind[i]==0)
             q.offer(i);
        } 

        List<Integer> topo = new ArrayList<>();

        while(!q.isEmpty()){

            int val = q.poll();
            topo.add(val);

            for(int i:graph.get(val)){
                ind[i]--;
                
                if(ind[i]==0)
                 q.offer(i);
            }
        }

        if(topo.size()<numCourses)
         return new int[]{};
        
        int ans[] = new int[numCourses];

        for(int i=0;i<topo.size();i++)
         ans[i] = topo.get(i);

         return ans; 
        
    }
}