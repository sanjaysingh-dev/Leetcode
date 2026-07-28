class Solution {
    public boolean checkGoodInteger(int n) {

        return (sOS(n)-sOD(n))>=50;
        
    }

    public int sOD(int N){

        int sum = 0;
        while(N>0){
            int d = N%10;
            sum+=d;
            N=N/10;
        }

        return sum;
    }

    public int sOS(int N){

        int sum = 0;

        while(N>0){
            int d = N%10;
            sum+=d*d;
            N=N/10;
        }

        return sum;
    }
}