class Solution {
    public int beautySum(String s) {

        int N = s.length();
        int sum = 0;

        for(int i=0;i<N;i++){

            HashMap<Character,Integer> map = new HashMap<>();

            for(int j=i;j<N;j++){

                char ch = s.charAt(j);

                map.put(ch,map.getOrDefault(ch,0)+1);

                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;

                for(int x: map.values()){
                    min = Math.min(min,x);
                    max = Math.max(max,x);
                }

                sum+=max-min;
            }
        }
        
        return sum;
    }
}