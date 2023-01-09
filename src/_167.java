import java.util.HashMap;

public class _167 {
    public static void main(String[] args) {
        Integer[] ddddd = twoSumII(new int[]{2, 7, 11, 15}, 9);
        System.out.println(ddddd);
    }

    public static Integer[] twoSumII(int[] numbers, int target) {
        HashMap<Integer, Integer> outupt = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (outupt.containsKey(target - numbers[i])) {
                return new Integer[]{outupt.get(target - numbers[i]), i+1};
            }else {
                outupt.put(numbers[i], i+1);
            }
        }
        return null;
    }


//    /***
//     *  取小
//     * @param numbers
//     * @param left
//     * @param right
//     * @param target
//     * @return
//     */
//    private static int getLeft(int[] numbers, int left, int right, int target){
//        int mid;
//        while(left <= right){//右指針大於左指針
//            mid = left + (right - left) / 2;//取中點，然後再用中位數的值去跟目標比較，移動左右直到
//            if(numbers[mid] < target) left = mid + 1;//如果中位數的值小於目標 則左＝中位數＋1 再跑while 讓左慢慢逼近目標
//            else right = mid - 1;//如果中位數大於目標 則右＝中位數-1 再跑while
//        }
//        return left;//左指針一定要小於右指針 表示所所有的數都二分一次
//    }
//
//    /****
//     * 取大
//     * @param numbers
//     * @param left
//     * @param right
//     * @param target
//     * @return
//     */
//    private static int getRight(int[] numbers, int left, int right, int target){
//        int mid;
//        while(left <= right){
//            mid = left + (right - left) / 2;
//            if(numbers[mid] > target) right = mid - 1;
//            else left = mid + 1;
//        }
//        return right;
//    }
//
//    /****
//     * 融入二元搜索 0ms runtime 「以後可能可以考慮只看runtime 畢竟現在設備很便宜」
//     * 像這種有排列過的儘量使用二分法去做
//     * todo 20221223 看不懂先放棄
//     */
//    public static int[] twoSumII(int[] numbers, int target) {
//        int left = 0;//左指針
//        int right = numbers.length - 1;//右指針
//        int sum;
//        while(true){
//            sum = numbers[left] + numbers[right];
//            if(sum == target) break;//左右指針合等於目標就算成功
//            else if(sum > target) right = getRight(numbers, left, right, target - numbers[left]);//左右合大於目標，降左右合（降右指針）
//            else left = getLeft(numbers, left, right, target - numbers[right]);////左右合小於目標，升左右合（升左指針）
//        }
//        return new int[]{left + 1, right + 1};
//    }
}
