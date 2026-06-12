class Solution {
    public int[] twoSum(int[] numbers, int target) {

        int N = numbers.length;
        int i = 0;
        int j = N-1;

        while(i<j){

            int sum = numbers[i]+numbers[j];

            if(sum==target)
              return new int[]{i+1,j+1};

            else if(sum>target)
             j--;

            else
             i++;
        }

        return new int[0];
        
    }
}