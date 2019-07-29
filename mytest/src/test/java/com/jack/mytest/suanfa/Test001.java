package com.jack.mytest.suanfa;

import java.util.HashMap;

/*
给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
示例:
给定 nums = [2, 7, 11, 15], target = 9
因为 nums[0] + nums[1] = 2 + 7 = 9
所以返回 [0, 1]
来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/two-sum
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Test001 {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4};
        int target = 7;
        int[] array1 = getArray(array, target);
        for (int value : array1) {
            System.out.println(value);
        }
    }

    private static int[] getArray(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return new int[]{(Integer) map.get(nums[i]), i};
            }
            // 注意这里面放的是什么, 放的是不满足上面条件下的 目标值减去当前值,
            map.put(target - nums[i], i);
            /**
             * map,put(7-1,0);
             * map,put(7-2,1);
             * map,put(7-3,2);
             * 满足条件的时候, 取出来 map.get(4) = 2, 本次循环的次数 3
             */
        }
        return new int[]{-1, -1};
    }
}
