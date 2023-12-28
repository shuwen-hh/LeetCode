import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {

    /**
     * 11. 盛最多的水
     *
     * @param height 整数数组
     * @return result 容器可以储存的最大水量
     * 短板移动可能会变大或者不变，长板移动肯定会变小，所以只需要移动短板，不会错过最大值
     */
    public static int maxArea(int[] height) {
        int result = 0;
        int left = 0;
        int right = height.length - 1;

        while (left != right) {
            int low = Math.min(height[left], height[right]);
            result = Math.max(low * (right - left), result);
            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }
        return result;
    }

    /**
     * 739. 每日温度
     * <p>
     * 暴力双循环超时。。。
     */
    public static int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        return result;
    }

    /**
     * 70. 爬楼梯(经典动态规划)
     *
     * @param n 楼梯层数
     * @return 每次走一步或者两步，总共的走法
     */
    public static int climbStairs(int n) {
        int x_2 = 1, x_1 = 2, x = 0;

        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return 2;
        }

        for (int i = 3; i <= n; i++) {
            System.out.println(x_2 + " " + x_1 + " " + x);
            x = x_1 + x_2;
            x_2 = x_1;
            x_1 = x;
        }

        return x;
    }

    /**
     * 两数之和
     *
     * @param nums   原始数组
     * @param target 目标和
     * @return 满足目标和的两个数
     */
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(target - nums[i])) {
                result[0] = hashMap.get(target - nums[i]);
                result[1] = i;
                break;
            }
            hashMap.put(nums[i], i);
        }
        return result;
    }

    /**
     * 三数之和
     */
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();

        result.add(new ArrayList<>());
        return result;
    }

    /**
     * 509.斐波那契数
     */
    public int fib(int n) {
        int x_0 = 0, x_1 = 1, x = 0;
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }

        for (int i = 2; i <= n; i++) {
            x = x_0 + x_1;
            x_0 = x_1;
            x_1 = x;
        }
        return x;
    }

    /**
     * 1137.第 N 个泰波那契数
     */
    public int tribonacci(int n) {
        int x_0 = 0, x_1 = 1, x_2 = 1, x = 0;

        if (n == 0) {
            return 0;
        }
        if (n == 1 || n == 2) {
            return 1;
        }

        for (int i = 3; i <= n; i++) {
            x = x_0 + x_1 + x_2;
            x_0 = x_1;
            x_1 = x_2;
            x_2 = x;
        }
        return x;
    }

    /**
     * 746.使用最小花费爬楼梯
     */
    public int minCostClimbingStairs(int[] cost) {
        int length = cost.length;
        int[] dp = new int[length + 1];

        dp[0] = dp[1] = 0;

        for (int i = 2; i <= length; i++) {
            dp[i] = Math.min(dp[i - 1] + cost[i - 1], dp[i - 2] + cost[i - 2]);
        }
        return dp[length];
    }
}
