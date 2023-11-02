package Study_Java.Task8.z9;

public class MyClass {

    public static int countSequences(int a, int b) {
        int[][] dp = new int[a + 1][b + 1];
        if(a <= b) {
            for (int i = 0; i <= a; i++) {
                dp[i][0] = 1;
            }
            for (int i = 1; i <= b; i++) {
                dp[0][i] = 1;
            }
            for (int i = 0; i <= a; i++) {
                for (int j = 0; j <= b; j++){
                    dp[0][0] = 0;
                }
            }

            for (int i = 1; i <= a; i++) {
                for (int j = 1; j <= b; j++) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }
        return dp[a][b];
    }
}
