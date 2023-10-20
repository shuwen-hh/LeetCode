

public class Solution {

    /**
     * 11. 盛最多的水
     *
     * @param height 整数数组
     * @return result 容器可以储存的最大水量
     * <p>
     * 短板移动可能会变大或者不变，长板移动肯定会变小，所以只需要移动短板，不会错过最大值
     */
    public int maxArea(int[] height) {
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
     *
     * 暴力双循环超时。。。
     */
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        return result;
    }

    // 测试==========================================
}
