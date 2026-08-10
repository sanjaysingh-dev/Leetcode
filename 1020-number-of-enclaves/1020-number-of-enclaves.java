class pair {

    int row;
    int col;

    public pair(int row, int col) {
        this.row = row;
        this.col = col;
    }
}

class Solution {

    public int numEnclaves(int[][] grid) {

        int N = grid.length;
        int M = grid[0].length;

        int vis[][] = new int[N][M];
        Queue<pair> q = new LinkedList<>();

        int count = 0;

        for (int j = 0; j < M; j++) {

            if (grid[0][j] == 1 && vis[0][j] != 1) {
                vis[0][j] = 1;
                q.offer(new pair(0, j));
            }

            if (grid[N - 1][j] == 1 && vis[N - 1][j] != 1) {
                vis[N - 1][j] = 1;
                q.offer(new pair(N - 1, j));
            }
        }

        for (int i = 0; i < N; i++) {

            if (grid[i][0] == 1 && vis[i][0] != 1) {
                vis[i][0] = 1;
                q.offer(new pair(i, 0));
            }

            if (grid[i][M - 1] == 1 && vis[i][M - 1] != 1) {
                vis[i][M - 1] = 1;
                q.offer(new pair(i, M - 1));
            }
        }

        int dr[] = { -1, 1, 0, 0 };
        int dc[] = { 0, 0, -1, 1 };

        while (!q.isEmpty()) {

            pair p = q.poll();
            int r = p.row;
            int c = p.col;

            for (int i = 0; i < 4; i++) {
                int newr = r + dr[i];
                int newc = c + dc[i];

                if (newr >= 0 && newr < N && newc >= 0 && newc < M &&
                        vis[newr][newc] != 1 && grid[newr][newc] == 1) {

                    vis[newr][newc] = 1;
                    q.offer(new pair(newr, newc));

                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (vis[i][j] != 1 && grid[i][j] == 1)
                    count++;
            }
        }

        return count;
    }
}