class Solution {
    public int[][] transpose(int[][] matrix) {

        int N = matrix.length;
        int M = matrix[0].length;

        int ans[][] = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                ans[i][j] = matrix[j][i];
            }
        }

        return ans;
    }
}