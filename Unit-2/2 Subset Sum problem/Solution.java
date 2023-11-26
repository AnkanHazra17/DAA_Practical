
public class Solution {

    public static boolean isSubsetSum(int[] arr, int target) {
        int n = arr.length;

        boolean[][] dpTable = new boolean[n + 1][target + 1];

        for (int i = 0; i < n; i++) {
            dpTable[i][0] = true;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= target; j++) {
                if (arr[i - 1] <= j) {
                    dpTable[i][j] = (dpTable[i - 1][j]) || (dpTable[i - 1][j - arr[i - 1]]);
                } else {
                    dpTable[i][j] = dpTable[i - 1][j];
                }
            }
        }

        return dpTable[n][target];
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 2, 6 };

        System.out.println(isSubsetSum(arr, 6));
    }
}
