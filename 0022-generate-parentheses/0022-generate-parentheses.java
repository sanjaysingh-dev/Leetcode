class Solution {
    List<String> list = new ArrayList<>();
   
    public List<String> generateParenthesis(int n) {

        solve("",n,0,0);
        return list;
    }

    public void solve(String s, int N, int open, int close){

        if(s.length()==2*N){
            list.add(s);
            return;
        } 


        if(open<N)
         solve(s+"(",N,open+1,close);

        if(close<open) 
        solve(s+")",N,open,close+1);
    }
}