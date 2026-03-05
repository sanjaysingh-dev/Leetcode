class Solution {
    public String restoreString(String s, int[] indices) {

        StringBuilder sb = new StringBuilder();
        int N = indices.length;

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                if(indices[j]==i)
                  sb.append(s.charAt(j));
            }
    }

    return sb.toString();
  }
}