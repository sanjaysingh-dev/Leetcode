class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {

        int N = matrix.length;
        int M = matrix[0].length;

        List<Integer> ans = new ArrayList<>();

        int rowmin[] = new int[N];
        int colmax[] = new int[M];

        Arrays.fill(rowmin,Integer.MAX_VALUE);
        Arrays.fill(colmax,Integer.MIN_VALUE);

        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                rowmin[i] = Math.min(rowmin[i],matrix[i][j]);
                colmax[j] = Math.max(colmax[j],matrix[i][j]);
            }
        } 
        

        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(matrix[i][j] == rowmin[i] && matrix[i][j]==colmax[j])
                  ans.add(matrix[i][j]);
            }
        }

        return ans;
        
    }
}