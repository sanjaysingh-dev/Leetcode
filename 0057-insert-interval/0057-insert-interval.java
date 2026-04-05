class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> result = new ArrayList<>();

        int N = intervals.length;

        int s = newInterval[0];
        int e = newInterval[1];

        int i = 0;

        while (i < N && intervals[i][1] < s) {
            result.add(intervals[i]);
            i++;
        }

        while (i < N && intervals[i][0] <= e) {
            s = Math.min(s, intervals[i][0]);
            e = Math.max(e, intervals[i][1]);
            i++;
        }

        result.add(new int[]{s, e});

        while (i < N) {
            result.add(intervals[i]);
            i++;
        }

        return result.toArray(new int[result.size()][]);
    }
}