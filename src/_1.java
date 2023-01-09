import java.util.HashMap;

public class _1 {
    public static void main(String[] args) {
        System.out.println(twoSum(new int[]{3, 2, 4,5,7,8,10,34,55}, 58));
    }

//    public static int[] twoSum(int[] nums, int target) {
//        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
//        for (int i = 0; i < nums.length; i++) {
//            Integer need = target - nums[i];
//            if (map.containsKey(need)) {
//                return new int[]{map.get(need), i};
//            }
//            map.put(nums[i], i);
//        }
//        return null;
//    }

    /***
     * 強者的 0ms 解法
     *
     * 	執行耗時:0 ms,擊敗了100.00% 的Java用戶
     * 	內存消耗:42.5 MB,擊敗了88.42% 的Java用戶
     *
     * @param nums
     * @param target
     * @return
     */
    public static int[] twoSum(int[] nums, int target) {
        int[] res = {-1, -1};
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                System.out.println("i=" + i + " , j=" + j);
                System.out.println("nums[j]+nums[j-i]:  nums[" + j + "]=" + nums[j] + ", nums[" + (j - i) + "]=" + nums[j - i]);
                if (nums[j] + nums[j - i] == target) {
                    System.out.println("true");
                    res[0] = j - i;
                    res[1] = j;
                    break;
                    //此處邏輯圖請看one note
                }
            }
            if (res[0] != -1) break;
        }
        return res;
    }
}
