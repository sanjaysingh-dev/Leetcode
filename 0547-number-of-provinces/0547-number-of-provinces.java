class Solution {
    public void dfs(int src,boolean vis[], List<List<Integer>> graph){

        vis[src] = true;

        for(int i: graph.get(src)){
            if(!vis[i])
               dfs(i,vis,graph);
        }

    }

    public int findCircleNum(int[][] isConnected) {

        int N = isConnected.length;
        List<List<Integer>> graph = new ArrayList<>();

        for(int i=0;i<N;i++)
         graph.add(new ArrayList<>());

        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                if(isConnected[i][j]==1){
                   graph.get(i).add(j);
                   graph.get(j).add(i);
                }
            }
        }

        boolean vis[] = new boolean[N+1];

        int count = 0;

        for(int i=0;i<N;i++){
            if(!vis[i]){
                count++;
                dfs(i,vis,graph);
            }
        }

        return count;
        
    }
}