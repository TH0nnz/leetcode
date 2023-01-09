import java.util.*;
import java.util.stream.Collectors;

public class _15 {
//    Input: nums = [-1,0,1,2,-1,-4]
//    Output: [[-1,-1,2],[-1,0,1]]


    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{-2, 0, 1, 1, 2}).toString());
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> r = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            System.out.println("i=" + i);
            int a = nums[i], target = -1 * a;
            System.out.println("a=" + a);
//雙指針技巧
            int lo = i + 1, hi = nums.length - 1;
            while (lo < hi) {
                int sum = nums[lo] + nums[hi];
                // 根据 sum 和 target 的比较，移动左右指针
                if (sum < target) {
                    lo++;
                } else if (sum > target) {
                    hi--;
                } else if (sum == target) {
                    List<Integer> v = new ArrayList<>();
                    v.add(a);
                    v.add(nums[lo]);
                    v.add(nums[hi]);

                    r.add(v);
                    break;
                }
            }


        }

        return r.stream().collect(Collectors.toList());
    }
//    public static List<List<Integer>> threeSum(int[] nums) {
//        Set<List<Integer>> r=new HashSet<>();
//        Arrays.sort(nums);
//        for (int i = 0; i < nums.length-1; i++) {
//            int a = nums[i];
//            for (int j = i + 1; j < nums.length; j++) {
//             int   b = nums[i + 1], c = (a + b) * -1;
//                if (c == nums[j]) {
//                    List<Integer> v=new ArrayList<>();
//                    v.add(a);
//                    v.add(b);
//                    v.add(c);
//
//                    r.add(v);
//                }
//            }
//        }
//
//        return r.stream().collect(Collectors.toList());
//    }

//    public static List<List<Integer>> threeSum(int[] nums) {
//        Arrays.sort(nums);
//        List<List<Integer>> res = new LinkedList<>();
//        for (int i = 0; i < nums.length - 2; i++) {
//            if (i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
//                int j = i + 1, k = nums.length - 1, target = 0 - nums[i];
//                while (j < k) {
//                    if (nums[j] + nums[k] == target) {
//                        res.add(Arrays.asList(nums[i], nums[j], nums[k]));
//                        while (j < k && nums[j] == nums[j + 1]) j++;
//                        while (j < k && nums[k] == nums[k - 1]) k--;
//                        j++;
//                        k--;
//                    } else if (nums[j] + nums[k] < target) ++j;
//                    else --k;
//                }
//            }
//        }
//        return res;
//    }

}