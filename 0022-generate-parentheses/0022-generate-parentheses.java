class Solution {
    List<String> list = new ArrayList<>();
   
    public List<String> generateParenthesis(int n) {

        solve("",n,0,0);
        return list;
    }

    public void solve(String s, int N, int open, int close){

        if(open>N || close>open)
         return;

        if(s.length()==2*N){
            list.add(s);
            return;
        } 


        solve(s+"(",N,open+1,close);
        solve(s+")",N,open,close+1);
    }
}