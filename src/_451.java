import java.util.*;

public interface _451 {
    public static void main(String[] args) {
        long time1 = System.nanoTime();
        System.out.println(frequencySort("2a554442f544asfasssffffasss"));
        System.out.println("花了：" + (System.nanoTime() - time1) + "NS=10^-9秒");
    }


    public static String frequencySort(String s) {
        int[] aaaa = new int[75];
        HashMap<Character, Integer> dd = new HashMap<>();
        for (char c : s.toCharArray()) {
            aaaa[(int) c - 48]++;
        }
        for (int i = 0; i < aaaa.length; i++) {
            dd.put((char)(i + 48), aaaa[i]);
        }
        List<Map.Entry<Character, Integer>> list = new ArrayList<Map.Entry<Character, Integer>>(dd.entrySet()); //轉換為list

        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            @Override
            public int compare(Map.Entry<Character, Integer> o1, Map.Entry<Character, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        String re="";
        for (Map.Entry<Character, Integer> mapping : list){
            re=re+String.valueOf( mapping.getKey()).repeat(mapping.getValue());
            System.out.println(mapping.getKey()+": "+mapping.getValue());
        }
        return re;
    }
}
