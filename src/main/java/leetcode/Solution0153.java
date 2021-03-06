package leetcode;

/**
 * @author xiangdotzhaoAtwoqutechcommacom
 * @date 2019/12/30
 */

public class Solution0153 {

    public int findMin(int[] nums) {
        if (nums == null || nums.length == 0) {
            return -1;
        }
        int lo = 0, hi = nums.length - 1;
        if (nums[lo] < nums[hi]) {
            return nums[lo];
        }
        while (lo < hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] > nums[hi]) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return nums[lo];
    }

}
