class Solution {
    public int maxArea(int[] height) {

        int N = height.length;
        int l = 0;
        int r = N-1;

        long max = 0;

        while(l<r){

            int h = Math.min(height[l],height[r]);
            int w = r-l;

            long area = (long)h*w;

            max = Math.max(max,area);

            if(height[l]<height[r])
             l++;

            else 
             r--; 
        }

        return (int)max;
        
    }
}