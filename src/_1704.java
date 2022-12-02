public interface _1704 {
    public static void main(String[] args) {
        System.out.println(halvesAreAlike("book"));
    }
    public static  boolean halvesAreAlike(String s) {
        String a_= s.toLowerCase().substring(0, s.length() / 2);
        String b_=s.toLowerCase().substring(s.length() / 2, s.length());
        String a = a_.replace("a", "").replace("e", "").replace("i", "").replace("o", "").replace("u", "");
        String b = b_.replace("a", "").replace("e", "").replace("i", "").replace("o", "").replace("u", "");

        return (a.length()-a_.length())==(b.length()-b_.length());
    }
}
