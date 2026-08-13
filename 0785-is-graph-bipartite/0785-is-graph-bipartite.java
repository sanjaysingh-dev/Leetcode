class Solution {

    public boolean dfs(int src, int color, int vis[], ArrayList<ArrayList<Integer>> g){

        vis[src] = color;

        for(int i: g.get(src)){
            if(vis[i]==-1){
             if(dfs(i,1-color,vis,g)==false)
               return false;
            }

            else if(vis[i]==color)
             return false; 
        } 

        return true;
    }

    public boolean isBipartite(int[][] graph) {

        int N = graph.length;

        ArrayList<ArrayList<Integer>> g = new ArrayList<>();

        for(int i=0;i<N;i++)
         g.add(new ArrayList<>());


        for(int i=0;i<N;i++){
            for(int j=0;j<graph[i].length;j++){
                    g.get(i).add(graph[i][j]);
                    g.get(graph[i][j]).add(i);
                }
         }
         

        int vis[] = new int[N];
        Arrays.fill(vis,-1);

        for(int i=0;i<N;i++){
            if(vis[i]==-1){
                if(dfs(i,0,vis,g)==false)
                    return false;
            }
        }

        return true;
        
    }
}