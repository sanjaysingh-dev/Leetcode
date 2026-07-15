class Solution {
    public List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ans = new ArrayList<>();

        for(int i=1;i<=numRows;i++)
          ans.add(NCR(i));

          return ans;
        
    }

    public List<Integer> NCR(int r){

        long res = 1;
        List<Integer> ans = new ArrayList<>();

        ans.add(1);

        for(int c=1;c<r;c++){
            res = res*(r-c);
            res = res/c;

            ans.add((int)res);
        }

        return ans;
    }
}