package by.academy.jc.ht.akbarova.ht_minabssum;

import java.util.Arrays;

public class Solution {

    public static int solution(int[] arr) {
        final int n = arr.length;
        if (n == 0) {
            return 0;
        }

        final int[] abs = new int[n];

        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            final int v = Math.abs(arr[i]);

            abs[i] = v;

            max = Math.max(max, v);
            sum = sum + v;
        }

        final int[] counts = new int[max + 1];
        for (int i = 0; i < n; i++) {
            final int v = abs[i];
            counts[v] += 1;
        }

        final int[] dp = new int[sum + 1];
        Arrays.fill(dp, -1);
        dp[0] = 0;

        for (int i = 1; i <= max; i++) {
            final int count = counts[i];
            if (count > 0) {
                for (int j = 0; j <= sum; j++) {
                    if (dp[j] >= 0) {
                        dp[j] = count;
                    } else if (j >= i && dp[j - i] > 0) {
                        dp[j] = dp[j - i] - 1;
                    }
                }
            }
        }

        int result = sum;
        for (int i = 0, limit = sum / 2 + 1; i < limit; i++) {
            if (dp[i] >= 0) {
                result = Math.min(result, sum - 2 * i);
            }
        }

        return result;
    }
}

