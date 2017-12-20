package leetcode;

/**
 * Created by zhangdong on 2017/12/20.
 * Product of Array Except Self
 * Given an array of n integers where n > 1, nums, return an array output such that output[i] is equal to the product of all the elements of nums except nums[i].

 Solve it without division and in O(n).

 For example, given [1,2,3,4], return [24,12,8,6].

 Follow up:
 Could you solve it with constant space complexity? (Note: The output array does not count as extra space for the purpose of space complexity analysis.)
 *
 */
public class Leet238_ {
    public int[] productExceptSelf(int[] nums) {
        int[] result =new int[nums.length];
        int mult=1;
        for (int i = 0; i < nums.length; i++) {
            mult*=nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0){
                result[i]=mult/nums[i];
            }else {
                result[i]=0;//
            }
        }
        return result;
    }
}
