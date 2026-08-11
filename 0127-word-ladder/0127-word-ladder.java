class pair{

    String word;
    int step;

    public pair(String word, int step){
        this.word = word;
        this.step = step;
    }
}

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {

        int N = wordList.size();
        HashSet<String> set = new HashSet<>();

        for(int i=0;i<N;i++)
         set.add(wordList.get(i));

        if(!set.contains(endWord))
          return 0; 

        set.remove(beginWord);

        Queue<pair> q = new LinkedList<>();

        q.offer(new pair(beginWord,1));

        while(!q.isEmpty()){

            pair p = q.poll();
            String word = p.word;
            int step = p.step;

            if(word.equals(endWord))
              return step;

            for(int i=0;i<word.length();i++){
              for(char ch='a';ch<='z';ch++){

                char arr[] = word.toCharArray();
                arr[i] = ch;

                String newWord = new String(arr);

                if(set.contains(newWord)){
                    set.remove(newWord);
                    q.offer(new pair(newWord,step+1));
                }
              }
            }  
        }

        return 0;
        
    }
}