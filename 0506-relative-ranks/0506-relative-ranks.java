class Solution {
    public String[] findRelativeRanks(int[] score) {

        int N = score.length;    
        String ans[] = new String[N];
        int dupli[] = score.clone();

        Arrays.sort(dupli);

        for(int i=0;i<N;i++){
                if(score[i]==dupli[N-1])
                  ans[i] = "Gold Medal";

                else if(score[i]==dupli[N-2])
                  ans[i] = "Silver Medal";

                else if(score[i]==dupli[N-3])
                  ans[i] = "Bronze Medal";

            else{
               for(int j=0;j<N;j++){
                  if(score[i]==dupli[j])
                     ans[i] = String.valueOf(N-j);    
            }
          }
        }
          return ans;
        }
    }

