class Solution {

    static void reverse(int A[]) {
        int N = A.length;
        int s = 0;
        int e = N - 1;

        while (s < e) {
            int temp = A[s];
            A[s] = A[e];
            A[e] = temp;
            s++;
            e--;
        }
    }

    static void rotate(int A[][]) {

        int N = A.length;

        for (int i = 0; i < N; i++) {
            for (int j = i + 1; j < N; j++) {
                int temp = A[i][j];
                A[i][j] = A[j][i];
                A[j][i] = temp;
            }
        }

        for (int i = 0; i < N; i++)
            reverse(A[i]);

    }

    static boolean isEquals(int A[][], int B[][]) {

        int N = A.length;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (A[i][j] != B[i][j])
                    return false;
            }
        }
        return true;
    }

    public boolean findRotation(int[][] mat, int[][] target) {

        for (int i = 0; i < 4; i++) {
            if (isEquals(mat, target))
                return true;

            rotate(mat);
        }

        return false;
    }
}