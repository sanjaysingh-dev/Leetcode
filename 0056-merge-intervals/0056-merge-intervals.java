class Solution {
    public int[][] merge(int[][] intervals) {

        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);

        ArrayList<ArrayList<Integer>> result = new ArrayList<>();

        int s = intervals[0][0];
        int e = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {

            if (intervals[i][0] <= e)
                e = Math.max(e, intervals[i][1]);

            else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(s);
                list.add(e);

                result.add(list);
                s = intervals[i][0];
                e = intervals[i][1];
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        list.add(s);
        list.add(e);

        result.add(list);

        int[][] ans = new int[result.size()][2];

        for (int i = 0; i < result.size(); i++) {
            ans[i][0] = result.get(i).get(0);
            ans[i][1] = result.get(i).get(1);
        }

        return ans;
    }
}