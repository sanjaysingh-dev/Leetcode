class Solution {
    public boolean isHappy(int n) {

        HashSet<Integer> set = new HashSet<>();

        while(n!=1){

            if(set.contains(n))
             return false;

            set.add(n);

            n=sumOfDigit(n); 
        }

        return true;
        
    }

    public int sumOfDigit(int N){

        int sum = 0;

        while(N>0){
            int d = N%10;
            sum+=d*d;
            N=N/10;
        }

        return sum;
    }
}