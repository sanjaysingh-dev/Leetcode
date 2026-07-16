class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals,(a,b)->a[0]-b[0]);

        int N = intervals.length;

        List<int[]> ans = new ArrayList<>();

        for(int i=0;i<N;i++){

        if(ans.isEmpty() || intervals[i][0] > ans.get(ans.size()-1)[1])
              ans.add(intervals[i]);

        else{

              ans.get(ans.size()-1)[1] = Math.max(intervals[i][1],
                                        ans.get(ans.size()-1)[1]);  
                
             } 
        }

        return ans.toArray(new int[ans.size()][]);
    }
}