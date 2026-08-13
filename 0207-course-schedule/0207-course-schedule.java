class Solution {

    public boolean dfs(int src, int vis[],int path[], List<List<Integer>> graph){

        vis[src] = 1;
        path[src] = 1;

        for(int i: graph.get(src)){
            if(vis[i]==0){
                if(dfs(i,vis,path,graph)==true)
                  return true; 
            }
            
            else if(path[i]==1)
             return  true;
        }

        path[src] = 0;
        return false;
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {

        List<List<Integer>> graph = new ArrayList<>();

        for(int i=0;i<numCourses;i++)
         graph.add(new ArrayList<>());

        for(int i=0;i<prerequisites.length;i++){
            int des = prerequisites[i][0];
            int src = prerequisites[i][1];

            graph.get(src).add(des);
        }

        int vis[] = new int[numCourses];
        int path[] = new int[numCourses];

        for(int i=0;i<numCourses;i++){
            if(vis[i]==0){
                if(dfs(i,vis,path,graph)==true)
                 return false;
            }
        }

        return true;
        
    }
}