package leetcode;

/**
<<<<<<< HEAD
 * Created by Eric on 2017/7/13.
 */
public class Leet001 {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            
        }
        return null;
=======
 * Created by zhangdong8 on 2017/7/13.
 */
public class Leet001 {
    public int[] twoSum(int[] nums, int target) {
        int[] result=new int[2];
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j]==target-nums[i]){
                    result[0]=i;
                    result[1]=j;
                    return result;
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Leet001 leet = new Leet001();
        int[] nums={2,5,5,11};
        int target=10;
        int[] result=leet.twoSum(nums,target);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
>>>>>>> 3602bfc90ee6cf1d1298a4404cfd5939487dfd77
    }
}
