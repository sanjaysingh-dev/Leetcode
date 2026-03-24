class Solution {
    public boolean checkIfExist(int[] arr) {

        int N = arr.length;

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(j!=i && arr[i]==2*arr[j])
                   return true;
            }
        }

        return false;
        
    }
}