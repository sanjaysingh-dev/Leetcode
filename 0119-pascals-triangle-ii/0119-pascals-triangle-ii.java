class Solution {
    public List<Integer> getRow(int rowIndex) {
        
       List<Integer> ans = new ArrayList<>();
       long res = 1;

       ans.add(1);

       for(int c=1;c<=rowIndex;c++){
        res = res*(rowIndex-c+1);
        res = res/c;

        ans.add((int)res);
       } 

       return ans;
        
    }
}