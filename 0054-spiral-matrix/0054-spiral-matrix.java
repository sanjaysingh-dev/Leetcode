class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();

        int N = matrix.length;
        int M = matrix[0].length;

        int i= 0;
        int j= 0;

        while(N>1 && M>1){

            for(int k=1;k<M;k++){
                ans.add(matrix[i][j]);
                j++;
            }

            for(int k=1;k<N;k++){
                ans.add(matrix[i][j]);
                i++;
            }

            for(int k=1;k<M;k++){
                ans.add(matrix[i][j]);
                j--;
            }

            for(int k=1;k<N;k++){
                ans.add(matrix[i][j]);
                i--;
            }

            i++;
            j++;
            N-=2;
            M-=2;
        }

        if(N==1){
            for(int k=0;k<M;k++){
                ans.add(matrix[i][j]);
                j++;
            }
        }

        else if(M==1){
            for(int k=0;k<N;k++){
                ans.add(matrix[i][j]);
                i++;
            }
        }

        return ans;
        
    }
}