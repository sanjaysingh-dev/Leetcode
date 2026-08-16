class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {

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

        int count = 0;

        while(!q.isEmpty()){

            int v = q.poll();
            count++;

            for(int i: graph.get(v)){
                ind[i]--;
                if(ind[i]==0)
                  q.offer(i);
            }
        }

        if(count<numCourses)
         return false;

        else
         return true; 

        
    }
}