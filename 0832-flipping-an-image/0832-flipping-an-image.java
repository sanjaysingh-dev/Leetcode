class Solution {

    static void reverse(int[] A){

        int N = A.length;
        int i = 0;
        int j = N-1;

        while(i<j){
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i++;
            j--;
        }
    }
    public int[][] flipAndInvertImage(int[][] image) {

        int N = image.length;

        for(int i=0;i<N;i++){

            reverse(image[i]);
            for(int j=0;j<N;j++){
                if(image[i][j] == 1)
                   image[i][j] = 0;

                else if(image[i][j] == 0)
                   image[i][j] = 1;  
            }
        }

        return image;
        
    }
}