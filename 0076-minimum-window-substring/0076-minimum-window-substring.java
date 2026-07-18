class Solution {
    public String minWindow(String s, String t) {

        int N = s.length();
        int M = t.length();

        HashMap<Character, Integer> wmap = new HashMap<>();
        HashMap<Character, Integer> tmap = new HashMap<>();

        for(int i=0;i<M;i++)
         tmap.put(t.charAt(i),tmap.getOrDefault(t.charAt(i),0)+1);

        int st=-1,ed=-1;
        int ans = Integer.MAX_VALUE;
        int i=0,j=0,mc=0;

        while(j<N){

            while(j<N && mc<M){

                char ch = s.charAt(j);

                wmap.put(ch,wmap.getOrDefault(ch,0)+1);

                if(tmap.containsKey(ch) && wmap.get(ch)<=tmap.get(ch))
                 mc++;

                j++; 
            }

            while(i<j && mc==M){

                int len = j-i;
                char ch = s.charAt(i);

                if(len<ans){
                    st = i;
                    ed = j-1;
                    ans = len;
                }

                wmap.put(ch,wmap.get(ch)-1);

                if(tmap.containsKey(ch) && wmap.get(ch)<tmap.get(ch))
                 mc--;

                if(wmap.get(ch)==0)
                  wmap.remove(ch);

                 i++;  
            }
        }

        if(st==-1)
         return "";

        else 
         return s.substring(st,ed+1); 

        
    }
}