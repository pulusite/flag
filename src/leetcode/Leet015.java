package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/**
 * Created by zhangdong on 2017/9/7.
 */
public class Leet015 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int len = nums.length;
        if (len<3) return result;
        Arrays.sort(nums);
        for (int i = 0; i < len; i++) {

        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {-1, 0, 1, 2, -1, -4};
        Leet015 leet = new Leet015();
        List<List<Integer>> result = leet.threeSum(nums);
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i).get(0));
            System.out.print(result.get(i).get(1));
            System.out.print(result.get(i).get(2));
            System.out.println();
        }
    }
}
