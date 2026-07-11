class pair{

    char ch;
    int freq;

    pair(int freq, char ch){
        this.freq = freq;
        this.ch = ch;
    }
}

class Solution {

    public String frequencySort(String s) {
        

        int N = s.length();

        pair freq[] = new pair[128];

        for(int i=0;i<128;i++)
         freq[i] = new pair(0,(char)i);

        for(int i=0;i<N;i++)
         freq[s.charAt(i)].freq++;

        Arrays.sort(freq, new Comparator<pair>(){

            public int compare(pair a, pair b){

                if(a.freq!=b.freq)
                  return b.freq-a.freq;

                  return a.ch-b.ch;
            }
        });

        StringBuilder sb = new StringBuilder();

        for(pair p: freq){

            while(p.freq>0){
                sb.append(p.ch);
                p.freq--;
            }
        } 

        return sb.toString(); 
    }
}